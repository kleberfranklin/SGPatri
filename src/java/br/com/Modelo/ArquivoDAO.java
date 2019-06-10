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
public class ArquivoDAO {
 
    private final Connection connection;
    
    
    public ArquivoDAO (){
        this.connection = new FabricaConexao().getConnetion();
    }

//METODO utilizado para lista os arquivos realiconado com o Auto de Cessão    
    public List<Arquivo> listArquivo(int pkAutoCessao) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Arquivo> arList = new ArrayList<Arquivo>();
        String sql = ("SELECT id_arquivo, fk_autocessao, nm_tipo, nm_arquivo, nm_extensao, nm_nomeclatura, nm_diretorio, nr_reti_ratificacao "
                    + "FROM tbl_anexo_auto_cessao "
                    + "WHERE fk_autocessao = ? " 
                    + "ORDER BY nm_tipo ASC, id_arquivo DESC" );
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkAutoCessao);
            rs = stmt.executeQuery();  
            while (rs.next()){
                Arquivo arquivo = new Arquivo();   
                    arquivo.setPkArquivo(rs.getInt("id_arquivo"));
                    arquivo.setFkAutocessao(rs.getInt("fk_autocessao"));
                    arquivo.setNmTipo(rs.getString("nm_tipo"));
                    arquivo.setNmArquivo(rs.getString("nm_arquivo"));
                    arquivo.setNmExtensao(rs.getString("nm_extensao"));
                    arquivo.setNmNomeclatura(rs.getString("nm_nomeclatura"));
                    arquivo.setNmDiretorio(rs.getString("nm_diretorio"));
                    arquivo.setNrRetiRatificacao(rs.getInt("nr_reti_ratificacao"));
                arList.add(arquivo);
            }       
        return arList;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    }    

//METODO utilizado para retorno id e o diretorio do Arquivo    
    public Arquivo pkArquivo(int pkArquivo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet  rs = null;
        Arquivo arquivo = new Arquivo();
        String sql = ("SELECT id_arquivo, nm_tipo, nm_arquivo, nm_extensao, nm_diretorio, nm_nomeclatura, nr_reti_ratificacao "
                    + "FROM tbl_anexo_auto_cessao "
                    + "WHERE id_arquivo = ? ");
            try {
             stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkArquivo);
            rs = stmt.executeQuery();  
                if (rs.next()){
                    arquivo.setPkArquivo(rs.getInt("id_arquivo"));
                    arquivo.setNmTipo(rs.getString("nm_tipo"));
                    arquivo.setNmArquivo(rs.getString("nm_arquivo"));
                    arquivo.setNmExtensao(rs.getString("nm_extensao"));
                    arquivo.setNmDiretorio(rs.getString("nm_diretorio"));
                    arquivo.setNmNomeclatura(rs.getString("nm_nomeclatura"));
                    arquivo.setNrRetiRatificacao(rs.getInt("nr_reti_ratificacao"));
                }       
            return arquivo;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
    }
    
    
    
//METODO utilizado para inserir uma nova Arquivo no BANCO
    public void cArquivo(Arquivo ar) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_anexo_auto_cessao "
                + "(fk_autocessao, nm_tipo, nm_arquivo, nm_extensao, nm_diretorio, nm_nomeclatura, nr_reti_ratificacao, nm_login, dthr_atualizacao) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, ar.getFkAutocessao());
                    stmt.setString(2, ar.getNmTipo());
                    stmt.setString(3, ar.getNmArquivo());
                    stmt.setString(4, ar.getNmExtensao());
                    stmt.setString(5, ar.getNmDiretorio());
                    stmt.setString(6, ar.getNmNomeclatura());
                    stmt.setInt(7, ar.getNrRetiRatificacao());
                    stmt.setString(8, ar.getNmLogin());
                    stmt.setTimestamp(9,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
//                stmt.close();
//                connection.close();
            }
    }
    
//METODO utilizado para atualizar  Arquivo no BANCO
    public void upArquivo(Arquivo ar) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_anexo_auto_cessao "
                + "SET fk_autocessao=?, nm_tipo=?, nm_arquivo=?, nm_extensao=?, nm_diretorio=?, nm_nomeclatura=?, nr_reti_ratificacao=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_arquivo=? ";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, ar.getFkAutocessao());
                    stmt.setString(2, ar.getNmTipo());
                    stmt.setString(3, ar.getNmArquivo());
                    stmt.setString(4, ar.getNmExtensao());
                    stmt.setString(5, ar.getNmDiretorio());
                    stmt.setString(6, ar.getNmNomeclatura());
                    stmt.setInt(7, ar.getNrRetiRatificacao());
                    stmt.setString(8, ar.getNmLogin());
                    stmt.setTimestamp(9,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(10, ar.getPkArquivo());
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
//                stmt.close();
//                connection.close();
            }
    }
    

//METODO utilizado para deletar arquivo do banco
    public void deleteArquvio (int pkArquivo) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "DELETE FROM tbl_anexo_auto_cessao "
                    +"WHERE id_arquivo = ? ";
        try{
            stmt = connection.prepareCall(sql);
                stmt.setInt(1, pkArquivo);
            stmt.execute();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally{
//        stmt.close();
//        connection.close();
        }
    }
    
    
//METODO utilizado para não ocorrer duplicidade      
    public int qtdRepetidos (int pkAutoCessao, String nmTipo) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int qtd = 10;
        String sql = "SELECT COUNT(*) AS qtd "
                    + "FROM tbl_anexo_auto_cessao "
                    + "WHERE fk_autocessao = ? and nm_tipo = ? "; 
            try{
                stmt = connection.prepareCall(sql);
                    stmt.setInt(1, pkAutoCessao);
                    stmt.setString(2, nmTipo);
                 rs = stmt.executeQuery();
                if(rs.next()){
                   qtd = rs.getInt("qtd");
                }
                return qtd;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
//                connection.close();
            }
    }













    
    
    
}
