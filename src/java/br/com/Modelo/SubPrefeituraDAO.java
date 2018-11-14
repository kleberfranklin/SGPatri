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
    
    
    
    
}
