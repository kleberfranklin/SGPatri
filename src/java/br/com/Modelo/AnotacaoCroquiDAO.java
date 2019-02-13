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
public class AnotacaoCroquiDAO {

    private final Connection connection;

//Construtor
    public AnotacaoCroquiDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //Metodo de quantidade de linhas
    public int qtdAntoCroqui(String qCroqui, String qArea, String qNome, String qInteressado, String qEndereco, String qAssunto,
            Date dtIni, Date dtFim) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_anotacao_expediente_oficial "
                + "WHERE cd_croqui ILIKE ? "
                + "and cd_area ILIKE ? "
                + "and nm_nome ILIKE ? "
                + "and nm_interessado ILIKE ? "
                + "and ds_local ILIKE ? "
                + "and ds_assunto ILIKE ? "
                + "and dt_data between ? and ? "
                + "and cd_croqui is not null "
                + "and cd_croqui != '' ");
        try {
            int total = 0;
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, '%' + qCroqui + '%');
                stmt.setString(2, '%' + qArea + '%');
                stmt.setString(3, qNome + '%');
                stmt.setString(4, '%' + qInteressado + '%');
                stmt.setString(5, '%' + qEndereco + '%');
                stmt.setString(6, '%' + qAssunto + '%');
                stmt.setDate(7, dtIni);
                stmt.setDate(8, dtFim);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    total = rs.getInt("total");
                }
                stmt.execute();
            }
            return total;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO lista os atributos do cadastro de croqui das pesquisas e paginado
    public List<AnotacaoCroqui> listAnotaCroqui(String qCroqui, String qArea, String qNome, String qInteressado, String qEndereco, String qAssunto,
            Date dtIni, Date dtFim, int qtLinha, int offset) {
        String sql = ("SELECT * FROM tbl_anotacao_expediente_oficial "
                + "WHERE cd_croqui ILIKE ? "
                + "and cd_area ILIKE ? "
                + "and nm_nome ILIKE ? "
                + "and nm_interessado ILIKE ? "
                + "and ds_local ILIKE ? "
                + "and ds_assunto ILIKE ? "
                + "and dt_data between ? and ? "
                + "and cd_croqui is not null "
                + "and cd_croqui != '' "
                + "ORDER BY dt_data DESC "
                + "LIMIT ? OFFSET ?");
        try {
            List<AnotacaoCroqui> listAnotacaoCroqui = new ArrayList<AnotacaoCroqui>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + qCroqui + '%');
            stmt.setString(2, '%' + qArea + '%');
            stmt.setString(3, '%' + qNome + '%');
            stmt.setString(4, '%' + qInteressado + '%');
            stmt.setString(5, '%' + qEndereco + '%');
            stmt.setString(6, '%' + qAssunto + '%');
            stmt.setDate(7, dtIni);
            stmt.setDate(8, dtFim);
            stmt.setInt(9, qtLinha);
            stmt.setInt(10, offset);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AnotacaoCroqui anotCroqui = new AnotacaoCroqui();
                anotCroqui.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                anotCroqui.setCdCroqui(rs.getString("cd_croqui"));
                anotCroqui.setCdArea(rs.getString("cd_area"));
                anotCroqui.setNmNome(rs.getString("nm_nome"));
                anotCroqui.setNmInteressado(rs.getString("nm_interessado"));
                anotCroqui.setDsLocal(rs.getString("ds_local"));
                anotCroqui.setDsAssunto(rs.getString("ds_assunto"));
                anotCroqui.setDtData(rs.getString("dt_data"));
                anotCroqui.setCdProcesso(rs.getString("cd_processo"));
                anotCroqui.setCdTid(rs.getString("cd_tid"));
                listAnotacaoCroqui.add(anotCroqui);
            }
            return listAnotacaoCroqui;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO uilizado para listar o nome do da tabela 
    public List<AnotacaoCroqui> listNome() {
        String sql = ("SELECT COUNT(*)qtd, nm_nome FROM tbl_anotacao_expediente "
                + "GROUP BY nm_nome "
                + "ORDER BY nm_nome ");
        try {
            List<AnotacaoCroqui> lisNome = new ArrayList<AnotacaoCroqui>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AnotacaoCroqui note = new AnotacaoCroqui();
                note.setNmNome(rs.getString("nm_nome"));
                lisNome.add(note);
            }
            return lisNome;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO detalhe de uma Anotação Croqui
    public AnotacaoCroqui detalheAnotacaoCroqui(int pkAnotacaoExpediente) {
        String sql = ("SELECT id_anotacao_expediente, nr_informacao_dgpi, ds_assunto, cd_croqui, cd_area, cd_processo, cd_tid, cd_expediente, nm_interessado, "
                + "ds_local,  nr_anotacao, nr_informacao, ds_despacho, dt_publicacao, dt_anotacao, ds_observacao, dt_data, nm_nome "
                + "FROM tbl_anotacao_expediente "
                + "WHERE id_anotacao_expediente = ? ");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkAnotacaoExpediente);
            ResultSet rs = stmt.executeQuery();

            AnotacaoCroqui anotCroqui = new AnotacaoCroqui();
            if (rs.next()) {
                anotCroqui.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                anotCroqui.setNrInformacaoDgpi(rs.getString("nr_informacao_dgpi"));
                anotCroqui.setCdCroqui(rs.getString("cd_croqui"));
                anotCroqui.setCdArea(rs.getString("cd_area"));
                anotCroqui.setCdProcesso(rs.getString("cd_processo"));
                anotCroqui.setCdTid(rs.getString("cd_tid"));
                anotCroqui.setCdExpediente(rs.getString("cd_expediente"));
                anotCroqui.setNmInteressado(rs.getString("nm_interessado"));
                anotCroqui.setDsAssunto(rs.getString("ds_assunto"));
                anotCroqui.setDsLocal(rs.getString("ds_local"));
                anotCroqui.setNrAnotacao(rs.getInt("nr_anotacao"));
                anotCroqui.setNrInformacao(rs.getInt("nr_informacao"));
                anotCroqui.setDsDespacho(rs.getString("ds_despacho"));
                anotCroqui.setDtPublicacao(rs.getString("dt_publicacao"));
                anotCroqui.setDtAnotacao(rs.getString("dt_anotacao"));
                anotCroqui.setDsObservacao(rs.getString("ds_observacao"));
                anotCroqui.setDtData(rs.getString("dt_data"));
                anotCroqui.setNmNome(rs.getString("nm_nome"));
                return anotCroqui;
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

//    METODO utilizado para inserir dados em um novo croqui
    public void insAnotacaoCroqui(AnotacaoCroqui anotCroqui) {
        String sql = "INSERT INTO tbl_anotacao_expediente ( cd_croqui, cd_area, nr_informacao_dgpi, cd_processo, cd_tid, cd_expediente, nm_interessado ,"
                + "ds_assunto, ds_local, ds_observacao, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,? )";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, anotCroqui.getCdCroqui());
            stmt.setString(2, anotCroqui.getCdArea());
            stmt.setString(3, anotCroqui.getNrInformacaoDgpi());
            stmt.setString(4, anotCroqui.getCdProcesso());
            stmt.setString(5, anotCroqui.getCdTid());
            stmt.setString(6, anotCroqui.getCdExpediente());
            stmt.setString(7, anotCroqui.getNmInteressado());
            stmt.setString(8, anotCroqui.getDsAssunto());
            stmt.setString(9, anotCroqui.getDsLocal());
            stmt.setString(10, anotCroqui.getDsObservacao());
            stmt.setString(11, anotCroqui.getNmLogin());
            stmt.setTimestamp(12, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void upAnotacaoCroqui(AnotacaoCroqui anotCroqui) {
        String sql = "UPDATE tbl_anotacao_expediente "
                + "SET cd_croqui=?, cd_area=?, nr_informacao_dgpi=?, cd_processo=?, cd_tid=?, cd_expediente=?, nm_interessado=?, ds_assunto=?, ds_local=?,"
                + "ds_observacao=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_anotacao_expediente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, anotCroqui.getCdCroqui());
            stmt.setString(2, anotCroqui.getCdArea());
            stmt.setString(3, anotCroqui.getNrInformacaoDgpi());
            stmt.setString(4, anotCroqui.getCdProcesso());
            stmt.setString(5, anotCroqui.getCdTid());
            stmt.setString(6, anotCroqui.getCdExpediente());
            stmt.setString(7, anotCroqui.getNmInteressado());
            stmt.setString(8, anotCroqui.getDsAssunto());
            stmt.setString(9, anotCroqui.getDsLocal());
            stmt.setString(10, anotCroqui.getDsObservacao());
            stmt.setString(11, anotCroqui.getNmLogin());
            stmt.setTimestamp(12, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
