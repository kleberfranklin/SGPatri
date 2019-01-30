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
public class AnotacaoExpedienteDAO {

    private final Connection connection;

//Construtor
    public AnotacaoExpedienteDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }
    
    
    //Metodo de quantidade de linhas
    public int qtdExpediente(String qCroqui, String qArea, String qNome, String qEndereco, String qAssunto, 
                                                           Date dtIni, Date dtFim) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_anotacao_expediente "
                    + "WHERE cd_croqui LIKE ? "
                    + "and cd_area LIKE ? "
                    + "and nm_nome LIKE ? "
                    + "and ds_local LIKE ? "
                    + "and ds_assunto LIKE ? "
                    + "and dt_data between ? and ?  ");
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
    public List<AnotacaoExpediente> listAnotacaoExpediente(String qCroqui, String qArea, String qNome, String qEndereco, String qAssunto, 
                                                           Date dtIni, Date dtFim, int qtLinha, int offset) {
        String sql = ("SELECT * FROM tbl_anotacao_expediente "
                    + "WHERE cd_croqui LIKE ? "
                    + "and cd_area LIKE ? "
                    + "and nm_nome LIKE ? "
                    + "and ds_local LIKE ? "
                    + "and ds_assunto LIKE ? "
                    + "and dt_data between ? and ? "
                    + "ORDER BY dt_data DESC "
                    + "LIMIT ? OFFSET ?");
        try {
            List<AnotacaoExpediente> listAnotacaoExpediente = new ArrayList<AnotacaoExpediente>();
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
                    AnotacaoExpediente expedi = new AnotacaoExpediente();
                        expedi.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                        expedi.setCdCroqui(rs.getString("cd_croqui"));
                        expedi.setCdArea(rs.getString("cd_area"));
                        expedi.setNmNome(rs.getString("nm_nome"));
                        expedi.setDsLocal(rs.getString("ds_local"));
                        expedi.setDsAssunto(rs.getString("ds_assunto"));
                        expedi.setDtData(rs.getString("dt_data"));
                        expedi.setCdProcesso(rs.getString("cd_processo"));
                        expedi.setCdTid(rs.getString("cd_tid"));
                    listAnotacaoExpediente.add(expedi);
                }
            return listAnotacaoExpediente;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    //METODO uilizado para listar o nome do da tabela 
    public List<AnotacaoExpediente> listNome(){
        String sql = ("SELECT COUNT(*)qtd, nm_nome FROM tbl_anotacao_expediente " +
                        "GROUP BY nm_nome " +
                        "ORDER BY nm_nome ");
        try{
            List<AnotacaoExpediente> lisNome = new ArrayList<AnotacaoExpediente>();
                PreparedStatement stmt =  connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    AnotacaoExpediente note = new AnotacaoExpediente ();
                        note.setNmNome(rs.getString("nm_nome"));
                    lisNome.add(note);
                }
            return lisNome;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    //METODO detalhe de uma Anotação de Expediente
    public AnotacaoExpediente detalheAnotacaoExpediente(int pkExpe){
        String sql = ("SELECT * FROM tbl_anotacao_expediente");
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkExpe);
            ResultSet rs = stmt.executeQuery();
            AnotacaoExpediente expedi = new AnotacaoExpediente();    
                if(rs.next()){
                    expedi.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                
                return expedi;
                }
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }
       
    
    //METODO utilizado para inserir dados em um novo croqui
//    public void upCadastroSic(AnotacaoExpediente cadsic) {
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
