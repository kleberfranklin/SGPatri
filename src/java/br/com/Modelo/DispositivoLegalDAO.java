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
    
    public void cDisLegal (DispositivoLegal dis) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_dispositivolegal "
                + "(fk_tipodisplegal, fk_autocessao, nr_disp, dt_disp, nm_login, dthr_atualicacao ) "
                + "VALUES (?,?,?,?,?,?)";
            try{
                 stmt = connection.prepareCall(sql);
                    stmt.setInt(1, dis.getFkTipoDisplegal());
                    stmt.setInt(2, dis.getFkAutoCessao());
                    stmt.setString(3, dis.getNrDisp());
                    stmt.setString(4, dis.getDtDisp());
                    stmt.setString(5, dis.getNmLogin());
                    stmt.setTimestamp(6, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
//                stmt.close();
//                connection.close();
            }
    }
    
    
//MEDOTO excluir o Dispositivo Legal 
    public void delDispositivo (int pkDispLegal, int fkAutoCessao) throws SQLException{
        PreparedStatement stmt = null;
        String sql= "DELETE FROM tbl_dispositivolegal "
                + "WHERE id_displegal= ? and fk_autocessao = ?";
            try{
                stmt = connection.prepareCall(sql);
                    stmt.setInt(1, pkDispLegal);
                    stmt.setInt(2, fkAutoCessao);
                stmt.execute();
            }catch(SQLException e){
              throw new RuntimeException(e);
            }finally{
//                stmt.close();
//                connection.close();
            }
    }
    
//METODO lista o Dispositivo Legal para Formulario Auto Cessao Validação
    public List<DispositivoLegal> listDispositivo(int fkAutoCessao) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<DispositivoLegal> lisDisp = new ArrayList<DispositivoLegal>();
        String sql = "SELECT dip.id_displegal, dip.fk_tipodisplegal, tp.nm_tipodisplegal, dip.nm_titulo, dip.nr_disp, dip.dt_disp  "
                + "FROM tbl_dispositivolegal dip "
                + "JOIN tbl_tipodispositivolegal tp ON tp.id_tipodisplegal = dip.fk_tipodisplegal "
                + "WHERE dip.fk_autocessao = ? "
                + "ORDER BY dip.id_displegal";
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, fkAutoCessao);
            rs = stmt.executeQuery();  
            while (rs.next()){
            DispositivoLegal disp = new DispositivoLegal();
            TipoDispositivoLegal tpDips = new TipoDispositivoLegal();
                tpDips.setNmTipoDispLegal(rs.getString("nm_tipodisplegal"));
                disp.setTipoDispositivo(tpDips);
                disp.setPkDisplegal(rs.getInt("id_displegal"));
                disp.setFkTipoDisplegal(rs.getInt("fk_tipodisplegal"));
                disp.setNmTitulo(rs.getString("nm_titulo"));
                disp.setNrDisp(rs.getString("nr_disp"));
                disp.setDtDisp(rs.getString("dt_disp"));
             lisDisp.add(disp);
            }       
            stmt.execute();
        return lisDisp;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    } 
    
 
    
    
    
    
}
