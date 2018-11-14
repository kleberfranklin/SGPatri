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
    
//METODO inserir Dispositivo Legal no Banco de Dados
    
    public void cDisLegal (DispositivoLegal dis){
        String sql = "INSERT INTO tbl_dispositivolegal (fk_tipodisplegal, fk_autocessao, nr_disp, dt_disp, nm_login, dthr_atualicacao ) "
                + "VALUES (?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareCall(sql);
                stmt.setInt(1, dis.getFkTipoDisplegal());
                stmt.setInt(2, dis.getFkAutoCessao());
                stmt.setString(3, dis.getNrDisp());
                stmt.setString(4, dis.getDtDisp());
                stmt.setString(5, dis.getNmLogin());
                stmt.setTimestamp(6, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
            stmt.cancel();
        }catch (SQLException e) {
        throw new RuntimeException(e);
      }
     
            
        
        
    }
    
//METODO lista o Dispositivo Legal para Formulario Auto Cessao Validação
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
