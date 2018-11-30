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
public class CatEntidadeDAO {
    
    
    //Atrituto 
    private final Connection connection;

//Construtor
    public CatEntidadeDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }
    
    
//METODO lista de Categoria de Entidades select    
    public List<CatEntidade> listCatEnt() {
        String sql = ("SELECT * FROM tbl_categoriaentidade ORDER BY nm_categ_ent");
    try {
        List<CatEntidade> lisCatEnt = new ArrayList<>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
                
            while (rs.next()){
            CatEntidade catent = new CatEntidade();
                catent.setPkCatEntidade(rs.getInt("id_categ_ent"));
                catent.setSgCateEntidade(rs.getString("sg_categ_ent"));
                catent.setNmCatEntidade(rs.getString("nm_categ_ent"));
                catent.setNmLogin(rs.getString("nm_login"));
                catent.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            lisCatEnt.add(catent);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return lisCatEnt;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 


 //METODO utilizado para retornar as informação de uma Categoria de Entidade
    public CatEntidade detalheCatEnt(int pkCatEntidade){
        String sql = "SELECT * FROM tbl_categoriaentidade WHERE id_categ_ent = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkCatEntidade);
            ResultSet rs = stmt.executeQuery();
                    
            CatEntidade catent = new CatEntidade();
            if(rs.next()){
                catent.setPkCatEntidade(rs.getInt("id_categ_ent"));
                catent.setSgCateEntidade(rs.getString("sg_categ_ent"));
                catent.setNmCatEntidade(rs.getString("nm_categ_ent"));
                catent.setNmLogin(rs.getString("nm_login"));
                catent.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         stmt.close();
         return catent;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }
    }       
    
}
