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
public class CatContrapartidaDAO {
      
    
    private final Connection connection;
    

//Construtor
    public CatContrapartidaDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }


//Metodo de quantidade de linhas
    public int qdCatContrapartida (String q){
        String sql = ("SELECT COUNT(*) as total FROM tbl_categoriacontrapartida "
                    + "WHERE (sg_catcontrapartida ILIKE ? or nm_catcontrapartida ILIKE ? ) ");
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

//METODO lista as Categoria Contrapartida das pesquisas e paginada
    public List<CatContrapartida> listCatContra(int qtLinha, int offset, String q ){
        String sql = ("SELECT * FROM tbl_categoriacontrapartida "
                    + "WHERE (sg_catcontrapartida ILIKE ? or nm_catcontrapartida ILIKE ? ) "
                    + "ORDER BY nm_catcontrapartida "
                    + "LIMIT ? OFFSET ? ");
        try{
            List<CatContrapartida> lisContra = new ArrayList<CatContrapartida>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                
                 ResultSet rs = stmt.executeQuery();
                    while (rs.next()){
                    CatContrapartida catContra = new CatContrapartida();
                        catContra.setPkCatContrapartida(rs.getInt("id_catcontrapartida"));
                        catContra.setSgCatContrapartida(rs.getString("sg_catcontrapartida"));
                        catContra.setNmCatContrapartida(rs.getString("nm_catcontrapartida"));
                        catContra.setNmLogin(rs.getString("nm_login"));
                        catContra.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                     lisContra.add(catContra);
                    }
                stmt.close();
         return lisContra;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }    

//METODO utilizado para retornar as informação de um Categoria Contrapartida
    public CatContrapartida detalheCatContra(int pkCatContra){
        String sql = "SELECT * FROM tbl_categoriacontrapartida WHERE id_catcontrapartida = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkCatContra);
            ResultSet rs = stmt.executeQuery();
                    
            CatContrapartida catContra = new CatContrapartida();
            if(rs.next()){
                catContra.setPkCatContrapartida(rs.getInt("id_catcontrapartida"));
                catContra.setSgCatContrapartida(rs.getString("sg_catcontrapartida"));
                catContra.setNmCatContrapartida(rs.getString("nm_catcontrapartida"));
                catContra.setNmLogin(rs.getString("nm_login"));
                catContra.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         stmt.close();
         return catContra;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }
    }    
//METODO utilizado para inserir uma nova Categoria Contrapartida no BANCO
    public void cCatContra(CatContrapartida catContra){
        String sql = "INSERT INTO tbl_categoriacontrapartida ( sg_catcontrapartida, nm_catcontrapartida, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1, catContra.getSgCatContrapartida());
                    stmt.setString(2, catContra.getNmCatContrapartida());
                    stmt.setString(3, catContra.getNmLogin());
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
    }          
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Categoria Contrapartida
    public void upCatContra(CatContrapartida catContra){
        String sql = "UPDATE tbl_categoriacontrapartida SET sg_catcontrapartida=?, nm_catcontrapartida=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_catcontrapartida = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, catContra.getSgCatContrapartida());
                stmt.setString(2, catContra.getNmCatContrapartida());
                stmt.setString(3, catContra.getNmLogin() );
                stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, catContra.getPkCatContrapartida());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }
    } 
    
    
//METODO lista a Categoria CatFinalidade para campo select
    public List<CatContrapartida> listSelectCatContra() {
    String sql = "SELECT * FROM tbl_categoriacontrapartida ORDER BY nm_catcontrapartida";
    
    try {
        List<CatContrapartida> lisCatContra = new ArrayList<CatContrapartida>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
            
            while (rs.next()){
             CatContrapartida catContra = new CatContrapartida();
                catContra.setPkCatContrapartida(rs.getInt("id_catcontrapartida"));
                catContra.setSgCatContrapartida(rs.getString("sg_catcontrapartida"));
                catContra.setNmCatContrapartida(rs.getString("nm_catcontrapartida"));
                catContra.setNmLogin(rs.getString("nm_login"));
                catContra.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
             lisCatContra.add(catContra);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return lisCatContra;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 
    
    
}
