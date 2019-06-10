/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d732229
 */
public class SetorDAO {

//Atrituto 
    private final Connection connection;

//Construtor
    public SetorDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

//METODO utilizado para inserir uma nova Setor no BANCO
    public void cSetor(Setor st) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_setor "
                    +"(fk_divisao, sg_setor, nm_setor, nm_nrsimproc, nm_nrsei, nm_login, dthr_atualizacao) "
                    +"VALUES (?,?,?,?,?,?,?)";
            try{
                 stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, st.getFkDivisao());
                    stmt.setString(2, st.getSgSetor());
                    stmt.setString(3, st.getNmSetor());
                    stmt.setString(4, st.getNmNrSimprocSetor());
                    stmt.setString(5, st.getNmNrSei());
                    stmt.setString(6, st.getNmLogin());
                    stmt.setTimestamp(7,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }

//MEDOTO utilizado para realizar a alteração das informações do Setor
    public void upSetor(Setor st) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_setor "
                + "SET sg_setor=?, nm_setor=?, nm_nrsimproc=?, nm_login=?, dthr_atualizacao=?, fk_divisao=?,  nm_nrsei=? "
                + "WHERE id_setor = ?";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1, st.getSgSetor());
                    stmt.setString(2, st.getNmSetor());
                    stmt.setString(3, st.getNmNrSimprocSetor());
                    stmt.setString(4, st.getNmLogin());
                    stmt.setTimestamp(5,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(6, st.getFkDivisao());
                    stmt.setString(7, st.getNmNrSei());
                    stmt.setInt(8, st.getPkSetor());
                stmt.execute();
            }catch (SQLException e){
               throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }

//METODO utilizado para retornar as informação de um Setor/Núcleo
    public Setor detalheSetor(int pkSetor) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Setor st = new Setor();
        String sql = "SELECT fk_divisao, id_setor, sg_divisao, nm_divisao, sg_setor, nm_setor, "
                    + "nm_nrsimproc, nm_nrsei, nm_login, dthr_atualizacao      "
                    +"FROM vw_setorcompleto "
                    +"WHERE id_setor = ?";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, pkSetor);
                rs = stmt.executeQuery();
                if(rs.next()){
                    st.setFkDivisao(rs.getInt("fk_divisao"));
                    st.setPkSetor(rs.getInt("id_setor"));
                    st.setSgDivisao(rs.getString("sg_divisao"));
                    st.setNmDivisao(rs.getString("nm_divisao"));
                    st.setSgSetor(rs.getString("sg_setor"));
                    st.setNmSetor(rs.getString("nm_setor"));
                    st.setNmNrSimprocSetor(rs.getString("nm_nrsimproc"));
                    st.SetNmNrSei(rs.getString("nm_nrsei"));
                    st.setNmLogin(rs.getString("nm_login"));
                    st.setDthrAtualiza(rs.getString("dthr_atualizacao"));
                }
            return st;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
    }

//METODO lista os setor de um Divisão, utilizado no o select da pagina cadastro e alteração de ususário
    public List<Setor> selecSetor(int pkDivisao) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Setor> stLista = new ArrayList<Setor>();
        String sql = ("SELECT id_setor, sg_setor, nm_setor "
                    +"FROM tbl_setor "
                    + "WHERE fk_divisao = ?");
            try {
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, pkDivisao);
                rs = stmt.executeQuery();  
                while (rs.next()){
                Setor st = new Setor();
                    st.setPkSetor(rs.getInt("id_setor"));
                    st.setSgSetor(rs.getString("sg_setor"));
                    st.setNmSetor(rs.getString("nm_setor"));
                stLista.add(st);
                }       
            return stLista;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
        }
    }     
       

//METODO lista os setor de pesquisa e paginado
    public List<Setor> listSetor(int qtLinha, int offset, String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Setor> setorList = new ArrayList<Setor>();
        String sql = ("SELECT id_setor, fk_divisao, sg_divisao, nm_divisao, sg_setor, nm_setor, nm_nrSimproc, nm_login, dthr_atualizacao "
                    +"FROM vw_setorcompleto "
                    +"WHERE (sg_setor ILIKE ? OR nm_setor ILIKE ? ) "
                    +"ORDER BY sg_divisao, sg_setor ASC "
                    +"LIMIT ? OFFSET ? ");
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                rs = stmt.executeQuery();
                    while (rs.next()){
                    Setor st = new Setor();
                        st.setPkSetor(rs.getInt("id_setor"));
                        st.setFkDivisao(rs.getInt("fk_divisao"));
                        st.setSgDivisao(rs.getString("sg_divisao"));
                        st.setNmDivisao(rs.getString("nm_divisao"));
                        st.setSgSetor(rs.getString("sg_setor"));
                        st.setNmSetor(rs.getString("nm_setor"));
                        st.setNmNrSimprocSetor(rs.getString("nm_nrSimproc"));
                        st.setNmLogin(rs.getString("nm_login"));
                        st.setDthrAtualiza(rs.getString("dthr_atualizacao"));
                     setorList.add(st);
                    }
            return setorList;
            } catch (SQLException e){
                throw new RuntimeException (e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
    }

//Metodo de quantidade de linhas
    public int qdSetor (String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;
        String sql = ("SELECT COUNT(*) as total "
                    +"FROM vw_setorcompleto "
                    +"WHERE (sg_setor ILIKE ? OR nm_setor ILIKE ? ) ");
        try{
             stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+q+'%');
                stmt.setString(2, '%'+q+'%');
             rs = stmt.executeQuery();
                if(rs.next()){
                    total = rs.getInt("total");
                }
        return total;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    }

}
