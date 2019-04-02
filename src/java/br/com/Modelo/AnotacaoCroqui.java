/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import java.util.Date;

/**
 *
 * @author x369482
 */
public class AnotacaoCroqui {

//Atributos
    private int pkAnotacaoExpediente, fkLogradouro, nrVerExpediente, nrVerArquivo;
    private String nmTipoExpediente, cdCroqui, cdArea, cdExpediente, nmInteressado, dsAssunto, dsDespacho, dsObservacao, nmAutor,  
            cdProcesso, cdTid, dtAnotacao, nrInformacaoDgpi, nmReferenciaEndereco, nmTipoProcesso, nrAnotacao, 
            nrInformacao,  nrEndereco, nmComplementoEndereco, nmLogin, dthrAtualizacao;
    private Date dtPublicacao, dtData;
    

    public AnotacaoCroqui() {
    }

    public AnotacaoCroqui(int fkLogradouro, String nmTipoExpediente, String cdCroqui, String cdArea, String cdExpediente, 
            String nmInteressado, String dsAssunto, String dsDespacho, String dsObservacao, String nmAutor, String cdProcesso, 
            String cdTid, String dtAnotacao, String nrInformacaoDgpi, Date dtPublicacao, String nmReferenciaEndereco, 
            Date dtData, String nmTipoProcesso, String nrAnotacao, String nrInformacao, String nrEndereco, 
            String nmComplementoEndereco, String nmLogin, int verCroqui) {
        this.fkLogradouro = fkLogradouro;
        this.nmTipoExpediente = nmTipoExpediente;
        this.cdCroqui = cdCroqui;
        this.cdArea = cdArea;
        this.cdExpediente = cdExpediente;
        this.nmInteressado = nmInteressado;
        this.dsAssunto = dsAssunto;
        this.dsDespacho = dsDespacho;
        this.dsObservacao = dsObservacao;
        this.nmAutor = nmAutor;
        this.cdProcesso = cdProcesso;
        this.cdTid = cdTid;
        this.dtAnotacao = dtAnotacao;
        this.nrInformacaoDgpi = nrInformacaoDgpi;
        this.dtPublicacao = dtPublicacao;
        this.nmReferenciaEndereco = nmReferenciaEndereco;
        this.dtData = dtData;
        this.nmTipoProcesso = nmTipoProcesso;
        this.nrAnotacao = nrAnotacao;
        this.nrInformacao = nrInformacao;
        this.nrEndereco = nrEndereco;
        this.nmComplementoEndereco = nmComplementoEndereco;
        this.nmLogin = nmLogin;
        this.nrVerExpediente = verCroqui;
    }

    public AnotacaoCroqui(int pkAnotacaoExpediente, int fkLogradouro, String nmTipoExpediente, String cdCroqui, String cdArea, String cdExpediente,
            String nmInteressado, String dsAssunto, String dsDespacho, String dsObservacao, String nmAutor, String cdProcesso, 
            String cdTid, String dtAnotacao, String nrInformacaoDgpi, Date dtPublicacao, String nmReferenciaEndereco, 
            Date dtData, String nmTipoProcesso, String nrAnotacao, String nrInformacao, String nrEndereco, String nmComplementoEndereco, 
            String nmLogin, int verCroqui) {
        this.pkAnotacaoExpediente = pkAnotacaoExpediente;
        this.fkLogradouro = fkLogradouro;
        this.nmTipoExpediente = nmTipoExpediente;
        this.cdCroqui = cdCroqui;
        this.cdArea = cdArea;
        this.cdExpediente = cdExpediente;
        this.nmInteressado = nmInteressado;
        this.dsAssunto = dsAssunto;
        this.dsDespacho = dsDespacho;
        this.dsObservacao = dsObservacao;
        this.nmAutor = nmAutor;
        this.cdProcesso = cdProcesso;
        this.cdTid = cdTid;
        this.dtAnotacao = dtAnotacao;
        this.nrInformacaoDgpi = nrInformacaoDgpi;
        this.dtPublicacao = dtPublicacao;
        this.nmReferenciaEndereco = nmReferenciaEndereco;
        this.dtData = dtData;
        this.nmTipoProcesso = nmTipoProcesso;
        this.nrAnotacao = nrAnotacao;
        this.nrInformacao = nrInformacao;
        this.nrEndereco = nrEndereco;
        this.nmComplementoEndereco = nmComplementoEndereco;
        this.nmLogin = nmLogin;
        this.nrVerExpediente = verCroqui;
    }
    
    
    
 
//Getter's & Setter's     

    public String getNmTipoExpediente() {
        return nmTipoExpediente;
    }

    public void setNmTipoExpediente(String nmTipoExpediente) {
        this.nmTipoExpediente = nmTipoExpediente;
    }

    public int getPkAnotacaoExpediente() {
        return pkAnotacaoExpediente;
    }

    public void setPkAnotacaoExpediente(int pkAnotacaoExpediente) {
        this.pkAnotacaoExpediente = pkAnotacaoExpediente;
    }

    public int getFkLogradouro() {
        return fkLogradouro;
    }

    public void setFkLogradouro(int fkLogradouro) {
        this.fkLogradouro = fkLogradouro;
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

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
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

    public String getDtAnotacao() {
        return dtAnotacao;
    }

    public void setDtAnotacao(String dtAnotacao) {
        this.dtAnotacao = dtAnotacao;
    }

    public String getNrInformacaoDgpi() {
        return nrInformacaoDgpi;
    }

    public void setNrInformacaoDgpi(String nrInformacaoDgpi) {
        this.nrInformacaoDgpi = nrInformacaoDgpi;
    }

    public Date getDtPublicacao() {
        return dtPublicacao;
    }

    public void setDtPublicacao(Date dtPublicacao) {
        this.dtPublicacao = dtPublicacao;
    }

    public String getNmReferenciaEndereco() {
        return nmReferenciaEndereco;
    }

    public void setNmReferenciaEndereco(String nmReferenciaEndereco) {
        this.nmReferenciaEndereco = nmReferenciaEndereco;
    }

    public Date getDtData() {
        return dtData;
    }

    public void setDtData(Date dtData) {
        this.dtData = dtData;
    }

    public String getNmTipoProcesso() {
        return nmTipoProcesso;
    }

    public void setNmTipoProcesso(String nmTipoProcesso) {
        this.nmTipoProcesso = nmTipoProcesso;
    }

    public String getNrAnotacao() {
        return nrAnotacao;
    }

    public void setNrAnotacao(String nrAnotacao) {
        this.nrAnotacao = nrAnotacao;
    }

    public String getNrInformacao() {
        return nrInformacao;
    }

    public void setNrInformacao(String nrInformacao) {
        this.nrInformacao = nrInformacao;
    }

    public String getNrEndereco() {
        return nrEndereco;
    }

    public void setNrEndereco(String nrEndereco) {
        this.nrEndereco = nrEndereco;
    }

    public String getNmComplementoEndereco() {
        return nmComplementoEndereco;
    }

    public void setNmComplementoEndereco(String nmComplementoEndereco) {
        this.nmComplementoEndereco = nmComplementoEndereco;
    }


    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public int getNrVerExpediente() {
        return nrVerExpediente;
    }    

    public void setNrVerExpediente(int nrVerExpediente) {
        this.nrVerExpediente = nrVerExpediente;
    }

    public int getNrVerArquivo() {
        return nrVerArquivo;
    }

    public void setNrVerArquivo(int nrVerArquivo) {
        this.nrVerArquivo = nrVerArquivo;
    }
    
    
    
    
    

}
