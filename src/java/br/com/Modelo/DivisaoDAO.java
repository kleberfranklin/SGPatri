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
 * @author d732229
 */
public class DivisaoDAO {
    
//Atrituto 
    private final Connection connection;

//Construtor
    public DivisaoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }
    
//METODO utilizado para inserir uma nova Divisao no BANCO
    public void cDivisao(Divisao dv){
    String sql = "INSERT INTO tbl_divisao (sg_divisao, nm_divisao, nm_nrsimproc, dthr_atualizacao, nm_login, nm_nrsei) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, dv.getSgDivisao());
                stmt.setString(2, dv.getNmDivisao());
                stmt.setString(3, dv.getNmNrSimproc());
                stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setString(5, dv.getNmLogin());
                stmt.setString(6, dv.getnmNrSei());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }
    }
//MEDOTO utilizado para realizar a alteração das informações da Divisão
    public void upDivisao(Divisao dv){
    String sql = "UPDATE tbl_divisao SET sg_divisao = ?, nm_divisao = ?, nm_nrsimproc = ?, dthr_atualizacao = ?, nm_login = ?, nm_nrsei = ? "
                + "WHERE id_divisao = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, dv.getSgDivisao());
                stmt.setString(2, dv.getNmDivisao());
                stmt.setString(3, dv.getNmNrSimproc());
                stmt.setTimestamp(4, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setString(5, dv.getNmLogin());
                stmt.setString(6, dv.getnmNrSei());
                stmt.setInt(7, dv.getPkDivisao());
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    
    
    
//METODO retorna as informações de um Divisão
    public Divisao detalheDivisao(int pkDivisao){
    String sql = "SELECT * FROM sch_cgpatri.tbl_divisao WHERE id_divisao = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkDivisao);
            ResultSet rs = stmt.executeQuery();

            Divisao dv = new Divisao();
            if (rs.next()){
                dv.setPkDivisao(rs.getInt("id_divisao"));
                dv.setSgDivisao(rs.getString("sg_divisao"));
                dv.setNmDivisao(rs.getString("nm_divisao"));
                dv.setNmNrSimproc(rs.getString("nm_nrsimproc"));
                dv.setNmNrSei(rs.getString("nm_nrsei"));
                dv.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                dv.setNmLogin(rs.getString("nm_login"));
            }
            stmt.close();
            return dv;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
//METODO utilizado para lista as divisões paginada e realiza pesquisa por sigla e nome da divisão
    public List<Divisao> listDivisao(int qtdLinha, int offset, String q) {
    String sql = "SELECT * FROM tbl_divisao "
                + "WHERE (sg_divisao ILIKE ? or nm_divisao ILIKE ?) "
                + "ORDER BY sg_divisao ASC "
                + "LIMIT ? OFFSET ?";
    try {
        List<Divisao> divLista = new ArrayList<Divisao>();
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1,'%'+q+'%');
                stmt.setString(2,'%'+q+'%');
                stmt.setInt(3, qtdLinha);
                stmt.setInt(4, offset);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()){
            Divisao di = new Divisao();
                di.setPkDivisao(rs.getInt("id_divisao"));
                di.setSgDivisao(rs.getString("sg_divisao"));
                di.setNmDivisao(rs.getString("nm_divisao"));
                di.setNmNrSimproc(rs.getString("nm_nrSimproc"));
                di.setNmNrSei(rs.getString("nm_nrsei"));
                di.setNmLogin(rs.getString("nm_login"));
                di.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
             divLista.add(di);
            }       
            stmt.close();
        return divLista;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 

//METODO uilizado para retornar a quantidade divisao cadastradas na pesquisa por nome ou sigla
    public int qtdDivisao(String q){
    String sql = "SELECT COUNT(*) as total FROM tbl_divisao WHERE (sg_divisao ILIKE ? or nm_divisao ILIKE ? )";
    try{
        PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,'%'+q+'%');
            stmt.setString(2,'%'+q+'%');
        ResultSet rs = stmt.executeQuery();
        
        int total = 0;
        if(rs.next()){
            total = rs.getInt("total");
        }
        stmt.close();
       return total;
    }catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }
    
//METODO utilizado para lista as Divisçoes, utilizado nos campos select da pagina cadastro  e alteração de usuário
    public List<Divisao> selectLisDivisao(){
        String sql = "SELECT * FROM tbl_divisao ORDER BY sg_divisao";
        try{
            List<Divisao> divLista = new ArrayList<Divisao>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Divisao dv = new Divisao();
                    dv.setPkDivisao(rs.getInt("id_divisao"));
                    dv.setSgDivisao(rs.getString("sg_divisao"));
                    dv.setNmDivisao(rs.getString("nm_divisao"));
            divLista.add(dv);
            }
            stmt.close();
            return divLista;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
   
    }
    










    
    
}
