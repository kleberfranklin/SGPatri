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
public class AutoCessaoAntigoDAO {
    
//Atrituto 
    private final Connection connection;

//Construtor
    public AutoCessaoAntigoDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }    

//METODO utilizado na Classe (AutoCessaoVencida)
    public int qtdAutoCessaoVencida(){
          String sql = ("SELECT COUNT(*) as total FROM autocessaocompleto "
                    + "WHERE dt_vencimento <= ? "
                    + "and nr_vigor = 1 and nr_encerrado = 0 "
                    + "ORDER BY dt_vencimento DESC");
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setTimestamp(1, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));

                ResultSet rs = stmt.executeQuery();
                int qtdAuto = 0;
                    if (rs.next()) {
                        qtdAuto = rs.getInt("total");
                    }
                stmt.close();
            return qtdAuto;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        }
        
//METODO utilizado na Classe (AutoCessaoVencida)
    public List<AutoCessaoAntigo> listAutoCessaoVencida(int qtdLinha, int OFFSET) {
            String sql = "SELECT * FROM autocessaocompleto "
                    + "WHERE dt_vencimento <= ?"
                    + "and nr_vigor = 1 and nr_encerrado = 0 "
                    + "ORDER BY dt_vencimento DESC "
                    + "LIMIT ? OFFSET ?";
            try {
                List<AutoCessaoAntigo> cessaoLista = new ArrayList<AutoCessaoAntigo>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setTimestamp(1, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(2, qtdLinha);
                stmt.setInt(3, OFFSET);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    AutoCessaoAntigo auto = new AutoCessaoAntigo();
                        auto.setPkCessao(rs.getInt("pk_cessao"));
                        auto.setNmAc(rs.getString("nm_ac"));
                        auto.setNmProcesso(rs.getString("nm_processo"));
                        auto.setPkTipoCessao(rs.getInt("pk_tipoCessao"));
                        auto.setNmCessao(rs.getString("nm_cessao"));
                        auto.setNmCessionario(rs.getString("nm_cessionario"));
                        auto.setNmEndereco(rs.getString("nm_endereco"));
                        auto.setNmCroqui(rs.getString("nm_croqui"));
                        auto.setDtVencimento(rs.getString("dt_vencimento"));
                        auto.setNrVigor(rs.getInt("nr_vigor"));
                        auto.setNrEncerrado(rs.getInt("nr_encerrado"));
                    cessaoLista.add(auto);
                }
                stmt.execute();
                stmt.close();
                return cessaoLista;

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }  

//METODO utilizado na Classe (AutoCessaolistaPagFiltro)
    public int qtdAutoCessaoPesquisa(String qTpcessao, String qAC, String qProcesso, String qCessionario, 
            String qEndereco,String qCroqui ,String qVigor){
          String sql = ("SELECT COUNT(*) as total FROM autocessaocompleto WHERE nm_cessao ILIKE ? and nm_ac ILIKE ? and nm_processo ILIKE ? "
                  + "and nm_cessionario ILIKE ? and nm_endereco ILIKE ? and nm_croqui ILIKE ? and nr_Vigor ILIKE ?"
                  + "and pk_tipoCessao <> 1");
           try {
               PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setString(1, '%'+qTpcessao+'%');
                   stmt.setString(2, qAC+'%');
                   stmt.setString(3, qProcesso+'%');
                   stmt.setString(4, qCessionario+'%');
                   stmt.setString(5, '%'+qEndereco+'%');
                   stmt.setString(6, qCroqui+'%');
                   stmt.setString(7, '%'+qVigor+'%');
               ResultSet rs = stmt.executeQuery();
               int qtdAuto = 0;

               if(rs.next()){
                   qtdAuto = rs.getInt("total");
               }
               stmt.close();
               return qtdAuto;
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }

        }
 
//METODO utilizado na Classe (AutoCessaolistaPagFiltro)
    public List<AutoCessaoAntigo> listPagFiltro(String qTpcessao, String qAC, String qProcesso, String qCessionario, 
            String qEndereco,String qCroqui ,String qVigor, int qtdLinha, int OFFSET) {
            String sql = ("SELECT * FROM autocessaocompleto "
                    + "WHERE nm_cessao ILIKE ? and nm_ac ILIKE ? and nm_processo ILIKE ? and nm_cessionario ILIKE ? "
                    + "and nm_endereco ILIKE ? and nm_croqui ILIKE ? and nr_Vigor ILIKE ? "
                    + "ORDER BY pk_cessao DESC "
                    + "LIMIT ? OFFSET ?");
            try {
                List<AutoCessaoAntigo> cessaoLista = new ArrayList<AutoCessaoAntigo>();

                PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setString(1, '%'+qTpcessao+'%');
                   stmt.setString(2, qAC+'%');
                   stmt.setString(3, qProcesso+'%');
                   stmt.setString(4, qCessionario+'%');
                   stmt.setString(5, '%'+qEndereco+'%');
                   stmt.setString(6, qCroqui+'%');
                   stmt.setString(7, '%'+qVigor+'%');
                   stmt.setInt(8, qtdLinha);
                   stmt.setInt(9, OFFSET);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                AutoCessaoAntigo auto = new AutoCessaoAntigo();
                    auto.setPkCessao(rs.getInt("pk_cessao"));
                    auto.setNmAc(rs.getString("nm_ac"));
                    auto.setNmProcesso(rs.getString("nm_processo"));
                    auto.setPkTipoCessao(rs.getInt("pk_tipoCessao"));
                    auto.setNmCessao(rs.getString("nm_cessao"));
                    auto.setNmCessionario(rs.getString("nm_cessionario"));
                    auto.setNmEndereco(rs.getString("nm_endereco"));
                    auto.setNmCroqui(rs.getString("nm_croqui"));
                    auto.setNrVigor(rs.getInt("nr_vigor"));
                    auto.setNrEncerrado(rs.getInt("nr_encerrado"));
                cessaoLista.add(auto);
                }
                stmt.execute();
                stmt.close();

                return cessaoLista;

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } 
    
//METODO utilizado na Classe (AutoCessaoPrazo)
    public int qtdAutoCessaoPrazo( int mes, int ano){
          String sql = ("SELECT COUNT(*) as total FROM autocessaocompleto "
                        + "WHERE dt_vencimento >= ? and month(dt_vencimento) = ? and year(dt_vencimento) = ? ");
           try {
               PreparedStatement stmt = connection.prepareStatement(sql);
                   //stmt.setString(1, data);
                   stmt.setTimestamp(1, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                   stmt.setInt(2, mes);
                   stmt.setInt(3,ano);
               ResultSet rs = stmt.executeQuery();

               int qtdAuto = 0;
               if(rs.next()){
                   qtdAuto = rs.getInt("total");
               }
               stmt.close();
               return qtdAuto;
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
        }    

   
//METODO utilizado na Classe (AutoCessaoPrazo)
    public List<AutoCessaoAntigo> listPrazo(int mes, int ano, int qtdLinha, int OFFSET) {
            String sql = ("SELECT * FROM autocessaocompleto "
                    + "WHERE dt_vencimento >= ? "
                    + "and month(dt_vencimento) = ? "
                    + "and year(dt_vencimento) = ? "
                    + "ORDER BY dt_vencimento DESC "
                    + "LIMIT ? OFFSET ?");
            try {
                List<AutoCessaoAntigo> cessaoLista = new ArrayList<AutoCessaoAntigo>();

                PreparedStatement stmt = connection.prepareStatement(sql);
                    stmt.setTimestamp(1, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                    stmt.setInt(2, mes);
                    stmt.setInt(3, ano);
                    stmt.setInt(4, qtdLinha);
                    stmt.setInt(5, OFFSET);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    AutoCessaoAntigo auto = new AutoCessaoAntigo();

                    auto.setPkCessao(rs.getInt("pk_cessao"));
                    auto.setNmAc(rs.getString("nm_ac"));
                    auto.setNmProcesso(rs.getString("nm_processo"));
                    auto.setPkTipoCessao(rs.getInt("pk_tipoCessao"));
                    auto.setNmCessao(rs.getString("nm_cessao"));
                    auto.setNmCessionario(rs.getString("nm_cessionario"));
                    auto.setNmEndereco(rs.getString("nm_endereco"));
                    auto.setNrVigor(rs.getInt("nr_vigor"));
                    auto.setNmCroqui(rs.getString("nm_croqui"));
                    auto.setNmFinalidade(rs.getString("nm_finalidade"));
                    cessaoLista.add(auto);
                }
                stmt.execute();
                stmt.close();
                return cessaoLista;

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }     
    
//METODO utilizado para Classe (AutoCessaoDetalhe) 
    public AutoCessaoAntigo detalheAutoCessao(int pkCessao){
        
        String sql = ("SELECT * FROM autocessaocompleto WHERE pk_cessao = ?");
           try {
               PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setInt(1, pkCessao);
                ResultSet rs = stmt.executeQuery();
                
                AutoCessaoAntigo auto = new AutoCessaoAntigo();
                if (rs.next()) {
                   auto.setPkCessao(rs.getInt("pk_cessao"));
                   auto.setNmAc(rs.getString("nm_ac"));
                   auto.setNmCessao(rs.getString("nm_cessao"));
                   auto.setNmProcesso(rs.getString("nm_processo"));
                   auto.setNmCessionario(rs.getString("nm_cessionario"));
                   auto.setNmAdministracao(rs.getString("nm_administracao"));
                   auto.setNmEndereco(rs.getString("nm_endereco"));
                   auto.setNmFinalidade(rs.getString("nm_finalidade"));
                   auto.setNmArea(rs.getString("nm_area"));
                   auto.setNmPanta(rs.getString("nm_planta"));
                   auto.setNmCroqui(rs.getString("nm_croqui"));
                   auto.setNmSetor(rs.getString("nm_setor"));
                   auto.setNmQuadra(rs.getString("nm_quadra"));
                   auto.setNmMunicipal(rs.getString("nm_municipal"));
                   auto.setDtLavraturadate(rs.getString("dt_lavratura"));
                   auto.setNmPrazo(rs.getString("nm_prazo"));
                   auto.setNrPendencia(rs.getInt("nr_pendencia"));
                   auto.setNrVigor(rs.getInt("nr_vigor"));
                   auto.setNrEncerrado(rs.getInt("nr_encerrado"));
                   auto.setDtEncerramento(rs.getString("dt_encerramento"));
                   auto.setSgPrefeituraRegional(rs.getString("sg_prefeituraRegional"));
                   auto.setNmPrefeituraRegional(rs.getString("nm_prefeituraRegional"));
                   auto.setSgSecretaria(rs.getString("sg_secretaria"));
                   auto.setNmSecretaria(rs.getString("nm_secretaria"));
                   auto.setDsContrapartida(rs.getString("ds_contrapartida"));
                   auto.setDsContrapartidaSimplificada(rs.getString("ds_contrapartidaSimplificada"));
                   auto.setDsObservacao(rs.getString("ds_observacao"));
                   auto.setDtVencimento(rs.getString("dt_vencimento"));
                   return auto;
               }
                stmt.execute();
                stmt.close();
           } catch (SQLException e) {
            throw new RuntimeException(e);
        }
           return null;
    }
    
//METODO utilizado na Classe AutoCessaoGraQtd)
    public List<AutoCessaoAntigo> listQtdPorCessao() {
            String sql = ("SELECT nm_cessao, COUNT(*) AS total FROM autocessaocompleto "
                        + "WHERE nr_vigor = 1 AND nr_encerrado = 0 "
                        + "GROUP BY pk_tipoCessao "
                        + "ORDER BY total DESC");
            try {
                List<AutoCessaoAntigo> cessaoLista = new ArrayList<AutoCessaoAntigo>();
                PreparedStatement stmt = connection.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    AutoCessaoAntigo auto = new AutoCessaoAntigo();
                        auto.setNmCessao(rs.getString("nm_cessao"));
                        auto.setNrTotal(rs.getInt("total"));
                    cessaoLista.add(auto);
                }
                stmt.execute();
                stmt.close();
                return cessaoLista;

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }         
 
 
 
    
}
