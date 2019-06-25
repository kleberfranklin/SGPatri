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
public class TipoAnexoDAO {
    
    
    private final Connection connection;
    
     public TipoAnexoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }
    
     
     public int qdTipoAnexo(String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT COUNT(*) as total FROM tbl_tipo_anexo_croqui "
                + "WHERE (sg_tipo_anexo_croqui ILIKE ? or nm_tipo_anexo_croqui ILIKE ? ) ");
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%' + q + '%');
                stmt.setString(2, '%' + q + '%');   
            rs = stmt.executeQuery();
            int total = 0;
            if (rs.next()) {
                total = rs.getInt("total");
            }
            stmt.execute();
            stmt.close();
            return total;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
            stmt.close();
            connection.close();
        }
    }

//METODO lista os Assuntos das pesquisas e paginada
    public List<TipoAnexo> listTipoAnexo(int qtLinha, int offset, String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<TipoAnexo> lisTpAn = new ArrayList<TipoAnexo>();

        String sql = ("SELECT * FROM tbl_tipo_anexo_croqui "
                + "WHERE (sg_tipo_anexo_croqui ILIKE ? or nm_tipo_anexo_croqui ILIKE ? ) "
                + "ORDER BY nm_tipo_anexo_croqui "
                + "LIMIT ? OFFSET ? ");
            try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%' + q + '%');
                stmt.setString(2, '%' + q + '%');
                stmt.setInt(3, qtLinha);
                stmt.setInt(4, offset);
            rs = stmt.executeQuery();
            while (rs.next()) {
                TipoAnexo tpAn = new TipoAnexo();
                    tpAn.setPkTipoAnexo(rs.getInt("id_tipo_anexo_croqui"));
                    tpAn.setSgTipoAnexo(rs.getString("sg_tipo_anexo_croqui"));
                    tpAn.setNmTipoAnexo(rs.getString("nm_tipo_anexo_croqui"));
                    tpAn.setNmLogin(rs.getString("nm_login"));
                    tpAn.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpAn.add(tpAn);
            }
            return lisTpAn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
            stmt.close();
//            connection.close();
        }

    }

//METODO utilizado para retornar as informação de um Assunto
    public TipoAnexo detalheTipoAnexo(int pkTipoAenxo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoAnexo tpAn = new TipoAnexo();

        String sql = "SELECT * FROM tbl_tipo_anexo_croqui "
                + "WHERE id_tipo_anexo_croqui = ?";
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkTipoAenxo);
            rs = stmt.executeQuery();
            if (rs.next()) {
                tpAn.setPkTipoAnexo(rs.getInt("id_tipo_anexo_croqui"));
                tpAn.setSgTipoAnexo(rs.getString("sg_tipo_anexo_croqui"));
                tpAn.setNmTipoAnexo(rs.getString("nm_tipo_anexo_croqui"));
                tpAn.setNmLogin(rs.getString("nm_login"));
                tpAn.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            return tpAn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
            stmt.close();
            connection.close();
        }
    }
//METODO utilizado para inserir um novo Assunto no BANCO

    public void insTipoAnexo(TipoAnexo tpAn) throws SQLException {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_tipo_anexo_croqui "
                + "(sg_tipo_anexo_croqui, nm_tipo_anexo_croqui, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, tpAn.getSgTipoAnexo());
                stmt.setString(2, tpAn.getNmTipoAnexo());
                stmt.setString(3, tpAn.getNmLogin());
                stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }

//MEDOTO utilizado para realizar a alteração das informações de um Assunto
    public void upTipoAnexo(TipoAnexo tpAn) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "UPDATE tbl_tipo_anexo_croqui "
                + "SET sg_tipo_anexo_croqui=?, nm_tipo_anexo_croqui=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_tipo_anexo_croqui = ?";

        try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, tpAn.getSgTipoAnexo());
                stmt.setString(2, tpAn.getNmTipoAnexo());
                stmt.setString(3, tpAn.getNmLogin());
                stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, tpAn.getPkTipoAnexo());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }

//METODO lista os Assuntos para o campo select
    public List<TipoAnexo> listSelectTipoAnexo() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT id_tipo_anexo_croqui, sg_tipo_anexo_croqui, nm_tipo_anexo_croqui,nm_login, dthr_atualizacao "
                    +"FROM tbl_tipo_anexo_croqui "
                    +"ORDER BY nm_tipo_anexo_croqui";
        try {
            List<TipoAnexo> lisTpAn = new ArrayList<TipoAnexo>();
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                TipoAnexo tpAn = new TipoAnexo();
                    tpAn.setPkTipoAnexo(rs.getInt("id_tipo_anexo_croqui"));
                    tpAn.setSgTipoAnexo(rs.getString("sg_tipo_anexo_croqui"));
                    tpAn.setNmTipoAnexo(rs.getString("nm_tipo_anexo_croqui"));
                    tpAn.setNmLogin(rs.getString("nm_login"));
                    tpAn.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpAn.add(tpAn);
            }

        return lisTpAn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
}
