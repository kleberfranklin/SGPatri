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
public class TipoExpedienteDAO {

    private final Connection connection;

//Construtor
    public TipoExpedienteDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

//Metodo de quantidade de linhas
    public int qdTipoExpediente(String q) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_tipo_expediente "
                + "WHERE (sg_tipo_expediente ILIKE ? or nm_tipo_expediente ILIKE ? ) ");
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

//METODO lista os Expedientes das pesquisas e paginada
    public List<TipoExpediente> listTipoExpediente(int qtLinha, int offset, String q) {
        String sql = ("SELECT * FROM tbl_tipo_expediente "
                + "WHERE (sg_tipo_expediente ILIKE ? or nm_tipo_expediente ILIKE ? ) "
                + "ORDER BY nm_tipo_expediente "
                + "LIMIT ? OFFSET ? ");
        try {
            List<TipoExpediente> lisTpEx = new ArrayList<TipoExpediente>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + q + '%');
            stmt.setString(2, '%' + q + '%');
            stmt.setInt(3, qtLinha);
            stmt.setInt(4, offset);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TipoExpediente tpEx = new TipoExpediente();
                tpEx.setPkTipoExpediente(rs.getInt("id_tipo_expediente"));
                tpEx.setSgTipoExpediente(rs.getString("sg_tipo_expediente"));
                tpEx.setNmTipoExpediente(rs.getString("nm_tipo_expediente"));
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

//METODO utilizado para retornar as informação de um Expediente
    public TipoExpediente detalheTipoExpediente(int pkTipoExpediente) {
        String sql = "SELECT * FROM tbl_tipo_expediente WHERE id_tipo_expediente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkTipoExpediente);
            ResultSet rs = stmt.executeQuery();

            TipoExpediente tpEx = new TipoExpediente();
            if (rs.next()) {
                tpEx.setPkTipoExpediente(rs.getInt("id_tipo_expediente"));
                tpEx.setSgTipoExpediente(rs.getString("sg_tipo_expediente"));
                tpEx.setNmTipoExpediente(rs.getString("nm_tipo_expediente"));
                tpEx.setNmLogin(rs.getString("nm_login"));
                tpEx.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            stmt.close();
            return tpEx;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//METODO utilizado para inserir um novo Expediente no BANCO

    public void insTipoExpediente(TipoExpediente tpEx) {
        String sql = "INSERT INTO tbl_tipo_expediente (sg_tipo_expediente, nm_tipo_expediente, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tpEx.getSgTipoExpediente());
            stmt.setString(2, tpEx.getNmTipoExpediente());
            stmt.setString(3, tpEx.getNmLogin());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//MEDOTO utilizado para realizar a alteração das informações de um Expediente
    public void upTipoExpediente(TipoExpediente tpEx) {
        String sql = "UPDATE tbl_tipo_expediente SET sg_tipo_expediente=?, nm_tipo_expediente=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_tipo_expediente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tpEx.getSgTipoExpediente());
            stmt.setString(2, tpEx.getNmTipoExpediente());
            stmt.setString(3, tpEx.getNmLogin());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.setInt(5, tpEx.getPkTipoExpediente());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//METODO lista os Expedientes para o campo select
    public List<TipoExpediente> listSelectTipoExpediente() {
        String sql = "SELECT * FROM tbl_tipo_expediente ORDER BY nm_tipo_expediente";

        try {
            List<TipoExpediente> lisTpEx = new ArrayList<TipoExpediente>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                TipoExpediente tpEx = new TipoExpediente();
                tpEx.setPkTipoExpediente(rs.getInt("id_tipo_expediente"));
                tpEx.setSgTipoExpediente(rs.getString("sg_tipo_expediente"));
                tpEx.setNmTipoExpediente(rs.getString("nm_tipo_expediente"));
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
