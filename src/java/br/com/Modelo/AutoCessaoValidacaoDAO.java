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
public class AutoCessaoValidacaoDAO {
    
    
    private final Connection connection;
    
    public AutoCessaoValidacaoDAO(){
        this.connection = new FabricaConexao().getConnetion();
    }
    
    //METODO utilizado na Classe (AutoCessaolistaPagFiltro)
    public int qtdAutoCessaoPesquisa(String qAC, String qProcesso, String qVigor){
          String sql = ("SELECT COUNT(*) as total FROM tbl_autocessao_stage WHERE cod_ac like ? and nm_processo like ? and nr_vigor like ? ");
           try {
               PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setString(1, qAC+'%');
                   stmt.setString(2, qProcesso+'%');
                   stmt.setString(3, '%'+qVigor+'%');
               ResultSet rs = stmt.executeQuery();
               int qtdAuto = 0;

               if(rs.next()){
                   qtdAuto = rs.getInt("total");
               }    
               return qtdAuto;
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }

        }
    
//METODO utilizado na Classe (AutoCessaolistaPagFiltro)
    public List<AutoCessaoValidacao> listPagFiltro(String qAC, String qProcesso, String qVigor, int qtdLinha, int OFFSET) {
            String sql = ("SELECT * FROM tbl_autocessao_stage "
                    + "WHERE cod_ac like ? and nm_processo like ? and nr_Vigor like ? "
                    + "ORDER BY cod_ac ASC "
                    + "LIMIT ? OFFSET ?");
            try {
                List<AutoCessaoValidacao> AutoValidacaoLista = new ArrayList<AutoCessaoValidacao>();

                PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setString(1, qAC+'%');
                   stmt.setString(2, qProcesso+'%');
                   stmt.setString(3, '%'+qVigor+'%');
                   stmt.setInt(4, qtdLinha);
                   stmt.setInt(5, OFFSET);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                AutoCessaoValidacao autoVa = new AutoCessaoValidacao();
                    autoVa.setPkAutoStage(rs.getInt("id_autocessao"));
                    autoVa.setNmCodAc(rs.getString("cod_ac"));
                    autoVa.setNmProcesso(rs.getString("nm_processo"));
                    autoVa.setNrVigor(rs.getString("nr_vigor"));
                    autoVa.setNmStatus(rs.getString("status"));
                AutoValidacaoLista.add(autoVa);
                }
                stmt.execute();
                stmt.close();

                return AutoValidacaoLista;

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }  
    

//METODO utilizado para Classe (AutoCessaoDetalhe) 
    public AutoCessaoValidacao detalheAutoCessao(int pkAutoStage){
        
        String sql = ("SELECT * FROM tbl_autocessao_stage WHERE id_autocessao = ?");
           try {
               PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setInt(1, pkAutoStage);
                ResultSet rs = stmt.executeQuery();
                
                AutoCessaoValidacao autoVa = new AutoCessaoValidacao();
                if (rs.next()) {
                    autoVa.setPkAutoStage(rs.getInt("id_autocessao"));
                    autoVa.setNmCodAc(rs.getString("cod_ac"));
                    autoVa.setFkTipoCessaoStage(rs.getInt("fk_tipocessao"));
                    autoVa.setFkCatEntidadeStage(rs.getInt("fk_categoriaentidade"));
                    autoVa.setFkCatAutoStage(rs.getInt("fk_categoriauto"));
                    autoVa.setFkCatFinalidadeStage(rs.getInt("fk_categoriafinalidade"));
                    autoVa.setFkDisplegalStage(rs.getInt("fk_displegal"));
                    autoVa.setDtLavratura(rs.getString("dt_lavratura"));
                    autoVa.setNmProcesso(rs.getString("nm_processo"));
                    autoVa.setNmCessionario(rs.getString("nm_cessionario"));
                    autoVa.setNmCedente(rs.getString("nm_cedente"));
                    autoVa.setNmPlanta(rs.getString("nm_planta"));
                    autoVa.setNmCroqui(rs.getString("nm_croqui"));
                    autoVa.setNrArea(rs.getString("nr_area"));
                    autoVa.setNrSetor(rs.getString("nr_setor"));
                    autoVa.setNrQuadra(rs.getString("nr_quadra"));
                    autoVa.setNrLote(rs.getString("nr_lote"));
                    autoVa.setNmTipoEndereco(rs.getString("nm_tipoendereco"));
                    autoVa.setNmTituloEndereco(rs.getString("nm_tituloendereco"));
                    autoVa.setNmEndereco(rs.getString("nm_endereco"));
                    autoVa.setNrEndereco(rs.getString("nr_endereco"));
                    autoVa.setNmComplementoEndereco(rs.getString("nm_complementoendereco"));
                    autoVa.setNmReferencialEndereco(rs.getString("nm_referencialendereco"));
                    autoVa.setNmMunicipal(rs.getString("nm_municipal"));
                    autoVa.setNrPrazo(rs.getString("nr_prazo"));
                    autoVa.setDtVencimento(rs.getString("dt_vencimento"));
                    autoVa.setDtEncerramento(rs.getString("dt_encerramento"));
                    autoVa.setDsContrapartida(rs.getString("ds_contrapartida"));
                    autoVa.setNrVigor(rs.getString("nr_vigor"));
                    autoVa.setDtCadastro(rs.getString("dt_cadastro"));
                    autoVa.setDsObservacao(rs.getString("ds_observacao"));
                    autoVa.setNmStatus(rs.getString("status"));
                    autoVa.setNmLogin(rs.getString("nm_login"));
                    autoVa.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                    autoVa.setFkNivelAdm(rs.getInt("fk_niveladm"));
                    autoVa.setFkSubpref(rs.getInt("fk_subprefeitura"));
                    autoVa.setNrVerAc(rs.getInt("nr_verificado_ac"));
                    autoVa.setNrVerDispLegal(rs.getInt("nr_verificado_displegal"));
                    autoVa.setNrVerArqAc(rs.getInt("nr_verificado_arquivo_ac"));
                    autoVa.setNrVerArqPlanta(rs.getInt("nr_verificado_arquivo_planta"));
                    autoVa.setNrVerValidacao(rs.getInt("nr_verificado_validacao"));
                return autoVa;
               }
                stmt.execute();
                stmt.close();
           } catch (SQLException e) {
            throw new RuntimeException(e);
        }
           return null;
    }    

    
}
