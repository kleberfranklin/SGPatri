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
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author x369482
 */
public class AnotacaoCroquiDAO {

    private final Connection connection;
    
    
    Calendar data = Calendar.getInstance();

//Construtor
    public AnotacaoCroquiDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //Metodo de quantidade de linhas
    public int qtdAntoCroqui(String qCroqui, String qArea, String qNome, String qInteressado, String qEndereco, String qAssunto,
            Date dtIni, Date dtFim) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_anotacao_expediente "
                + "WHERE cd_croqui ILIKE ? "
                + "and cd_area ILIKE ? "
                + "and nm_autor ILIKE ? "
                + "and nm_interessado ILIKE ? "
                + "and nm_referencia_endereco ILIKE ? "
                + "and ds_assunto ILIKE ? "
                + "and dt_data between ? and ? "
                + "and nm_tipo_expediente = 'CROQUI' ");
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
        String sql = ("SELECT * FROM tbl_anotacao_expediente "
                + "WHERE cd_croqui ILIKE ? "
                + "and cd_area ILIKE ? "
                + "and nm_autor ILIKE ? "
                + "and nm_interessado ILIKE ? "
                + "and nm_referencia_endereco ILIKE ? "
                + "and ds_assunto ILIKE ? "
                + "and dt_data between ? and ? "
                + "and nm_tipo_expediente = 'CROQUI' "
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
                anotCroqui.setNmAutor(rs.getString("nm_autor"));
                anotCroqui.setNmInteressado(rs.getString("nm_interessado"));
                anotCroqui.setNmReferenciaEndereco(rs.getString("nm_referencia_endereco"));
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
        String sql = ("SELECT COUNT(*)qtd, nm_autor FROM tbl_anotacao_expediente "
                + "WHERE nm_tipo_expediente = 'CROQUI' "
                + "GROUP BY nm_autor "
                + "ORDER BY nm_autor ");
        try {
            List<AnotacaoCroqui> lisNome = new ArrayList<AnotacaoCroqui>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AnotacaoCroqui note = new AnotacaoCroqui();
                note.setNmAutor(rs.getString("nm_autor"));
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
                + "nm_referencia_endereco,  nr_anotacao, nr_informacao, ds_despacho, dt_publicacao, dt_anotacao, ds_observacao, dt_data, nm_autor "
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
                anotCroqui.setNmReferenciaEndereco(rs.getString("nm_referencia_endereco"));
                anotCroqui.setNrAnotacao(rs.getString("nr_anotacao"));
                anotCroqui.setNrInformacao(rs.getString("nr_informacao"));
                anotCroqui.setDsDespacho(rs.getString("ds_despacho"));
                anotCroqui.setDtPublicacao(rs.getString("dt_publicacao"));
                anotCroqui.setDtAnotacao(rs.getString("dt_anotacao"));
                anotCroqui.setDsObservacao(rs.getString("ds_observacao"));
                anotCroqui.setDtData(rs.getString("dt_data"));
                anotCroqui.setNmAutor(rs.getString("nm_Autor"));
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
    public int cAnotacaoCroqui(AnotacaoCroqui anotCroqui) {
        int pkCroqui=0;
        String strPublicacao, strData;
        Date dtPubicacao, dtData;
        
        strPublicacao = anotCroqui.getDtPublicacao();
        strData = anotCroqui.getDtData();
            
        if ("".equals(strPublicacao)){
            dtPubicacao = null;
        }else{
            dtPubicacao = java.sql.Date.valueOf(strPublicacao);
        }
            
        if ("".equals(strData)){
            dtData = null;
        }else{
            dtData = java.sql.Date.valueOf(strData);
        }
                
        String sql = "INSERT INTO tbl_anotacao_expediente (fk_logradouro, cd_croqui, cd_area, cd_expediente, nm_interessado, ds_assunto, ds_despacho, ds_observacao, nm_autor, "
                + "nm_login, cd_processo, cd_tid, dt_anotacao, nr_informacao_dgpi, dt_publicacao, nm_referencia_endereco, dt_data, nm_tipo_processo, nm_tipo_expediente, nr_anotacao, "
                + "nr_informacao, nr_endereco, nm_complemento_endereco, dthr_atualizacao) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                    stmt.setInt(1, anotCroqui.getFkLogradouro());
                    stmt.setString(2, anotCroqui.getCdCroqui());
                    stmt.setString(3, anotCroqui.getCdArea());
                    stmt.setString(4, anotCroqui.getCdExpediente());
                    stmt.setString(5, anotCroqui.getNmInteressado());
                    stmt.setString(6, anotCroqui.getDsAssunto());
                    stmt.setString(7, anotCroqui.getDsDespacho());
                    stmt.setString(8, anotCroqui.getDsObservacao());
                    stmt.setString(9, anotCroqui.getNmAutor());
                    stmt.setString(10, anotCroqui.getNmLogin());
                    stmt.setString(11, anotCroqui.getCdProcesso());
                    stmt.setString(12, anotCroqui.getCdTid());
                    stmt.setString(13, anotCroqui.getDtAnotacao());
                    stmt.setString(14, anotCroqui.getNrInformacaoDgpi());
                    stmt.setDate(15, dtPubicacao);
                    stmt.setString(16, anotCroqui.getNmReferenciaEndereco());
                    stmt.setDate(17, dtData);
                    stmt.setString(18, anotCroqui.getNmTipoProcesso());
                    stmt.setString(19, anotCroqui.getNmTipoExpediente());
                    stmt.setString(20, anotCroqui.getNrAnotacao());
                    stmt.setString(21, anotCroqui.getNrInformacao());
                    stmt.setString(22, anotCroqui.getNrEndereco());
                    stmt.setString(23, anotCroqui.getNmComplementoEndereco());
                    stmt.setTimestamp(24, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.executeUpdate();
            
                ResultSet rs = stmt.getGeneratedKeys();
                if(rs.next()){
                    pkCroqui = rs.getInt("id_anotacao_expediente");
                }
            stmt.close();
            return pkCroqui;
                  
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void upAnotacaoCroqui(AnotacaoCroqui anotCroqui) {
        String strPublicacao, strData;
        Date dtPubicacao, dtData;
        
        strPublicacao = anotCroqui.getDtPublicacao();
        strData = anotCroqui.getDtData();
            
        if ("".equals(strPublicacao)){
            dtPubicacao = null;
        }else{
            dtPubicacao = java.sql.Date.valueOf(strPublicacao);
        }
            
        if ("".equals(strData)){
            dtData = null;
        }else{
            dtData = java.sql.Date.valueOf(strData);
        }
        
        String sql = "UPDATE tbl_anotacao_expediente "
                + "SET fk_logradouro, cd_croqui, cd_area, cd_expediente, nm_interessado, ds_assunto, ds_despacho, ds_observacao, nm_autor, "
                + "nm_login, cd_processo, cd_tid, dt_anotacao, nr_informacao_dgpi, dt_publicacao, nm_referencia_endereco, dt_data, nm_tipo_processo, nm_tipo_expediente, nr_anotacao, "
                + "nr_informacao, nr_endereco, nm_complemento_endereco, dthr_atualizacao "
                + "WHERE id_anotacao_expediente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, anotCroqui.getFkLogradouro());
                    stmt.setString(2, anotCroqui.getCdCroqui());
                    stmt.setString(3, anotCroqui.getCdArea());
                    stmt.setString(4, anotCroqui.getCdExpediente());
                    stmt.setString(5, anotCroqui.getNmInteressado());
                    stmt.setString(6, anotCroqui.getDsAssunto());
                    stmt.setString(7, anotCroqui.getDsDespacho());
                    stmt.setString(8, anotCroqui.getDsObservacao());
                    stmt.setString(9, anotCroqui.getNmAutor());
                    stmt.setString(10, anotCroqui.getNmLogin());
                    stmt.setString(11, anotCroqui.getCdProcesso());
                    stmt.setString(12, anotCroqui.getCdTid());
                    stmt.setString(13, anotCroqui.getDtAnotacao());
                    stmt.setString(14, anotCroqui.getNrInformacaoDgpi());
                    stmt.setDate(15, dtPubicacao);
                    stmt.setString(16, anotCroqui.getNmReferenciaEndereco());
                    stmt.setDate(17, dtData);
                    stmt.setString(18, anotCroqui.getNmTipoProcesso());
                    stmt.setString(19, anotCroqui.getNmTipoExpediente());
                    stmt.setString(20, anotCroqui.getNrAnotacao());
                    stmt.setString(21, anotCroqui.getNrInformacao());
                    stmt.setString(22, anotCroqui.getNrEndereco());
                    stmt.setString(23, anotCroqui.getNmComplementoEndereco());
                    stmt.setTimestamp(24, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(25,anotCroqui.getPkAnotacaoExpediente());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
