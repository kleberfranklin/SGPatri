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
    public List<NivelAdministracao> listNivelAdm() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<NivelAdministracao> lisNivelAdm = new ArrayList<>();
        
        String sql = ("SELECT id_niveladministracao, sg_administracao, nm_administracao, nm_login, dthr_atualizacao "
                    + "FROM tbl_niveladministracao "
                    + "ORDER BY nm_administracao");
        try {

                stmt = connection.prepareStatement(sql);
                rs = stmt.executeQuery();  

                while (rs.next()){
                NivelAdministracao nvadm = new NivelAdministracao();
                    nvadm.setPkAdm(rs.getInt("id_niveladministracao"));
                    nvadm.setSgAdm(rs.getString("sg_administracao"));
                    nvadm.setNmAdm(rs.getString("nm_administracao"));
                    nvadm.setNmLogin(rs.getString("nm_login"));
                    nvadm.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisNivelAdm.add(nvadm);
                }       
                stmt.execute();
                stmt.close();                                                                                                                                                                
            return lisNivelAdm;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
        
    } 
    
    
    //METODO utilizado para retornar as informação de um Nivel Administração
    public NivelAdministracao detalheNivelAdm(int pkNivelAdm) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        NivelAdministracao nvadm = new NivelAdministracao();
        String sql = "SELECT id_niveladministracao, sg_administracao, nm_administracao, nm_login, dthr_atualizacao "
                    + "FROM tbl_niveladministracao "
                    + "WHERE id_niveladministracao = ?";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, pkNivelAdm);
                    rs = stmt.executeQuery();
                if(rs.next()){
                    nvadm.setPkAdm(rs.getInt("id_niveladministracao"));
                    nvadm.setSgAdm(rs.getString("sg_administracao"));
                    nvadm.setNmAdm(rs.getString("nm_administracao"));
                    nvadm.setNmLogin(rs.getString("nm_login"));
                    nvadm.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                }
            return nvadm;
            
            }catch (SQLException e){
              throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
//                connection.close();
            }
    }   
    
    
    
}
