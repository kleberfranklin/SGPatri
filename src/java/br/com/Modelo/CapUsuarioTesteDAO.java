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
public class CapUsuarioTesteDAO {

//Atrituto 
    private final Connection connection;

//Construtor
    public CapUsuarioTesteDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

//MEDOTO de inserir um novo usuário do CAP
    public void cUsuarioCap(CapUsuario capUs) {
        String sql = "INSERT INTO tbl_usuario_cap (fk_divisao, fk_setor, nr_ativo, fk_perfil, fk_cargo, nm_login, nm_nome, nm_rf, nm_email, nm_loginAtualizacao, dthr_atualizacao) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, capUs.getPkDivisao());
            stmt.setInt(2, capUs.getPkSetor());
            stmt.setInt(3, capUs.getNrAtivo());
            stmt.setInt(4, capUs.getPkPerfil());
            stmt.setInt(5, capUs.getPkCargo());
            stmt.setString(6, capUs.getNmLogin());
            stmt.setString(7, capUs.getNmNome());
            stmt.setString(8, capUs.getNmRf());
            stmt.setString(9, capUs.getNmEmail());
            stmt.setString(10, capUs.getNmLoginAtualizacao());
            stmt.setTimestamp(11, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//METODO alterar informação do usuario do CAP
    public void altUsuarioCap(CapUsuario capUs) {
        String sql = "UPDATE tbl_usuario_cap SET fk_divisao=?, fk_setor=?, nr_ativo=?, fk_perfil=?, fk_cargo=?, "
                + "nm_login=?, nm_nome=?, nm_rf=?, nm_email=?, nm_loginAtualizacao=?, dthr_atualizacao=?"
                + " WHERE id_usuario_cap = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, capUs.getPkDivisao());
            stmt.setInt(2, capUs.getPkSetor());
            stmt.setInt(3, capUs.getNrAtivo());
            stmt.setInt(4, capUs.getPkPerfil());
            stmt.setInt(5, capUs.getPkCargo());
            stmt.setString(6, capUs.getNmLogin());
            stmt.setString(7, capUs.getNmNome());
            stmt.setString(8, capUs.getNmRf());
            stmt.setString(9, capUs.getNmEmail());
            stmt.setString(10, capUs.getNmLoginAtualizacao());
            stmt.setTimestamp(11, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.setInt(12, capUs.getPkUsuarioCap());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

//METODO lista todos os usuário do CAP
    public List<CapUsuario> listCapUsuario() {
        String sql = "SELECT * FROM vw_usuariocompleto_cap";
        try {
            List<CapUsuario> capUslista = new ArrayList<CapUsuario>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                CapUsuario capUs = new CapUsuario();
                capUs.setPkUsuarioCap(rs.getInt("id_usuario_cap"));
                capUs.setPkDivisao(rs.getInt("id_divisao"));
                capUs.setPkSetor(rs.getInt("id_setor"));
                capUs.setNrAtivo(rs.getInt("nr_ativo"));
                capUs.setPkCargo(rs.getInt("id_cargo"));
                capUs.setPkPerfil(rs.getInt("id_perfil"));
                capUs.setNmLogin(rs.getString("nm_login"));
                capUs.setNmNome(rs.getString("nm_nome"));
                capUs.setSgDivisao(rs.getString("sg_divisao"));
                capUs.setNmDivisao(rs.getString("nm_divisao"));
                capUs.setSgSetor(rs.getString("sg_setor"));
                capUs.setNmSetor(rs.getString("nm_setor"));
                capUs.setNmRf(rs.getString("nm_rf"));
                capUs.setNmCargo(rs.getString("nm_cargo"));
                capUs.setNmPerfil(rs.getString("nm_perfil"));
                capUs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                capUslista.add(capUs);
            }
            stmt.close();
            return capUslista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//METODO quantidade de usuários cadastrados 
    public int qtdUsuarioCap() {
        String sql = ("SELECT COUNT(*) as total FROM tbl_usuario_cap ");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            int qtdUsCap = 0;

            if (rs.next()) {
                qtdUsCap = rs.getInt("total");
            }
            stmt.close();
            return qtdUsCap;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

//METODO quantidade de usuários encontratos um pesquisa por nome
    public int qtdUsuarioQ(String q, String sgDivisao) {
        String sql = ("SELECT COUNT(*) as total FROM vw_usuariocompleto_cap "
                + "WHERE nm_nome ILIKE ? and sg_divisao ILIKE ? ");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, '%' + q + '%');
            stmt.setString(2, '%' + sgDivisao + '%');

            ResultSet rs = stmt.executeQuery();
            int qtdUs = 0;

            if (rs.next()) {
                qtdUs = rs.getInt("total");
            }
            stmt.execute();
            stmt.close();
            return qtdUs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

//METODO quantidade de usuario cadastrado em um pesquisa por nome e paginada
    public List<CapUsuario> listPaginaCapUsuario(int qtdLinha, int iniPosicao, String q, String sgDivisao) {
        String sql = ("SELECT * FROM vw_usuariocompleto_cap "
                + "WHERE nm_nome ILIKE ? and sg_divisao ILIKE ? "
                + "ORDER BY nm_nome "
                + "LIMIT ? OFFSET ?");
        try {
            List<CapUsuario> capUslista = new ArrayList<CapUsuario>();
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, '%' + q + '%');
            stmt.setString(2, '%' + sgDivisao + '%');
            stmt.setInt(3, qtdLinha);
            stmt.setInt(4, iniPosicao);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                CapUsuario capUs = new CapUsuario();
                capUs.setPkUsuarioCap(rs.getInt("id_usuario_cap"));
                capUs.setPkDivisao(rs.getInt("id_divisao"));
                capUs.setPkSetor(rs.getInt("id_setor"));
                capUs.setNrAtivo(rs.getInt("nr_ativo"));
                capUs.setPkCargo(rs.getInt("id_cargo"));
                capUs.setPkPerfil(rs.getInt("id_perfil"));
                capUs.setNmLogin(rs.getString("nm_login"));
                capUs.setNmNome(rs.getString("nm_nome"));
                capUs.setSgDivisao(rs.getString("sg_divisao"));
                capUs.setNmDivisao(rs.getString("nm_divisao"));
                capUs.setSgSetor(rs.getString("sg_setor"));
                capUs.setNmSetor(rs.getString("nm_setor"));
                capUs.setNmRf(rs.getString("nm_rf"));
                capUs.setNmCargo(rs.getString("nm_cargo"));
                capUs.setNmPerfil(rs.getString("nm_perfil"));
                capUs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                capUslista.add(capUs);
            }
            stmt.execute();
            stmt.close();
            return capUslista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//METODO ativa de desativa o acesso de um usuário na pagina paginada de lista de usuário
    public void atuStatus(CapUsuario capUs) {
        String sql = ("UPDATE tbl_usuario_cap SET nr_ativo=?, nm_loginAtualizacao=?, dthr_atualizacao=?"
                + "WHERE id_usuario_cap=? ");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, capUs.getNrAtivo());
            stmt.setString(2, capUs.getNmLoginAtualizacao());
            stmt.setTimestamp(3, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
            stmt.setInt(4, capUs.getPkUsuarioCap());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

//METODO verificar o acesso do usuario atraves do login
    public CapUsuario verificarLoginCap(String login) {
        String sql = ("SELECT * FROM vw_usuariocompleto_cap WHERE nm_login = ?");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, login);
            ResultSet rs = stmt.executeQuery();

            CapUsuario capUs = new CapUsuario();
            if (rs.next()) {
                capUs.setPkUsuarioCap(rs.getInt("id_usuario_cap"));
                capUs.setPkDivisao(rs.getInt("id_divisao"));
                capUs.setPkSetor(rs.getInt("id_setor"));
                capUs.setNrAtivo(rs.getInt("nr_ativo"));
                capUs.setPkCargo(rs.getInt("id_cargo"));
                capUs.setPkPerfil(rs.getInt("id_perfil"));
                capUs.setNmLogin(rs.getString("nm_login"));
                capUs.setNmNome(rs.getString("nm_nome"));
                capUs.setSgDivisao(rs.getString("sg_divisao"));
                capUs.setNmDivisao(rs.getString("nm_divisao"));
                capUs.setSgSetor(rs.getString("sg_setor"));
                capUs.setNmSetor(rs.getString("nm_setor"));
                capUs.setNmRf(rs.getString("nm_rf"));
                capUs.setNmCargo(rs.getString("nm_cargo"));
                capUs.setNmPerfil(rs.getString("nm_perfil"));
                capUs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                capUs.setNmFoto(rs.getString("nm_foto"));
            }
            stmt.execute();
            stmt.close();
            return capUs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //METODO retorna o nome e sigla da Divisão do usuário
    public CapUsuario nomeUsuarioCap(String NmLogin) {
        String sql = ("SELECT * FROM vw_usuariocompleto_cap WHERE nm_login = ?");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, NmLogin);
            ResultSet rs = stmt.executeQuery();

            CapUsuario capUs = new CapUsuario();
            if (rs.next()) {
                capUs.setNmLogin(rs.getString("nm_login"));
                capUs.setNmNome(rs.getString("nm_nome"));
                capUs.setSgDivisao(rs.getString("sg_divisao"));
            }
            stmt.close();
            return capUs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//METODO retorna as informações de um usuário para pagina UsuarioDetalhe
    public CapUsuario detalheUsuarioCap(int pkUsusarioCap) {
        String sql = ("SELECT * FROM vw_usuariocompleto_cap WHERE id_usuario_cap = ?");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkUsusarioCap);
            ResultSet rs = stmt.executeQuery();

            CapUsuario capUs = new CapUsuario();
            if (rs.next()) {
                capUs.setPkUsuarioCap(rs.getInt("id_usuario_cap"));
                capUs.setPkDivisao(rs.getInt("id_divisao"));
                capUs.setPkSetor(rs.getInt("id_setor"));
                capUs.setNrAtivo(rs.getInt("nr_ativo"));
                capUs.setPkCargo(rs.getInt("id_cargo"));
                capUs.setPkPerfil(rs.getInt("id_perfil"));
                capUs.setNmLogin(rs.getString("nm_login"));
                capUs.setNmNome(rs.getString("nm_nome"));
                capUs.setSgDivisao(rs.getString("sg_divisao"));
                capUs.setNmDivisao(rs.getString("nm_divisao"));
                capUs.setSgSetor(rs.getString("sg_setor"));
                capUs.setNmSetor(rs.getString("nm_setor"));
                capUs.setNmRf(rs.getString("nm_rf"));
                capUs.setNmEmail(rs.getString("nm_email"));
                capUs.setNmCargo(rs.getString("nm_cargo"));
                capUs.setNmPerfil(rs.getString("nm_perfil"));
                capUs.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                capUs.setNmFoto(rs.getString("nm_foto"));
                capUs.setNmLoginAtualizacao(rs.getString("nm_loginAtualizacao"));
            }
            stmt.close();
            return capUs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
