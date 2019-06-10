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
public class CatAutoCessaoDAO {
    private final Connection connection;

//Construtor
    public CatAutoCessaoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }


//Metodo de quantidade de linhas
    public int qdCatAutoCessao (String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;
        String sql = ("SELECT COUNT(*) as total "
                    + "FROM tbl_categoriautocessao "
                    + "WHERE (sg_categoriauto ILIKE ? or nm_categoriaauto ILIKE ? ) ");
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

//METODO lista as Categoria de Auto de Cessão das pesquisas e paginado
    public List<CatAutoCessao> listCatAuto(int qtLinha, int offset, String q ) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<CatAutoCessao> lisAuto = new ArrayList<CatAutoCessao>();
        String sql = ("SELECT id_categ_autocessao, sg_categoriauto, nm_categoriaauto, nm_login, dthr_atualizacao "
                    + "FROM tbl_categoriautocessao "
                    + "WHERE (sg_categoriauto ILIKE ? or nm_categoriaauto ILIKE ? ) "
                    + "ORDER BY nm_categoriaauto "
                    + "LIMIT ? OFFSET ? ");
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                rs = stmt.executeQuery();
                    while (rs.next()){
                    CatAutoCessao auto = new CatAutoCessao();
                        auto.setPkCatAutoCessao(rs.getInt("id_categ_autocessao"));
                        auto.setSgCatAutoCessao(rs.getString("sg_categoriauto"));
                        auto.setNmCatAutoCessao(rs.getString("nm_categoriaauto"));
                        auto.setNmLogin(rs.getString("nm_login"));
                        auto.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                     lisAuto.add(auto);
                    }
            return lisAuto;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
        
    }    

//METODO utilizado para retornar as informação de um Categoria de Auto de Cessão
    public CatAutoCessao detalheCatAuto(int pkCatAutoCessao) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CatAutoCessao auto = new CatAutoCessao();
        String sql = "SELECT id_categ_autocessao, sg_categoriauto, nm_categoriaauto, nm_login, dthr_atualizacao  "
                    + "FROM tbl_categoriautocessao "
                    + "WHERE id_categ_autocessao = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkCatAutoCessao);
            rs = stmt.executeQuery();
            if(rs.next()){
                auto.setPkCatAutoCessao(rs.getInt("id_categ_autocessao"));
                auto.setSgCatAutoCessao(rs.getString("sg_categoriauto"));
                auto.setNmCatAutoCessao(rs.getString("nm_categoriaauto"));
                auto.setNmLogin(rs.getString("nm_login"));
                auto.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         return auto;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
//            connection.close();
        }
    }    
//METODO utilizado para inserir uma nova Categoria de Auto de Cessão no BANCO
    public void cCatAutoCessao(CatAutoCessao catauto) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_categoriautocessao "
                + "(sg_categoriauto, nm_categoriaauto, nm_login, dthr_atualizacao) "
                + "VALUES (?,?,?,? )";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1, catauto.getSgCatAutoCessao() );
                    stmt.setString(2, catauto.getNmCatAutoCessao() );
                    stmt.setString(3, catauto.getNmLogin() );
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }       
    
//MEDOTO utilizado para realizar a alteração das informações de um Categoria de Auto de Cessão
    public void upCatAutoCessao(CatAutoCessao catauto) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_categoriautocessao "
                + "SET sg_categoriauto=?, nm_categoriaauto=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_categ_autocessao = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, catauto.getSgCatAutoCessao() );
                stmt.setString(2, catauto.getNmCatAutoCessao() );
                stmt.setString(3, catauto.getNmLogin() );
                stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, catauto.getPkCatAutoCessao());
            stmt.execute();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }finally{
            stmt.close();
            connection.close();
        }
    } 
    
    
//METODO lista a Categoria de Auto de Cessão para campo select
    public List<CatAutoCessao> listSelectCatAutoCessao() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<CatAutoCessao> lisAuto = new ArrayList<CatAutoCessao>();
        String sql = "SELECT id_categ_autocessao, sg_categoriauto, nm_categoriaauto, nm_login, dthr_atualizacao  "
                + "FROM tbl_categoriautocessao "
                + "ORDER BY nm_categoriaauto";
        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();  
            while (rs.next()){
            CatAutoCessao auto = new CatAutoCessao();
                auto.setPkCatAutoCessao(rs.getInt("id_categ_autocessao"));
                auto.setSgCatAutoCessao(rs.getString("sg_categoriauto"));
                auto.setNmCatAutoCessao(rs.getString("nm_categoriaauto"));
                auto.setNmLogin(rs.getString("nm_login"));
                auto.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
             lisAuto.add(auto);
            }       
            stmt.execute();
        return lisAuto;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
}
