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
    public int qdTipoDispLegal (String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;
        String sql = ("SELECT COUNT(*) as total FROM tbl_tipodispositivolegal "
                    + "WHERE (sg_tipodisplegal LIKE ? or nm_tipodisplegal LIKE ? ) ");
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+q+'%');
                stmt.setString(2, '%'+q+'%');
            rs = stmt.executeQuery();
                if(rs.next()){
                    total = rs.getInt("total");
                }
            stmt.execute();
            return total;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
        
    }    

//METODO lista dos tipo de dispositivo das pesquisas e paginado
    public List<TipoDispositivoLegal> listTipoDispLegal(int qtLinha, int offset, String q ) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<TipoDispositivoLegal> lisTpDispLegal = new ArrayList<TipoDispositivoLegal>();

        String sql = ("SELECT id_tipodisplegal, sg_tipodisplegal, nm_tipodisplegal, nm_login, dthr_atualizacao  "
                    + "FROM tbl_tipodispositivolegal "
                    + "WHERE (sg_tipodisplegal LIKE ? or nm_tipodisplegal LIKE ? ) "
                    + "ORDER BY nm_tipodisplegal "
                    + "LIMIT ? OFFSET ? ");
        try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setString(2,'%'+q+'%');
                    stmt.setInt(3, qtLinha);
                    stmt.setInt(4, offset);
                
                rs = stmt.executeQuery();
                    while (rs.next()){
                    TipoDispositivoLegal tpdisp = new TipoDispositivoLegal();    
                        tpdisp.setPkTipoDispLegal(rs.getInt("id_tipodisplegal"));
                        tpdisp.setSgTipoDispLegal(rs.getString("sg_tipodisplegal"));
                        tpdisp.setNmTipoDispLegal(rs.getString("nm_tipodisplegal"));
                        tpdisp.setNmLogin(rs.getString("nm_login"));
                        tpdisp.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                     lisTpDispLegal.add(tpdisp);
                    }
                return lisTpDispLegal;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
        
    }    

//METODO utilizado para retornar as informação de um Tipo de Dispositivo Legal
    public TipoDispositivoLegal detalheTpDisp(int pkTipoDispLegal) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoDispositivoLegal tpdisp = new TipoDispositivoLegal();
        
        String sql = "SELECT id_tipodisplegal, sg_tipodisplegal, nm_tipodisplegal, nm_login, dthr_atualizacao "
                    + "FROM tbl_tipodispositivolegal "
                    + "WHERE id_tipodisplegal = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkTipoDispLegal);
                rs = stmt.executeQuery();
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
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    }    
//METODO utilizado para inserir um novo Tipo de Dispositivo Legal no BANCO
    public void cTipoDisp(TipoDispositivoLegal tpdisp) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_tipodispositivolegal "
                + "( sg_tipodisplegal, nm_tipodisplegal, nm_login, dthr_atualizacao ) "
                    + "VALUES (?,?,?,? )";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1, tpdisp.getSgTipoDispLegal());
                    stmt.setString(2, tpdisp.getNmTipoDispLegal());
                    stmt.setString(3, tpdisp.getNmLogin());
                    stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
            stmt.close();
            connection.close();
        }
    }       
    
    
//MEDOTO utilizado para realizar a alteração das informações de um Tipo Dispositivo Legal
    public void upTipoDisp(TipoDispositivoLegal tpdisp) throws SQLException{
        PreparedStatement stmt = null;
        
        String sql = "UPDATE tbl_tipodispositivolegal "
                    +"SET sg_tipodisplegal=?, nm_tipodisplegal=?, nm_login=?, dthr_atualizacao=? "
                    +"WHERE id_tipodisplegal = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, tpdisp.getSgTipoDispLegal());
                stmt.setString(2, tpdisp.getNmTipoDispLegal());
                stmt.setString(3, tpdisp.getNmLogin());
                stmt.setTimestamp(4,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, tpdisp.getPkTipoDispLegal());
            stmt.execute();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }finally{
            stmt.close();
            connection.close();
        }
    } 
    
    
//METODO lista o Tipo Dispositivo Legal para campo select
    public List<TipoDispositivoLegal> listSelectTipoDisp() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<TipoDispositivoLegal> lisTipoDisp = new ArrayList<TipoDispositivoLegal>();
        
        String sql = "SELECT id_tipodisplegal, sg_tipodisplegal, nm_tipodisplegal, nm_login, dthr_atualizacao "
                    +"FROM tbl_tipodispositivolegal "
                    +"ORDER BY nm_tipodisplegal";
    
        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();  
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
        return lisTipoDisp;

        } catch (SQLException e) {
            throw new RuntimeException(e);
          }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
        } 



    
    
}
