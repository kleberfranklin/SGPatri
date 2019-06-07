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
 * @author x369482
 */
public class AnotacaoCroquiDAO {

    private final Connection connection;

//Construtor
    public AnotacaoCroquiDAO() {
        this.connection = new FabricaConexao().getConnetion();
    }

    
    public List<AnotacaoCroqui> pesquisaCroqui(int pkTpExpediente, String nmprocesso, int qtdLinha, int offset) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AnotacaoCroqui> listAnotCroqui = new ArrayList<AnotacaoCroqui>();
                 
        String sql = "SELECT id_anotacao_expediente, fk_assunto_expediente, fk_tipo_despacho, fk_tipo_expediente, cd_expediente, cd_croqui, cd_area, "
                + "nm_interessado, nm_tipoendereco, nm_tituloendereco, nm_endereco, nr_endereco, nm_complementoendereco, nm_referencialendereco " 
                + "FROM tbl_anotacao_expediente_croqui "    
                + "WHERE fk_tipo_expediente=? AND cd_expediente=? "
                + "LIMIT ? OFFSET ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkTpExpediente);
                stmt.setString(2, nmprocesso);
                stmt.setInt(3, qtdLinha);
                stmt.setInt(4, offset);
            rs = stmt.executeQuery();
                while(rs.next()){
                    TipoAssunto tpAssunto = new TipoAssunto();
                    TipoDespacho tpDespacho = new TipoDespacho();
                    TipoExpediente tpExpediente = new TipoExpediente();
                    Endereco endereco = new Endereco();    
                    AnotacaoCroqui anotCroqui = new AnotacaoCroqui();
                    
                    tpAssunto.setPkTipoAssunto(rs.getInt("fk_assunto_expediente"));
                    tpDespacho.setPkTipoDespacho(rs.getInt("fk_tipo_despacho"));
                    tpExpediente.setPkTipoExpediente(rs.getInt("fk_tipo_expediente"));
                    
                    endereco.setTipo(rs.getString(("nm_tipoendereco")));
                    endereco.setTitulo(rs.getString("nm_tituloendereco"));
                    endereco.setEndereco(rs.getString("nm_endereco"));
                    endereco.setNumero(rs.getString("nr_endereco"));
                    endereco.setComplemento(rs.getString("nm_complementoendereco"));
                    endereco.setReferencia(rs.getString("nm_referencialendereco"));
                    
                    anotCroqui.setTpExpediente(tpExpediente);
                    anotCroqui.setCdExpediente(rs.getString("cd_expediente"));
                    anotCroqui.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                    anotCroqui.setCdCroqui(rs.getString("cd_croqui"));
                    anotCroqui.setCdArea(rs.getString("cd_area"));
                    anotCroqui.setNmInteressado(rs.getString("nm_interessado"));
                    anotCroqui.setEndereco(endereco);
                listAnotCroqui.add(anotCroqui);
                }
            return listAnotCroqui;
        }catch (SQLException e){
           throw new RuntimeException(e);
        }finally{
            rs.close();
            stmt.close();
            connection.close();
            
        }
    }
    
    
    
    public int cAnotacao(AnotacaoCroqui anotCroqui) throws SQLException{        
            PreparedStatement stmt = null;
            ResultSet rs = null;
            int pkAnotCroqui =0;
            String sql = "INSERT INTO tbl_anotacao_expediente_croqui "
                    + "(fk_assunto_expediente, fk_tipo_despacho, fk_tipo_expediente, cd_expediente, cd_croqui, cd_area, nm_interessado, "
                    + "dt_publicacao, dt_tramitacao, ds_observacao,  nm_tipoendereco, nm_tituloendereco, "
                    + "nm_endereco, nr_endereco, nm_complementoendereco, nm_referencialendereco, ds_local, "
                    + "nm_login, dthr_atualizacao) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";           
            try{
                stmt = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                    stmt.setInt(1, anotCroqui.getTpAssunto().getPkTipoAssunto());
                    stmt.setInt(2, anotCroqui.getTpDespacho().getPkTipoDespacho());
                    stmt.setInt(3, anotCroqui.getTpExpediente().getPkTipoExpediente());
                    stmt.setString(4, anotCroqui.getCdExpediente());
                    stmt.setString(5, anotCroqui.getCdCroqui());
                    stmt.setString(6, anotCroqui.getCdArea());
                    stmt.setString(7, anotCroqui.getNmInteressado());
                    stmt.setDate(8, anotCroqui.getDtPublicacao());
                    stmt.setDate(9, anotCroqui.getDtTramitacao());
                    stmt.setString(10, anotCroqui.getDsObservacao());
                    stmt.setString(11, anotCroqui.getEndereco().getTipo());
                    stmt.setString(12, anotCroqui.getEndereco().getTitulo());
                    stmt.setString(13, anotCroqui.getEndereco().getEndereco());
                    stmt.setString(14, anotCroqui.getEndereco().getNumero());
                    stmt.setString(15, anotCroqui.getEndereco().getComplemento());
                    stmt.setString(16, anotCroqui.getEndereco().getReferencia());
                    stmt.setString(17, anotCroqui.getDsLocal());
                    stmt.setString(18, anotCroqui.getNmLogin());
                    stmt.setTimestamp(19, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.executeUpdate();
                rs = stmt.getGeneratedKeys();                    
                if(rs.next()){
                    pkAnotCroqui = rs.getInt("id_anotacao_expediente");
                }
                return pkAnotCroqui;
            }catch (SQLException e){
                throw new RuntimeException(e);
            }finally{
//                stmt.close();
//                connection.close();
            }
    }
        
    
    public AnotacaoCroqui detalheAnotacaoCroqui(int pkAnotacaoExpediente ) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet rs =null;
        TipoAssunto tpAssunto = new TipoAssunto();
        TipoDespacho tpDespacho = new TipoDespacho();
        TipoExpediente tpExpediente = new TipoExpediente();
        Endereco endereco = new Endereco();    
        AnotacaoCroqui anotCroqui = new AnotacaoCroqui();
        
        String sql = "SELECT id_anotacao_expediente, fk_assunto_expediente, fk_tipo_despacho, fk_tipo_expediente, cd_expediente, "
                + "cd_croqui, cd_area, nm_interessado, dt_publicacao, dt_tramitacao, ds_observacao, nm_login, "
                + "dthr_atualizacao, nm_tipoendereco, nm_tituloendereco, nm_endereco, nr_endereco, nm_complementoendereco, nm_referencialendereco " 
                + "FROM tbl_anotacao_expediente_croqui "    
                + "WHERE id_anotacao_expediente=? ";
            try{
                stmt = connection.prepareStatement(sql);
                    stmt.setInt(1, pkAnotacaoExpediente);
                rs = stmt.executeQuery();
                if(rs.next()){
                    tpAssunto.setPkTipoAssunto(rs.getInt("fk_assunto_expediente"));
                    tpDespacho.setPkTipoDespacho(rs.getInt("fk_tipo_despacho"));
                    tpExpediente.setPkTipoExpediente(rs.getInt("fk_tipo_expediente"));
                    
                    endereco.setTipo(rs.getString(("nm_tipoendereco")));
                    endereco.setTitulo(rs.getString("nm_tituloendereco"));
                    endereco.setEndereco(rs.getString("nm_endereco"));
                    endereco.setNumero(rs.getString("nr_endereco"));
                    endereco.setComplemento(rs.getString("nm_complementoendereco"));
                    endereco.setReferencia(rs.getString("nm_referencialendereco"));
                    
                    anotCroqui.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                    anotCroqui.setTpAssunto(tpAssunto);
                    anotCroqui.setTpDespacho(tpDespacho);
                    anotCroqui.setTpExpediente(tpExpediente);
                    anotCroqui.setEndereco(endereco);
                    anotCroqui.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                    anotCroqui.setCdExpediente(rs.getString("cd_expediente"));
                    anotCroqui.setCdCroqui(rs.getString("cd_croqui"));
                    anotCroqui.setCdArea(rs.getString("cd_area"));
                    anotCroqui.setNmInteressado(rs.getString("nm_interessado"));
                    anotCroqui.setDtPublicacao(rs.getDate("dt_publicacao"));
                    anotCroqui.setDtTramitacao(rs.getDate("dt_tramitacao"));
                    anotCroqui.setDsObservacao(rs.getString("ds_observacao"));
                    anotCroqui.setNmLogin(rs.getString("nm_login"));
                    anotCroqui.setDthrAtualizacao(rs.getString("dthr_atualizacao"));
                }
                return anotCroqui;
            }catch (SQLException e){
               throw new RuntimeException(e);
            }finally{
//                rs.close();
//                stmt.close();
//                connection.close();
            }
    }


    public void upAnotacao(AnotacaoCroqui anotCroqui) throws SQLException {
       PreparedStatement stmt = null;
        String sql = "UPDATE tbl_anotacao_expediente_croqui "
                + "SET fk_assunto_expediente=?, fk_tipo_despacho=?, fk_tipo_expediente=?, cd_expediente=?, "
                + "cd_croqui=?, cd_area=?, nm_interessado=?, dt_publicacao=?, dt_tramitacao=?, ds_observacao=?, nm_tipoendereco=?, "
                + "nm_tituloendereco=?, nm_endereco=?, nr_endereco=?, nm_complementoendereco=?, nm_referencialendereco=?, ds_local=?, "
                + "nm_login=?, dthr_atualizacao=? "
                + "WHERE id_anotacao_expediente = ?";
        try{
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, anotCroqui.getTpAssunto().getPkTipoAssunto());
                stmt.setInt(2, anotCroqui.getTpDespacho().getPkTipoDespacho());
                stmt.setInt(3, anotCroqui.getTpExpediente().getPkTipoExpediente());
                stmt.setString(4, anotCroqui.getCdExpediente());
                stmt.setString(5, anotCroqui.getCdCroqui());
                stmt.setString(6, anotCroqui.getCdArea());
                stmt.setString(7, anotCroqui.getNmInteressado());
                stmt.setDate(8, anotCroqui.getDtPublicacao());
                stmt.setDate(9, anotCroqui.getDtTramitacao());
                stmt.setString(10, anotCroqui.getDsObservacao());
                stmt.setString(11, anotCroqui.getEndereco().getTipo());
                stmt.setString(12, anotCroqui.getEndereco().getTitulo());
                stmt.setString(13, anotCroqui.getEndereco().getEndereco());
                stmt.setString(14, anotCroqui.getEndereco().getNumero());
                stmt.setString(15, anotCroqui.getEndereco().getComplemento());
                stmt.setString(16, anotCroqui.getEndereco().getReferencia());
                stmt.setString(17, anotCroqui.getDsLocal());
                stmt.setString(18, anotCroqui.getNmLogin());
                stmt.setTimestamp(19, java.sql.Timestamp.valueOf(java.time.LocalDateTime.now()));
                stmt.setInt(20, anotCroqui.getPkAnotacaoExpediente());
            stmt.execute();
        }catch (SQLException e){
               throw new RuntimeException(e);
        }finally{
            stmt.close();
            connection.close();
        }
    }

    public int qtdAnotCroqui(int pkTpExpediente, String cdExpediente) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int qtd=0;
        
        String sql = "SELECT COUNT(*)  AS qtd "
                + "FROM sch_cgpatri.tbl_anotacao_expediente_croqui "
                + "WHERE fk_tipo_expediente=? AND cd_expediente=?  ";
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setInt(1, pkTpExpediente);
                stmt.setString(2, cdExpediente);
            rs = stmt.executeQuery();
                if(rs.next()){
                    qtd = rs.getInt("qtd");
                }
            return qtd;
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
        
    }
   
    public int qtdAnotCroquiLista(String qCroqui, String qArea, String sgTpExpediente, String cdExpediente, 
                                String qAssunto, String qInteressado, String qLocal) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int qtd=0;
        String sql = "SELECT COUNT(*)  AS qtd "
                +"FROM tbl_anotacao_expediente_croqui  anot "
                +"JOIN sch_cgpatri.tbl_tipo_expediente tpEx "
                +"ON anot.fk_tipo_expediente = tpEx.id_tipo_expediente "
                +"JOIN sch_cgpatri.tbl_assunto_expediente tpAs "
                +"ON anot.fk_assunto_expediente = tpAs.id_assunto_expediente "
                +"WHERE anot.cd_croqui LIKE ? "
                +"AND anot.cd_area LIKE ? " 
                +"AND tpEx.sg_tipo_expediente LIKE ? " 
                +"AND anot.cd_expediente LIKE ? " 
                +"AND tpAs.nm_assunto LIKE ? "
                +"AND anot.nm_interessado LIKE ? "
                +"AND anot.ds_local LIKE ? ";
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%' + qCroqui + '%');
                stmt.setString(2, '%' + qArea + '%');
                stmt.setString(3, '%' + sgTpExpediente + '%');
                stmt.setString(4, '%' + cdExpediente + '%');
                stmt.setString(5, '%' + qAssunto + '%');
                stmt.setString(6, '%' + qInteressado + '%');
                stmt.setString(7, '%' + qLocal + '%');
            rs = stmt.executeQuery();
                if(rs.next()){
                    qtd = rs.getInt("qtd");
                }
            return qtd;
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
        
    }
    public List<AnotacaoCroqui> lisAnotCroquiLista(String qCroqui, String qArea, String sgTpExpediente, String cdExpediente, 
                                String qAssunto, String qInteressado, String qLocal, int qtdLinha, int OFFSET) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<AnotacaoCroqui> listAnotCroqui = new ArrayList<AnotacaoCroqui>();
        String sql = "SELECT anot.id_anotacao_expediente, anot.cd_croqui, anot.cd_area, anot.fk_tipo_expediente, tpEx.sg_tipo_expediente, anot.cd_expediente, "
                +"anot.fk_assunto_expediente, tpAs.nm_assunto, anot.nm_interessado, anot.ds_local "
                +"FROM tbl_anotacao_expediente_croqui  anot "
                +"JOIN sch_cgpatri.tbl_tipo_expediente tpEx "
                +"ON anot.fk_tipo_expediente = tpEx.id_tipo_expediente "
                +"JOIN sch_cgpatri.tbl_assunto_expediente tpAs "
                +"ON anot.fk_assunto_expediente = tpAs.id_assunto_expediente "
                +"WHERE anot.cd_croqui LIKE ? "
                +"AND anot.cd_area LIKE ? " 
                +"AND tpEx.sg_tipo_expediente LIKE ? " 
                +"AND anot.cd_expediente LIKE ? " 
                +"AND tpAs.nm_assunto LIKE ? "
                +"AND anot.nm_interessado LIKE ? "
                +"AND anot.ds_local LIKE ? "
                +"ORDER BY anot.cd_croqui "
                +"LIMIT ? OFFSET ? ";
        try {
            stmt = connection.prepareStatement(sql);
                stmt.setString(1, '%' + qCroqui + '%');
                stmt.setString(2, '%' + qArea + '%');
                stmt.setString(3, '%' + sgTpExpediente + '%');
                stmt.setString(4, '%' + cdExpediente + '%');
                stmt.setString(5, '%' + qAssunto + '%');
                stmt.setString(6, '%' + qInteressado + '%');
                stmt.setString(7, '%' + qLocal + '%');
                stmt.setInt(8, qtdLinha );
                stmt.setInt(9, OFFSET);
            rs = stmt.executeQuery();
                while(rs.next()){
                    AnotacaoCroqui anot = new AnotacaoCroqui();
                    TipoExpediente tpEx = new TipoExpediente();
                    TipoAssunto tpAs = new TipoAssunto();
                    
                    tpEx.setPkTipoExpediente(rs.getInt("fk_tipo_expediente"));
                    tpEx.setSgTipoExpediente(rs.getString("sg_tipo_expediente"));
                    tpAs.setPkTipoAssunto(rs.getInt("fk_assunto_expediente"));
                    tpAs.setNmTipoAssunto(rs.getString("nm_assunto"));
                    
                    anot.setPkAnotacaoExpediente(rs.getInt("id_anotacao_expediente"));
                    anot.setCdCroqui(rs.getString("cd_croqui"));
                    anot.setCdArea(rs.getString("cd_area"));
                    anot.setTpExpediente(tpEx);
                    anot.setCdExpediente(rs.getString("cd_expediente"));
                    anot.setTpAssunto(tpAs);
                    anot.setNmInteressado(rs.getString("nm_interessado"));
                    anot.setDsLocal(rs.getString("ds_local"));
                    
                listAnotCroqui.add(anot);
                }
            return listAnotCroqui;
        } catch (SQLException e) {
            throw new RuntimeException (e);
        }
        
    }

    
    
    
    
    
    
    
    
    
    
    

}
