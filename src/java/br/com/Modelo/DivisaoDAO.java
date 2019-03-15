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
public class DivisaoDAO {
    
//Atrituto 
    private final Connection connection;

//Construtor
    public DivisaoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }
    
//METODO utilizado para inserir uma nova Divisao no BANCO
    public void cDivisao(Divisao dv) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_divisao "
                + "(sg_divisao, nm_divisao, nm_nrsimproc, dthr_atualizacao, nm_login, nm_nrsei) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1, dv.getSgDivisao());
                    stmt.setString(2, dv.getNmDivisao());
                    stmt.setString(3, dv.getNmNrSimproc());
                    stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setString(5, dv.getNmLogin());
                    stmt.setString(6, dv.getnmNrSei());
            stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }
//MEDOTO utilizado para realizar a alteração das informações da Divisão
    public void upDivisao(Divisao dv) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_divisao "
                    + "SET sg_divisao = ?, nm_divisao = ?, nm_nrsimproc = ?, dthr_atualizacao = ?, nm_login = ?, nm_nrsei = ? "
                    + "WHERE id_divisao = ?";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1, dv.getSgDivisao());
                    stmt.setString(2, dv.getNmDivisao());
                    stmt.setString(3, dv.getNmNrSimproc());
                    stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setString(5, dv.getNmLogin());
                    stmt.setString(6, dv.getnmNrSei());
                    stmt.setInt(7, dv.getPkDivisao());
                stmt.execute();
            }catch(SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }
    
    
//METODO retorna as informações de um Divisão
    public Divisao detalheDivisao(int pkDivisao) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Divisao dv = new Divisao();
        String sql = "SELECT id_divisao, sg_divisao, nm_divisao, nm_nrsimproc, nm_nrsei, dthr_atualizacao, nm_login "
                + "FROM tbl_divisao "
                + "WHERE id_divisao = ?";
            try {
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, pkDivisao);
                rs = stmt.executeQuery();
                if (rs.next()){
                    dv.setPkDivisao(rs.getInt("id_divisao"));
                    dv.setSgDivisao(rs.getString("sg_divisao"));
                    dv.setNmDivisao(rs.getString("nm_divisao"));
                    dv.setNmNrSimproc(rs.getString("nm_nrsimproc"));
                    dv.setNmNrSei(rs.getString("nm_nrsei"));
                    dv.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                    dv.setNmLogin(rs.getString("nm_login"));
                }
            return dv;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                stmt.close();
//                connection.close();
            }
    }
    
    
//METODO utilizado para lista as divisões paginada e realiza pesquisa por sigla e nome da divisão
    public List<Divisao> listDivisao(int qtdLinha, int offset, String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Divisao> divLista = new ArrayList<Divisao>();
        String sql = "SELECT id_divisao, sg_divisao, nm_divisao, nm_nrSimproc, nm_nrsei, nm_login, dthr_atualizacao "
                + "FROM tbl_divisao "
                + "WHERE (sg_divisao ILIKE ? or nm_divisao ILIKE ?) "
                + "ORDER BY sg_divisao ASC "
                + "LIMIT ? OFFSET ?";
            try {
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtdLinha);
                    stmt.setInt(4, offset);
                rs = stmt.executeQuery(); 
            while (rs.next()){
                Divisao di = new Divisao();
                    di.setPkDivisao(rs.getInt("id_divisao"));
                    di.setSgDivisao(rs.getString("sg_divisao"));
                    di.setNmDivisao(rs.getString("nm_divisao"));
                    di.setNmNrSimproc(rs.getString("nm_nrSimproc"));
                    di.setNmNrSei(rs.getString("nm_nrsei"));
                    di.setNmLogin(rs.getString("nm_login"));
                    di.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
             divLista.add(di);
            }       
            return divLista;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
    } 

//METODO uilizado para retornar a quantidade divisao cadastradas na pesquisa por nome ou sigla
    public int qtdDivisao(String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;
        String sql = "SELECT COUNT(*) as total "
            + "FROM tbl_divisao "
                + "WHERE (sg_divisao ILIKE ? or nm_divisao ILIKE ? )";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                rs = stmt.executeQuery();
                if(rs.next()){
                    total = rs.getInt("total");
                }
            return total;
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
    }
    
//METODO utilizado para lista as Divisçoes, utilizado nos campos select da pagina cadastro  e alteração de usuário
    public List<Divisao> selectLisDivisao() throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Divisao> divLista = new ArrayList<Divisao>();
        String sql = "SELECT id_divisao, sg_divisao, nm_divisao "
                + "FROM tbl_divisao "
                + "ORDER BY sg_divisao";
        try{
            stmt = connection.prepareStatement(sql);
                rs = stmt.executeQuery();
            while(rs.next()){
                Divisao dv = new Divisao();
                    dv.setPkDivisao(rs.getInt("id_divisao"));
                    dv.setSgDivisao(rs.getString("sg_divisao"));
                    dv.setNmDivisao(rs.getString("nm_divisao"));
            divLista.add(dv);
            }
            stmt.executeQuery();
            return divLista;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
   
    }
    










    
    
}
