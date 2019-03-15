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
    
//METODO utilizado para inserir uma nova Arquivo no BANCO
    public void cArquivo(Arquivo ar) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_arquivo "
                + "(fk_tipo_arquivo, nm_origem, nm_tipo, nm_nome_arquivo, nm_diretorio, nm_nome, nm_login, dthr_atualizacao) "
                + "VALUES (?,?,?,?,?,?,?,?)";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, ar.getFkTipoArquivo());
                    stmt.setString(2, ar.getNmOrigem());
                    stmt.setString(3, ar.getNmTipo());
                    stmt.setString(4, ar.getNmNomeArquivo());
                    stmt.setString(5, ar.getNmDiretorio());
                    stmt.setString(6, ar.getNmNome());
                    stmt.setString(7, ar.getNmLogin());
                    stmt.setTimestamp(8,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }
    
//METODO utilizado para atualizar  Arquivo no BANCO
    public void upArquivo(Arquivo ar) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_arquivo "
                + "SET fk_tipo_arquivo=?, nm_origem=?, nm_tipo=?, nm_nome_arquivo=?, nm_diretorio=?, nm_nome=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_arquivo=? ";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, ar.getFkTipoArquivo());
                    stmt.setString(2, ar.getNmOrigem());
                    stmt.setString(3, ar.getNmTipo());
                    stmt.setString(4, ar.getNmNomeArquivo());
                    stmt.setString(5, ar.getNmDiretorio());
                    stmt.setString(6, ar.getNmNome());
                    stmt.setString(7, ar.getNmLogin());
                    stmt.setTimestamp(8,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(9, ar.getPkArquivo());
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }
    
//METODO utilizado para lista os arquivos realiconado com o Auto de Cessão    
    public List<Arquivo> listArquivo(int pkTipo, String origem) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Arquivo> arList = new ArrayList<Arquivo>();
        String sql = ("SELECT id_arquivo, fk_tipo_arquivo, nm_origem, nm_tipo, nm_nome_arquivo, nm_nome, nm_diretorio "
                    + "FROM tbl_arquivo "
                    + "WHERE fk_tipo_arquivo = ? and nm_origem = ? " );
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkTipo);
                stmt.setString(2, origem);
            rs = stmt.executeQuery();  
            while (rs.next()){
                Arquivo arquivo = new Arquivo();   
                    arquivo.setPkArquivo(rs.getInt("id_arquivo"));
                    arquivo.setFkTipoArquivo(rs.getInt("fk_tipo_arquivo"));
                    arquivo.setNmOrigem(rs.getString("nm_origem"));
                    arquivo.setNmTipo(rs.getString("nm_tipo"));
                    arquivo.setNmNomeArquivo(rs.getString("nm_nome_arquivo"));
                    arquivo.setNmNome(rs.getString("nm_nome"));
                    arquivo.setNmDiretorio(rs.getString("nm_diretorio"));
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
    public Arquivo pkArquivo(int pkTipo, String origem, String Tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet  rs = null;
        Arquivo arquivo = new Arquivo();
        String sql = ("SELECT id_arquivo, nm_origem, nm_tipo, nm_nome, nm_diretorio "
                    + "FROM tbl_arquivo "
                    + "WHERE fk_tipo_arquivo = ? and nm_origem = ? and nm_tipo = ? " );
            try {

             stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkTipo);
                stmt.setString(2, origem);
                stmt.setString(3, Tipo);
            rs = stmt.executeQuery();  
                if (rs.next()){
                    arquivo.setPkArquivo(rs.getInt("id_arquivo"));
                    arquivo.setNmOrigem(rs.getString("nm_origem"));
                    arquivo.setNmTipo(rs.getString("nm_tipo"));
                    arquivo.setNmNome(rs.getString("nm_nome"));
                    arquivo.setNmDiretorio(rs.getString("nm_diretorio"));
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
    
//METODO utilizado para não ocorrer duplicidade      
    public boolean duplicidade (int pkArquivo, String nmTipo) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean encontrado = false;
        String sql = "SELECT id_arquivo, nm_nome_arquivo, nm_diretorio "
                    + "FROM tbl_arquivo "
                    + "WHERE fk_tipo_arquivo = ? and nm_tipo = ? "; 
            try{
                stmt = connection.prepareCall(sql);
                    stmt.setInt(1, pkArquivo);
                    stmt.setString(2, nmTipo);
                 rs = stmt.executeQuery();
                if(rs.next()){
                   encontrado = true;
                }
                stmt.close();
                return encontrado;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
    }













    
    
    
}
