/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import java.sql.Date;


/**
 *
 * @author x369482
 */
public class AnotacaoCroqui {

//Atributos
    private int pkAnotacaoExpediente;
    private String cdExpediente, cdCroqui, cdArea, nmInteressado, dsLocal, dsObservacao, nmLogin, dthrAtualizacao;
    private Date dtPublicacao, dtTramitacao;
    private TipoAssunto tpAssunto;
    private TipoExpediente tpExpediente;
    private TipoDespacho tpDespacho;
    private Endereco endereco;
    private AnexoCroqui [] anexoCroqui ;
            

//Construtor    
    public AnotacaoCroqui(){
    }
    

   

    //Getter's & Setter's
    public int getPkAnotacaoExpediente() {
        return pkAnotacaoExpediente;
    }

    public void setPkAnotacaoExpediente(int pkAnotacaoExpediente) {
        this.pkAnotacaoExpediente = pkAnotacaoExpediente;
    }

    public String getCdExpediente() {
        return cdExpediente;
    }

    public void setCdExpediente(String cdExpediente) {
        this.cdExpediente = cdExpediente;
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

    public String getNmInteressado() {
        return nmInteressado;
    }

    public void setNmInteressado(String nmInteressado) {
        this.nmInteressado = nmInteressado;
    }

    public String getDsLocal() {
        return dsLocal;
    }

    public void setDsLocal(String dsLocal) {
        this.dsLocal = dsLocal;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public Date getDtPublicacao() {
        return dtPublicacao;
    }

    public void setDtPublicacao(Date dtPublicacao) {
        this.dtPublicacao = dtPublicacao;
    }

    public Date getDtTramitacao() {
        return dtTramitacao;
    }

    public void setDtTramitacao(Date dtTramitacao) {
        this.dtTramitacao = dtTramitacao;
    }

    public TipoAssunto getTpAssunto() {
        return tpAssunto;
    }

    public void setTpAssunto(TipoAssunto tpAssunto) {
        this.tpAssunto = tpAssunto;
    }

    public TipoExpediente getTpExpediente() {
        return tpExpediente;
    }

    public void setTpExpediente(TipoExpediente tpExpediente) {
        this.tpExpediente = tpExpediente;
    }

    public TipoDespacho getTpDespacho() {
        return tpDespacho;
    }

    public void setTpDespacho(TipoDespacho tpDespacho) {
        this.tpDespacho = tpDespacho;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public AnexoCroqui[] getAnexoCroqui() {
        return anexoCroqui;
    }

    public void setAnexoCroqui(AnexoCroqui[] anexoCroqui) {
        this.anexoCroqui = anexoCroqui;
    }
   
}
