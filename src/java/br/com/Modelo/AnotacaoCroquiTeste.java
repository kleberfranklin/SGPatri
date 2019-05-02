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
public class AnotacaoCroquiTeste {

//Atributos
    private int pkAnotacaoExpediente, fkUsuario, fkAssuntoExpediente, fkTipoDespachoExpediente, fkTipoExpediente;

    private String cdExpediente, cdCroqui, cdArea, nmInteressado, dsLocal, dtPublicacao, dtTramitacao, dsObservacao, nmAutor,
            dtData, dthrAtualizacao, nmLogin;

    public AnotacaoCroquiTeste(int pkAnotacaoExpediente, String cdExpediente, String cdCroqui, String cdArea, String cdExpediente0, String nmInteressado, String dsObservacao, String nmLogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AnotacaoCroquiTeste() {
    }

//Construtor   
//Getter's & Setter's
    /**
     * @return the pkAnotacaoExpediente
     */
    public int getPkAnotacaoExpediente() {
        return pkAnotacaoExpediente;
    }

    /**
     * @param pkAnotacaoExpediente the pkAnotacaoExpediente to set
     */
    public void setPkAnotacaoExpediente(int pkAnotacaoExpediente) {
        this.pkAnotacaoExpediente = pkAnotacaoExpediente;
    }

    /**
     * @return the fkUsuario
     */
    public int getFkUsuario() {
        return fkUsuario;
    }

    /**
     * @param fkUsuario the fkUsuario to set
     */
    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    /**
     * @return the fkAssuntoExpediente
     */
    public int getFkAssuntoExpediente() {
        return fkAssuntoExpediente;
    }

    /**
     * @param fkAssuntoExpediente the fkAssuntoExpediente to set
     */
    public void setFkAssuntoExpediente(int fkAssuntoExpediente) {
        this.fkAssuntoExpediente = fkAssuntoExpediente;
    }

    /**
     * @return the fkTipoDespachoExpediente
     */
    public int getFkTipoDespachoExpediente() {
        return fkTipoDespachoExpediente;
    }

    /**
     * @param fkTipoDespachoExpediente the fkTipoDespachoExpediente to set
     */
    public void setFkTipoDespachoExpediente(int fkTipoDespachoExpediente) {
        this.fkTipoDespachoExpediente = fkTipoDespachoExpediente;
    }

    /**
     * @return the fkTipoExpediente
     */
    public int getFkTipoExpediente() {
        return fkTipoExpediente;
    }

    /**
     * @param fkTipoExpediente the fkTipoExpediente to set
     */
    public void setFkTipoExpediente(int fkTipoExpediente) {
        this.fkTipoExpediente = fkTipoExpediente;
    }

    /**
     * @return the cdExpediente
     */
    public String getCdExpediente() {
        return cdExpediente;
    }

    /**
     * @param cdExpediente the cdExpediente to set
     */
    public void setCdExpediente(String cdExpediente) {
        this.cdExpediente = cdExpediente;
    }

    /**
     * @return the cdCroqui
     */
    public String getCdCroqui() {
        return cdCroqui;
    }

    /**
     * @param cdCroqui the cdCroqui to set
     */
    public void setCdCroqui(String cdCroqui) {
        this.cdCroqui = cdCroqui;
    }

    /**
     * @return the cdArea
     */
    public String getCdArea() {
        return cdArea;
    }

    /**
     * @param cdArea the cdArea to set
     */
    public void setCdArea(String cdArea) {
        this.cdArea = cdArea;
    }

    /**
     * @return the nmInteressado
     */
    public String getNmInteressado() {
        return nmInteressado;
    }

    /**
     * @param nmInteressado the nmInteressado to set
     */
    public void setNmInteressado(String nmInteressado) {
        this.nmInteressado = nmInteressado;
    }

    /**
     * @return the dsLocal
     */
    public String getDsLocal() {
        return dsLocal;
    }

    /**
     * @param dsLocal the dsLocal to set
     */
    public void setDsLocal(String dsLocal) {
        this.dsLocal = dsLocal;
    }

    /**
     * @return the dtPublicacao
     */
    public String getDtPublicacao() {
        return dtPublicacao;
    }

    /**
     * @param dtPublicacao the dtPublicacao to set
     */
    public void setDtPublicacao(String dtPublicacao) {
        this.dtPublicacao = dtPublicacao;
    }

    /**
     * @return the dtTramitacao
     */
    public String getDtTramitacao() {
        return dtTramitacao;
    }

    /**
     * @param dtTramitacao the dtTramitacao to set
     */
    public void setDtTramitacao(String dtTramitacao) {
        this.dtTramitacao = dtTramitacao;
    }

    /**
     * @return the dsObservacao
     */
    public String getDsObservacao() {
        return dsObservacao;
    }

    /**
     * @param dsObservacao the dsObservacao to set
     */
    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    /**
     * @return the nmAutor
     */
    public String getNmAutor() {
        return nmAutor;
    }

    /**
     * @param nmAutor the nmAutor to set
     */
    public void setNmAutor(String nmAutor) {
        this.nmAutor = nmAutor;
    }

    /**
     * @return the dtData
     */
    public String getDtData() {
        return dtData;
    }

    /**
     * @param dtData the dtData to set
     */
    public void setDtData(String dtData) {
        this.dtData = dtData;
    }

    /**
     * @return the dthrAtualizacao
     */
    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    /**
     * @param dthrAtualizacao the dthrAtualizacao to set
     */
    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    /**
     * @return the nmLogin
     */
    public String getNmLogin() {
        return nmLogin;
    }

    /**
     * @param nmLogin the nmLogin to set
     */
    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }
}
