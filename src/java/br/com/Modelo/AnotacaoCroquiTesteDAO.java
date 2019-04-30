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
public class AnotacaoCroquiTesteDAO {

    private final Connection connection;

//Construtor
    public AnotacaoCroquiTesteDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //Metodo de quantidade de linhas
    public int qtdAntoCroqui(String qExpediente, String qCroqui, String qArea, String qInteressado, String qEndereco, String qPublicacao, String qTramitacao,
            Date dtIni, Date dtFim) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_anotacao_expediente "
                + "WHERE cd_expediente ILIKE ? "
                + "and cd_croqui ILIKE ? "
                + "and cd_area ILIKE ? "
                + "and nm_interessado ILIKE ? "
                + "and ds_local ILIKE ? "
                + "and dt_publicacao ILIKE ? "
                + "and dt_tramitacao ILIKE ? "
                + "and dt_data between ? and ? "
                + "and cd_croqui is not null "
                + "and cd_croqui != '' ");
        try {
            int total = 0;
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, '%' + qExpediente);
                stmt.setString(2, '%' + qCroqui + '%');
                stmt.setString(3, '%' + qArea + '%');
                stmt.setString(4, '%' + qInteressado + '%');
                stmt.setString(6, '%' + qEndereco + '%');
                stmt.setString(7, '%' + qTramitacao + '%');
                stmt.setString(8, '%' + qPublicacao + '%');
                stmt.setDate(9, dtIni);
                stmt.setDate(10, dtFim);
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
    public List<AnotacaoCroquiTeste> listAnotaCroqui(String qExpediente, String qCroqui, String qArea, String qNome, String qInteressado, String qEndereco,
            Date dtIni, Date dtFim, int qtLinha, int offset) {
        String sql = ("SELECT * FROM tbl_anotacao_expediente "
                + "WHERE cd_expediente ILIKE ? "
                + "and cd_croqui ILIKE ? "
                + "and cd_area ILIKE ? "
                //                + "and nm_autor ILIKE ? "
                + "and nm_interessado ILIKE ? "
                + "and ds_local ILIKE ? "
                + "and dt_data between ? and ? "
                + "and cd_croqui is not null "
                + "and cd_croqui != '' "
                + "ORDER BY dt_data DESC "
                + "LIMIT ? OFFSET ?");
        try {
            List<AnotacaoCroquiTeste> listAnotacaoCroqui = new ArrayList<AnotacaoCroquiTeste>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + qCroqui + '%');
            stmt.setString(2, '%' + qArea + '%');
            stmt.setString(3, '%' + qNome + '%');
            stmt.setString(4, '%' + qInteressado + '%');
            stmt.setString(5, '%' + qEndereco + '%');
            stmt.setDate(7, dtIni);
            stmt.setDate(8, dtFim);
            stmt.setInt(9, qtLinha);
            stmt.setInt(10, offset);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AnotacaoCroquiTeste anotCroquiT = new AnotacaoCroquiTeste();
                anotCroquiT.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                anotCroquiT.setCdExpediente(rs.getString("cd_expediente"));
                anotCroquiT.setCdCroqui(rs.getString("cd_croqui"));
                anotCroquiT.setCdArea(rs.getString("cd_area"));
                anotCroquiT.setNmInteressado(rs.getString("nm_interessado"));
                anotCroquiT.setDsLocal(rs.getString("ds_local"));
                anotCroquiT.setDtData(rs.getString("dt_data"));
                anotCroquiT.setNmAutor(rs.getString("nm_autor"));
                listAnotacaoCroqui.add(anotCroquiT);
            }
            return listAnotacaoCroqui;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO uilizado para listar o tipo de expediente da tabela 
    public List<AnotacaoCroqui> listTpExpediente() {
        String sql = ("SELECT sg_tipo_expediente FROM tbl_tipo_expediente "
                + "GROUP BY sg_tipo_expediente "
                + "ORDER BY sg_tipo_expediente ");
        try {
            List<AnotacaoCroqui> listTpExpediente = new ArrayList<AnotacaoCroqui>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AnotacaoCroqui anotExp = new AnotacaoCroqui();
                anotExp.setSgTipoExpediente(rs.getString("sg_tipo_expediente"));
                listTpExpediente.add(anotExp);
            }
            return listTpExpediente;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO uilizado para listar o nome do da tabela 
    public List<AnotacaoCroquiTeste> listNome() {
        String sql = ("SELECT COUNT(*)qtd, nm_autor FROM tbl_historico_anotacao_croqui "
                + "GROUP BY nm_autor "
                + "ORDER BY nm_autor ");
        try {
            List<AnotacaoCroquiTeste> lisNome = new ArrayList<AnotacaoCroquiTeste>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AnotacaoCroquiTeste note = new AnotacaoCroquiTeste();
                note.setNmAutor(rs.getString("nm_autor"));
                lisNome.add(note);
            }
            return lisNome;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public AnotacaoCroquiTeste pesqExpediente(int pkAnotacaoExpediente) throws SQLException {
        String sql = ("SELECT id_anotacao_expediente, cd_expediente, fk_tipo_expediente , cd_croqui, cd_area, nm_interessado, ds_local, dt_publicacao, "
                + " dt_tramitacao, ds_observacao, dt_data, nm_autor "
                + " WHERE cd_expediente=? "
                + "AND fk_tipo_expediente=? ");

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, pkAnotacaoExpediente);
            ResultSet rs = stmt.executeQuery();
        }
        return null;

    }

    //METODO detalhe de uma Anotação Croqui
    public AnotacaoCroquiTeste detalheAnotacaoCroqui(int pkAnotacaoExpediente) {
        String sql = ("SELECT cd_expediente, cd_croqui, cd_area, nm_interessado, ds_local, dt_publicacao, dt_tramitacao, "
                + "ds_observacao, dt_data, nm_autor "
                + "FROM tbl_anotacao_expediente "
                + "WHERE cd_expediente= ?");
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, pkAnotacaoExpediente);
            ResultSet rs = stmt.executeQuery();

            AnotacaoCroquiTeste anotCroquiT = new AnotacaoCroquiTeste();
            if (rs.next()) {
                stmt.setString(1, anotCroquiT.getCdExpediente());
                stmt.setString(2, anotCroquiT.getCdCroqui());
                stmt.setString(3, anotCroquiT.getCdArea());
                stmt.setString(4, anotCroquiT.getNmInteressado());
                stmt.setString(5, anotCroquiT.getDsLocal());
                stmt.setString(6, anotCroquiT.getDtPublicacao());
                stmt.setString(7, anotCroquiT.getDtTramitacao());
                stmt.setString(8, anotCroquiT.getDtData());
                stmt.setString(8, anotCroquiT.getNmAutor());
                stmt.setString(8, anotCroquiT.getDsObservacao());
                stmt.setString(9, anotCroquiT.getNmLogin());
                stmt.setTimestamp(10, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                return anotCroquiT;
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

//    METODO utilizado para inserir dados em um novo croqui
//    public void insAnotacaoCroqui(AnotacaoCroquiTeste anotCroquiT) {
//        String sql = "INSERT INTO tbl_historico_anotacao_croqui ( cd_croqui, cd_area, nr_informacao_dgpi, cd_processo, cd_tid, cd_expediente, nm_interessado ,"
//                + "ds_assunto, nm_referencia_endereco, ds_observacao, nm_autor, dt_data, nm_login, dthr_atualizacao ) "
//                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,? )";
//
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setString(1, anotCroquiT.getCdExpediente());
//            stmt.setString(2, anotCroquiT.getCdCroqui());
//            stmt.setString(3, anotCroquiT.getCdArea());
//            stmt.setString(4, anotCroquiT.getNmInteressado());
//            stmt.setString(5, anotCroquiT.getDsLocal());
////            stmt.setString(8, anotCroquiT.getDsAssunto());
//            stmt.setString(6, anotCroquiT.getDtPublicacao());
//            stmt.setString(7, anotCroquiT.getDtTramitacao());
//            stmt.setString(8, anotCroquiT.getDsObservacao());
//            stmt.setString(9, anotCroquiT.getNmAutor());
//            stmt.setString(10, anotCroquiT.getDtData());
//            stmt.setString(11, anotCroquiT.getNmLogin());
//            stmt.setTimestamp(12, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
//
//            stmt.execute();
//            stmt.close();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public void upAnotacaoCroqui(AnotacaoCroquiTeste anotCroquiT) {
        String sql = "UPDATE tbl_anotacao_expediente "
                + "SET cd_expediente=?, cd_croqui=?, cd_area=?, nm_interessado=?, ds_local=?, dt_publicacao=?, dt_tramitacao=? "
                + "ds_observacao=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_anotacao_expediente = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, anotCroquiT.getCdExpediente());
            stmt.setString(2, anotCroquiT.getCdCroqui());
            stmt.setString(3, anotCroquiT.getCdArea());
            stmt.setString(4, anotCroquiT.getNmInteressado());
            stmt.setString(5, anotCroquiT.getDsLocal());
            stmt.setString(6, anotCroquiT.getDtPublicacao());
            stmt.setString(7, anotCroquiT.getDtTramitacao());
            stmt.setString(8, anotCroquiT.getDsObservacao());
//            stmt.setString(9, anotCroquiT.getNmAutor());
//            stmt.setString(10, anotCroquiT.getDtData());
            stmt.setString(11, anotCroquiT.getNmLogin());
            stmt.setTimestamp(12, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//
//    public AnotacaoCroquiRelatorio relatorioAnotacaoCroqui(int pkAnotacaoCroquiRelatorio) {
//        String sql = "SELECT id_anotacao_croqui FROM tbl_anotacao_croqui";
//
//        try {
//            List<AnotacaoCroquiRelatorio> listRelat = new ArrayList<AnotacaoCroquiRelatorio>();
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setInt(1, pkAnotacaoCroquiRelatorio);
//            ResultSet rs = stmt.executeQuery();
//
//            while (rs.next()) {
//                AnotacaoCroquiRelatorio anotCroqRel = new AnotacaoCroquiRelatorio();
//                anotCroqRel.setPkAnotacaoCroquiRelatorio(rs.getInt("pkAnotacaoCroquiRelatorio"));
//                listRelat.add(anotCroqRel);
//            }
//            stmt.execute();
//            stmt.close();
//            return listRelat;
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
