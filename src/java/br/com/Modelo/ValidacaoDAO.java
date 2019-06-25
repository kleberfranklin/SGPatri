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
public class ValidacaoDAO {
     
    private final Connection connection;
    
    public ValidacaoDAO(){
        this.connection = new FabricaConexao().getConnetion();
    }
    
//METODO utilizado para retornar as informação de um Validação
    public Validacao detalheValidacaoAutoCessao(int fkAutoCessao) throws SQLException {
        PreparedStatement stmt =null;
        ResultSet rs = null;
        Validacao val = new Validacao();
        String sql = "SELECT id_validacao_autocessao, fk_autocessao, fk_divisao, nm_status, "
                    + "nm_problema, nm_tarefa, ds_obs, nm_login, dthr_atualizacao "
                    + "FROM tbl_validacao_autocessao "
                    + "WHERE fk_autocessao = ? ";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, fkAutoCessao);
            rs = stmt.executeQuery();
            if(rs.next()){
               val.setPkValidacao(rs.getInt("id_validacao_autocessao"));
               val.setFkAutoCessao(rs.getInt("fk_autocessao"));
               val.setFkDivisao(rs.getInt("fk_divisao"));
               val.setNmStatus(rs.getString("nm_status"));
               val.setNmProblema(rs.getString("nm_problema"));
               val.setNmTarefa(rs.getString("nm_tarefa"));
               val.setDsObsservacao(rs.getString("ds_obs"));
               val.setNmLogin(rs.getString("nm_login"));
               val.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
            }
            return val;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }finally{
//            rs.close();
            stmt.close();
//            connection.close();
        }
    } 
    
    
//METODO utilizado para inserir uma nova Validação no BANCO
    public int cValidacao(Validacao val) throws SQLException{
        int pkValidacao = 0;
        PreparedStatement stmt =null;
        ResultSet rs = null;
        String sql = "INSERT INTO tbl_validacao_autocessao (fk_autocessao, fk_divisao, nm_status, "
                + "nm_problema, nm_tarefa, ds_obs, nm_login, dthr_atualizacao) "
                + "VALUES (?,?,?,?,?,?,?,?)";
            try{
                stmt = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                    stmt.setInt(1, val.getFkAutoCessao());
                    stmt.setInt(2, val.getFkDivisao());
                    stmt.setString(3, val.getNmStatus());
                    stmt.setString(4, val.getNmProblema());
                    stmt.setString(5, val.getNmTarefa());
                    stmt.setString(6, val.getDsObsservacao());
                    stmt.setString(7, val.getNmLogin());
                    stmt.setTimestamp(8,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.executeUpdate();
                rs = stmt.getGeneratedKeys();
                if(rs.next()){
                    pkValidacao = rs.getInt("id_validacao_autocessao");
                }
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
//                rs.close();
                stmt.close();
            }
            return pkValidacao;
    }    
    
//MEDOTO utilizado para realizar a alteração das informações da Validação
    public void upValidacao(Validacao val) throws SQLException {
        PreparedStatement stmt = null;
                
        String sql = "UPDATE tbl_validacao_autocessao SET fk_autocessao=?, fk_divisao=?, nm_status=?, "
                    + "nm_problema=?, nm_tarefa=?, ds_obs=?, nm_login=?, dthr_atualizacao=? "
                    + "WHERE id_validacao_autocessao = ?";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, val.getFkAutoCessao());
                    stmt.setInt(2, val.getFkDivisao());
                    stmt.setString(3, val.getNmStatus());
                    stmt.setString(4, val.getNmProblema());
                    stmt.setString(5, val.getNmTarefa());
                    stmt.setString(6, val.getDsObsservacao());
                    stmt.setString(7, val.getNmLogin());
                    stmt.setTimestamp(8,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(9, val.getPkValidacao());
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally {
                stmt.close();
                connection.close();
        }
    }     

//METODO lista os setor de um Divisão, utilizado no o select da pagina cadastro e alteração de ususário
    public List<Validacao> lisValidacao(int pkAutoCessao) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Validacao> listValidacao = new ArrayList<Validacao>();
        String sql = ("SELECT id_validacao_autocessao, fk_autocessao, fk_divisao, nm_status,  "
                    + " nm_tarefa, nm_problema, ds_obs, nm_login, dthr_atualizacao "
                    + "FROM tbl_validacao_autocessao "
                    + "WHERE fk_autocessao = ? "
                    + "ORDER BY id_validacao_autocessao DESC");
            try {
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, pkAutoCessao);
                rs = stmt.executeQuery();  
                while (rs.next()){
                    Validacao va = new Validacao();
                        va.setPkValidacao(rs.getInt("id_validacao_autocessao"));
                        va.setFkAutoCessao(rs.getInt("fk_autocessao"));
                        va.setFkDivisao(rs.getInt("fk_divisao"));
                        va.setNmStatus(rs.getString("nm_status"));
                        va.setNmTarefa(rs.getString("nm_tarefa"));
                        va.setNmProblema(rs.getString("nm_problema"));
                        va.setDsObsservacao(rs.getString("ds_obs"));
                        va.setNmLogin(rs.getString("nm_login"));
                        va.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                listValidacao.add(va);
                }
            return listValidacao;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    } 
    
    
    
}
