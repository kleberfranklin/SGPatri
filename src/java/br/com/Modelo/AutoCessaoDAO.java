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
public class AutoCessaoDAO {
    
    
    private final Connection connection;
    
    public AutoCessaoDAO(){
        this.connection = new FabricaConexao().getConnetion();
    }
    
    //Atributo DATA para inserir a data da OS.
    Calendar calendar = Calendar.getInstance();
    java.sql.Date data = new java.sql.Date(calendar.getTime().getTime());
   
    
//METODO utilizado na Classe (AutoCessaolistaPagFiltro)
    public List<AutoCessao> listPagFiltroPesquisa(String qTpcessao, String qAC, String qProcesso, String qCessionario, String qCedente,
        String qEndereco,String qCroqui ,String qVigor, int qtdLinha, int OFFSET) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AutoCessao> cessaoLista = new ArrayList<AutoCessao>();
        String sql = ("SELECT auto.id_autocessao, auto.cod_ac, auto.nm_processo, auto.nm_tipo_processo, auto.fk_tipocessao, tp.nm_tipocessao, auto.nm_cedente, "
                + "auto.nm_cessionario, auto.nm_endereco, auto.nm_croqui, auto.nr_vigor, auto.status "
                + "FROM tbl_autocessao auto "
                + "JOIN sch_cgpatri.tbl_tipocessao tp ON auto.fk_tipocessao = tp.id_tipocessao "
                + "WHERE CAST(auto.fk_tipocessao AS VARCHAR) ILIKE ? "
                + "and auto.cod_ac ILIKE ? "
                + "and auto.nm_processo ILIKE ? "
                + "and auto.nm_cessionario ILIKE ? "
                + "and auto.nm_cedente ILIKE ? "
                + "and (auto.nm_endereco ILIKE ? or auto.nm_referencialendereco ILIKE ?) "
                + "and auto.nm_croqui ILIKE ? and auto.nr_Vigor ILIKE ? "
                + "ORDER BY auto.cod_ac DESC "
                + "LIMIT ? OFFSET ?");
            try {
                stmt = connection.prepareStatement(sql);
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
                rs = stmt.executeQuery();
                while (rs.next()) {
                AutoCessao auto = new AutoCessao();
                TipoAutoCessao tp = new TipoAutoCessao();
                    tp.setNmTipoAutoCessao(rs.getString("nm_tipocessao"));
                    auto.setTipoAutoCessao(tp);
                    auto.setPkAutoCessao(rs.getInt("id_autocessao"));
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
            return cessaoLista;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
        } 
    

//METODO utilizado na Classe (AutoCessaolistaPagFiltro)
    public int qtdAutoPesquisa(String qTpcessao, String qAC, String qProcesso, String qCessionario, String qCedente, 
            String qEndereco, String qCroqui, String qVigor) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int qtdAuto = 0;
        String sql = ("SELECT COUNT(*) as total "
                + "FROM tbl_autocessao "
                + "WHERE CAST(fk_tipocessao AS VARCHAR) ILIKE ? "
                + "and cod_ac ILIKE ? "
                + "and nm_processo ILIKE ? "
                + "and nm_cessionario ILIKE ? "
                + "and nm_cedente ILIKE ? "
                + "and ( nm_endereco ILIKE ? or nm_referencialendereco ILIKE ? ) "
                + "and nm_croqui ILIKE ? and nr_vigor ILIKE ? ");
           try {
                stmt = connection.prepareStatement(sql);
                   stmt.setString(1, '%'+qTpcessao+'%');
                   stmt.setString(2, qAC+'%');
                   stmt.setString(3, qProcesso+'%');
                   stmt.setString(4, '%'+qCessionario+'%');
                   stmt.setString(5, '%'+qCedente+'%');
                   stmt.setString(6, '%'+qEndereco+'%');
                   stmt.setString(7, '%'+qEndereco+'%');
                   stmt.setString(8, qCroqui+'%');
                   stmt.setString(9, '%'+qVigor+'%');
                rs = stmt.executeQuery();
               if(rs.next()){
                   qtdAuto = rs.getInt("total");
               }
            return qtdAuto;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }

    }
    
    
//METODO utilizado para lista de Validação do Auto de Cessão
    public int qtdAutoCessaoPesquisa(String qAC, String qProcesso, String qVigor, String qStatus) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int qtdAuto = 0;
        String sql = ("SELECT COUNT(*) as total "
                + "FROM tbl_autocessao "
                + "WHERE cod_ac ILIKE ? "
                + "and nm_processo ILIKE ? "
                + "and nr_vigor ILIKE ? "
                + "and status ILIKE ? ");
            try {
                stmt = connection.prepareStatement(sql);
                   stmt.setString(1, qAC+'%');
                   stmt.setString(2, qProcesso+'%');
                   stmt.setString(3, '%'+qVigor+'%');
                   stmt.setString(4, qStatus+'%');
                rs = stmt.executeQuery();
                if(rs.next()){
                   qtdAuto = rs.getInt("total");
                }    
            return qtdAuto;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
               rs.close();
               stmt.close();
               connection.close();
            }

    }
    
//METODO utilizado para lista de Validação do Auto de Cessão
    public List<AutoCessao> listPagFiltro(String qAC, String qProcesso, String qVigor, 
            String qStatus, int qtdLinha, int OFFSET) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AutoCessao> AutoLista = new ArrayList<AutoCessao>();
            String sql = ("SELECT id_autocessao, cod_ac, nm_processo, nr_vigor, status "
                    + "FROM tbl_autocessao "
                    + "WHERE cod_ac ILIKE ? "
                    + "and nm_processo ILIKE ? "
                    + "and nr_Vigor ILIKE ? "
                    + "and status ILIKE ? "
                    + "ORDER BY cod_ac ASC "
                    + "LIMIT ? OFFSET ?");
            try {
                stmt = connection.prepareStatement(sql);
                   stmt.setString(1, qAC+'%');
                   stmt.setString(2, qProcesso+'%');
                   stmt.setString(3, '%'+qVigor+'%');
                   stmt.setString(4, qStatus+'%');
                   stmt.setInt(5, qtdLinha);
                   stmt.setInt(6, OFFSET);
                rs = stmt.executeQuery();
                while (rs.next()) {
                AutoCessao auto = new AutoCessao();
                    auto.setPkAutoCessao(rs.getInt("id_autocessao"));
                    auto.setNmCodAc(rs.getString("cod_ac"));
                    auto.setNmProcesso(rs.getString("nm_processo"));
                    auto.setNrVigor(rs.getString("nr_vigor"));
                    auto.setNmStatus(rs.getString("status"));
                AutoLista.add(auto);
                }
                stmt.execute();
            return AutoLista;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                rs.close();
                stmt.close();
                connection.close();
            }
        }  

//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoStatus( int pkAutoStage, String nmStatus) throws SQLException{
        PreparedStatement stmt = null;
        String sql ="UPDATE tbl_autocessao "
                + "SET status = ? "
                + "WHERE id_autocessao=? ";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setString(1, nmStatus);
                    stmt.setInt(2, pkAutoStage);
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }       
    }    
    
//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoAuto( int pkAutoStage, int nrVerAuto) throws SQLException{
        PreparedStatement stmt = null;
        String sql ="UPDATE tbl_autocessao "
                + "SET nr_verificado_ac = ? "
                + "WHERE id_autocessao=? ";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, nrVerAuto);
                    stmt.setInt(2, pkAutoStage);
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }       
    }    

//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoValidacao(int fkValidacao ,int nrVerValidacao, int pkAutoStage, String nmStatus) throws SQLException{
        PreparedStatement stmt = null;
        String sql ="UPDATE tbl_autocessao "
                + "SET fk_validacao=?, nr_verificado_validacao=?, status=? "
                + "WHERE id_autocessao=? ";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, fkValidacao);
                    stmt.setInt(2, nrVerValidacao);
                    stmt.setString(3, nmStatus);
                    stmt.setInt(4, pkAutoStage);
                stmt.execute();
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }

//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoDisLegal(int pkAutoStage, int nrVerDisplegal) throws SQLException{
        PreparedStatement stmt = null;
        String sql ="UPDATE tbl_autocessao "
                + "SET nr_verificado_displegal=? "
                + "WHERE id_autocessao=?";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, nrVerDisplegal);
                    stmt.setInt(2, pkAutoStage);
            stmt.execute();
            }catch (SQLException e){
               throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            } 
    }
           
//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoArquivoAc(int pkAutoStage, int nrVerAc) throws SQLException{
        PreparedStatement stmt = null;
        String sql ="UPDATE tbl_autocessao "
                + "SET nr_verificado_arquivo_ac = ? "
                + "WHERE id_autocessao = ? ";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, nrVerAc);
                    stmt.setInt(2, pkAutoStage);
            stmt.execute();
            }catch (SQLException e){
               throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            }
    }

//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao status Dispositivo Legal
    public void upAutoCessaoVerificadoArquivoPlanta(int pkAutoStage, int nrVerPlanta) throws SQLException{
        PreparedStatement stmt = null;
        String sql ="UPDATE tbl_autocessao "
                + "SET nr_verificado_arquivo_planta = ? "
                + "WHERE id_autocessao = ? ";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, nrVerPlanta);
                    stmt.setInt(2, pkAutoStage);
                stmt.execute();
            }catch (SQLException e){
               throw new RuntimeException(e);
            }finally{
                stmt.close();
                connection.close();
            } 
    }
       
//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao
    public int cAutoCessao(AutoCessao auto) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int pkAuto =0;
        String sql = "INSERT INTO tbl_autocessao "
                + "(fk_tipocessao, fk_categoriaentidade, fk_categoriauto, fk_categoriafinalidade, "
                + "dt_lavratura, nm_processo, nm_tipo_processo, nm_cessionario, nm_cedente, nm_planta, nm_croqui, nr_area, nr_setor, nr_quadra, "
                + "nr_lote, nm_tipoendereco, nm_tituloendereco, nm_endereco, nr_endereco, nm_complementoendereco, nm_referencialendereco, "
                + "nr_prazo_ano, nr_prazo_mes, nr_prazo, dt_vencimento, ds_contrapartida, ds_observacao, status, cod_ac, fk_niveladm, fk_subprefeitura, "
                + "nr_verificado_ac, nm_cap, nm_metragem_oficial, fk_subcatfinalidade, fk_catcontrapartida, ds_finalidade, nm_login, dthr_atualizacao, nr_vigor, dt_cadastro ) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
             stmt = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, auto.getFkTipoCessaoStage());
                stmt.setInt(2, auto.getFkCatEntidadeStage());
                stmt.setInt(3, auto.getFkCatAutoStage());
                stmt.setInt(4, auto.getFkCatFinalidadeStage());
                stmt.setDate(5, auto.getDtLavratura());
                stmt.setString(6, auto.getNmProcesso());
                stmt.setString(7, auto.getNmTipoProcesso());
                stmt.setString(8, auto.getNmCessionario());
                stmt.setString(9, auto.getNmCedente());
                stmt.setString(10, auto.getNmPlanta());
                stmt.setString(11, auto.getNmCroqui());
                stmt.setString(12, auto.getNrArea());
                stmt.setString(13, auto.getNrSetor());
                stmt.setString(14, auto.getNrQuadra());
                stmt.setString(15, auto.getNrLote());
                stmt.setString(16, auto.getNmTipoEndereco());
                stmt.setString(17, auto.getNmTituloEndereco());
                stmt.setString(18, auto.getNmEndereco());
                stmt.setString(19, auto.getNrEndereco());
                stmt.setString(20, auto.getNmComplementoEndereco());
                stmt.setString(21, auto.getNmReferencialEndereco());
                stmt.setInt(22, auto.getNrPrazoAno());
                stmt.setInt(23, auto.getNrPrazoMes());
                stmt.setString(24, auto.getNrPrazo());
                stmt.setString(25, auto.getDtVencimento());
                stmt.setString(26, auto.getDsContrapartida());
                stmt.setString(27, auto.getDsObservacao());
                stmt.setString(28, auto.getNmStatus());
                stmt.setString(29, auto.getNmCodAc());
                stmt.setInt(30, auto.getFkNivelAdm());
                stmt.setInt(31, auto.getFkSubpref());
                stmt.setInt(32, auto.getNrVerAc());
                stmt.setString(33, auto.getNrCap());
                stmt.setString(34, auto.getNmMetragem());
                stmt.setInt(35, auto.getFkSubcatfinalidade());
                stmt.setInt(36, auto.getFkCatContrapartida());
                stmt.setString(37, auto.getDsFinalidade());
                stmt.setString(38,auto.getNmLogin());
                stmt.setTimestamp(39, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setString(40, auto.getNrVigor());
                stmt.setDate(41, data);
            stmt.executeUpdate();
            rs = stmt.getGeneratedKeys();
                if(rs.next()){
                    pkAuto = rs.getInt("id_autocessao");
                }
            return pkAuto;
        }catch (SQLException e){
           throw new RuntimeException(e);
        }finally{
//            rs.close();
//            stmt.close();
//            connection.close();
        }
    }    


//MEDOTO utilizado para realizar a alteração das informações do Auto Cessao
    public void upAutoCessao(AutoCessao auto) throws SQLException{
        PreparedStatement stmt = null;
        String sql = "UPDATE tbl_autocessao "
                + "SET  fk_tipocessao=?, fk_categoriaentidade=?, fk_categoriauto=?, fk_categoriafinalidade=?, "
                + "dt_lavratura=?, nm_processo=?, nm_tipo_processo=?, nm_cessionario=?, nm_cedente=?, nm_planta=?, nm_croqui=?, nr_area=?, nr_setor=?, nr_quadra=?, "
                + "nr_lote=?, nm_tipoendereco=?, nm_tituloendereco=?, nm_endereco=?, nr_endereco= ?, nm_complementoendereco=?, nm_referencialendereco=?, "
                + "nr_prazo_ano=?, nr_prazo_mes=?, nr_prazo=?, dt_vencimento=?, ds_contrapartida=?, ds_observacao=?, status=?, cod_ac=?, fk_niveladm=?, fk_subprefeitura=?, "
                + "nr_verificado_ac=?, nm_cap=?, nm_metragem_oficial=?, fk_subcatfinalidade=?, fk_catcontrapartida=?, ds_finalidade=?, nm_login=?, dthr_atualizacao=?, nr_vigor=? "
                + "WHERE id_autocessao=?";
        try{
             stmt = connection.prepareStatement(sql);
                stmt.setInt(1, auto.getFkTipoCessaoStage());
                stmt.setInt(2, auto.getFkCatEntidadeStage());
                stmt.setInt(3, auto.getFkCatAutoStage());
                stmt.setInt(4, auto.getFkCatFinalidadeStage());
                stmt.setDate(5, auto.getDtLavratura());
                stmt.setString(6, auto.getNmProcesso());
                stmt.setString(7, auto.getNmTipoProcesso());
                stmt.setString(8, auto.getNmCessionario());
                stmt.setString(9, auto.getNmCedente());
                stmt.setString(10, auto.getNmPlanta());
                stmt.setString(11, auto.getNmCroqui());
                stmt.setString(12, auto.getNrArea());
                stmt.setString(13, auto.getNrSetor());
                stmt.setString(14, auto.getNrQuadra());
                stmt.setString(15, auto.getNrLote());
                stmt.setString(16, auto.getNmTipoEndereco());
                stmt.setString(17, auto.getNmTituloEndereco());
                stmt.setString(18, auto.getNmEndereco());
                stmt.setString(19, auto.getNrEndereco());
                stmt.setString(20, auto.getNmComplementoEndereco());
                stmt.setString(21, auto.getNmReferencialEndereco());
                stmt.setInt(22, auto.getNrPrazoAno());
                stmt.setInt(23, auto.getNrPrazoMes());
                stmt.setString(24, auto.getNrPrazo());
                stmt.setString(25, auto.getDtVencimento());
                stmt.setString(26, auto.getDsContrapartida());
                stmt.setString(27, auto.getDsObservacao());
                stmt.setString(28, auto.getNmStatus());
                stmt.setString(29, auto.getNmCodAc());
                stmt.setInt(30, auto.getFkNivelAdm());
                stmt.setInt(31, auto.getFkSubpref());
                stmt.setInt(32, auto.getNrVerAc());
                stmt.setString(33, auto.getNrCap());
                stmt.setString(34, auto.getNmMetragem());
                stmt.setInt(35, auto.getFkSubcatfinalidade());
                stmt.setInt(36, auto.getFkCatContrapartida());
                stmt.setString(37, auto.getDsFinalidade());
                stmt.setString(38,auto.getNmLogin());
                stmt.setTimestamp(39, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setString(40, auto.getNrVigor());
                stmt.setInt(41, auto.getPkAutoCessao());
            stmt.execute();
        }catch (SQLException e){
           throw new RuntimeException(e);
        }finally{
            stmt.close();
            connection.close();
        } 
    }    
    
    
//METODO utilizado para Classe (AutoCessaoDetalhe) 
    public AutoCessao detalheAutoCessao(int pkAutoStage) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = ("SELECT id_autocessao, cod_ac ,fk_tipocessao ,fk_categoriaentidade, fk_categoriauto, fk_categoriafinalidade, "
                + "fk_subcatfinalidade, fk_niveladm, fk_subprefeitura, fk_catcontrapartida, fk_validacao, dt_lavratura, nm_processo, nm_tipo_processo, "
                + "nm_cessionario, nm_cedente, nm_planta, nm_croqui, nr_area, nr_setor, nr_quadra, nr_lote, nm_tipoendereco, nm_tituloendereco, "
                + "nm_endereco, nr_endereco, nm_complementoendereco, nm_referencialendereco, nm_municipal, nr_prazo, nr_prazo_ano, nr_prazo_mes, "
                + "dt_vencimento, dt_encerramento, ds_contrapartida, ds_finalidade, nr_vigor, dt_cadastro, ds_observacao, status, nm_login, "
                + "dthr_atualizacao, nm_cap, nm_metragem_oficial, nr_verificado_ac, nr_verificado_displegal, nr_verificado_arquivo_ac, "
                + "nr_verificado_arquivo_planta, nr_verificado_validacao "
                + "FROM tbl_autocessao "
                + "WHERE id_autocessao = ?");
           try {
                stmt = connection.prepareStatement(sql);
                   stmt.setInt(1, pkAutoStage);
                rs = stmt.executeQuery();
                AutoCessao auto = new AutoCessao();
                if (rs.next()) {
                    auto.setPkAutoCessao(rs.getInt("id_autocessao"));
                    auto.setNmCodAc(rs.getString("cod_ac"));
                    auto.setFkTipoCessaoStage(rs.getInt("fk_tipocessao"));
                    auto.setFkCatEntidadeStage(rs.getInt("fk_categoriaentidade"));
                    auto.setFkCatAutoStage(rs.getInt("fk_categoriauto"));
                    auto.setFkCatFinalidadeStage(rs.getInt("fk_categoriafinalidade"));
                    auto.setFkSubcatfinalidade(rs.getInt("fk_subcatfinalidade"));
                    auto.setFkNivelAdm(rs.getInt("fk_niveladm"));
                    auto.setFkSubpref(rs.getInt("fk_subprefeitura"));
                    auto.setFkCatContrapartida(rs.getInt("fk_catcontrapartida"));
                    auto.setFkValidacao(rs.getInt("fk_validacao"));
                    auto.setDtLavratura(rs.getDate("dt_lavratura"));
                    auto.setNmProcesso(rs.getString("nm_processo"));
                    auto.setNmTipoProcesso(rs.getString("nm_tipo_processo"));
                    auto.setNmCessionario(rs.getString("nm_cessionario"));
                    auto.setNmCedente(rs.getString("nm_cedente"));
                    auto.setNmPlanta(rs.getString("nm_planta"));
                    auto.setNmCroqui(rs.getString("nm_croqui"));
                    auto.setNrArea(rs.getString("nr_area"));
                    auto.setNrSetor(rs.getString("nr_setor"));
                    auto.setNrQuadra(rs.getString("nr_quadra"));
                    auto.setNrLote(rs.getString("nr_lote"));
                    auto.setNmTipoEndereco(rs.getString("nm_tipoendereco"));
                    auto.setNmTituloEndereco(rs.getString("nm_tituloendereco"));
                    auto.setNmEndereco(rs.getString("nm_endereco"));
                    auto.setNrEndereco(rs.getString("nr_endereco"));
                    auto.setNmComplementoEndereco(rs.getString("nm_complementoendereco"));
                    auto.setNmReferencialEndereco(rs.getString("nm_referencialendereco"));
                    auto.setNmMunicipal(rs.getString("nm_municipal"));
                    auto.setNrPrazo(rs.getString("nr_prazo"));
                    auto.setNrPrazoAno(rs.getInt("nr_prazo_ano"));
                    auto.setNrPrazoMes(rs.getInt("nr_prazo_mes"));
                    auto.setDtVencimento(rs.getString("dt_vencimento"));
                    auto.setDtEncerramento(rs.getString("dt_encerramento"));
                    auto.setDsContrapartida(rs.getString("ds_contrapartida"));
                    auto.setDsFinalidade(rs.getString("ds_finalidade"));
                    auto.setNrVigor(rs.getString("nr_vigor"));
                    auto.setDtCadastro(rs.getString("dt_cadastro"));
                    auto.setDsObservacao(rs.getString("ds_observacao"));
                    auto.setNmStatus(rs.getString("status"));
                    auto.setNmLogin(rs.getString("nm_login"));
                    auto.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                    auto.setNrCap(rs.getString("nm_cap"));
                    auto.setNmMetragem(rs.getString("nm_metragem_oficial"));
                    auto.setNrVerAc(rs.getInt("nr_verificado_ac"));
                    auto.setNrVerDispLegal(rs.getInt("nr_verificado_displegal"));
                    auto.setNrVerArqAc(rs.getInt("nr_verificado_arquivo_ac"));
                    auto.setNrVerArqPlanta(rs.getInt("nr_verificado_arquivo_planta"));
                    auto.setNrVerValidacao(rs.getInt("nr_verificado_validacao"));
                return auto;
               }
               stmt.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
               rs.close();
               stmt.close();
               connection.close();
            }
           return null;
    }    

//Metodo para grafico de status do processo de validadaçao    
    public List<AutoCessao> statusValidacao() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AutoCessao> listGrafico = new ArrayList<AutoCessao>();
        String sql =("SELECT count(*) as qtd, status "
                    +"FROM tbl_autocessao "
                    +"GROUP BY status "
                    +"Order By qtd DESC");
        try{
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
                while(rs.next()){
                    AutoCessao auto = new AutoCessao();
                        auto.setFkValidacao(rs.getInt("qtd"));
                        auto.setNmStatus(rs.getString("status"));
                listGrafico.add(auto);
                }
        }catch (SQLException e){
            throw new RuntimeException (e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
        return listGrafico;
    }
    
//Metodo para grafico de quantidade por tipo de Auto de Cessão    
    public List<AutoCessao> qtdTipoAutoCessao() throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AutoCessao> listGraficoTipoAuto = new ArrayList<AutoCessao>();
        String sql =("SELECT count(*) as qtd, tp.nm_tipocessao "
                    +"FROM tbl_autocessao auto "
                    +"JOIN tbl_tipocessao tp ON auto.fk_tipocessao = tp.id_tipocessao "
                    +"GROUP BY tp.nm_tipocessao "
                    +"ORDER BY qtd DESC "
                    +"LIMIT 15");
        try{
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
                while(rs.next()){
                    AutoCessao auto = new AutoCessao();
                    TipoAutoCessao tp = new TipoAutoCessao();
                        tp.setNmTipoAutoCessao(rs.getString("nm_tipocessao"));
                        auto.setFkValidacao(rs.getInt("qtd"));
                        auto.setTipoAutoCessao(tp);
                listGraficoTipoAuto.add(auto);
                }
        }catch (SQLException e){
            throw new RuntimeException (e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
        }
        return listGraficoTipoAuto;
    }
    
    
    public int verificarDuplicidadeAutoCesssao(String qCodAc, String qProcesso, int fktipocessao) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int pkAutoCessao = 0;
        String sql =("SELECT id_autocessao, cod_ac, nm_processo, fk_tipocessao "
                    +"FROM tbl_autocessao "
                    +"WHERE cod_ac=? and  nm_processo=? and fk_tipocessao=? ");
            try{
                stmt = connection.prepareCall(sql);
                    stmt.setString(1, qCodAc);
                    stmt.setString(2, qProcesso);
                    stmt.setInt(3, fktipocessao);
                rs = stmt.executeQuery();
                if(rs.next()){
                    pkAutoCessao = rs.getInt("id_autocessao") ;
                }
            return pkAutoCessao;     
            }catch(SQLException e) {
                throw new RuntimeException(e);
            }finally{
//                rs.close();
//                stmt.close();
//                connection.close();
            }
    }    
    
    
    
    
    
    
    
    
    
    
}
