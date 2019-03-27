/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

/**
 *
 * @author x369482
 */
public class AnotacaoCroqui {

//Atributos
    private int pkAnotacaoExpediente, nrAnotacao, nrInformacao, fkUsuario, fkCatFormularios, nrCodigo;

    private String cdCroqui, cdArea, cdExpediente, nrInformacaoDgpi, nmInteressado, dsAssunto, dsDespacho, dsObservacao, nmAutor, cdSetor, cdQuadra, 
            cdLote, dtPublicacao, nmReferenciaEndereco, dtData, dthrAtualizacao, nmLogin, dtAnotacao, nmPublicadoPor, dsInfoGeral, cdTid, cdProcesso;

//Construtor    
    public AnotacaoCroqui() {
    }

    public AnotacaoCroqui(int pkCadastroSic, int fkUsuario, int fkEnderecos, String nrInformacaoDgpi, String cdProcesso, String cdTid, 
            String cdCroqui, String cdArea, String cdExpediente, String nmInteressado, String dsAssunto, String dsObservacao, String nmLogin) {
        
    }


    //Getter's & Setter's
    public int getPkAnotacaoExpediente() {
        return pkAnotacaoExpediente;
    }

    public void setPkAnotacaoExpediente(int pkAnotacaoExpediente) {
        this.pkAnotacaoExpediente = pkAnotacaoExpediente;
    }

    public String getCdProcesso() {
        return cdProcesso;
    }

    public void setCdProcesso(String cdProcesso) {
        this.cdProcesso = cdProcesso;
    }

    public String getCdTid() {
        return cdTid;
    }

    public void setCdTid(String cdTid) {
        this.cdTid = cdTid;
    }

    public int getNrAnotacao() {
        return nrAnotacao;
    }

    public void setNrAnotacao(int nrAnotacao) {
        this.nrAnotacao = nrAnotacao;
    }

    public int getNrInformacao() {
        return nrInformacao;
    }

    public void setNrInformacao(int nrInformacao) {
        this.nrInformacao = nrInformacao;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int pkUsuario) {
        this.fkUsuario = pkUsuario;
    }

    public int getFkCatFormularios() {
        return fkCatFormularios;
    }

    public void setFkCatFormularios(int pkCatFormularios) {
        this.fkCatFormularios = pkCatFormularios;
    }

    public int getNrCodigo() {
        return nrCodigo;
    }

    public void setNrCodigo(int nrCodigo) {
        this.nrCodigo = nrCodigo;
    }

    public String getCdCroqui() {
        return cdCroqui;
    }

    public void setCdCroqui(String cdCroqui) {
        this.cdCroqui = cdCroqui;
    }

    public String getCdArea() {
        return cdArea;
    }

    public void setCdArea(String cdArea) {
        this.cdArea = cdArea;
    }

    public String getCdExpediente() {
        return cdExpediente;
    }

    public void setCdExpediente(String cdExpediente) {
        this.cdExpediente = cdExpediente;
    }

    public String getNrInformacaoDgpi() {
        return nrInformacaoDgpi;
    }

    public void setNrInformacaoDgpi(String nrInformacaoDgpi) {
        this.nrInformacaoDgpi = nrInformacaoDgpi;
    }
        
    public String getNmInteressado() {
        return nmInteressado;
    }

    public void setNmInteressado(String nmInteressado) {
        this.nmInteressado = nmInteressado;
    }

    public String getDsAssunto() {
        return dsAssunto;
    }

    public void setDsAssunto(String dsAssunto) {
        this.dsAssunto = dsAssunto;
    }

    public String getDsDespacho() {
        return dsDespacho;
    }

    public void setDsDespacho(String dsDespacho) {
        this.dsDespacho = dsDespacho;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getNmAutor() {
        return nmAutor;
    }

    public void setNmAutor(String nmAutor) {
        this.nmAutor = nmAutor;
    }

    public String getCdSetor() {
        return cdSetor;
    }

    public void setCdSetor(String cdSetor) {
        this.cdSetor = cdSetor;
    }

    public String getCdQuadra() {
        return cdQuadra;
    }

    public void setCdQuadra(String cdQuadra) {
        this.cdQuadra = cdQuadra;
    }

    public String getCdLote() {
        return cdLote;
    }

    public void setCdLote(String cdLote) {
        this.cdLote = cdLote;
    }

    public String getDtPublicacao() {
        return dtPublicacao;
    }

    public void setDtPublicacao(String dtPublicacao) {
        this.dtPublicacao = dtPublicacao;
    }

    public String getDtData() {
        return dtData;
    }

    public void setDtData(String dtData) {
        this.dtData = dtData;
    }

    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getDtAnotacao() {
        return dtAnotacao;
    }

    public void setDtAnotacao(String dtAnotacao) {
        this.dtAnotacao = dtAnotacao;
    }

    public String getNmPublicadoPor() {
        return nmPublicadoPor;
    }

    public void setNmPublicadoPor(String nmPublicadoPor) {
        this.nmPublicadoPor = nmPublicadoPor;
    }

    public String getDsInfoGeral() {
        return dsInfoGeral;
    }

    public void setDsInfoGeral(String dsInfoGeral) {
        this.dsInfoGeral = dsInfoGeral;
    }

    public String getNmReferenciaEndereco() {
        return nmReferenciaEndereco;
    }

    public void setNmReferenciaEndereco(String nmReferenciaEndereco) {
        this.nmReferenciaEndereco = nmReferenciaEndereco;
    }
    
    

}
