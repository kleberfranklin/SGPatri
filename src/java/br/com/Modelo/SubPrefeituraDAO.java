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
public class SubPrefeituraDAO {
    private final Connection connection;
    
    
    public SubPrefeituraDAO (){
        this.connection = new FabricaConexao().getConnetion();
    }
    
//METODO lista as Subpreituras para campo select
    public List<SubPrefeitura> listSelectSubPref() {
    String sql = "SELECT * FROM tbl_subprefeitura ORDER BY nm_subprefeitura ";
    
    try {
        List<SubPrefeitura> subPref = new ArrayList<SubPrefeitura>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
            
            while (rs.next()){
             SubPrefeitura subpref = new SubPrefeitura();
                subpref.setPkSubPrefeitura(rs.getInt("id_subprefeitura"));
                subpref.setSgSbuPrefeitura(rs.getString("sg_subprefeitura"));
                subpref.setNmSubPrefeitura(rs.getString("nm_subprefeitura"));
             subPref.add(subpref);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return subPref;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }     
    
//METODO utilizado para retornar as informação de um Subprefeitura
    public SubPrefeitura detalheSubPref(int pkSubPref){
        String sql = "SELECT * FROM tbl_subprefeitura WHERE id_subprefeitura = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkSubPref);
            ResultSet rs = stmt.executeQuery();
                    
            SubPrefeitura sub = new SubPrefeitura();
            if(rs.next()){
                sub.setPkSubPrefeitura(rs.getInt("id_subprefeitura"));
                sub.setSgSbuPrefeitura(rs.getString("sg_subprefeitura"));
                sub.setNmSubPrefeitura(rs.getString("nm_subprefeitura"));
                sub.setNmSubPrefeito(rs.getString("nm_subprefeito"));
                sub.setNmTelefone(rs.getString("nm_telefone"));
                sub.setNmEndereco(rs.getString("nm_endereco"));
                sub.setNmEmail(rs.getString("nm_email"));
                sub.setNmSite(rs.getString("nm_site"));
                sub.setNmLogin(rs.getString("nm_login"));
                sub.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         stmt.close();
         return sub;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }
    }   
        
    
    
}
