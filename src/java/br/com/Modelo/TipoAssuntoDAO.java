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
    public int qdTipoAssunto(String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT COUNT(*) as total FROM tbl_assunto_expediente "
                + "WHERE (sg_assunto ILIKE ? or nm_assunto ILIKE ? ) ");

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
            rs.close();
            stmt.close();
            connection.close();
        }
    }

//METODO lista os Assuntos das pesquisas e paginada
    public List<TipoAssunto> listTipoAssunto(int qtLinha, int offset, String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT * FROM tbl_assunto_expediente "
                + "WHERE (sg_assunto ILIKE ? or nm_assunto ILIKE ? ) "
                + "ORDER BY nm_assunto "
                + "LIMIT ? OFFSET ? ");

        try {
            List<TipoAssunto> lisTpAs = new ArrayList<TipoAssunto>();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + q + '%');
            stmt.setString(2, '%' + q + '%');
            stmt.setInt(3, qtLinha);
            stmt.setInt(4, offset);

            rs = stmt.executeQuery();
            while (rs.next()) {
                TipoAssunto tpAs = new TipoAssunto();
                tpAs.setPkTipoAssunto(rs.getInt("id_assunto_expediente"));
                tpAs.setSgTipoAssunto(rs.getString("sg_assunto"));
                tpAs.setNmTipoAssunto(rs.getString("nm_assunto"));
                tpAs.setNmLogin(rs.getString("nm_login"));
                tpAs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpAs.add(tpAs);
            }
            stmt.close();
            return lisTpAs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            rs.close();
            stmt.close();
            connection.close();
        }

    }

//METODO utilizado para retornar as informação de um Assunto
    public TipoAssunto detalheTipoAssunto(int pkTipoAssunto) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tbl_assunto_expediente "
                + "WHERE id_assunto_expediente = ?";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkTipoAssunto);
            rs = stmt.executeQuery();

            TipoAssunto tpAs = new TipoAssunto();
            if (rs.next()) {
                tpAs.setPkTipoAssunto(rs.getInt("id_assunto_expediente"));
                tpAs.setSgTipoAssunto(rs.getString("sg_assunto"));
                tpAs.setNmTipoAssunto(rs.getString("nm_assunto"));
                tpAs.setNmLogin(rs.getString("nm_login"));
                tpAs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            stmt.close();
            return tpAs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            rs.close();
            stmt.close();
            connection.close();
        }
    }
//METODO utilizado para inserir um novo Assunto no BANCO

    public void insTipoAssunto(TipoAssunto tpAs) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "INSERT INTO tbl_assunto_expediente ( sg_assunto, nm_assunto, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,? )";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, tpAs.getSgTipoAssunto());
            stmt.setString(2, tpAs.getNmTipoAssunto());
            stmt.setString(3, tpAs.getNmLogin());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            rs.close();
            stmt.close();
            connection.close();
        }
    }

//MEDOTO utilizado para realizar a alteração das informações de um Assunto
    public void upTipoAssunto(TipoAssunto tpAs) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "UPDATE tbl_assunto_expediente SET sg_assunto=?, nm_assunto=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_assunto_expediente = ?";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, tpAs.getSgTipoAssunto());
            stmt.setString(2, tpAs.getNmTipoAssunto());
            stmt.setString(3, tpAs.getNmLogin());
            stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.setInt(5, tpAs.getPkTipoAssunto());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            rs.close();
            stmt.close();
            connection.close();
        }
    }

//METODO lista os Assuntos para o campo select
    public List<TipoAssunto> listSelectTipoAssunto() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tbl_assunto_expediente ORDER BY nm_assunto";

        try {
            List<TipoAssunto> lisTpAs = new ArrayList<TipoAssunto>();
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                TipoAssunto tpAs = new TipoAssunto();
                tpAs.setPkTipoAssunto(rs.getInt("id_assunto_expediente"));
                tpAs.setSgTipoAssunto(rs.getString("sg_assunto"));
                tpAs.setNmTipoAssunto(rs.getString("nm_assunto"));
                tpAs.setNmLogin(rs.getString("nm_login"));
                tpAs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                lisTpAs.add(tpAs);
            }
            stmt.execute();
            stmt.close();
            return lisTpAs;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            rs.close();
            stmt.close();
            connection.close();
        }
    }

}
