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
public class AnotacaoDiversasDAO {

    private final Connection connection;
    

//Construtor
    public AnotacaoDiversasDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //Metodo de quantidade de linhas
    public int qtdAntoDiversa(String qSetor, String qQuarda, String qLote, String qArea, String qNome, String qInteressado, 
            String qEndereco, String qAssunto, Date dtIni, Date dtFim) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_anotacao_expediente "
                + "WHERE cd_setor ILIKE ? "
                + "and cd_quadra ILIKE ? "
                + "and cd_lote ILIKE ? "
                + "and cd_area ILIKE ? "
                + "and nm_autor ILIKE ? "
                + "and nm_interessado ILIKE ? "
                + "and nm_referencia_endereco ILIKE ? "
                + "and ds_assunto ILIKE ? "
                + "and dt_data between ? and ? "
                + "and nm_tipo_expediente = 'AD' ");
        try {
            int total = 0;
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, qSetor + '%');
                stmt.setString(2, qQuarda + '%');
                stmt.setString(3, qLote + '%');
                stmt.setString(4, qArea + '%');
                stmt.setString(5, qNome + '%');
                stmt.setString(6, '%' + qInteressado + '%');
                stmt.setString(7, '%' + qEndereco + '%');
                stmt.setString(8, '%' + qAssunto + '%');
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
    public List<AnotacaoDiversas> listAnotaDiversa(String qSetor, String qQuarda, String qLote, String qArea, String qNome, String qInteressado, 
            String qEndereco, String qAssunto,
            Date dtIni, Date dtFim, int qtLinha, int offset) {
        String sql = ("SELECT id_anotacao_expediente, cd_setor, cd_quadra, cd_lote, cd_area, nm_autor, nm_interessado, "
                + "nm_referencia_endereco, ds_assunto, dt_data, cd_processo, cd_tid  "
                + "FROM tbl_anotacao_expediente "
                + "WHERE cd_setor ILIKE ? "
                + "and cd_quadra ILIKE ? "
                + "and cd_lote ILIKE ? "
                + "and cd_area ILIKE ? "
                + "and nm_autor ILIKE ? "
                + "and nm_interessado ILIKE ? "
                + "and nm_referencia_endereco ILIKE ? "
                + "and ds_assunto ILIKE ? "
                + "and dt_data between ? and ? "
                + "and nm_tipo_expediente = 'AD' "
                + "ORDER BY dt_data DESC "
                + "LIMIT ? OFFSET ?");
        try {
            List<AnotacaoDiversas> listAnotacaoDiversas = new ArrayList<AnotacaoDiversas>();
            PreparedStatement stmt = connection.prepareStatement(sql);
             stmt.setString(1, qSetor + '%');
                stmt.setString(2, qQuarda + '%');
                stmt.setString(3, qLote + '%');
                stmt.setString(4, qArea + '%');
                stmt.setString(5, qNome + '%');
                stmt.setString(6, '%' + qInteressado + '%');
                stmt.setString(7, '%' + qEndereco + '%');
                stmt.setString(8, '%' + qAssunto + '%');
                stmt.setDate(9, dtIni);
                stmt.setDate(10, dtFim);
                stmt.setInt(11, qtLinha);
                stmt.setInt(12, offset);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AnotacaoDiversas anotDiversas = new AnotacaoDiversas();
                anotDiversas.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                anotDiversas.setCdSetor(rs.getString("cd_setor"));
                anotDiversas.setCdQuadra(rs.getString("cd_quadra"));
                anotDiversas.setCdLote(rs.getString("cd_lote"));
                anotDiversas.setCdArea(rs.getString("cd_area"));
                anotDiversas.setNmAutor(rs.getString("nm_autor"));
                anotDiversas.setNmInteressado(rs.getString("nm_interessado"));
                anotDiversas.setNmReferenciaEndereco(rs.getString("nm_referencia_endereco"));
                anotDiversas.setDsAssunto(rs.getString("ds_assunto"));
                anotDiversas.setDtData(rs.getDate("dt_data"));
                anotDiversas.setCdProcesso(rs.getString("cd_processo"));
                anotDiversas.setCdTid(rs.getString("cd_tid"));
                listAnotacaoDiversas.add(anotDiversas);
            }
            return listAnotacaoDiversas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO uilizado para listar o nome do da tabela 
    public List<AnotacaoDiversas> listNome() {
        String sql = ("SELECT COUNT(*)qtd, nm_autor FROM tbl_anotacao_expediente "
                + "WHERE nm_tipo_expediente = 'AD' "
                + "GROUP BY nm_autor "
                + "ORDER BY nm_autor ");
        try {
            List<AnotacaoDiversas> lisNome = new ArrayList<AnotacaoDiversas>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                AnotacaoDiversas note = new AnotacaoDiversas();
                    note.setNmAutor(rs.getString("nm_autor"));
                lisNome.add(note);
            }
            return lisNome;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO detalhe de uma Anotação Croqui
    public AnotacaoDiversas detalheAnotacaoDiversas(int pkAnotacaoExpediente) {
        String sql = ("SELECT id_anotacao_expediente, fk_logradouro, nr_informacao_dgpi, ds_assunto, cd_setor, cd_quadra, cd_lote, cd_area, nm_tipo_processo, cd_processo, cd_tid, cd_expediente, nm_interessado, "
                + "nm_referencia_endereco,  nr_anotacao, nr_informacao, ds_despacho, dt_publicacao, dt_anotacao, ds_observacao, dt_data, nm_autor, "
                + "nr_endereco, nm_complemento_endereco, nr_verificado_expediente, nr_verificado_arquivo "
                + "FROM tbl_anotacao_expediente "
                + "WHERE id_anotacao_expediente = ? ");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkAnotacaoExpediente);
                ResultSet rs = stmt.executeQuery();

            AnotacaoDiversas anotDiversas = new AnotacaoDiversas();
            if (rs.next()) {
                anotDiversas.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                anotDiversas.setFkLogradouro(rs.getInt("fk_logradouro"));
                anotDiversas.setNrInformacaoDgpi(rs.getString("nr_informacao_dgpi"));
                anotDiversas.setCdSetor(rs.getString("cd_setor"));
                anotDiversas.setCdQuadra(rs.getString("cd_quadra"));
                anotDiversas.setCdLote(rs.getString("cd_lote"));
                anotDiversas.setCdArea(rs.getString("cd_area"));
                anotDiversas.setNmTipoProcesso(rs.getString("nm_tipo_processo"));
                anotDiversas.setCdProcesso(rs.getString("cd_processo"));
                anotDiversas.setCdTid(rs.getString("cd_tid"));
                anotDiversas.setCdExpediente(rs.getString("cd_expediente"));
                anotDiversas.setNmInteressado(rs.getString("nm_interessado"));
                anotDiversas.setDsAssunto(rs.getString("ds_assunto"));
                anotDiversas.setNmReferenciaEndereco(rs.getString("nm_referencia_endereco"));
                anotDiversas.setNrAnotacao(rs.getString("nr_anotacao"));
                anotDiversas.setDsInformacaoGeral(rs.getString("ds_info_geral"));
                anotDiversas.setNrInformacao(rs.getString("nr_informacao"));
                anotDiversas.setDsDespacho(rs.getString("ds_despacho"));
                anotDiversas.setDtPublicacao(rs.getDate("dt_publicacao"));
                anotDiversas.setDtAnotacao(rs.getString("dt_anotacao"));
                anotDiversas.setDsObservacao(rs.getString("ds_observacao"));
                anotDiversas.setDtData(rs.getDate("dt_data"));
                anotDiversas.setNmAutor(rs.getString("nm_Autor"));
                anotDiversas.setNrEndereco(rs.getString("nr_endereco"));
                anotDiversas.setNmComplementoEndereco(rs.getString("nm_complemento_endereco"));
                anotDiversas.setNrVerExpediente(rs.getInt("nr_verificado_expediente"));
                anotDiversas.setNrVerArquivo(rs.getInt("nr_verificado_arquivo"));
                return anotDiversas;
            }
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

//    METODO utilizado para inserir dados em um novo croqui
    public int cAnotacaoDiversas(AnotacaoDiversas anotDiversas) {
        int pk=0;
                
        String sql = "INSERT INTO tbl_anotacao_expediente (fk_logradouro, cd_setor, cd_quadra, cd_lote, cd_area, cd_expediente, nm_interessado, ds_assunto, ds_despacho, ds_observacao, nm_autor, "
                + "nm_login, cd_processo, cd_tid, dt_anotacao, ds_info_geral, nr_informacao_dgpi, dt_publicacao, nm_referencia_endereco, dt_data, nm_tipo_processo, nm_tipo_expediente, nr_anotacao, "
                + "nr_informacao, nr_endereco, nm_complemento_endereco, dthr_atualizacao, nr_verificado_expediente) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                    stmt.setInt(1, anotDiversas.getFkLogradouro());
                    stmt.setString(2, anotDiversas.getCdSetor());
                    stmt.setString(3, anotDiversas.getCdQuadra());
                    stmt.setString(4, anotDiversas.getCdLote());
                    stmt.setString(5, anotDiversas.getCdArea());
                    stmt.setString(6, anotDiversas.getCdExpediente());
                    stmt.setString(7, anotDiversas.getNmInteressado());
                    stmt.setString(8, anotDiversas.getDsAssunto());
                    stmt.setString(9, anotDiversas.getDsDespacho());
                    stmt.setString(10, anotDiversas.getDsObservacao());
                    stmt.setString(11, anotDiversas.getNmAutor());
                    stmt.setString(12, anotDiversas.getNmLogin());
                    stmt.setString(13, anotDiversas.getCdProcesso());
                    stmt.setString(14, anotDiversas.getCdTid());
                    stmt.setString(15, anotDiversas.getDtAnotacao());
                    stmt.setString(16, anotDiversas.getDsInformacaoGeral());
                    stmt.setString(17, anotDiversas.getNrInformacaoDgpi());
                    stmt.setDate(18, (Date) anotDiversas.getDtPublicacao());
                    stmt.setString(19, anotDiversas.getNmReferenciaEndereco());
                    stmt.setDate(20, (Date) anotDiversas.getDtData());
                    stmt.setString(21, anotDiversas.getNmTipoProcesso());
                    stmt.setString(22, anotDiversas.getNmTipoExpediente());
                    stmt.setString(23, anotDiversas.getNrAnotacao());
                    stmt.setString(24, anotDiversas.getNrInformacao());
                    stmt.setString(25, anotDiversas.getNrEndereco());
                    stmt.setString(26, anotDiversas.getNmComplementoEndereco());
                    stmt.setTimestamp(27, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(28, anotDiversas.getNrVerExpediente());
                stmt.executeUpdate();
            
                ResultSet rs = stmt.getGeneratedKeys();
                if(rs.next()){
                    pk = rs.getInt("id_anotacao_expediente");
                }
            stmt.close();
            return pk;
                  
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void upAnotacaoDiversas(AnotacaoDiversas anotDiversas) {
        String sql = "UPDATE tbl_anotacao_expediente "
                + "SET fk_logradouro=?, cd_setor=?, cd_quadra=?, cd_lote=?, cd_area=?, cd_expediente=?, nm_interessado=?, ds_assunto=?, ds_despacho=?, ds_observacao=?, nm_autor=?, "
                + "nm_login=?, cd_processo=?, cd_tid=?, dt_anotacao=?, ds_info_geral=?, nr_informacao_dgpi=?, dt_publicacao=?, nm_referencia_endereco=?, dt_data=?, nm_tipo_processo=?, nm_tipo_expediente=?, nr_anotacao=?, "
                + "nr_informacao=?, nr_endereco=?, nm_complemento_endereco=?, dthr_atualizacao=?, nr_verificado_expediente = ? "
                + "WHERE id_anotacao_expediente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, anotDiversas.getFkLogradouro());
                stmt.setString(2, anotDiversas.getCdSetor());
                stmt.setString(3, anotDiversas.getCdQuadra());
                stmt.setString(4, anotDiversas.getCdLote());
                stmt.setString(5, anotDiversas.getCdArea());
                stmt.setString(6, anotDiversas.getCdExpediente());
                stmt.setString(7, anotDiversas.getNmInteressado());
                stmt.setString(8, anotDiversas.getDsAssunto());
                stmt.setString(9, anotDiversas.getDsDespacho());
                stmt.setString(10, anotDiversas.getDsObservacao());
                stmt.setString(11, anotDiversas.getNmAutor());
                stmt.setString(12, anotDiversas.getNmLogin());
                stmt.setString(13, anotDiversas.getCdProcesso());
                stmt.setString(14, anotDiversas.getCdTid());
                stmt.setString(15, anotDiversas.getDtAnotacao());
                stmt.setString(16, anotDiversas.getDsInformacaoGeral());
                stmt.setString(17, anotDiversas.getNrInformacaoDgpi());
                stmt.setDate(18, (Date) anotDiversas.getDtPublicacao());
                stmt.setString(19, anotDiversas.getNmReferenciaEndereco());
                stmt.setDate(20, (Date) anotDiversas.getDtData());
                stmt.setString(21, anotDiversas.getNmTipoProcesso());
                stmt.setString(22, anotDiversas.getNmTipoExpediente());
                stmt.setString(23, anotDiversas.getNrAnotacao());
                stmt.setString(24, anotDiversas.getNrInformacao());
                stmt.setString(25, anotDiversas.getNrEndereco());
                stmt.setString(26, anotDiversas.getNmComplementoEndereco());
                stmt.setTimestamp(27, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(28, anotDiversas.getNrVerExpediente());
                stmt.setInt(29,anotDiversas.getPkAnotacaoExpediente());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public void upAnotacaoDiversasVerificadoArquivo (int pkAnotacaoExpediente){
        String sql = "UPDATE tbl_anotacao_expediente "
                    + "SET nr_verificado_arquivo = 1 "
                    + "WHERE id_anotacao_expediente = ? ";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkAnotacaoExpediente);
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }    
    
    }
    
    
    

}
