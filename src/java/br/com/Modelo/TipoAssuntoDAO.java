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
public class TipoAssuntoDAO {

    private final Connection connection;

//Construtor
    public TipoAssuntoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

//Metodo de quantidade de linhas
    public int qdTipoAssunto(String q) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_tipo_assunto "
                + "WHERE (sg_tipo_assunto ILIKE ? or nm_tipo_assunto ILIKE ? ) ");
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

//METODO lista os Assuntos das pesquisas e paginada
    public List<TipoAssunto> listTipoAssunto(int qtLinha, int offset, String q) {
        String sql = ("SELECT * FROM tbl_tipo_assunto "
                + "WHERE (sg_tipo_assunto ILIKE ? or nm_tipo_assunto ILIKE ? ) "
                + "ORDER BY nm_tipo_assunto "
                + "LIMIT ? OFFSET ? ");
        try {
            List<TipoAssunto> lisTpAs = new ArrayList<TipoAssunto>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + q + '%');
            stmt.setString(2, '%' + q + '%');
            stmt.setInt(3, qtLinha);
            stmt.setInt(4, offset);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TipoAssunto tpAs = new TipoAssunto();
                tpAs.setPkTipoAssunto(rs.getInt("id_tipo_assunto"));
                tpAs.setSgTipoAssunto(rs.getString("sg_tipo_assunto"));
                tpAs.setNmTipoAssunto(rs.getString("nm_tipo_assunto"));
                tpAs.setNmLogin(rs.getString("nm_login"));
                tpAs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpAs.add(tpAs);
            }
            stmt.close();
            return lisTpAs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

//METODO utilizado para retornar as informação de um Assunto
    public TipoAssunto detalheTipoAssunto(int pkTipoAssunto) {
        String sql = "SELECT * FROM tbl_tipo_assunto WHERE id_tipo_assunto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkTipoAssunto);
            ResultSet rs = stmt.executeQuery();

            TipoAssunto tpAs = new TipoAssunto();
            if (rs.next()) {
                tpAs.setPkTipoAssunto(rs.getInt("id_tipo_assunto"));
                tpAs.setSgTipoAssunto(rs.getString("sg_tipo_assunto"));
                tpAs.setNmTipoAssunto(rs.getString("nm_tipo_assunto"));
                tpAs.setNmLogin(rs.getString("nm_login"));
                tpAs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            stmt.close();
            return tpAs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//METODO utilizado para inserir um novo Assunto no BANCO

    public void insTipoAssunto(TipoAssunto tpAs) {
        String sql = "INSERT INTO tbl_tipo_assunto ( sg_tipo_assunto, nm_tipo_assunto, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tpAs.getSgTipoAssunto());
            stmt.setString(2, tpAs.getNmTipoAssunto());
            stmt.setString(3, tpAs.getNmLogin());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//MEDOTO utilizado para realizar a alteração das informações de um Assunto
    public void upTipoAssunto(TipoAssunto tpAs) {
        String sql = "UPDATE tbl_tipo_assunto SET sg_tipo_assunto=?, nm_tipo_assunto=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_tipo_assunto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, tpAs.getSgTipoAssunto());
            stmt.setString(2, tpAs.getNmTipoAssunto());
            stmt.setString(3, tpAs.getNmLogin());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.setInt(5, tpAs.getPkTipoAssunto());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//METODO lista os Assuntos para o campo select
    public List<TipoAssunto> listSelectTipoAssunto() {
        String sql = "SELECT * FROM tbl_tipo_assunto ORDER BY nm_tipo_assunto";

        try {
            List<TipoAssunto> lisTpAs = new ArrayList<TipoAssunto>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                TipoAssunto tpAs = new TipoAssunto();
                tpAs.setPkTipoAssunto(rs.getInt("id_tipo_assunto"));
                tpAs.setSgTipoAssunto(rs.getString("sg_tipo_assunto"));
                tpAs.setNmTipoAssunto(rs.getString("nm_tipo_assunto"));
                tpAs.setNmLogin(rs.getString("nm_login"));
                tpAs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpAs.add(tpAs);
            }
            stmt.execute();
            stmt.close();
            return lisTpAs;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
