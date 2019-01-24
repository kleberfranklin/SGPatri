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
public class CadastroSicDAO {

    private final Connection connection;

//Construtor
    public CadastroSicDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //METODO lista os atributos do cadastro de croqui das pesquisas e paginado
    public List<CadastroSic> listCadSic(int qtLinha, int offset, String q) {
        String sql = ("SELECT * FROM tbl_cadastro_sic ");
        try {
            List<CadastroSic> listCadSic = new ArrayList<CadastroSic>();
            PreparedStatement stmt = connection.prepareStatement(sql); {
                stmt.setString(1, '%' + q + '%');
                stmt.setString(2, '%' + q + '%');
                stmt.setInt(3, qtLinha);
                stmt.setInt(4, offset);

                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    CadastroSic cadsic = new CadastroSic();
                        cadsic.setPkCadastroSic(rs.getInt("id_cadastro_sic"));
                        cadsic.setCdCroqui(rs.getString("cd_croqui"));
                        cadsic.setCdArea(rs.getString("cd_area"));
                        cadsic.setNrInformacaoDgpi(rs.getInt("nr_informacao_dgpi"));
                        cadsic.setCdProcesso(rs.getString("cd_processo"));
                        cadsic.setCdTid(rs.getString("cd_tid"));
                        cadsic.setCdExpediente(rs.getString("cd_expediente"));
                        cadsic.setNmInteressado(rs.getString("nm_interessado"));
                        cadsic.setDsAssunto(rs.getString("ds_assunto"));
                        cadsic.setDsObservacao(rs.getString("ds_observacao"));
                        cadsic.setFkEnderecos(rs.getInt("fk_enderecos"));
                        cadsic.setNmLogin(rs.getString("nm_login"));
                        cadsic.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                    listCadSic.add(cadsic);
                }
            }
            return listCadSic;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO utilizado para inserir dados em um novo croqui
    public void upCadastroSic(CadastroSic cadsic) {
        String sql = "INSERT INTO tbl_cadastro_sic ( cd_croqui, cd_area, nr_informacao_dgpi, cd_processo, cd_tid, cd_expediente, nm_interessado ,"
                + "ds_assunto, fk_enderecos, ds_observacao, nm_login, dthr_atualizacao ) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,? )";
        try {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, cadsic.getCdCroqui());
                stmt.setString(2, cadsic.getCdArea());
                stmt.setInt(3, cadsic.getNrInformacaoDgpi());
                stmt.setString(4, cadsic.getCdProcesso());
                stmt.setString(5, cadsic.getCdTid());
                stmt.setString(6, cadsic.getCdExpediente());
                stmt.setString(7, cadsic.getNmInteressado());
                stmt.setString(8, cadsic.getDsAssunto());
                stmt.setString(9, cadsic.getDsObservacao());
                stmt.setInt(10, cadsic.getFkEnderecos());
                stmt.setString(11, cadsic.getNmLogin());
                stmt.setTimestamp(12, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));

                stmt.execute();
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //Metodo de quantidade de linhas
    public int qdCadastroSic(String q) {
        String sql = ("SELECT COUNT(*) as total FROM tbl_cadastro_sic "
                + "WHERE (# LIKE ? or # LIKE ? ) ");
        try {
            int total;
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, '%' + q + '%');
                stmt.setString(2, '%' + q + '%');
                ResultSet rs = stmt.executeQuery();
                total = 0;
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

}
