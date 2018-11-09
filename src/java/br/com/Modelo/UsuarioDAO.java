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
public class UsuarioDAO {
    
//Atrituto 
    private final Connection connection;

//Construtor
    public UsuarioDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    
//MEDOTO de inserir um novo usuário
    public void cUsuario(Usuario us) {
      String sql = "INSERT INTO tbl_usuario (fk_divisao, fk_setor, nr_ativo, fk_perfil, fk_cargo, nm_login, nm_nome, nm_rf, nm_email, nm_loginAtualizacao, dthr_atualizacao) "+
                                "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      try {
          PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, us.getPkDivisao());
            stmt.setInt(2,us.getPkSetor());
            stmt.setInt(3,us.getNrAtivo());
            stmt.setInt(4, us.getPkPerfil());
            stmt.setInt(5, us.getPkCargo());
            stmt.setString(6, us.getNmLogin());
            stmt.setString(7, us.getNmNome());
            stmt.setString(8, us.getNmRf());
            stmt.setString(9, us.getNmEmail());
            stmt.setString(10, us.getNmLoginAtualizacao());
            stmt.setTimestamp(11, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
        stmt.execute();
        stmt.close();
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
    }  
        
//METODO alterar informação do usuario
    public void altUsuario(Usuario us){
        String sql = "UPDATE tbl_usuario SET fk_divisao=?, fk_setor=?, nr_ativo=?, fk_perfil=?, fk_cargo=?, "
                    + "nm_login=?, nm_nome=?, nm_rf=?, nm_email=?, nm_loginAtualizacao=?, dthr_atualizacao=?"
                    + " WHERE id_usuario = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, us.getPkDivisao());
                stmt.setInt(2, us.getPkSetor());
                stmt.setInt(3, us.getNrAtivo());
                stmt.setInt(4, us.getPkPerfil());
                stmt.setInt(5, us.getPkCargo());
                stmt.setString(6, us.getNmLogin());
                stmt.setString(7, us.getNmNome());
                stmt.setString(8, us.getNmRf());
                stmt.setString(9, us.getNmEmail());
                stmt.setString(10, us.getNmLoginAtualizacao());
                stmt.setTimestamp(11, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(12, us.getPkUsuario());
            stmt.execute();
            stmt.close();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    
    
    }

    
//METODO lista todos os usuário
    public List<Usuario> listUsuario() {
    String sql = "SELECT * FROM vw_usuariocompleto";
    try {
        List<Usuario> uslista = new ArrayList<Usuario>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
                
            while (rs.next()){
            Usuario us = new Usuario();
                us.setPkUsuario(rs.getInt("id_usuario"));
                us.setPkDivisao(rs.getInt("id_divisao"));
                us.setPkSetor(rs.getInt("id_setor"));
                us.setNrAtivo(rs.getInt("nr_ativo"));
                us.setPkCargo(rs.getInt("id_cargo"));
                us.setPkPerfil(rs.getInt("id_perfil"));
                us.setNmLogin(rs.getString("nm_login"));
                us.setNmNome(rs.getString("nm_nome"));
                us.setSgDivisao(rs.getString("sg_divisao"));
                us.setNmDivisao(rs.getString("nm_divisao"));
                us.setSgSetor(rs.getString("sg_setor"));
                us.setNmSetor(rs.getString("nm_setor"));
                us.setNmRf(rs.getString("nm_rf"));
                us.setNmCargo(rs.getString("nm_cargo"));
                us.setNmPerfil(rs.getString("nm_perfil"));
                us.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
//                us.setNmLoginAtualizacao(rs.getString("nm_loginAtualizacao"));
             uslista.add(us);
            }       
                                                                                                                                                                           
        return uslista;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }  

//METODO quantidade de usuários cadastrados 
 public int qtdUsuario(){
       String sql = ("SELECT COUNT(*) as total FROM tbl_usuario ");
    	try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            int qtdUs = 0;
            
            if(rs.next()){
                qtdUs = rs.getInt("total");
            }
            
            return qtdUs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
                
     }
    
 
//METODO quantidade de usuários encontratos um pesquisa por nome
 public int qtdUsuarioQ(String q, String sgDivisao){
       String sql = ("SELECT COUNT(*) as total FROM vw_usuariocompleto "
               + "WHERE nm_nome LIKE ? and sg_divisao LIKE ? ");
    	try {
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+q+'%');
                stmt.setString(2, '%'+sgDivisao+'%');
            
            ResultSet rs = stmt.executeQuery();
            int qtdUs = 0;
            
            if(rs.next()){
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
    public List<Usuario> listPaginaUsuario(int qtdLinha, int iniPosicao, String q, String sgDivisao) {
    String sql = ("SELECT * FROM vw_usuariocompleto "
            + "WHERE nm_nome LIKE ? and sg_divisao LIKE ? "
            + "ORDER BY nm_nome "
            + "LIMIT ? OFFSET ?");
    try {
        List<Usuario> uslista = new ArrayList<Usuario>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, '%'+q+'%');
            stmt.setString(2, '%'+sgDivisao+'%');
            stmt.setInt(3, qtdLinha);
            stmt.setInt(4, iniPosicao);
            
            ResultSet rs = stmt.executeQuery();  
                
            while (rs.next()){
            Usuario us = new Usuario();
                us.setPkUsuario(rs.getInt("id_usuario"));
                us.setPkDivisao(rs.getInt("id_divisao"));
                us.setPkSetor(rs.getInt("id_setor"));
                us.setNrAtivo(rs.getInt("nr_ativo"));
                us.setPkCargo(rs.getInt("id_cargo"));
                us.setPkPerfil(rs.getInt("id_perfil"));
                us.setNmLogin(rs.getString("nm_login"));
                us.setNmNome(rs.getString("nm_nome"));
                us.setSgDivisao(rs.getString("sg_divisao"));
                us.setNmDivisao(rs.getString("nm_divisao"));
                us.setSgSetor(rs.getString("sg_setor"));
                us.setNmSetor(rs.getString("nm_setor"));
                us.setNmRf(rs.getString("nm_rf"));
                us.setNmCargo(rs.getString("nm_cargo"));
                us.setNmPerfil(rs.getString("nm_perfil"));
                us.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
//                us.setNmLoginAtualizacao(rs.getString("nm_loginAtualizacao"));
             uslista.add(us);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return uslista;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }  
    
    
//METODO ativa de desativa o acesso de um usuário na pagina paginada de lista de usuário
 public void atuStatus(Usuario us){
       String sql = ("UPDATE tbl_usuario SET nr_ativo=?, nm_loginAtualizacao=?, dthr_atualizacao=?"
                                            + "WHERE id_usuario=? ");
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, us.getNrAtivo());
                stmt.setString(2,us.getNmLoginAtualizacao());
                stmt.setTimestamp(3, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(4, us.getPkUsuario());
            stmt.execute();
            stmt.close();  
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
                
     } 
    
    
//METODO verificar o acesso do usuario atraves do login
 public Usuario verificarLogin (String login){
     String sql = ("SELECT * FROM vw_usuariocompleto WHERE nm_login = ?");
     try{
         PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, login);
            ResultSet rs = stmt.executeQuery();  
            
            Usuario us = new Usuario();    
            if (rs.next()){
                us.setPkUsuario(rs.getInt("id_usuario"));
                us.setPkDivisao(rs.getInt("id_divisao"));
                us.setPkSetor(rs.getInt("id_setor"));
                us.setNrAtivo(rs.getInt("nr_ativo"));
                us.setPkCargo(rs.getInt("id_cargo"));
                us.setPkPerfil(rs.getInt("id_perfil"));
                us.setNmLogin(rs.getString("nm_login"));
                us.setNmNome(rs.getString("nm_nome"));
                us.setSgDivisao(rs.getString("sg_divisao"));
                us.setNmDivisao(rs.getString("nm_divisao"));
                us.setSgSetor(rs.getString("sg_setor"));
                us.setNmSetor(rs.getString("nm_setor"));
                us.setNmRf(rs.getString("nm_rf"));
                us.setNmCargo(rs.getString("nm_cargo"));
                us.setNmPerfil(rs.getString("nm_perfil"));
                us.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                us.setNmFoto(rs.getString("nm_foto"));
            //    us.setNmSenha(rs.getString("nm_senha"));
//                us.setNmLoginAtualizacao(rs.getString("nm_loginAtualizacao"));
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return us;
     }catch (SQLException e) {
            throw new RuntimeException(e);
        }
 }
 
 
//METODO retorna as informações de um usuário para pagina UsuarioDetalhe
 public Usuario detalheUsuario (int pkUsusario){
     String sql = ("SELECT * FROM vw_usuariocompleto WHERE id_usuario = ?");
     try{
         PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkUsusario);
            ResultSet rs = stmt.executeQuery();  
            
            Usuario us = new Usuario();    
            if (rs.next()){
                us.setPkUsuario(rs.getInt("id_usuario"));
                us.setPkDivisao(rs.getInt("id_divisao"));
                us.setPkSetor(rs.getInt("id_setor"));
                us.setNrAtivo(rs.getInt("nr_ativo"));
                us.setPkCargo(rs.getInt("id_cargo"));
                us.setPkPerfil(rs.getInt("id_perfil"));
                us.setNmLogin(rs.getString("nm_login"));
                us.setNmNome(rs.getString("nm_nome"));
                us.setSgDivisao(rs.getString("sg_divisao"));
                us.setNmDivisao(rs.getString("nm_divisao"));
                us.setSgSetor(rs.getString("sg_setor"));
                us.setNmSetor(rs.getString("nm_setor"));
                us.setNmRf(rs.getString("nm_rf"));
                us.setNmEmail(rs.getString("nm_email"));
                us.setNmCargo(rs.getString("nm_cargo"));
                us.setNmPerfil(rs.getString("nm_perfil"));
                us.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                us.setNmFoto(rs.getString("nm_foto"));
                us.setNmLoginAtualizacao(rs.getString("nm_loginAtualizacao"));
//                us.setNmNomeAtualizacao(rs.getString("nm_nomeAtualizacao"));
            }       
                                                                                                                                                                
        return us;
     }catch (SQLException e) {
            throw new RuntimeException(e);
        }
 }
 
 
    
}
