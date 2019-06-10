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
    public int qdCatFinalidade (String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;
        String sql = ("SELECT COUNT(*) as total "
                + "FROM tbl_categoriafinalidade "
                    + "WHERE (sg_categoriafinalidade ILIKE ? or nm_categoriafinalidade ILIKE ? ) ");
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

//METODO lista as Categoria Finalidade das pesquisas e paginada
    public List<CatFinalidade> listCatFinalidade (int qtLinha, int offset, String q ) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<CatFinalidade> lisCatFin = new ArrayList<CatFinalidade>();
        String sql = ("SELECT id_categoriafinalidade, sg_categoriafinalidade, nm_categoriafinalidade, nm_login, dthr_atualizacao "
                    + "FROM tbl_categoriafinalidade "
                    + "WHERE (sg_categoriafinalidade ILIKE ? or nm_categoriafinalidade ILIKE ? ) "
                    + "ORDER BY nm_categoriafinalidade "
                    + "LIMIT ? OFFSET ? ");
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setString(1,'%'+q+'%');
                stmt.setString(2,'%'+q+'%');
                stmt.setInt(3, qtLinha);
                stmt.setInt(4, offset);
            rs = stmt.executeQuery();
                    while (rs.next()){
                    CatFinalidade catFin = new CatFinalidade();
                        catFin.setPkCatFinalidade(rs.getInt("id_categoriafinalidade"));
                        catFin.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                        catFin.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                        catFin.setNmLogin(rs.getString("nm_login"));
                        catFin.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                     lisCatFin.add(catFin);
                    }
            return lisCatFin;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
        
    }    

//METODO utilizado para retornar as informação de um Categoria Finalidade
    public CatFinalidade detalheCatFinalidade(int pkCatFinalidade) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CatFinalidade catFin = new CatFinalidade();
        String sql = "SELECT id_categoriafinalidade, sg_categoriafinalidade, nm_categoriafinalidade, nm_login, dthr_atualizacao "
                    + "FROM tbl_categoriafinalidade "
                    + "WHERE id_categoriafinalidade = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkCatFinalidade);
            rs = stmt.executeQuery();
            if(rs.next()){
                catFin.setPkCatFinalidade(rs.getInt("id_categoriafinalidade"));
                catFin.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                catFin.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                catFin.setNmLogin(rs.getString("nm_login"));
                catFin.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         return catFin;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
//            connection.close();
        }
    }    
//METODO utilizado para inserir uma nova Categoria Finalidade no BANCO
    public void cCatFinalidade(CatFinalidade catFin) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_categoriafinalidade "
                + "(sg_categoriafinalidade, nm_categoriafinalidade, nm_login, dthr_atualizacao) "
                + "VALUES (?,?,?,? )";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1, catFin.getSgCatFinalidade());
                    stmt.setString(2, catFin.getNmCatFinalidade());
                    stmt.setString(3, catFin.getNmLogin());
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }          
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Categoria Finalidade
    public void upCatFinalidade(CatFinalidade catFin) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_categoriafinalidade SET "
                + "sg_categoriafinalidade=?, nm_categoriafinalidade=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_categoriafinalidade = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, catFin.getSgCatFinalidade() );
                stmt.setString(2, catFin.getNmCatFinalidade() );
                stmt.setString(3, catFin.getNmLogin() );
                stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, catFin.getPkCatFinalidade());
            stmt.execute();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }finally{
            stmt.close();
            connection.close();
        }
    } 
    
    
//METODO lista a Categoria Finalidade para campo select
    public List<CatFinalidade> listSelectCatFinalidade() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<CatFinalidade> lisCatFin = new ArrayList<CatFinalidade>();
        String sql = "SELECT id_categoriafinalidade, sg_categoriafinalidade, nm_categoriafinalidade, nm_login, dthr_atualizacao  "
                + "FROM tbl_categoriafinalidade "
                + "ORDER BY nm_categoriafinalidade";
        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();  
                while (rs.next()){
                 CatFinalidade catFin = new CatFinalidade();
                    catFin.setPkCatFinalidade(rs.getInt("id_categoriafinalidade"));
                    catFin.setSgCatFinalidade(rs.getString("sg_categoriafinalidade"));
                    catFin.setNmCatFinalidade(rs.getString("nm_categoriafinalidade"));
                    catFin.setNmLogin(rs.getString("nm_login"));
                    catFin.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                 lisCatFin.add(catFin);
                }       
        return lisCatFin;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    } 
    
    
    
    
}
