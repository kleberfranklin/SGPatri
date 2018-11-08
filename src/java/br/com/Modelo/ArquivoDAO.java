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
    public void cArquivo(Arquivo ar){
        String sql = "INSERT INTO tbl_arquivo (fk_tipo_arquivo, nm_origem, nm_tipo, nm_nome, nm_diretorio, nm_login, dthr_atualizacao) "
                + "VALUES (?,?,?,?,?,?,?)";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, ar.getFkTipoArquivo());
                    stmt.setString(2, ar.getNmOrigem());
                    stmt.setString(3, ar.getNmTipo());
                    stmt.setString(4, ar.getNmNome());
                    stmt.setString(5, ar.getNmDiretorio());
                    stmt.setString(6, ar.getNmLogin());
                    stmt.setTimestamp(7,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
    }
    
//METODO utilizado para atualizar  Arquivo no BANCO
    public void upArquivo(Arquivo ar){
        String sql = "UPDATE tbl_arquivo SET fk_tipo_arquivo=?, nm_origem=?, nm_tipo=?, nm_nome=?, nm_diretorio=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_arquivo=? ";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, ar.getFkTipoArquivo());
                    stmt.setString(2, ar.getNmOrigem());
                    stmt.setString(3, ar.getNmTipo());
                    stmt.setString(4, ar.getNmNome());
                    stmt.setString(5, ar.getNmDiretorio());
                    stmt.setString(6, ar.getNmLogin());
                    stmt.setTimestamp(7,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(8, ar.getPkArquivo());
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
    }
    
//METODO utilizado para lista os arquivos realiconado com o Auto de Cessão    
    public List<Arquivo> listArquivo(int pkTipo, String origem) {
        String sql = ("SELECT * FROM tbl_arquivo WHERE fk_tipo_arquivo = ? and nm_origem = ? " );
    try {
            List<Arquivo> arList = new ArrayList<Arquivo>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, pkTipo);
                    stmt.setString(2, origem);
                ResultSet rs = stmt.executeQuery();  

            while (rs.next()){

                Arquivo arquivo = new Arquivo();   
                    arquivo.setPkArquivo(rs.getInt("id_arquivo"));
                    arquivo.setFkTipoArquivo(rs.getInt("fk_tipo_arquivo"));
                    arquivo.setNmOrigem(rs.getString("nm_origem"));
                    arquivo.setNmTipo(rs.getString("nm_tipo"));
                    arquivo.setNmNome(rs.getString("nm_nome"));
                    arquivo.setNmDiretorio(rs.getString("nm_diretorio"));
                arList.add(arquivo);
            }       
            stmt.close();                                                                                                                                                                
        return arList;

    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
    
//METODO utilizado para retorno id e o diretorio do Arquivo    
    public Arquivo pkArquivo(int pkTipo, String origem, String Tipo) {
        String sql = ("SELECT * FROM tbl_arquivo WHERE fk_tipo_arquivo = ? and nm_origem = ? and nm_tipo = ? " );
    try {
        Arquivo arquivo = new Arquivo();   
        PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkTipo);
            stmt.setString(2, origem);
            stmt.setString(3, Tipo);
        ResultSet rs = stmt.executeQuery();  
            if (rs.next()){
                arquivo.setPkArquivo(rs.getInt("id_arquivo"));
                arquivo.setNmOrigem(rs.getString("nm_origem"));
                arquivo.setNmTipo(rs.getString("nm_tipo"));
                arquivo.setNmDiretorio(rs.getString("nm_diretorio"));
            }       
            stmt.close();                                                                                                                                                                
        return arquivo;
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
    
//METODO utilizado para não ocorrer duplicidade      
    public boolean duplicidade (String nmOrigem, String nmTipo, String nmDiretorio){
        String sql = "SELECT nm_diretorio FROM tbl_arquivo WHERE nm_origem = ? and nm_tipo = ? and nm_diretorio = ? "; 
        try{
            boolean encontrado = false;
            PreparedStatement stmt = connection.prepareCall(sql);
                stmt.setString(1, nmOrigem);
                stmt.setString(2, nmTipo);
                stmt.setString(3, nmDiretorio);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
               encontrado = true;
            }
            stmt.close();
            return encontrado;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }    
    
    
}
