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
public class NivelAdministracaoDAO {
    
//Atrituto 
    private final Connection connection;

//Construtor
    public NivelAdministracaoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }
    
    
//METODO lista os NivelAdm select    
    public List<NivelAdministracao> listNivelAdm() {
        String sql = ("SELECT * FROM niveladministracao ORDER BY nm_administracao");
    try {
        List<NivelAdministracao> lisNivelAdm = new ArrayList<NivelAdministracao>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();  
                
            while (rs.next()){
            NivelAdministracao nvadm = new NivelAdministracao();
                nvadm.setPkNiveladm(rs.getInt("pk_niveladministracao"));
                nvadm.setSgAdm(rs.getString("sg_administracao"));
                nvadm.setNnAdm(rs.getString("nm_administracao"));
                nvadm.setNmLogin(rs.getString("nm_login"));
                nvadm.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            lisNivelAdm.add(nvadm);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        
        return lisNivelAdm;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 
    
    
    
}
