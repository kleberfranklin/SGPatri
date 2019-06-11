/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;


import java.sql.Array;
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
public class AnexoCroquiDAO {
    
    private final Connection connection;
    

//Construtor
    public AnexoCroquiDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    
    public List<AnexoCroqui> listAnexo(int pkAnotacaoExpediente) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AnexoCroqui> listAnexo = new ArrayList<AnexoCroqui>();               
        String sql = ("SELECT id_anexo_croqui, nm_anexo, ds_anexo, fk_tipo_anexo, sg_tipo_anexo_croqui, nm_tipo_anexo_croqui, nm_diretorio, nm_extensao, an.nm_login, an.dthr_atualizacao "
                    +"FROM tbl_anexo_anotacao_expediente_croqui an "
                    +"JOIN sch_cgpatri.tbl_tipo_anexo_croqui tp "
                    +"ON tp.id_tipo_anexo_croqui = an.fk_tipo_anexo "
                    +"WHERE id_anexo_croqui in(SELECT id_anexo_croqui "
                    +"FROM tbl_cross_anotacao_croqui_anexo "
                    +"WHERE id_anotacao_expediente in(?)) ");
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkAnotacaoExpediente);
            rs = stmt.executeQuery();
                while(rs.next()){
                    AnexoCroqui anexo = new AnexoCroqui();
                        TipoAnexo tpAn = new TipoAnexo();
                        tpAn.setPkTipoAnexo(rs.getInt("fk_tipo_anexo"));
                        tpAn.setSgTipoAnexo(rs.getString("sg_tipo_anexo_croqui"));
                        tpAn.setNmTipoAnexo(rs.getString("nm_tipo_anexo_croqui"));
                        anexo.setTpAnexo(tpAn);
                        anexo.setPkAnexoCroqui(rs.getInt("id_anexo_croqui"));
                        anexo.setFkTipoAnexo(rs.getInt("fk_tipo_anexo"));
                        anexo.setNmAnexo(rs.getString("nm_anexo"));
                        anexo.setDsAnexo(rs.getString("ds_anexo"));
                        anexo.setNmDiretorio(rs.getString("nm_diretorio"));
                        anexo.setNmExtensao(rs.getString("nm_extensao"));
                        anexo.setNmLogin(rs.getString("nm_login"));
                        anexo.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                    listAnexo.add(anexo);
                 }
            return listAnexo;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }
    
    public AnexoCroqui detalheAnexo(int pkAntoCroqui) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AnexoCroqui anexo = new AnexoCroqui();               
        String sql = ("SELECT id_anexo_croqui, fk_tipo_anexo, nm_anexo, nm_diretorio, nm_extensao, nm_login, dthr_atualizacao "
                    +"FROM tbl_anexo_anotacao_expediente_croqui "
                    +"WHERE id_anexo_croqui = ? ");
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkAntoCroqui);
            rs = stmt.executeQuery();
                while(rs.next()){
                    anexo.setPkAnexoCroqui(rs.getInt("id_anexo_croqui"));
                    anexo.setFkTipoAnexo(rs.getInt("fk_tipo_anexo"));
                    anexo.setNmAnexo(rs.getString("nm_anexo"));
                    anexo.setNmDiretorio(rs.getString("nm_diretorio"));
                    anexo.setNmExtensao(rs.getString("nm_extensao"));
                    anexo.setNmLogin(rs.getString("nm_login"));
                    anexo.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                 }
            return anexo;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }

    public int cAnexoCroqui(AnexoCroqui anexo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int pkAnexoCroqui = 0;
            String sql = "INSERT INTO tbl_anexo_anotacao_expediente_croqui "
                        +"(fk_tipo_anexo, nm_anexo, ds_anexo, nm_diretorio, nm_extensao, nm_login, dthr_atualizacao) " 
                        +"VALUES ( ?, ?, ?, ?, ?, ?, ?) ";
        try {
            stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, anexo.getFkTipoAnexo());
                stmt.setString(2, anexo.getNmAnexo());
                stmt.setString(3, anexo.getDsAnexo());
                stmt.setString(4, anexo.getNmDiretorio());
                stmt.setString(5, anexo.getNmExtensao());
                stmt.setString(6, anexo.getNmLogin());
                stmt.setTimestamp(7, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                pkAnexoCroqui = rs.getInt("id_anexo_croqui");
            }
        return pkAnexoCroqui;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            stmt.close();
//            rs.close();
//            connection.close();
        }
    }
    
    
    
    public void cCrossAnexoCroqui (int pkAnotCroqui, int pkAnexo, String login ) throws SQLException{
        PreparedStatement stmt = null;
            String sql = "INSERT INTO tbl_cross_anotacao_croqui_anexo "
                +"(id_anotacao_expediente, id_anexo_croqui, nm_login, dthr_atualizacao ) " 
                +"VALUES (?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkAnotCroqui);
                stmt.setInt(2, pkAnexo);
                stmt.setString(3,login);
                stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
             
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }finally{
//            stmt.close();
        }
    }


    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
