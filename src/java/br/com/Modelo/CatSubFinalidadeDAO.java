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
    public int qdCatSubFinalidade (String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;
        String sql = ("SELECT COUNT(*) as total "
                    + "FROM tbl_subcategoriafinalidade "
                    + "WHERE (sg_subcatfinalidade ILIKE ? or nm_subcatfinalidade ILIKE ? ) ");
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

//METODO lista as Sub Categoria Finalidade das pesquisas e paginada
    public List<CatSubFinalidade> listCatSubFinalidade (int qtLinha, int offset, String q ){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<CatSubFinalidade> lisCatSub = new ArrayList<>();
        String sql = ("SELECT id_subcatfinalidade, fk_categoriafinalidade, sg_categoriafinalidade, nm_categoriafinalidade, "
                    + "sg_subcatfinalidade, nm_subcatfinalidade, nm_login, dthr_atualizacao "
                    + "FROM vw_subcategoriafinalidadecompleto "
                    + "WHERE (sg_subcatfinalidade ILIKE ? or nm_subcatfinalidade ILIKE ? ) "
                    + "ORDER BY nm_subcatfinalidade "
                    + "LIMIT ? OFFSET ? ");
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                rs = stmt.executeQuery();
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
            return lisCatSub;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        
    }    

//METODO utilizado para retornar as informação de uma Sub Categoria Finalidade
    public CatSubFinalidade detalheCatSubFinalidade(int pkCatSubFinalidade) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        CatSubFinalidade catSub = new CatSubFinalidade();
        String sql = "SELECT id_subcatfinalidade, fk_categoriafinalidade, sg_categoriafinalidade, nm_categoriafinalidade, "
                    + "sg_subcatfinalidade, nm_subcatfinalidade, nm_login, dthr_atualizacao   "
                    + "FROM vw_subcategoriafinalidadecompleto "
                    + "WHERE id_subcatfinalidade = ?";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, pkCatSubFinalidade);
                rs = stmt.executeQuery();
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
            return catSub;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
//                connection.close();
            }
    }    
//METODO utilizado para inserir uma nova Sub Categoria Finalidade no BANCO
    public void cCatSubFinalidade(CatSubFinalidade catSubFin) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_subcategoriafinalidade "
                + "(fk_categoriafinalidade, sg_subcatfinalidade, nm_subcatfinalidade, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,?, ?)";
            try{
                 stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, catSubFin.getFkCatFinalidade());
                    stmt.setString(2, catSubFin.getSgCatSubFinalidade());
                    stmt.setString(3, catSubFin.getNmCatSubFinalidade()) ;
                    stmt.setString(4, catSubFin.getNmLogin()) ;
                    stmt.setTimestamp(5,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }       
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Sub Categoria Finalidade
    public void upCatSubFinalidade(CatSubFinalidade catSubFin) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_subcategoriafinalidade "
                + "SET fk_categoriafinalidade=?, sg_subcatfinalidade=?, nm_subcatfinalidade=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_subcatfinalidade = ?";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, catSubFin.getFkCatFinalidade());
                    stmt.setString(2, catSubFin.getSgCatSubFinalidade());   
                    stmt.setString(3, catSubFin.getNmCatSubFinalidade());
                    stmt.setString(4, catSubFin.getNmLogin() );
                    stmt.setTimestamp(5,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(6, catSubFin.getPkCatSubFinalidade());
                stmt.execute();
            }catch (SQLException e){
               throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    } 
    
    
//METODO lista a Sub Categoria Finalidade para campo select
    public List<CatSubFinalidade> listSelectSubCatFinalidade(int pkCatFinalidade) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<CatSubFinalidade> lisCatSub = new ArrayList<>();
        String sql = "SELECT id_subcatfinalidade, fk_categoriafinalidade, sg_categoriafinalidade, nm_categoriafinalidade, sg_subcatfinalidade, "
                + "nm_subcatfinalidade, nm_login, dthr_atualizacao  "
                + "FROM vw_subcategoriafinalidadecompleto "
                + "WHERE fk_categoriafinalidade = ? "
                + "ORDER BY nm_subcatfinalidade ";
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkCatFinalidade);
                rs = stmt.executeQuery();  
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
        return lisCatSub;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    
    } 
    
    
    
    
}
