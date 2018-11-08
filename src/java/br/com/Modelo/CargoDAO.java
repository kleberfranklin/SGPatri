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
public class CargoDAO {
    
    
        private final Connection connection;

//Construtor
    public CargoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    
//METODO lista todos os cargo cadastrados, utilizado com campo select do pagaina cadastro e alteração de usuário
    public List<Cargo> listCargo() {
    String sql = "SELECT * FROM tbl_cargo";
    
    try {
        List<Cargo> cgLista = new ArrayList<Cargo>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
                
            while (rs.next()){
            Cargo cg = new Cargo();
                cg.setPkCargo(rs.getInt("id_cargo"));
                cg.setNmCargo(rs.getString("nm_cargo"));
                cg.setDsCargo(rs.getString("ds_cargo"));
                cg.setNmLogin(rs.getString("nm_login"));
                cg.setDsCargo(rs.getString("dthr_atualizacao"));
             cgLista.add(cg);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        
        return cgLista;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 
    
    
    
    
    
    
    
}
