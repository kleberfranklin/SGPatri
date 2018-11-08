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
    public int qdCatAutoCessao (String q){
        String sql = ("SELECT COUNT(*) as total FROM tbl_categoriautocessao "
                    + "WHERE (sg_categoriauto LIKE ? or nm_categoriaauto LIKE ? ) ");
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+q+'%');
                stmt.setString(2, '%'+q+'%');
            ResultSet rs = stmt.executeQuery();
                int total = 0;
                if(rs.next()){
                    total = rs.getInt("total");
                }
            stmt.execute();
            stmt.close();
        return total;
        }catch (SQLException e){
            throw new RuntimeException(e);
            }
    }    

//METODO lista as Categoria de Auto de Cessão das pesquisas e paginado
    public List<CatAutoCessao> listCatAuto(int qtLinha, int offset, String q ){
        String sql = ("SELECT * FROM tbl_categoriautocessao "
                    + "WHERE (sg_categoriauto LIKE ? or nm_categoriaauto LIKE ? ) "
                    + "ORDER BY nm_categoriaauto "
                    + "LIMIT ? OFFSET ? ");
        try{
            List<CatAutoCessao> lisAuto = new ArrayList<CatAutoCessao>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                
                 ResultSet rs = stmt.executeQuery();
                    while (rs.next()){
                    CatAutoCessao auto = new CatAutoCessao();
                        auto.setPkCatAutoCessao(rs.getInt("id_categ_autocessao"));
                        auto.setSgCatAutoCessao(rs.getString("sg_categoriauto"));
                        auto.setNmCatAutoCessao(rs.getString("nm_categoriaauto"));
                        auto.setNmLogin(rs.getString("nm_login"));
                        auto.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                     lisAuto.add(auto);
                    }
                stmt.close();
         return lisAuto;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }    

//METODO utilizado para retornar as informação de um Categoria de Auto de Cessão
    public CatAutoCessao detalheCatAuto(int pkCatAutoCessao){
        String sql = "SELECT * FROM tbl_categoriautocessao WHERE id_categ_autocessao = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkCatAutoCessao);
            ResultSet rs = stmt.executeQuery();
                    
            CatAutoCessao auto = new CatAutoCessao();
            if(rs.next()){
                auto.setPkCatAutoCessao(rs.getInt("id_categ_autocessao"));
                auto.setSgCatAutoCessao(rs.getString("sg_categoriauto"));
                auto.setNmCatAutoCessao(rs.getString("nm_categoriaauto"));
                auto.setNmLogin(rs.getString("nm_login"));
                auto.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         stmt.close();
         return auto;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }
    }    
//METODO utilizado para inserir uma nova Categoria de Auto de Cessão no BANCO
    public void cCatAutoCessao(CatAutoCessao catauto){
        String sql = "INSERT INTO tbl_categoriautocessao ( sg_categoriauto, nm_categoriaauto, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                    //stmt.setInt( 1, 2);    
                    stmt.setString(1, catauto.getSgCatAutoCessao() );
                    stmt.setString(2, catauto.getNmCatAutoCessao() );
                    stmt.setString(3, catauto.getNmLogin() );
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
    }       
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Categoria de Auto de Cessão
    public void upCatAutoCessao(CatAutoCessao catauto){
        String sql = "UPDATE tbl_categoriautocessao SET sg_categoriauto=?, nm_categoriaauto=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_categ_autocessao = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, catauto.getSgCatAutoCessao() );
                stmt.setString(2, catauto.getNmCatAutoCessao() );
                stmt.setString(3, catauto.getNmLogin() );
                stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, catauto.getPkCatAutoCessao());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }
    } 
    
    
//METODO lista a Categoria de Auto de Cessão para campo select
    public List<CatAutoCessao> listSelectCatAutoCessao() {
    String sql = "SELECT * FROM tbl_categoriautocessao ORDER BY nm_categoriaauto";
    
    try {
        List<CatAutoCessao> lisAuto = new ArrayList<CatAutoCessao>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
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
            stmt.close();                                                                                                                                                                
        return lisAuto;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
}
