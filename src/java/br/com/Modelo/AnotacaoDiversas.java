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
public class AnotacaoDiversas {

//Atributos
    private int pkAnotacaoExpediente, fkLogradouro, nrVerExpediente, nrVerArquivo;
    private String nmTipoExpediente, cdArea, cdExpediente, nmInteressado, dsAssunto, dsDespacho, dsObservacao, nmAutor,  
            cdSetor, cdQuadra, cdLote, cdProcesso, cdTid, dtAnotacao, dsInformacaoGeral, nrInformacaoDgpi, nmReferenciaEndereco, nmTipoProcesso, nrAnotacao, 
            nrInformacao,  nrEndereco, nmComplementoEndereco, nmLogin, dthrAtualizacao;
    private Date dtPublicacao, dtData;
    
//Construtor    
    public AnotacaoDiversas() {
    }

    
    
 
//Getter's & Setter's     

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

    public String getNmTipoExpediente() {
        return nmTipoExpediente;
    }

    public void setNmTipoExpediente(String nmTipoExpediente) {
        this.nmTipoExpediente = nmTipoExpediente;
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

    public String getDsInformacaoGeral() {
        return dsInformacaoGeral;
    }

    public void setDsInformacaoGeral(String dsInformacaoGeral) {
        this.dsInformacaoGeral = dsInformacaoGeral;
    }

    public String getNrInformacaoDgpi() {
        return nrInformacaoDgpi;
    }

    public void setNrInformacaoDgpi(String nrInformacaoDgpi) {
        this.nrInformacaoDgpi = nrInformacaoDgpi;
    }

    public String getNmReferenciaEndereco() {
        return nmReferenciaEndereco;
    }

    public void setNmReferenciaEndereco(String nmReferenciaEndereco) {
        this.nmReferenciaEndereco = nmReferenciaEndereco;
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

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public Date getDtPublicacao() {
        return dtPublicacao;
    }

    public void setDtPublicacao(Date dtPublicacao) {
        this.dtPublicacao = dtPublicacao;
    }

    public Date getDtData() {
        return dtData;
    }

    public void setDtData(Date dtData) {
        this.dtData = dtData;
    }

    
    
    
    
    
    

}
