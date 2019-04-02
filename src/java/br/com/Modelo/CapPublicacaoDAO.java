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
public class CapPublicacaoDAO {

    private final Connection connection;

//Construtor
    public CapPublicacaoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    //Metodo de quantidade de linhas
    public int qtdPubliCap(int codCap, Date dtIni, Date dtFim) {
        String sql = ("SELECT COUNT(*) AS total FROM sch_cap.tbl_cap "
//                + "WHERE cod_cap = ? "
//                + "and data_cri between ? and ? "
                 );
        try {
            int total = 0;
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, codCap);
                stmt.setDate(2, dtIni);
                stmt.setDate(3, dtFim);
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

    //METODO lista os atributos do CAP para pesquisas e paginado
    public List<CapPublicacao> listPubliCap(int codCap, Date dtIni, Date dtFim, int qtLinha, int offset) {
        String sql = ("SELECT * FROM sch_cap.tbl_cap "
                + "WHERE cod_cap = ? "
//                + "and data_cri between ? and ? "
                + "ORDER BY data_cri DESC "
                + "LIMIT ? OFFSET ?");
        try {
            List<CapPublicacao> listCapPublicacao = new ArrayList<CapPublicacao>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codCap);
            stmt.setDate(2, dtIni);
            stmt.setDate(3, dtFim);
            stmt.setInt(4, qtLinha);
            stmt.setInt(5, offset);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                CapPublicacao publiCap = new CapPublicacao();
                publiCap.setPkCapPublicacao(rs.getInt("gid"));
                publiCap.setCodCap(rs.getInt("cod_cap"));
                publiCap.setDataCri(rs.getString("data_cri"));
                listCapPublicacao.add(publiCap);
            }
            return listCapPublicacao;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
