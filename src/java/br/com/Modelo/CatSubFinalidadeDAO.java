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
public class CatSubFinalidadeDAO {
    
    private final Connection connection;

//Construtor
    public CatSubFinalidadeDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }


//Metodo de quantidade de linhas
    public int qdCatSubFinalidade (String q){
        String sql = ("SELECT COUNT(*) as total FROM tbl_subcategoriafinalidade "
                    + "WHERE (sg_subcatfinalidade ILIKE ? or nm_subcatfinalidade ILIKE ? ) ");
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

//METODO lista as Sub Categoria Finalidade das pesquisas e paginada
    public List<CatSubFinalidade> listCatSubFinalidade (int qtLinha, int offset, String q ){
        String sql = ("SELECT * FROM vw_subcategoriafinalidadecompleto "
                    + "WHERE (sg_subcatfinalidade ILIKE ? or nm_subcatfinalidade ILIKE ? ) "
                    + "ORDER BY nm_subcatfinalidade "
                    + "LIMIT ? OFFSET ? ");
        try{
            List<CatSubFinalidade> lisCatSub = new ArrayList<>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                
                 ResultSet rs = stmt.executeQuery();
                    while (rs.next()){
                    CatSubFinalidade catSub = new CatSubFinalidade();
                        catSub.setPkCatSubFinalidade(rs.getInt("id_subcatfinalidade"));
                        catSub.setFkCatFinalidade(rs.getInt("fk_categoriafinalidade"));
                        catSub.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                        catSub.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                        catSub.setSgCatSubFinalidade(rs.getString("sg_subcatfinalidade"));
                        catSub.setNmCatSubFinalidade(rs.getString("nm_subcatfinalidade"));
                        catSub.setNmLogin(rs.getString("nm_login"));
                        catSub.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                     lisCatSub.add(catSub);
                    }
                stmt.close();
         return lisCatSub;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }    

//METODO utilizado para retornar as informação de uma Sub Categoria Finalidade
    public CatSubFinalidade detalheCatSubFinalidade(int pkCatSubFinalidade){
        String sql = "SELECT * FROM vw_subcategoriafinalidadecompleto WHERE id_subcatfinalidade = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkCatSubFinalidade);
            ResultSet rs = stmt.executeQuery();
                    
            CatSubFinalidade catSub = new CatSubFinalidade();
            if(rs.next()){
                catSub.setPkCatSubFinalidade(rs.getInt("id_subcatfinalidade"));
                catSub.setFkCatFinalidade(rs.getInt("fk_categoriafinalidade"));
                catSub.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                catSub.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                catSub.setSgCatSubFinalidade(rs.getString("sg_subcatfinalidade"));
                catSub.setNmCatSubFinalidade(rs.getString("nm_subcatfinalidade"));
                catSub.setNmLogin(rs.getString("nm_login"));
                catSub.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         stmt.close();
         return catSub;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }
    }    
//METODO utilizado para inserir uma nova Sub Categoria Finalidade no BANCO
    public void cCatSubFinalidade(CatSubFinalidade catSubFin){
        String sql = "INSERT INTO tbl_subcategoriafinalidade (fk_categoriafinalidade, sg_subcatfinalidade, nm_subcatfinalidade, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,?, ?)";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, catSubFin.getFkCatFinalidade());
                    stmt.setString(2, catSubFin.getSgCatSubFinalidade());
                    stmt.setString(3, catSubFin.getNmCatSubFinalidade()) ;
                    stmt.setString(4, catSubFin.getNmLogin()) ;
                    stmt.setTimestamp(5,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
    }       
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Sub Categoria Finalidade
    public void upCatSubFinalidade(CatSubFinalidade catSubFin){
        String sql = "UPDATE tbl_subcategoriafinalidade SET fk_categoriafinalidade=?, sg_subcatfinalidade=?, nm_subcatfinalidade=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_subcatfinalidade = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, catSubFin.getFkCatFinalidade());
                stmt.setString(2, catSubFin.getSgCatSubFinalidade());
                stmt.setString(3, catSubFin.getNmCatSubFinalidade());
                stmt.setString(4, catSubFin.getNmLogin() );
                stmt.setTimestamp(5,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(6, catSubFin.getPkCatSubFinalidade());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }
    } 
    
    
//METODO lista a Sub Categoria Finalidade para campo select
    public List<CatSubFinalidade> listSelectSubCatFinalidade(int pkCatFinalidade) {
    String sql = "SELECT * FROM vw_subcategoriafinalidadecompleto "
            + "WHERE fk_categoriafinalidade = ? "
            + "ORDER BY nm_subcatfinalidade ";
            
    try {
        List<CatSubFinalidade> lisCatSub = new ArrayList<>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkCatFinalidade);
            ResultSet rs = stmt.executeQuery();  
            
            while (rs.next()){
            CatSubFinalidade catSub = new CatSubFinalidade();
                catSub.setPkCatSubFinalidade(rs.getInt("id_subcatfinalidade"));
                catSub.setFkCatFinalidade(rs.getInt("fk_categoriafinalidade"));
                catSub.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                catSub.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                catSub.setSgCatSubFinalidade(rs.getString("sg_subcatfinalidade"));
                catSub.setNmCatSubFinalidade(rs.getString("nm_subcatfinalidade"));
                catSub.setNmLogin(rs.getString("nm_login"));
                catSub.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            lisCatSub.add(catSub);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return lisCatSub;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 
    
    
    
    
}
