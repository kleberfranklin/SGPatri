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
public class TipoAutoCessaoDAO extends FabricaConexao {
    
     private Connection connection = getConnetion();
    

//Construtor
    public TipoAutoCessaoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }


//Metodo de quantidade de linhas
    public int qdTipoCessao (String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;
        String sql = ("SELECT COUNT(*) as total "
                    + "FROM tbl_tipocessao "
                    + "WHERE nm_tipocessao ILIKE ? ");
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+q+'%');
            rs = stmt.executeQuery();
                if(rs.next()){
                    total = rs.getInt("total");
                }
            stmt.execute();
        return total;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    }    

//METODO lista os Tipos de Auto de Cessão das pesquisas e paginada
    public List<TipoAutoCessao> listTpCessao (int qtLinha, int offset, String q ) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;      
        List<TipoAutoCessao> lisTpCessao = new ArrayList<TipoAutoCessao>();
        String sql = ("SELECT id_tipocessao, fk_categoriauto, sg_categoriauto, nm_categoriaauto, nm_tipocessao, "
                    + "nm_tipocessao, nm_login, dthr_atualizacao "
                    + "FROM vw_tipocessaocompleto "
                    + "WHERE nm_tipocessao ILIKE ? "
                    + "ORDER BY nm_tipocessao "
                    + "LIMIT ? OFFSET ? ");
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setString(1,'%'+q+'%');
                stmt.setInt(2, qtLinha);
                stmt.setInt(3, offset);
                rs = stmt.executeQuery();
                while (rs.next()){
                TipoAutoCessao tpCessao = new TipoAutoCessao();
                    tpCessao.setPkTipoAutoCessao(rs.getInt("id_tipocessao"));
                    tpCessao.setFkCatAutoCessao(rs.getInt("fk_categoriauto"));
                    tpCessao.setSgCatAutoCessao(rs.getString("sg_categoriauto"));
                    tpCessao.setNmCatAutoCessao(rs.getString("nm_categoriaauto"));
                    tpCessao.setNmTipoAutoCessao(rs.getString("nm_tipocessao"));
                    tpCessao.setNmLogin(rs.getString("nm_login"));
                    tpCessao.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                 lisTpCessao.add(tpCessao);
                }
            return lisTpCessao;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
        
    }    

//METODO utilizado para retornar as informação de um Tipo de Auto Cessão
    public TipoAutoCessao detalheTpCessao(int pkTipoAutoCessao) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoAutoCessao tpCessao = new TipoAutoCessao();
        String sql = "SELECT id_tipocessao, fk_categoriauto, sg_categoriauto, nm_categoriaauto, nm_tipocessao, nm_login, dthr_atualizacao "
                    + "FROM vw_tipocessaocompleto "
                    + "WHERE id_tipocessao = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkTipoAutoCessao);
                rs = stmt.executeQuery();
            if(rs.next()){
                tpCessao.setPkTipoAutoCessao(rs.getInt("id_tipocessao"));
                tpCessao.setFkCatAutoCessao(rs.getInt("fk_categoriauto"));
                tpCessao.setSgCatAutoCessao(rs.getString("sg_categoriauto"));
                tpCessao.setNmCatAutoCessao(rs.getString("nm_categoriaauto"));
                tpCessao.setNmTipoAutoCessao(rs.getString("nm_tipocessao"));
                tpCessao.setNmLogin(rs.getString("nm_login"));
                tpCessao.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            return tpCessao;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
//            connection.close();
        }
    }   
    
    
//METODO utilizado para inserir uma novo Tipo de Auto de Cessao no BANCO
    public void cTipoCessao(TipoAutoCessao tpCessao) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_tipocessao "
                + "(fk_categoriauto, nm_tipocessao, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, tpCessao.getFkCatAutoCessao());
                    stmt.setString(2, tpCessao.getNmTipoAutoCessao());
                    stmt.setString(3, tpCessao.getNmLogin());
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
            stmt.close();
            connection.close();
        }
    }          
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Tipo de Auto de Cessão
    public void upTipoCessao(TipoAutoCessao tpCessao) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_tipocessao "
                    +"SET fk_categoriauto=?, nm_tipocessao=?, nm_login=?, dthr_atualizacao=? "
                    +"WHERE id_tipocessao = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, tpCessao.getFkCatAutoCessao());
                stmt.setString(2, tpCessao.getNmTipoAutoCessao());
                stmt.setString(3, tpCessao.getNmLogin() );
                stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, tpCessao.getPkTipoAutoCessao());
            stmt.execute();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }finally{
            stmt.close();
            connection.close();
        }
    } 
    
    
//METODO lista os Tipo de Auto Cessão para campo select
    public List<TipoAutoCessao> listSelectTpCessao() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<TipoAutoCessao> lisTpCessao = new ArrayList<TipoAutoCessao>();
        String sql = "SELECT id_tipocessao, fk_categoriauto, sg_categoriauto, nm_categoriaauto, "
                    + "nm_tipocessao, nm_login, dthr_atualizacao "
                    + "FROM vw_tipocessaocompleto "
                    + "ORDER BY nm_tipocessao ";
        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();  
                while (rs.next()){
                 TipoAutoCessao tpCessao = new TipoAutoCessao();
                    tpCessao.setPkTipoAutoCessao(rs.getInt("id_tipocessao"));
                    tpCessao.setFkCatAutoCessao(rs.getInt("fk_categoriauto"));
                    tpCessao.setSgCatAutoCessao(rs.getString("sg_categoriauto"));
                    tpCessao.setNmCatAutoCessao(rs.getString("nm_categoriaauto"));
                    tpCessao.setNmTipoAutoCessao(rs.getString("nm_tipocessao"));
                    tpCessao.setNmLogin(rs.getString("nm_login"));
                    tpCessao.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                 lisTpCessao.add(tpCessao);
                }       
                stmt.execute();
        return lisTpCessao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    } 
    
    

  
    
}
