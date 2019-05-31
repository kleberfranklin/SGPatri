/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author x369482
 */
public class MinisterioPublicoDAO {

    private final Connection connection;

    public MinisterioPublicoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //metodo para editar um cadastro de um processo do ministerio publico 
    public void upMinisterioPublico(MinisterioPublico mp) throws SQLException {
        PreparedStatement stmt = null;

        String sql = "UPDATE tbl_ministerio_publico "
                + "SET nm_origem=?, dt_entrada=?, cd_oficio_entrada=?, cd_processo=?, cd_processo_ini=?, nm_tipo_processo=?, nm_interessado=?, "
                + "nm_solicitado=?, ds_assunto=?, ds_endereco=?, nr_info_dgpi=?, dt_resposta=?, cd_oficio_resposta=?, nr_procedimento=?, ds_observacao=?, "
                + "nm_login=?, dthr_atualizacao=? "
                + "WHERE id_ministerio_publico=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, mp.getNmOrigem());
            stmt.setDate(2, mp.getDtEntrada());
            stmt.setString(3, mp.getCdOficioEntrada());
            stmt.setString(4, mp.getCdProcesso());
            stmt.setString(5, mp.getCdProcessoIni());
            stmt.setString(6, mp.getNmTipoProcesso());
            stmt.setString(7, mp.getNmInteressado());
            stmt.setString(8, mp.getNmSolicitado());
            stmt.setString(9, mp.getDsAssunto());
            stmt.setString(10, mp.getDsEndereco());
            stmt.setString(11, mp.getNrInfoDgpi());
            stmt.setDate(12, mp.getDtResposta());
            stmt.setString(13, mp.getCdOficioResposta());
            stmt.setString(14, mp.getNrProcedimento());
            stmt.setString(15, mp.getDsObservacao());
            stmt.setString(16, mp.getNmLogin());
            stmt.setTimestamp(17, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.setInt(18, mp.getPkMinisterioPublico());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            connection.close();
        }
    }

    //metodo para inserir um novo cadastro de um processo do ministerio publico 
    public void insMinisterioPublico(MinisterioPublico mp) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "INSERT INTO tbl_ministerio_publico "
                + "(nm_origem, dt_entrada, cd_oficio_entrada, cd_processo_ini, cd_processo, nm_tipo_processo, nm_interessado, nm_solicitado, ds_assunto, "
                + "ds_endereco, nr_info_dgpi, dt_resposta, cd_oficio_resposta, nr_procedimento, ds_observacao, "
                + "nm_login, dthr_atualizacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, mp.getNmOrigem());
            stmt.setDate(2, mp.getDtEntrada());
            stmt.setString(3, mp.getCdOficioEntrada());
            stmt.setString(4, mp.getCdProcessoIni());
            stmt.setString(5, mp.getCdProcesso());
            stmt.setString(6, mp.getNmTipoProcesso());
            stmt.setString(7, mp.getNmInteressado());
            stmt.setString(8, mp.getNmSolicitado());
            stmt.setString(9, mp.getDsAssunto());
            stmt.setString(10, mp.getDsEndereco());
            stmt.setString(11, mp.getNrInfoDgpi());
            stmt.setDate(12, mp.getDtResposta());
            stmt.setString(13, mp.getCdOficioResposta());
            stmt.setString(14, mp.getNrProcedimento());
            stmt.setString(15, mp.getDsObservacao());
            stmt.setString(16, mp.getNmLogin());
            stmt.setTimestamp(17, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            connection.close();
        }
    }

    //METODO utilizado para retornar as informação de um processo do Ministerio Publico
    public MinisterioPublico detalheMinisterioPublico(int pkMinisterioPublico) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tbl_ministerio_publico "
                + "WHERE id_ministerio_publico = ?";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkMinisterioPublico);
            rs = stmt.executeQuery();

            MinisterioPublico ministPublico = new MinisterioPublico();
            if (rs.next()) {
                ministPublico.setPkMinisterioPublico(rs.getInt("id_ministerio_publico"));
                ministPublico.setNmOrigem(rs.getString("nm_origem"));
                ministPublico.setDtEntrada(rs.getDate("dt_entrada"));
                ministPublico.setCdOficioEntrada(rs.getString("cd_oficio_entrada"));
                ministPublico.setCdProcessoIni(rs.getString("cd_processo_ini"));
                ministPublico.setCdProcesso(rs.getString("cd_processo"));
                ministPublico.setNmTipoProcesso(rs.getString("nm_tipo_processo"));
                ministPublico.setNmInteressado(rs.getString("nm_interessado"));
                ministPublico.setNmSolicitado(rs.getString("nm_solicitado"));
                ministPublico.setDsAssunto(rs.getString("ds_assunto"));
                ministPublico.setDsEndereco(rs.getString("ds_endereco"));
                ministPublico.setNrInfoDgpi(rs.getString("nr_info_dgpi"));
                ministPublico.setCdOficioResposta(rs.getString("cd_oficio_resposta"));
                ministPublico.setDtResposta(rs.getDate("dt_resposta"));
                ministPublico.setNrProcedimento(rs.getString("nr_procedimento"));
                ministPublico.setDsObservacao(rs.getString("ds_observacao"));
                ministPublico.setNmLogin(rs.getString("nm_login"));
                ministPublico.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            stmt.close();
            return ministPublico;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
            stmt.close();
            connection.close();
        }
    }

    public int qtdMinisterioPublico(String qOrigem, String qEndereco, String qAssunto, String qProcedimento, String qSolicitado, String qOficioResposta,
            Date dtIni, Date dtFim) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT COUNT(*) as total "
                + "FROM tbl_ministerio_publico "
                + "WHERE nm_origem ILIKE ? "
                + "AND ds_endereco ILIKE ? "
                + "AND ds_assunto ILIKE ? "
                + "AND nr_procedimento ILIKE ? "
                + "AND nm_solicitado ILIKE ? "
                + "and dt_resposta between ? and ? "
                + "AND cd_oficio_resposta ILIKE ? ");

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + qOrigem + '%');
            stmt.setString(2, '%' + qEndereco + '%');
            stmt.setString(3, '%' + qAssunto + '%');
            stmt.setString(4, '%' + qProcedimento + '%');
            stmt.setString(5, '%' + qSolicitado + '%');
            stmt.setDate(6, dtIni);
            stmt.setDate(7, dtFim);
            stmt.setString(8, '%' + qOficioResposta + '%');
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

    public List<MinisterioPublico> listMinisterioPublico(String nmOrigem, String dsEndereco, String dsAssunto, String nrProcedimento, String nmSolicitado,
            String cdOficioResposta, String dtRespostaTxt, Date dtIni, Date dtFim, int qtdLinha, int offset, String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT id_ministerio_publico, nm_origem, ds_endereco, ds_assunto, nr_procedimento, nm_solicitado, CAST(dt_resposta AS VARCHAR), dt_resposta, cd_oficio_resposta "
                + "FROM tbl_ministerio_publico "
                + "WHERE nm_origem ILIKE ? "
                + "AND ds_endereco ILIKE ? "
                + "AND ds_assunto ILIKE ? "
                + "AND nr_procedimento ILIKE ? "
                + "AND nm_solicitado ILIKE ? "
                + "AND dt_resposta between ? and ? "
                + "AND cd_oficio_resposta ILIKE ? "
                + "ORDER BY id_ministerio_publico ASC "
                + "LIMIT ? OFFSET ? ");

        try {
            List<MinisterioPublico> listMinistPublico = new ArrayList<MinisterioPublico>();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + nmOrigem + '%');
            stmt.setString(2, '%' + dsEndereco + '%');
            stmt.setString(3, '%' + dsAssunto + '%');
            stmt.setString(4, '%' + nrProcedimento + '%');
            stmt.setString(5, '%' + nmSolicitado + '%');
            stmt.setDate(6, dtIni);
            stmt.setDate(7, dtFim);
            stmt.setString(8, '%' + cdOficioResposta + '%');
            stmt.setInt(9, qtdLinha);
            stmt.setInt(10, offset);

            rs = stmt.executeQuery();
            while (rs.next()) {
                MinisterioPublico ministPublico = new MinisterioPublico();
                ministPublico.setPkMinisterioPublico(rs.getInt("id_ministerio_publico"));
                ministPublico.setNmOrigem(rs.getString("nm_origem"));
                ministPublico.setDsEndereco(rs.getString("ds_endereco"));
                ministPublico.setDsAssunto(rs.getString("ds_assunto"));
                ministPublico.setNrProcedimento(rs.getString("nr_procedimento"));
                ministPublico.setNmSolicitado(rs.getString("nm_solicitado"));
                ministPublico.setDtResposta(rs.getDate("dt_resposta"));
                ministPublico.setCdOficioResposta(rs.getString("cd_oficio_resposta"));
                listMinistPublico.add(ministPublico);
            }
            stmt.close();
            return listMinistPublico;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
            stmt.close();
            connection.close();
        }

    }
}
