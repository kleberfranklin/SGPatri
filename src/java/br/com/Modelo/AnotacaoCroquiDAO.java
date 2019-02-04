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
    public int qtdAntoCroqui(String qCroqui, String qArea, String qNome, String qEndereco, String qAssunto, 
                                                           Date dtIni, Date dtFim) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_anotacao_expediente "
                    + "WHERE cd_croqui LIKE ? "
                    + "and cd_area LIKE ? "
                    + "and nm_nome LIKE ? "
                    + "and ds_local LIKE ? "
                    + "and ds_assunto LIKE ? "
                    + "and dt_data between ? and ? "
                    + "and cd_croqui is not null "
                    + "and cd_croqui != '' ");
        try {
            int total =0;
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                    stmt.setString(1, '%' + qCroqui + '%');
                    stmt.setString(2, '%' + qArea + '%');
                    stmt.setString(3, qNome + '%');
                    stmt.setString(4, '%' + qEndereco + '%');
                    stmt.setString(5, '%' + qAssunto + '%');
                    stmt.setDate(6, dtIni);
                    stmt.setDate(7, dtFim);
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
    public List<AnotacaoCroqui> listAnotaCroqui(String qCroqui, String qArea, String qNome, String qEndereco, String qAssunto, 
                                                           Date dtIni, Date dtFim, int qtLinha, int offset) {
        String sql = ("SELECT * FROM tbl_anotacao_expediente "
                    + "WHERE cd_croqui LIKE ? "
                    + "and cd_area LIKE ? "
                    + "and nm_nome LIKE ? "
                    + "and ds_local LIKE ? "
                    + "and ds_assunto LIKE ? "
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
                stmt.setString(3, qNome + '%');
                stmt.setString(4, '%' + qEndereco + '%');
                stmt.setString(5, '%' + qAssunto + '%');
                stmt.setDate(6, dtIni);
                stmt.setDate(7, dtFim);
                stmt.setInt(8, qtLinha);
                stmt.setInt(9, offset);

            ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    AnotacaoCroqui anotCroqui = new AnotacaoCroqui();
                        anotCroqui.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                        anotCroqui.setCdCroqui(rs.getString("cd_croqui"));
                        anotCroqui.setCdArea(rs.getString("cd_area"));
                        anotCroqui.setNmNome(rs.getString("nm_nome"));
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
    public List<AnotacaoCroqui> listNome(){
        String sql = ("SELECT COUNT(*)qtd, nm_nome FROM tbl_anotacao_expediente " +
                        "GROUP BY nm_nome " +
                        "ORDER BY nm_nome ");
        try{
            List<AnotacaoCroqui> lisNome = new ArrayList<AnotacaoCroqui>();
                PreparedStatement stmt =  connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    AnotacaoCroqui note = new AnotacaoCroqui ();
                        note.setNmNome(rs.getString("nm_nome"));
                    lisNome.add(note);
                }
            return lisNome;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    //METODO detalhe de uma Anotação Croqui
     public AnotacaoCroqui detalheAnotacaoCroqui(int pkAnotacaoExpediente){
        String sql = ("SELECT id_anotacao_expediente, nr_informacao_dgpi, ds_assunto, cd_croqui, cd_area, cd_processo, cd_tid, cd_expediente, nm_interessado, "
                    + "ds_local,  nr_anotacao, nr_informacao, ds_despacho, dt_publicacao, dt_anotacao, ds_observacao, dt_data, nm_nome "
                    + "FROM tbl_anotacao_expediente "
                    + "WHERE id_anotacao_expediente = ? ");
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkAnotacaoExpediente);
            ResultSet rs = stmt.executeQuery();
            
            AnotacaoCroqui anotCroqui = new AnotacaoCroqui();    
                if(rs.next()){
                    anotCroqui.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                    anotCroqui.setNmInformacaoDgpi(rs.getString("nr_informacao_dgpi"));
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
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }
    
////    METODO utilizado para inserir dados em um novo croqui
//    public void upAnotacaoCroqui(AnotacaoCroqui anotCroqui) {
//        String sql = "INSERT INTO tbl_anotacao_expediente ( cd_croqui, cd_area, nr_informacao_dgpi, cd_processo, cd_tid, cd_expediente, nm_interessado ,"
//                + "ds_assunto, fk_enderecos, ds_observacao, nm_login, dthr_atualizacao ) "
//                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,? )";
//        try {
//            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//                stmt.setString(1, cadsic.getCdCroqui());
//                stmt.setString(2, cadsic.getCdArea());
//                stmt.setInt(3, cadsic.getNrInformacaoDgpi());
//                stmt.setString(4, cadsic.getCdProcesso());
//                stmt.setString(5, cadsic.getCdTid());
//                stmt.setString(6, cadsic.getCdExpediente());
//                stmt.setString(7, cadsic.getNmInteressado());
//                stmt.setString(8, cadsic.getDsAssunto());
//                stmt.setString(9, cadsic.getDsObservacao());
//                stmt.setInt(10, cadsic.getFkEnderecos());
//                stmt.setString(11, cadsic.getNmLogin());
//                stmt.setTimestamp(12, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
//
//                stmt.execute();
//                stmt.close();
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    


 
    
    
}
