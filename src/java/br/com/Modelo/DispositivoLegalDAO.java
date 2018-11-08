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
public class DispositivoLegalDAO {
    
    private final Connection connection;
    
    public DispositivoLegalDAO(){
        this.connection = new FabricaConexao().getConnetion();
    }
    
    
    
//METODO lista o Tipo Dispositivo Legal para Formulario Auto Cessao Validação
    public List<DispositivoLegal> listDispositivo(int pkDisplegal) {
    String sql = "SELECT * FROM tbl_dispositivolegal WHERE  id_displegal = ? ORDER BY nm_tipodisplegal";
    
    try {
        List<DispositivoLegal> lisDisp = new ArrayList<DispositivoLegal>();
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkDisplegal);
            ResultSet rs = stmt.executeQuery();  
            while (rs.next()){
            DispositivoLegal disp = new DispositivoLegal();
                disp.setPkDisplegal(rs.getInt("id_displegal"));
                disp.setNmTitulo(rs.getString("nm_titulo"));
                disp.setNrDisp(rs.getString("nr_disp"));
                disp.setDtDisp(rs.getString("dt_disp"));
             lisDisp.add(disp);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return lisDisp;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 
    
    
}
