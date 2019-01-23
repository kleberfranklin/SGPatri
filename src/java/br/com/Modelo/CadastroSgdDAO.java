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
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author x369482
 */
public class CadastroSgdDAO {

    private final Connection connection;

    public CadastroSgdDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //METODO utilizado na Classe (CadastroSgdlistaPagFiltro)
    public List<CadastroSGD> listPagFiltroPesquisaSGD(String cdProcesso, String nmInteressado, String nmAssunto, String cdCroqui, int qtdLinha, int OFFSET) {
        String sql = ("SELECT * FROM tbl_cadastro_sgd "
                + "WHERE LIKE ? and cd_processo LIKE ? and nm_interessado LIKE ? and nm_assunto LIKE ? and cd_croqui LIKE ? "
                + "ORDER BY cd_processo DESC "
                + "LIMIT ? OFFSET ?");
        try {
            List<CadastroSGD> sgdLista = new ArrayList<CadastroSGD>();

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cdProcesso + '%');
            stmt.setString(2, nmInteressado + '%');
            stmt.setString(3, '%' + nmAssunto + '%');
            stmt.setString(4, cdCroqui + '%');
            stmt.setInt(5, qtdLinha);
            stmt.setInt(6, OFFSET);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                CadastroSGD sgd = new CadastroSGD();
                sgd.setPkCadastroSgd(rs.getInt("pk_cadastro_sgd"));
                sgd.setCdProcesso(rs.getString("cd_processo"));
                sgd.setNmInteressado(rs.getString("nm_interessado"));
                sgd.setNmAssunto(rs.getString("nm_assunto"));
                sgd.setCdCroqui(rs.getString("cd_croqui"));

                sgdLista.add(sgd);
            }
            stmt.execute();
            stmt.close();

            return sgdLista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int qtdSgdPesquisa(String cdProcesso, String nmInteressado, String nmAssunto, String cdCroqui) {
        {
            String sql = ("SELECT COUNT(*) as total FROM tbl_cadastro_sgd WHERE LIKE ? and nm_processo LIKE ? "
                    + "and nm_interessado LIKE ? and nm_assunto LIKE ? and cd_croqui LIKE ? ");
            try {
                int qtdSgd;
                try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                    stmt.setString(3, cdProcesso + '%');
                    stmt.setString(4, '%' + nmInteressado + '%');
                    stmt.setString(5, '%' + nmAssunto + '%');
                    stmt.setString(6, '%' + cdCroqui + '%');
                    ResultSet rs = stmt.executeQuery();
                    qtdSgd = 0;
                    if (rs.next()) {
                        qtdSgd = rs.getInt("total");
                    }
                }
                return qtdSgd;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public CadastroSGD detalheCadSgd(int pkCadastroSgd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

}
