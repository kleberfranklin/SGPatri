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
import java.util.Calendar;
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
    
    //Atributo DATA para inserir a data da OS.
    Calendar calendar = Calendar.getInstance();
    java.sql.Date data = new java.sql.Date(calendar.getTime().getTime());
    
//METODO utilizado na Classe (AutoCessaolistaPagFiltro)
    public List<AutoCessaoValidacao> listPagFiltroPesquisa(String qTpcessao, String qAC, String qProcesso, String qCessionario, String qCedente,
            String qEndereco,String qCroqui ,String qVigor, int qtdLinha, int OFFSET) {
            String sql = ("SELECT * FROM tbl_autocessao_stage "
                    + "WHERE CAST(fk_tipocessao AS VARCHAR) ILIKE ? and cod_ac ILIKE ? and nm_processo ILIKE ? and nm_cessionario ILIKE ? and nm_cedente ILIKE ? "
                    + "and (nm_endereco ILIKE ? or nm_referencialendereco ILIKE ?) and nm_croqui ILIKE ? and nr_Vigor ILIKE ? "
                    + "ORDER BY cod_ac DESC "
                    + "LIMIT ? OFFSET ?");
            try {
                List<AutoCessaoValidacao> cessaoLista = new ArrayList<AutoCessaoValidacao>();

                PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setString(1, '%'+qTpcessao+'%');
                   stmt.setString(2, qAC+'%');
                   stmt.setString(3, qProcesso+'%');
                   stmt.setString(4, '%'+qCessionario+'%');
                   stmt.setString(5, '%'+qCedente+'%');
                   stmt.setString(6, '%'+qEndereco+'%');
                   stmt.setString(7, '%'+qEndereco+'%');
                   stmt.setString(8, qCroqui+'%');
                   stmt.setString(9, '%'+qVigor+'%');
                   stmt.setInt(10, qtdLinha);
                   stmt.setInt(11, OFFSET);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                AutoCessaoValidacao auto = new AutoCessaoValidacao();
                    auto.setPkAutoStage(rs.getInt("id_autocessao"));
                    auto.setNmCodAc(rs.getString("cod_ac"));
                    auto.setNmProcesso(rs.getString("nm_processo"));
                    auto.setFkTipoCessaoStage(rs.getInt("fk_tipocessao"));
                    auto.setNmCedente(rs.getString("nm_cedente"));
                    auto.setNmCessionario(rs.getString("nm_cessionario"));
                    auto.setNmEndereco(rs.getString("nm_endereco"));
                    auto.setNmCroqui(rs.getString("nm_croqui"));
                    auto.setNrVigor(rs.getString("nr_vigor"));
                    auto.setNmStatus(rs.getString("status"));
                    
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
    public int qtdAutoPesquisa(String qTpcessao, String qAC, String qProcesso, String qCessionario, String qCedente, 
            String qEndereco, String qCroqui, String qVigor){
          String sql = ("SELECT COUNT(*) as total FROM tbl_autocessao_stage WHERE CAST(fk_tipocessao AS VARCHAR) ILIKE ? and cod_ac ILIKE ? and nm_processo ILIKE ? "
                  + "and nm_cessionario ILIKE ? and nm_cedente ILIKE ? and ( nm_endereco ILIKE ? or nm_referencialendereco ILIKE ?) and nm_croqui ILIKE ? and nr_vigor ILIKE ? ");
//                  + "and pk_tipoCessao <> 1");
           try {
               PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setString(1, '%'+qTpcessao+'%');
                   stmt.setString(2, qAC+'%');
                   stmt.setString(3, qProcesso+'%');
                   stmt.setString(4, '%'+qCessionario+'%');
                   stmt.setString(5, '%'+qCedente+'%');
                   stmt.setString(6, '%'+qEndereco+'%');
                   stmt.setString(7, '%'+qEndereco+'%');
                   stmt.setString(8, qCroqui+'%');
                   stmt.setString(9, '%'+qVigor+'%');
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
    public int qtdAutoCessaoPesquisa(String qAC, String qProcesso, String qVigor, String qStatus){
          String sql = ("SELECT COUNT(*) as total FROM tbl_autocessao_stage WHERE cod_ac ILIKE ? and nm_processo ILIKE ? and nr_vigor ILIKE ? and status ILIKE ? ");
           try {
               PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setString(1, qAC+'%');
                   stmt.setString(2, qProcesso+'%');
                   stmt.setString(3, '%'+qVigor+'%');
                   stmt.setString(4, qStatus+'%');
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
    public List<AutoCessaoValidacao> listPagFiltro(String qAC, String qProcesso, String qVigor, String qStatus, int qtdLinha, int OFFSET) {
            String sql = ("SELECT * FROM tbl_autocessao_stage "
                    + "WHERE cod_ac ILIKE ? and nm_processo ILIKE ? and nr_Vigor ILIKE ? and status ILIKE ? "
                    + "ORDER BY cod_ac ASC "
                    + "LIMIT ? OFFSET ?");
            try {
                List<AutoCessaoValidacao> AutoValidacaoLista = new ArrayList<AutoCessaoValidacao>();

                PreparedStatement stmt = connection.prepareStatement(sql);
                   stmt.setString(1, qAC+'%');
                   stmt.setString(2, qProcesso+'%');
                   stmt.setString(3, '%'+qVigor+'%');
                   stmt.setString(4, qStatus+'%');
                   stmt.setInt(5, qtdLinha);
                   stmt.setInt(6, OFFSET);
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

//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoAuto( int pkAutoStage, int nrVerAuto){
        String sql ="UPDATE tbl_autocessao_stage SET nr_verificado_ac=? "
                + "WHERE id_autocessao=? ";
                try{
                    PreparedStatement stmt = connection.prepareStatement(sql);
                        stmt.setInt(1, nrVerAuto);
                        stmt.setInt(2, pkAutoStage);
                stmt.execute();
                stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        } 
    }    

//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoValidacao(int fkValidacao ,int nrVerValidacao, int pkAutoStage, String nmStatus){
        String sql ="UPDATE tbl_autocessao_stage SET fk_validacao=?, nr_verificado_validacao=?, status=? "
                + "WHERE id_autocessao=? ";
                try{
                    PreparedStatement stmt = connection.prepareStatement(sql);
                        stmt.setInt(1, fkValidacao);
                        stmt.setInt(2, nrVerValidacao);
                        stmt.setString(3, nmStatus);
                        stmt.setInt(4, pkAutoStage);
                stmt.execute();
                stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        } 
    }

//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoDisLegal(int pkAutoStage, int nrVerDisplegal){
        String sql ="UPDATE tbl_autocessao_stage SET nr_verificado_displegal=? "
                + "WHERE id_autocessao=?";
                try{
                    PreparedStatement stmt = connection.prepareStatement(sql);
                        stmt.setInt(1, nrVerDisplegal);
                        stmt.setInt(2, pkAutoStage);
                stmt.execute();
                stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        } 
    }
           
//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoArquivoAc(int pkAutoStage, int nrVerDisplegal){
        String sql ="UPDATE tbl_autocessao_stage SET nr_verificado_arquivo_ac=? "
                + "WHERE id_autocessao=?";
                try{
                    PreparedStatement stmt = connection.prepareStatement(sql);
                        stmt.setInt(1, nrVerDisplegal);
                        stmt.setInt(2, pkAutoStage);
                stmt.execute();
                stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        } 
    }

//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoArquivoPlanta(int pkAutoStage, int nrVerDisplegal){
        String sql ="UPDATE tbl_autocessao_stage SET nr_verificado_arquivo_planta=? "
                + "WHERE id_autocessao=?";
                try{
                    PreparedStatement stmt = connection.prepareStatement(sql);
                        stmt.setInt(1, nrVerDisplegal);
                        stmt.setInt(2, pkAutoStage);
                stmt.execute();
                stmt.close();
        }catch (SQLException e){
           throw new RuntimeException(e);
        } 
    }
       
//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao
    public int cAutoCessaoValidacao(AutoCessaoValidacao auto){
        int pkAuto =0;
        String sql = "INSERT INTO tbl_autocessao_stage  (fk_tipocessao, fk_categoriaentidade, fk_categoriauto, fk_categoriafinalidade, "
                + "dt_lavratura, nm_processo, nm_cessionario, nm_cedente, nm_planta, nm_croqui, nr_area, nr_setor, nr_quadra, "
                + "nr_lote, nm_tipoendereco, nm_tituloendereco, nm_endereco, nr_endereco, nm_complementoendereco, nm_referencialendereco, "
                + "nr_prazo_ano, nr_prazo_mes, nr_prazo, dt_vencimento, ds_contrapartida, ds_observacao, status, cod_ac, fk_niveladm, fk_subprefeitura, "
                + "nr_verificado_ac, nm_cap, nm_metragem_oficial, fk_subcatfinalidade, fk_catcontrapartida, ds_finalidade, nm_login, dthr_atualizacao, nr_vigor, dt_cadastro ) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, auto.getFkTipoCessaoStage());
                stmt.setInt(2, auto.getFkCatEntidadeStage());
                stmt.setInt(3, auto.getFkCatAutoStage());
                stmt.setInt(4, auto.getFkCatFinalidadeStage());
                stmt.setString(5, auto.getDtLavratura());
                stmt.setString(6, auto.getNmProcesso());
                stmt.setString(7, auto.getNmCessionario());
                stmt.setString(8, auto.getNmCedente());
                stmt.setString(9, auto.getNmPlanta());
                stmt.setString(10, auto.getNmCroqui());
                stmt.setString(11, auto.getNrArea());
                stmt.setString(12, auto.getNrSetor());
                stmt.setString(13, auto.getNrQuadra());
                stmt.setString(14, auto.getNrLote());
                stmt.setString(15, auto.getNmTipoEndereco());
                stmt.setString(16, auto.getNmTituloEndereco());
                stmt.setString(17, auto.getNmEndereco());
                stmt.setString(18, auto.getNrEndereco());
                stmt.setString(19, auto.getNmComplementoEndereco());
                stmt.setString(20, auto.getNmReferencialEndereco());
                stmt.setInt(21, auto.getNrPrazoAno());
                stmt.setInt(22, auto.getNrPrazoMes());
                stmt.setString(23, auto.getNrPrazo());
                stmt.setString(24, auto.getDtVencimento());
                stmt.setString(25, auto.getDsContrapartida());
                stmt.setString(26, auto.getDsObservacao());
                stmt.setString(27, auto.getNmStatus());
                stmt.setString(28, auto.getNmCodAc());
                stmt.setInt(29, auto.getFkNivelAdm());
                stmt.setInt(30, auto.getFkSubpref());
                stmt.setInt(31, auto.getNrVerAc());
                stmt.setString(32, auto.getNrCap());
                stmt.setString(33, auto.getNmMetragem());
                stmt.setInt(34, auto.getFkSubcatfinalidade());
                stmt.setInt(35, auto.getFkCatContrapartida());
                stmt.setString(36, auto.getDsFinalidade());
                stmt.setString(37,auto.getNmLogin());
                stmt.setTimestamp(38, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setString(39, auto.getNrVigor());
                stmt.setDate(40, data);
//            stmt.execute();
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
                if(rs.next()){
                    pkAuto = rs.getInt(1);
                }
            stmt.close();
            return pkAuto;
        }catch (SQLException e){
           throw new RuntimeException(e);
        } 
    }    


//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao
    public void upAutoCessaoValidacao(AutoCessaoValidacao auto){
        String sql = "UPDATE tbl_autocessao_stage SET  fk_tipocessao=?, fk_categoriaentidade=?, fk_categoriauto=?, fk_categoriafinalidade=?, "
                + "dt_lavratura=?, nm_processo=?, nm_cessionario=?, nm_cedente=?, nm_planta=?, nm_croqui=?, nr_area=?, nr_setor=?, nr_quadra=?, "
                + "nr_lote=?, nm_tipoendereco=?, nm_tituloendereco=?, nm_endereco=?, nr_endereco= ?, nm_complementoendereco=?, nm_referencialendereco=?, "
                + "nr_prazo_ano=?, nr_prazo_mes=?, nr_prazo=?, dt_vencimento=?, ds_contrapartida=?, ds_observacao=?, status=?, cod_ac=?, fk_niveladm=?, fk_subprefeitura=?, "
                + "nr_verificado_ac=?, nm_cap=?, nm_metragem_oficial=?, fk_subcatfinalidade=?, fk_catcontrapartida=?, ds_finalidade=?, nm_login=?, dthr_atualizacao=?, nr_vigor=? "
                + "WHERE id_autocessao=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, auto.getFkTipoCessaoStage());
                stmt.setInt(2, auto.getFkCatEntidadeStage());
                stmt.setInt(3, auto.getFkCatAutoStage());
                stmt.setInt(4, auto.getFkCatFinalidadeStage());
                stmt.setString(5, auto.getDtLavratura());
                stmt.setString(6, auto.getNmProcesso());
                stmt.setString(7, auto.getNmCessionario());
                stmt.setString(8, auto.getNmCedente());
                stmt.setString(9, auto.getNmPlanta());
                stmt.setString(10, auto.getNmCroqui());
                stmt.setString(11, auto.getNrArea());
                stmt.setString(12, auto.getNrSetor());
                stmt.setString(13, auto.getNrQuadra());
                stmt.setString(14, auto.getNrLote());
                stmt.setString(15, auto.getNmTipoEndereco());
                stmt.setString(16, auto.getNmTituloEndereco());
                stmt.setString(17, auto.getNmEndereco());
                stmt.setString(18, auto.getNrEndereco());
                stmt.setString(19, auto.getNmComplementoEndereco());
                stmt.setString(20, auto.getNmReferencialEndereco());
                stmt.setInt(21, auto.getNrPrazoAno());
                stmt.setInt(22, auto.getNrPrazoMes());
                stmt.setString(23, auto.getNrPrazo());
                stmt.setString(24, auto.getDtVencimento());
                stmt.setString(25, auto.getDsContrapartida());
                stmt.setString(26, auto.getDsObservacao());
                stmt.setString(27, auto.getNmStatus());
                stmt.setString(28, auto.getNmCodAc());
                stmt.setInt(29, auto.getFkNivelAdm());
                stmt.setInt(30, auto.getFkSubpref());
                stmt.setInt(31, auto.getNrVerAc());
                stmt.setString(32, auto.getNrCap());
                stmt.setString(33, auto.getNmMetragem());
                stmt.setInt(34, auto.getFkSubcatfinalidade());
                stmt.setInt(35, auto.getFkCatContrapartida());
                stmt.setString(36, auto.getDsFinalidade());
                stmt.setString(37,auto.getNmLogin());
                stmt.setTimestamp(38, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setString(39, auto.getNrVigor());
                stmt.setInt(40, auto.getPkAutoStage());
            stmt.execute();
            stmt.close();
        }catch (SQLException e){
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
                    autoVa.setFkSubcatfinalidade(rs.getInt("fk_subcatfinalidade"));
                    autoVa.setFkNivelAdm(rs.getInt("fk_niveladm"));
                    autoVa.setFkSubpref(rs.getInt("fk_subprefeitura"));
                    autoVa.setFkCatContrapartida(rs.getInt("fk_catcontrapartida"));
                    autoVa.setFkValidacao(rs.getInt("fk_validacao"));
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
                    autoVa.setNrPrazoAno(rs.getInt("nr_prazo_ano"));
                    autoVa.setNrPrazoMes(rs.getInt("nr_prazo_mes"));
                    autoVa.setDtVencimento(rs.getString("dt_vencimento"));
                    autoVa.setDtEncerramento(rs.getString("dt_encerramento"));
                    autoVa.setDsContrapartida(rs.getString("ds_contrapartida"));
                    autoVa.setDsFinalidade(rs.getString("ds_finalidade"));
                    autoVa.setNrVigor(rs.getString("nr_vigor"));
                    autoVa.setDtCadastro(rs.getString("dt_cadastro"));
                    autoVa.setDsObservacao(rs.getString("ds_observacao"));
                    autoVa.setNmStatus(rs.getString("status"));
                    autoVa.setNmLogin(rs.getString("nm_login"));
                    autoVa.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                    autoVa.setNrCap(rs.getString("nm_cap"));
                    autoVa.setNmMetragem(rs.getString("nm_metragem_oficial"));
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
