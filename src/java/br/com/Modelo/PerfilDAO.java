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
public class PerfilDAO {

 
    private final Connection connection;

//Construtor
    public PerfilDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }
    
 //METODO utilizado para inserir uma novo Perfil no BANCO
    public void cPerfil(Perfil per){
        String sql = "INSERT INTO tbl_perfil (nm_perfil, ds_perfil, nr_ler, nr_inserir, nr_editar, nr_excluir, nr_gerencia, nm_login, dthr_atualizacao) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
            try{
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1, per.getNmPerfil());
                    stmt.setString(2, per.getDsPerfil());
                    stmt.setInt(3, per.getNrLer());
                    stmt.setInt(4, per.getNrInserir());
                    stmt.setInt(5, per.getNrEditar());
                    stmt.setInt(6, per.getNrExcluir());
                    stmt.setInt(7, per.getNrGerenciar());
                    stmt.setString(8, per.getNmLogin());
                    stmt.setTimestamp(9,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.execute();
                stmt.close();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
    }   

//MEDOTO utilizado para realizar a alteração das informações do Perfil
    public void upPerfil(Perfil per){
        String sql = "UPDATE tbl_perfil SET nm_perfil=?, ds_perfil=?, nr_ler=?, nr_inserir=?, nr_editar=?, nr_excluir=?, nr_gerencia=?, nm_login=?, dthr_atualizacao=? "
                + "WHERE id_perfil = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, per.getNmPerfil());
                stmt.setString(2, per.getDsPerfil());
                stmt.setInt(3, per.getNrLer());
                stmt.setInt(4, per.getNrInserir());
                stmt.setInt(5, per.getNrEditar());
                stmt.setInt(6, per.getNrExcluir());
                stmt.setInt(7, per.getNrGerenciar());
                stmt.setString(8, per.getNmLogin());
                stmt.setTimestamp(9,java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(10,per.getPkPerfil());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }
    }    
    
//METODO utilizado para retornar as informação de um Perfil
    public Perfil detalhePerfil(int pkPerfil){
        String sql = "SELECT * FROM tbl_perfil WHERE id_perfil = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pkPerfil);
            ResultSet rs = stmt.executeQuery();
                    
            Perfil per = new Perfil();
            if(rs.next()){
                per.setPkPerfil(rs.getInt("id_perfil"));
                per.setNmPerfil(rs.getString("nm_perfil"));
                per.setDsPerfil(rs.getString("ds_perfil"));
                per.setNmLogin(rs.getString("nm_login"));
                per.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                per.setNrEditar(rs.getInt("nr_editar"));
                per.setNrExcluir(rs.getInt("nr_excluir"));
                per.setNrGerenciar(rs.getInt("nr_gerencia"));
                per.setNrInserir(rs.getInt("nr_inserir"));
                per.setNrLer(rs.getInt("nr_ler"));
            }
         stmt.close();
         return per;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }
    }


//Metodo de quantidade de linhas
    public int qdPerfil(String q){
        String sql = ("SELECT COUNT(*) as total FROM tbl_perfil "
                    + "WHERE nm_perfil LIKE ? ");
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+q+'%');
            ResultSet rs = stmt.executeQuery();
                int total = 0;
                if(rs.next()){
                    total = rs.getInt("total");
                }
            stmt.execute();
            stmt.close();
        return total;
        }catch (SQLException e){
            throw new RuntimeException(e);
            }
    }    
    
    
//METODO lista os perfil das pesquisas e paginado
    public List<Perfil> lisPerfil(int qtLinha, int offset, String q ){
        String sql = ("SELECT * FROM tbl_perfil "
                    + "WHERE nm_perfil LIKE ? "
                    + "ORDER BY nm_perfil, nm_perfil ASC "
                    + "LIMIT ? OFFSET ? ");
        try{
            List<Perfil> perlista = new ArrayList<Perfil>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setInt(2, qtLinha);
                    stmt.setInt(3, offset);
                
                 ResultSet rs = stmt.executeQuery();
                    while (rs.next()){
                    Perfil per = new Perfil();
                        per.setPkPerfil(rs.getInt("id_perfil"));
                        per.setNmPerfil(rs.getString("nm_perfil"));
                        per.setDsPerfil(rs.getString("ds_perfil"));
                        per.setNmLogin(rs.getString("nm_login"));
                        per.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                        per.setNrEditar(rs.getInt("nr_editar"));
                        per.setNrExcluir(rs.getInt("nr_excluir"));
                        per.setNrGerenciar(rs.getInt("nr_gerencia"));
                        per.setNrInserir(rs.getInt("nr_inserir"));
                        per.setNrLer(rs.getInt("nr_ler"));
                     perlista.add(per);
                    }
                stmt.close();
         return perlista;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
//METODO lista os perfil cadastrados, utilizado no campo select da pagina cadastrado e alteração de usuário
    public List<Perfil> listSelectPerfil(){
    String sql = "SELECT * FROM tbl_perfil";
    
    try {
        List<Perfil> perLista = new ArrayList<Perfil>();
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();  
            while (rs.next()){
            Perfil per = new Perfil();
                per.setPkPerfil(rs.getInt("id_perfil"));
                per.setNmPerfil(rs.getString("nm_perfil"));
                per.setDsPerfil(rs.getString("ds_perfil"));
                per.setNmLogin(rs.getString("nm_login"));
                per.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
             perLista.add(per);
            }       
            stmt.execute();
            stmt.close();                                                                                                                                                                
        return perLista;
    
    } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    } 
    
    
    
    
    
    
    
    
    
    
}