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
public class AgendamentoSalaDAO {

    private final Connection connection;

    public AgendamentoSalaDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //metodo para editar um cadastro de um processo do ministerio publico 
    public void upAgendamentoSala(AgendamentoSala as) throws SQLException {
        PreparedStatement stmt = null;

        String sql = "UPDATE tbl_agendamento_sala "
                + "SET dt_data=?, horario_inicio=?, horario_fim=?, nm_nome=?, nm_setor=?, ds_observacao=?, "
                + "nm_login=?, dthr_atualizacao=? "
                + "WHERE id_ministerio_publico=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setDate(1, as.getDtData());
            stmt.setString(2, as.getHorarioIni());
            stmt.setString(3, as.getHorarioFim());
            stmt.setString(4, as.getNmNome());
            stmt.setString(5, as.getNmSetor());
            stmt.setString(6, as.getDsObservacao());
            stmt.setString(7, as.getNmLogin());
            stmt.setTimestamp(8, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.setInt(9, as.getPkAgendamentoSala());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            connection.close();
        }
    }

    //metodo para inserir um novo cadastro de um processo do ministerio publico 
    public void insAgendamentoSala(AgendamentoSala as) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "INSERT INTO tbl_agendamento_sala "
                + "(dt_data, horario_inicio, horario_fim, nm_nome, nm_setor, ds_observacao, "
                + "nm_login, dthr_atualizacao) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setDate(1, as.getDtData());
            stmt.setString(2, as.getHorarioIni());
            stmt.setString(3, as.getHorarioFim());
            stmt.setString(4, as.getNmNome());
            stmt.setString(5, as.getNmSetor());
            stmt.setString(6, as.getDsObservacao());
            stmt.setString(7, as.getNmLogin());
            stmt.setTimestamp(8, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            connection.close();
        }
    }

    //METODO utilizado para retornar as informação de um processo do Ministerio Publico
    public AgendamentoSala detalheAgendamentoSala(int pkAgendamentoSala) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM tbl_agendamento_sala "
                + "WHERE id_agendamento_sala = ?";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkAgendamentoSala);
            rs = stmt.executeQuery();

            AgendamentoSala agendaSala = new AgendamentoSala();
            if (rs.next()) {
                agendaSala.setPkAgendamentoSala(rs.getInt("id_agendamento_sala"));
                agendaSala.setDtData(rs.getDate("dt_data"));
                agendaSala.setHorarioIni(rs.getString("horario_inicio"));
                agendaSala.setHorarioFim(rs.getString("horario_fim"));
                agendaSala.setNmNome(rs.getString("nm_nome"));
                agendaSala.setNmSetor(rs.getString("nm_setor"));
                agendaSala.setDsObservacao(rs.getString("ds_observacao"));
                agendaSala.setNmLogin(rs.getString("nm_login"));
                agendaSala.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            stmt.close();
            return agendaSala;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            connection.close();
        }
    }

    public int qtdAgendamentoSala() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT COUNT(*) as total "
                + "FROM tbl_agendamento_sala ");

        try {
            stmt = connection.prepareStatement(sql);

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
            stmt.close();
            connection.close();
        }
    }

    public List<AgendamentoSala> listAgendamentoSala(Date qData, String dtDataTxt, String horarioIni, String horarioFim, String nmNome,
            int qtdLinha, int offset, String q) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = ("SELECT id_agendamento_sala, dt_data, TO_CHAR(dt_data :: DATE, ' dd/mm/yyyy') as dt_data_txt, horario_inicio, horario_fim, nm_nome "
                + "FROM tbl_agendamento_sala "
                + "ORDER BY dt_data DESC, "
                + "horario_inicio ASC "
                + "LIMIT ? OFFSET ? ");

        try {
            List<AgendamentoSala> listAgendaSala = new ArrayList<AgendamentoSala>();
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, qtdLinha);
            stmt.setInt(2, offset);

            rs = stmt.executeQuery();
            while (rs.next()) {
                AgendamentoSala agendaSala = new AgendamentoSala();
                agendaSala.setPkAgendamentoSala(rs.getInt("id_agendamento_sala"));
                agendaSala.setDtData(rs.getDate("dt_data"));
                agendaSala.setDtDataTxt(rs.getString("dt_data_txt"));
                agendaSala.setHorarioIni(rs.getString("horario_inicio"));
                agendaSala.setHorarioFim(rs.getString("horario_fim"));
                agendaSala.setNmNome(rs.getString("nm_nome"));
                listAgendaSala.add(agendaSala);
            }
            stmt.close();
            return listAgendaSala;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            stmt.close();
            connection.close();
        }

    }
}
