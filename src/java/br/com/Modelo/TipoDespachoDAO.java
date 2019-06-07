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
 * @author x369482
 */
public class TipoDespachoDAO {

    private final Connection connection;

//Construtor
    public TipoDespachoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

//Metodo de quantidade de linhas
    public int qdTipoDespacho(String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int total = 0;

        String sql = ("SELECT COUNT(*) as total FROM tbl_tipo_despacho_expediente "
                + "WHERE (sg_despacho ILIKE ? or nm_despacho ILIKE ? ) ");

        try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%' + q + '%');
                stmt.setString(2, '%' + q + '%');
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                total = rs.getInt("total");
            }
            return total;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }

//METODO lista os Despachos das pesquisas e paginada
    public List<TipoDespacho> listTipoDespacho(int qtLinha, int offset, String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT * FROM tbl_tipo_despacho_expediente "
                + "WHERE (sg_despacho ILIKE ? or nm_despacho ILIKE ? ) "
                + "ORDER BY nm_despacho "
                + "LIMIT ? OFFSET ? ");

        try {
            List<TipoDespacho> lisTpEx = new ArrayList<TipoDespacho>();
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%' + q + '%');
                stmt.setString(2, '%' + q + '%');
                stmt.setInt(3, qtLinha);
                stmt.setInt(4, offset);

            rs = stmt.executeQuery();
            while (rs.next()) {
                TipoDespacho tpEx = new TipoDespacho();
                tpEx.setPkTipoDespacho(rs.getInt("id_tipo_despacho"));
                tpEx.setSgTipoDespacho(rs.getString("sg_despacho"));
                tpEx.setNmTipoDespacho(rs.getString("nm_despacho"));
                tpEx.setNmLogin(rs.getString("nm_login"));
                tpEx.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpEx.add(tpEx);
            }
            stmt.close();
            return lisTpEx;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            rs.close();
            stmt.close();
            connection.close();
        }

    }

//METODO utilizado para retornar as informação de um Despacho
    public TipoDespacho detalheTipoDespacho(int pkTipoDespacho) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tbl_tipo_despacho_expediente "
                + "WHERE id_tipo_despacho = ?";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkTipoDespacho);
            rs = stmt.executeQuery();

            TipoDespacho tpEx = new TipoDespacho();
            if (rs.next()) {
                tpEx.setPkTipoDespacho(rs.getInt("id_tipo_despacho"));
                tpEx.setSgTipoDespacho(rs.getString("sg_despacho"));
                tpEx.setNmTipoDespacho(rs.getString("nm_despacho"));
                tpEx.setNmLogin(rs.getString("nm_login"));
                tpEx.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            stmt.close();
            return tpEx;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }
//METODO utilizado para inserir um novo Despacho no BANCO

    public void insTipoDespacho(TipoDespacho tpEx) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "INSERT INTO tbl_tipo_despacho_expediente (sg_despacho, nm_despacho, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";

        try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, tpEx.getSgTipoDespacho());
                stmt.setString(2, tpEx.getNmTipoDespacho());
                stmt.setString(3, tpEx.getNmLogin());
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

//MEDOTO utilizado para realizar a alteração das informações de um Despacho
    public void upTipoDespacho(TipoDespacho tpEx) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "UPDATE tbl_tipo_despacho_expediente SET sg_despacho=?, nm_despacho=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_tipo_despacho = ?";

        try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, tpEx.getSgTipoDespacho());
                stmt.setString(2, tpEx.getNmTipoDespacho());
                stmt.setString(3, tpEx.getNmLogin());
                stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(5, tpEx.getPkTipoDespacho());
            stmt.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }

//METODO lista os Despachos para o campo select
    public List<TipoDespacho> listSelectTipoDespacho() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tbl_tipo_despacho_expediente ORDER BY nm_despacho";

        try {
            List<TipoDespacho> lisTpEx = new ArrayList<TipoDespacho>();
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                TipoDespacho tpEx = new TipoDespacho();
                tpEx.setPkTipoDespacho(rs.getInt("id_tipo_despacho"));
                tpEx.setSgTipoDespacho(rs.getString("sg_despacho"));
                tpEx.setNmTipoDespacho(rs.getString("nm_despacho"));
                tpEx.setNmLogin(rs.getString("nm_login"));
                tpEx.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpEx.add(tpEx);
            }
            stmt.execute();
            stmt.close();
            return lisTpEx;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }

}
