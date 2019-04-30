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
    public int qdTipoDespacho(String q) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_tipo_despacho_expediente "
                + "WHERE (sg_tipo_despacho ILIKE ? or nm_tipo_despacho ILIKE ? ) ");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + q + '%');
            stmt.setString(2, '%' + q + '%');
            ResultSet rs = stmt.executeQuery();
            int total = 0;
            if (rs.next()) {
                total = rs.getInt("total");
            }
            stmt.execute();
            stmt.close();
            return total;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//METODO lista os Despachos das pesquisas e paginada
    public List<TipoDespacho> listTipoDespacho(int qtLinha, int offset, String q) {
        String sql = ("SELECT * FROM tbl_tipo_despacho_expediente "
                + "WHERE (sg_tipo_despacho ILIKE ? or nm_tipo_despacho ILIKE ? ) "
                + "ORDER BY nm_tipo_despacho "
                + "LIMIT ? OFFSET ? ");
        try {
            List<TipoDespacho> lisTpEx = new ArrayList<TipoDespacho>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + q + '%');
            stmt.setString(2, '%' + q + '%');
            stmt.setInt(3, qtLinha);
            stmt.setInt(4, offset);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TipoDespacho tpEx = new TipoDespacho();
                tpEx.setPkTipoDespacho(rs.getInt("id_tipo_despacho"));
                tpEx.setSgTipoDespacho(rs.getString("sg_tipo_despacho"));
                tpEx.setNmTipoDespacho(rs.getString("nm_tipo_despacho"));
                tpEx.setNmLogin(rs.getString("nm_login"));
                tpEx.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpEx.add(tpEx);
            }
            stmt.close();
            return lisTpEx;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

//METODO utilizado para retornar as informação de um Despacho
    public TipoDespacho detalheTipoDespacho(int pkTipoDespacho) {
        String sql = "SELECT * FROM  WHERE id_tipo_despacho = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkTipoDespacho);
            ResultSet rs = stmt.executeQuery();

            TipoDespacho tpEx = new TipoDespacho();
            if (rs.next()) {
                tpEx.setPkTipoDespacho(rs.getInt("id_tipo_despacho"));
                tpEx.setSgTipoDespacho(rs.getString("sg_tipo_despacho"));
                tpEx.setNmTipoDespacho(rs.getString("nm_tipo_despacho"));
                tpEx.setNmLogin(rs.getString("nm_login"));
                tpEx.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            stmt.close();
            return tpEx;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//METODO utilizado para inserir um novo Despacho no BANCO

    public void insTipoDespacho(TipoDespacho tpEx) {
        String sql = "INSERT INTO tbl_tipo_despacho_expediente (sg_tipo_despacho, nm_tipo_despacho, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tpEx.getSgTipoDespacho());
            stmt.setString(2, tpEx.getNmTipoDespacho());
            stmt.setString(3, tpEx.getNmLogin());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//MEDOTO utilizado para realizar a alteração das informações de um Despacho
    public void upTipoDespacho(TipoDespacho tpEx) {
        String sql = "UPDATE tbl_tipo_despacho_expediente SET sg_tipo_despacho=?, nm_tipo_despacho=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_tipo_despacho = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tpEx.getSgTipoDespacho());
            stmt.setString(2, tpEx.getNmTipoDespacho());
            stmt.setString(3, tpEx.getNmLogin());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.setInt(5, tpEx.getPkTipoDespacho());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//METODO lista os Despachos para o campo select
    public List<TipoDespacho> listSelectTipoDespacho() {
        String sql = "SELECT * FROM tbl_tipo_despacho_expediente ORDER BY nm_tipo_despacho";

        try {
            List<TipoDespacho> lisTpEx = new ArrayList<TipoDespacho>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                TipoDespacho tpEx = new TipoDespacho();
                tpEx.setPkTipoDespacho(rs.getInt("id_tipo_despacho"));
                tpEx.setSgTipoDespacho(rs.getString("sg_tipo_despacho"));
                tpEx.setNmTipoDespacho(rs.getString("nm_tipo_despacho"));
                tpEx.setNmLogin(rs.getString("nm_login"));
                tpEx.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpEx.add(tpEx);
            }
            stmt.execute();
            stmt.close();
            return lisTpEx;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
