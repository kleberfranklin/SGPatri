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
public class TipoDispositivoLegalDAO {
    
//Atrituto 
    private final Connection connection;

//Construtor
    public TipoDispositivoLegalDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }


    
//Metodo de quantidade de linhas
    public int qdTipoDispLegal (String q){
        String sql = ("SELECT COUNT(*) as total FROM tbl_tipodispositivolegal "
                    + "WHERE ( sg_tipodisplegal LIKE ? or nm_tipodisplegal LIKE ? ) ");
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+q+'%');
                stmt.setString(2, '%'+q+'%');
            ResultSet rs = stmt.executeQuery();
                int total = 0;
                if(rs.next()){
                    total = rs.getInt("total");
                }
            stmt.execute();
            stmt.close();
        return total;
        }catch (SQLException e){
            throw new RuntimeException(e);
            }
    }    

//METODO lista dos tipo de dispositivo das pesquisas e paginado
    public List<TipoDispositivoLegal> listTipoDispLegal(int qtLinha, int offset, String q ){
        String sql = ("SELECT * FROM tbl_tipodispositivolegal "
                    + "WHERE (sg_tipodisplegal LIKE ? or nm_tipodisplegal LIKE ? ) "
                    + "ORDER BY nm_tipodisplegal "
                    + "LIMIT ? OFFSET ? ");
        try{
            List<TipoDispositivoLegal> lisTpDispLegal = new ArrayList<TipoDispositivoLegal>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                
                 ResultSet rs = stmt.executeQuery();
                    while (rs.next()){
                    TipoDispositivoLegal tpdisp = new TipoDispositivoLegal();
                        tpdisp.setPkTipoDispLegal(rs.getInt("id_tipodisplegal"));
                        tpdisp.setSgTipoDispLegal(rs.getString("sg_tipodisplegal"));
                        tpdisp.setNmTipoDispLegal(rs.getString("nm_tipodisplegal"));
                        tpdisp.setNmLogin(rs.getString("nm_login"));
                        tpdisp.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                     lisTpDispLegal.add(tpdisp);
                    }
                stmt.close();
         return lisTpDispLegal;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }    

//METODO utilizado para retornar as informação de um Tipo de Dispositivo Legal
    public TipoDispositivoLegal detalheTpDisp(int pkTipoDispLegal){
        String sql = "SELECT * FROM tbl_tipodispositivolegal WHERE id_tipodisplegal = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkTipoDispLegal);
            ResultSet rs = stmt.executeQuery();
                    
            TipoDispositivoLegal tpdisp = new TipoDispositivoLegal();
            if(rs.next()){
                tpdisp.setPkTipoDispLegal(rs.getInt("id_tipodisplegal"));
                tpdisp.setSgTipoDispLegal(rs.getString("sg_tipodisplegal"));
                tpdisp.setNmTipoDispLegal(rs.getString("nm_tipodisplegal"));
                tpdisp.setNmLogin(rs.getString("nm_login"));
                tpdisp.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
         stmt.close();
         return tpdisp;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }
    }    
//METODO utilizado para inserir um novo Tipo de Dispositivo Legal no BANCO
    public void cTipoDisp(TipoDispositivoLegal tpdisp){
        String sql = "INSERT INTO tbl_tipodispositivolegal ( sg_tipodisplegal, nm_tipodisplegal, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1, tpdisp.getSgTipoDispLegal());
                    stmt.setString(2, tpdisp.getNmTipoDispLegal());
                    stmt.setString(3, tpdisp.getNmLogin());
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
    }       
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Tipo Dispositivo Legal
    public void upTipoDisp(TipoDispositivoLegal tpdisp){
        String sql = "UPDATE tbl_tipodispositivolegal SET sg_tipodisplegal=?, nm_tipodisplegal=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_tipodisplegal = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, tpdisp.getSgTipoDispLegal());
                    stmt.setString(2, tpdisp.getNmTipoDispLegal());
                    stmt.setString(3, tpdisp.getNmLogin());
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, tpdisp.getPkTipoDispLegal());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }
    } 
    
    
//METODO lista o Tipo Dispositivo Legal para campo select
    public List<TipoDispositivoLegal> listSelectTipoDisp() {
    String sql = "SELECT * FROM tbl_tipodispositivolegal ORDER BY nm_tipodisplegal";
    
    try {
        List<TipoDispositivoLegal> lisTipoDisp = new ArrayList<TipoDispositivoLegal>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
            while (rs.next()){
            TipoDispositivoLegal tpdisp = new TipoDispositivoLegal();
                tpdisp.setPkTipoDispLegal(rs.getInt("id_tipodisplegal"));
                tpdisp.setSgTipoDispLegal(rs.getString("sg_tipodisplegal"));
                tpdisp.setNmTipoDispLegal(rs.getString("nm_tipodisplegal"));
                tpdisp.setNmLogin(rs.getString("nm_login"));
                tpdisp.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
             lisTipoDisp.add(tpdisp);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return lisTipoDisp;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 



    
    
}
