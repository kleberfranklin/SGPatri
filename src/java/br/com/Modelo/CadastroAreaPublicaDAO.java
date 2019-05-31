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
public class CadastroAreaPublicaDAO {

    private final Connection connection;

    public CadastroAreaPublicaDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //metodo para editar um cadastro de um processo do ministerio publico 
//    public void upCadastroAreaPublica(CadastroAreaPublica cap) throws SQLException {
//        PreparedStatement stmt = null;
//
//        String sql = "UPDATE tbl_ministerio_publico "
//                + "SET nm_origem=?, dt_entrada=?, cd_oficio_entrada=?, cd_processo=?, cd_processo_ini=?, nm_tipo_processo=?, nm_interessado=?, "
//                + "nm_solicitado=?, ds_assunto=?, ds_endereco=?, nr_info_dgpi=?, dt_resposta=?, cd_oficio_resposta=?, nr_procedimento=?, ds_observacao=?, "
//                + "nm_login=?, dthr_atualizacao=? "
//                + "WHERE id_ministerio_publico=?";
//        try {
//            stmt = connection.prepareStatement(sql);
//            stmt.setString(1, cap.getNmOrigem());
//            stmt.setDate(2, cap.getDtEntrada());
//            stmt.setString(3, cap.getCdOficioEntrada());
//            stmt.setString(4, cap.getCdProcesso());
//            stmt.setString(5, cap.getCdProcessoIni());
//            stmt.setString(6, cap.getNmTipoProcesso());
//            stmt.setString(7, cap.getNmInteressado());
//            stmt.setString(8, cap.getNmSolicitado());
//            stmt.setString(9, cap.getDsAssunto());
//            stmt.setString(10, cap.getDsEndereco());
//            stmt.setString(11, cap.getNrInfoDgpi());
//            stmt.setDate(12, cap.getDtResposta());
//            stmt.setString(13, cap.getCdOficioResposta());
//            stmt.setString(14, cap.getNrProcedimento());
//            stmt.setString(15, cap.getDsObservacao());
//            stmt.setString(16, cap.getNmLogin());
//            stmt.setTimestamp(17, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
//            stmt.setInt(18, cap.getPkMinisterioPublico());
//            stmt.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            stmt.close();
//            connection.close();
//        }
//    }
//
//    //metodo para inserir um novo cadastro de um processo do ministerio publico 
//    public void insCadastroAreaPublica(CadastroAreaPublica cap) throws SQLException {
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        String sql = "INSERT INTO sch_cap.tbl_cap "
//                + "(origem, dt_entrada, cd_oficio_entrada, cd_processo_ini, cd_processo, nm_tipo_processo, nm_interessado, nm_solicitado, ds_assunto, "
//                + "ds_endereco, nr_info_dgpi, dt_resposta, cd_oficio_resposta, nr_procedimento, ds_observacao, "
//                + "nm_login, dthr_atualizacao) "
//                + "VALUES (?, ?, ?, ?, ?)";
//        try {
//            stmt = connection.prepareStatement(sql);
//            stmt.setString(1, cap.getNmOrigem());
//            stmt.setInt(2, cap.getCdCap());
//            stmt.setString(3, cap.getStCap());
//            stmt.setString(4, cap.getNmLogin());
//            stmt.setTimestamp(5, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
//            stmt.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            stmt.close();
//            connection.close();
//        }
//    }
    //METODO utilizado para retornar as informação de um processo do Ministerio Publico
    public CadastroAreaPublica detalheCadastroAreaPublica(int pkCap) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM sch_cap.tbl_cap "
                + "WHERE gid = ?";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkCap);
            rs = stmt.executeQuery();

            CadastroAreaPublica cap = new CadastroAreaPublica();
            if (rs.next()) {
                cap.setPkCap(rs.getInt("gid"));
                cap.setCdCap(rs.getInt("cod_cap"));
                cap.setStCap(rs.getString("st_cap"));
                cap.setStObservacao(rs.getString("st_obs"));
                cap.setNmTecnico(rs.getString("nome_tec"));
                cap.setDtCriacao(rs.getString("data_cri"));
                cap.setDocDigitalizado(rs.getString("doc_digit"));
                cap.setNmOrigem(rs.getString("origem"));
                cap.setNrAreaCap(rs.getString("area_ofi"));
                cap.setNrAreaPoligono(rs.getString("area_pol"));
                cap.setEdificacao(rs.getString("edificacao"));
                cap.setNmPropietarioAntigo(rs.getString("prop_antigo"));
                cap.setTpRegistro(rs.getString("tipo_reg"));
                cap.setNrRegistro(rs.getString("num_reg"));
                cap.setNrCri(rs.getString("num_cri"));
                cap.setCdPlanta(rs.getString("planta"));
                cap.setCdProcesso(rs.getString("num_pa"));
                cap.setCdProcessoOrigem(rs.getString("num_pa_or"));
                cap.setDsDispLegal(rs.getString("dis_leg"));
                cap.setCdCroqui(rs.getString("num_crq"));
                cap.setCdArea(rs.getString("area_crq"));
                cap.setNmParc(rs.getString("nom_parc"));
                cap.setDsDestinoOr(rs.getString("dest_or"));
                cap.setCdProcessoJudicial(rs.getString("proc_jud"));
                cap.setTpDp(rs.getString("tipo_dp"));
                cap.setNmMe(rs.getString("nom_me"));
                cap.setDsCip(rs.getString("cip"));
                cap.setDtImissao(rs.getString("data_imiss"));
                cap.setTpEscritura(rs.getString("tipo_escr"));
                cap.setDtEscritura(rs.getString("data_escr"));
                cap.setNmLogradouro(rs.getString("logra"));
                cap.setDsObservacao(rs.getString("obs_geral"));
                cap.setGeojson(rs.getString("geojson"));
                cap.setNmLogin(rs.getString("nm_login"));
                cap.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            stmt.close();
            return cap;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
            stmt.close();
            connection.close();
        }
    }

    public int qtdCadastroAreaPublica(String qCap) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT COUNT(*) as total "
                + "FROM sch_cap.tbl_cap "
                + "WHERE cod_cap::text ILIKE ? ");

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, qCap + '%');
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

    public List<CadastroAreaPublica> listCadastroAreaPublica(String qCap, String qStCap, String qOrigem, int qtdLinha, int offset, String q
    ) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT gid, origem, cod_cap, st_cap "
                + "FROM sch_cap.tbl_cap "
                + "WHERE cod_cap::text ILIKE ? "
                + "ORDER BY gid ASC "
                + "LIMIT ? OFFSET ? ");

        try {
            List<CadastroAreaPublica> listCap = new ArrayList<CadastroAreaPublica>();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, qCap + '%');
            stmt.setInt(2, qtdLinha);
            stmt.setInt(3, offset);
            rs = stmt.executeQuery();
            while (rs.next()) {
                CadastroAreaPublica cap = new CadastroAreaPublica();
                cap.setPkCap(rs.getInt("gid"));
                cap.setCdCap(rs.getInt("cod_cap"));
                cap.setStCap(rs.getString("st_cap"));
                cap.setNmOrigem(rs.getString("origem"));
                listCap.add(cap);
            }
            stmt.close();
            return listCap;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
//            rs.close();
            stmt.close();
            connection.close();
        }

    }
}
