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
public class CatFinalidadeDAO {
    
private final Connection connection;

//Construtor
    public CatFinalidadeDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }


//Metodo de quantidade de linhas
    public int qdCatFinalidade (String q){
        String sql = ("SELECT COUNT(*) as total FROM tbl_categoriafinalidade "
                    + "WHERE (sg_categoriafinalidade ILIKE ? or nm_categoriafinalidade ILIKE ? ) ");
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

//METODO lista as Categoria Finalidade das pesquisas e paginada
    public List<CatFinalidade> listCatFinalidade (int qtLinha, int offset, String q ){
        String sql = ("SELECT * FROM tbl_categoriafinalidade "
                    + "WHERE (sg_categoriafinalidade ILIKE ? or nm_categoriafinalidade ILIKE ? ) "
                    + "ORDER BY nm_categoriafinalidade "
                    + "LIMIT ? OFFSET ? ");
        try{
            List<CatFinalidade> lisCatFin = new ArrayList<CatFinalidade>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                
                 ResultSet rs = stmt.executeQuery();
                    while (rs.next()){
                    CatFinalidade catFin = new CatFinalidade();
                        catFin.setPkCatFinalidade(rs.getInt("id_categoriafinalidade"));
                        catFin.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                        catFin.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                        catFin.setNmLogin(rs.getString("nm_login"));
                        catFin.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                     lisCatFin.add(catFin);
                    }
                stmt.close();
         return lisCatFin;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }    

//METODO utilizado para retornar as informação de um Categoria Finalidade
    public CatFinalidade detalheCatFinalidade(int pkCatFinalidade){
        String sql = "SELECT * FROM tbl_categoriafinalidade WHERE id_categoriafinalidade = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkCatFinalidade);
            ResultSet rs = stmt.executeQuery();
                    
            CatFinalidade catFin = new CatFinalidade();
            if(rs.next()){
                catFin.setPkCatFinalidade(rs.getInt("id_categoriafinalidade"));
                catFin.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                catFin.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                catFin.setNmLogin(rs.getString("nm_login"));
                catFin.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         stmt.close();
         return catFin;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }
    }    
//METODO utilizado para inserir uma nova Categoria Finalidade no BANCO
    public void cCatFinalidade(CatFinalidade catFin){
        String sql = "INSERT INTO tbl_categoriafinalidade ( sg_categoriafinalidade, nm_categoriafinalidade, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1, catFin.getSgCatFinalidade());
                    stmt.setString(2, catFin.getNmCatFinalidade());
                    stmt.setString(3, catFin.getNmLogin());
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
    }          
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Categoria Finalidade
    public void upCatFinalidade(CatFinalidade catFin){
        String sql = "UPDATE tbl_categoriafinalidade SET sg_categoriafinalidade=?, nm_categoriafinalidade=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_categoriafinalidade = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, catFin.getSgCatFinalidade() );
                stmt.setString(2, catFin.getNmCatFinalidade() );
                stmt.setString(3, catFin.getNmLogin() );
                stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, catFin.getPkCatFinalidade());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }
    } 
    
    
//METODO lista a Categoria Finalidade para campo select
    public List<CatFinalidade> listSelectCatFinalidade() {
    String sql = "SELECT * FROM tbl_categoriafinalidade ORDER BY nm_categoriafinalidade";
    
    try {
        List<CatFinalidade> lisCatFin = new ArrayList<CatFinalidade>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
            
            while (rs.next()){
             CatFinalidade catFin = new CatFinalidade();
                catFin.setPkCatFinalidade(rs.getInt("id_categoriafinalidade"));
                catFin.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                catFin.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                catFin.setNmLogin(rs.getString("nm_login"));
                catFin.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
             lisCatFin.add(catFin);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return lisCatFin;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 
    
    
    
    
}
