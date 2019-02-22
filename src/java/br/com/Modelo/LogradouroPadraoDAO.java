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
public class LogradouroPadraoDAO {
    
    private final Connection connection;

//Construtor
    public LogradouroPadraoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }
    
    
    public List<LogradouroPadrao> pesquisaNomeLogradouro(String nmLogradouro){
            String sql = "SELECT nm_logradouro_completo, nr_cep, nm_bairro "
                    + "FROM tbl_logradouro_padrao "
                    + "WHERE nm_logradouro_completo ILIKE ? "
//                    + "GROUP BY nm_nome_log, nr_cep_d "
                    + "ORDER BY nm_logradouro_completo "
                    + "LIMIT 10 ";
        try{
            List<LogradouroPadrao> listLogradouro = new  ArrayList<LogradouroPadrao>();
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+nmLogradouro+'%');
                ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                LogradouroPadrao logpadrao = new LogradouroPadrao();
//                    logpadrao.setPkLogradouroPadrao(rs.getInt("id_dados_logradouros"));
                    logpadrao.setNmLogradouroCompleto(rs.getString("nm_logradouro_completo"));
                    logpadrao.setNmBairro(rs.getString("nm_bairro"));
                    logpadrao.setNrCep(rs.getString("nr_cep"));
                listLogradouro.add(logpadrao);
            }
            stmt.close();
        return listLogradouro;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    public LogradouroPadrao pesquisaCepLogradouro(String nrCep){
            String sql = "SELECT id_logradouro_padrao, nm_logradouro_completo, nr_cep, nm_bairro "
                    + "FROM tbl_logradouro_padrao "
                    + "WHERE nr_cep = ? ";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, nrCep);
                ResultSet rs = stmt.executeQuery();

            LogradouroPadrao logpadrao = new LogradouroPadrao();
                while (rs.next()){
                    logpadrao.setPkLogradouroPadrao(rs.getInt("id_logradouro_padrao"));
                    logpadrao.setNmLogradouroCompleto(rs.getString("nm_logradouro_completo"));
                    logpadrao.setNrCep(rs.getString("nr_cep"));
                    logpadrao.setNmBairro(rs.getString("nm_bairro"));
                }
            stmt.close();                
        return logpadrao;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
    public LogradouroPadrao pequisaPkLogradouro(int pkLogradouro){
        LogradouroPadrao lograPadrao = new LogradouroPadrao();
        String sql = "SELECT id_logradouro_padrao, nr_cep, nm_bairro, nm_logradouro_completo "
                    + "FROM tbl_logradouro_padrao "
                    + "WHERE id_logradouro_padrao = ? ";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkLogradouro);
                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                    lograPadrao.setPkLogradouroPadrao(rs.getInt("id_logradouro_padrao"));
                    lograPadrao.setNrCep(rs.getString("nr_cep"));
                    lograPadrao.setNmBairro(rs.getString("nm_bairro"));
                    lograPadrao.setNmLogradouroCompleto(rs.getString("nm_logradouro_completo"));
                }
                stmt.close();
            return lograPadrao;    
        }catch (SQLException e){
            throw new RuntimeException (e);
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
