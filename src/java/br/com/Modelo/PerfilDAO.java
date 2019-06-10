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
    public void cPerfil(Perfil per) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tbl_perfil "
                + "(nm_perfil, ds_perfil, nr_ler, nr_inserir, nr_editar, "
                + "nr_excluir, nr_gerencia, nm_login, dthr_atualizacao) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
            try{
                stmt = connection.prepareStatement(sql);
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
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }   

//MEDOTO utilizado para realizar a alteração das informações do Perfil
    public void upPerfil(Perfil per) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_perfil "
                + "SET nm_perfil=?, ds_perfil=?, nr_ler=?, nr_inserir=?, nr_editar=?, nr_excluir=?, nr_gerencia=?, "
                + "nm_login=?, dthr_atualizacao=? "
                + "WHERE id_perfil = ?";
        try{
            stmt = connection.prepareStatement(sql);
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
        }finally{
            stmt.close();
            connection.close();
        }
    }    
    
//METODO utilizado para retornar as informação de um Perfil
    public Perfil detalhePerfil(int pkPerfil) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Perfil per = new Perfil();
        String sql = "SELECT id_perfil, nm_perfil, ds_perfil, nm_login, dthr_atualizacao, "
                + "nr_editar, nr_excluir, nr_gerencia, nr_inserir,  nr_ler "
                + "FROM tbl_perfil "
                + "WHERE id_perfil = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkPerfil);
            rs = stmt.executeQuery();
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
         return per;
        }catch (SQLException e){
          throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
            
    }


//Metodo de quantidade de linhas
    public int qdPerfil(String q) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs =null;
        String sql = ("SELECT COUNT(*) as total FROM tbl_perfil "
                    + "WHERE nm_perfil ILIKE ? ");
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%'+q+'%');
            rs = stmt.executeQuery();
                int total = 0;
                if(rs.next()){
                    total = rs.getInt("total");
                }
        return total;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    }    
    
    
//METODO lista os perfil das pesquisas e paginado
    public List<Perfil> lisPerfil(int qtLinha, int offset, String q ) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Perfil> perlista = new ArrayList<Perfil>();
        String sql = ("SELECT id_perfil, nm_perfil, ds_perfil, nm_login, dthr_atualizacao, nr_editar, nr_excluir, nr_gerencia, nr_inserir, nr_ler "
                    + "FROM tbl_perfil "
                    + "WHERE nm_perfil ILIKE ? "
                    + "ORDER BY nm_perfil, nm_perfil ASC "
                    + "LIMIT ? OFFSET ? ");
            try{
                 stmt = connection.prepareStatement(sql);
                    stmt.setString(1,'%'+q+'%');
                    stmt.setInt(2, qtLinha);
                    stmt.setInt(3, offset);
                  rs = stmt.executeQuery();
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
            return perlista;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
    }
    
//METODO lista os perfil cadastrados, utilizado no campo select da pagina cadastrado e alteração de usuário
    public List<Perfil> listSelectPerfil() throws SQLException{
        PreparedStatement  stmt = null;
        ResultSet rs = null;
        List<Perfil> perLista = new ArrayList<Perfil>();
        String sql = "SELECT id_perfil, nm_perfil, ds_perfil, nm_login, dthr_atualizacao "
                +"FROM tbl_perfil "
                +"WHERE id_perfil <> 3";
        try {
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();  
            while (rs.next()){
            Perfil per = new Perfil();
                per.setPkPerfil(rs.getInt("id_perfil"));
                per.setNmPerfil(rs.getString("nm_perfil"));
                per.setDsPerfil(rs.getString("ds_perfil"));
                per.setNmLogin(rs.getString("nm_login"));
                per.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
             perLista.add(per);
            }       
        return perLista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
    } 
    
    
    
    
    
    
    
    
    
    
}