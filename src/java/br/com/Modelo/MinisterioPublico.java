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
public class MinisterioPublico {

    private int pkMinisterioPublico, fkTpExpediente;
    private String nmOrigem, cdOficioEntrada, cdProcesso, cdProcessoIni, nmTipoProcesso, nmInteressado, nmSolicitado, dsAssunto, dsEndereco, nrInfoDgpi,
            cdOficioResposta, nrProcedimento, dsObservacao, nmLogin, dthrAtualizacao;
    private Date dtResposta, dtEntrada;

    public MinisterioPublico(int pkMinisterioPublico, String nmOrigem, Date dtEntrada, String cdOficioEntrada, String cdProcessoIni, String cdProcesso, String nmInteressado, String nmSolicitado, String dsAssunto, String dsEndereco, String nrInfoDgpi, String cdOficioResposta, Date dtResposta, String nrProcedimento, String dsObservacao, String nmLogin, String dthrAtualizacao) {
        this.pkMinisterioPublico = pkMinisterioPublico;
        this.nmOrigem = nmOrigem;
        this.dtEntrada = dtEntrada;
        this.cdOficioEntrada = cdOficioEntrada;
        this.cdProcessoIni = cdProcessoIni;
        this.cdProcesso = cdProcesso;
        this.nmSolicitado = nmSolicitado;
        this.nmInteressado = nmInteressado;
        this.dsAssunto = dsAssunto;
        this.dsEndereco = dsEndereco;
        this.nrInfoDgpi = nrInfoDgpi;
        this.dtResposta = dtResposta;
        this.cdOficioResposta = cdOficioResposta;
        this.nrProcedimento = nrProcedimento;
        this.dsObservacao = dsObservacao;
        this.nmLogin = nmLogin;
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public MinisterioPublico() {
    }

    /**
     * @return the pkMinisterioPublico
     */
    public int getPkMinisterioPublico() {
        return pkMinisterioPublico;
    }

    /**
     * @param pkMinisterioPublico the pkMinisterioPublico to set
     */
    public void setPkMinisterioPublico(int pkMinisterioPublico) {
        this.pkMinisterioPublico = pkMinisterioPublico;
    }

    /**
     * @return the pkTpExpediente
     */
    public int getFkTpExpediente() {
        return fkTpExpediente;
    }

    /**
     * @param fkTpExpediente the fkTpExpediente to set
     */
    public void setFkTpExpediente(int fkTpExpediente) {
        this.fkTpExpediente = fkTpExpediente;
    }

    /**
     * @return the nmOrigem
     */
    public String getNmOrigem() {
        return nmOrigem;
    }

    /**
     * @param nmOrigem the nmOrigem to set
     */
    public void setNmOrigem(String nmOrigem) {
        this.nmOrigem = nmOrigem;
    }

    /**
     * @return the dtEntrada
     */
    public Date getDtEntrada() {
        return dtEntrada;
    }

    /**
     * @param dtEntrada the dtEntrada to set
     */
    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    /**
     * @return the cdOficioEntrada
     */
    public String getCdOficioEntrada() {
        return cdOficioEntrada;
    }

    /**
     * @param cdOficioEntrada the cdOficioEntrada to set
     */
    public void setCdOficioEntrada(String cdOficioEntrada) {
        this.cdOficioEntrada = cdOficioEntrada;
    }

    /**
     * @return the cdProcesso
     */
    public String getCdProcesso() {
        return cdProcesso;
    }

    /**
     * @param cdProcesso the cdProcesso to set
     */
    public void setCdProcesso(String cdProcesso) {
        this.cdProcesso = cdProcesso;
    }

    /**
     * @return the nmTipoProcesso
     */
    public String getNmTipoProcesso() {
        return nmTipoProcesso;
    }

    /**
     * @param nmTipoProcesso the nmTipoProcesso to set
     */
    public void setNmTipoProcesso(String nmTipoProcesso) {
        this.nmTipoProcesso = nmTipoProcesso;
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
     * @return the dsAssunto
     */
    public String getDsAssunto() {
        return dsAssunto;
    }

    /**
     * @param dsAssunto the dsAssunto to set
     */
    public void setDsAssunto(String dsAssunto) {
        this.dsAssunto = dsAssunto;
    }

    /**
     * @return the dsEndereco
     */
    public String getDsEndereco() {
        return dsEndereco;
    }

    /**
     * @param dsEndereco the dsEndereco to set
     */
    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    /**
     * @return the nrInfoDgpi
     */
    public String getNrInfoDgpi() {
        return nrInfoDgpi;
    }

    /**
     * @param nrInfoDgpi the nrInfoDgpi to set
     */
    public void setNrInfoDgpi(String nrInfoDgpi) {
        this.nrInfoDgpi = nrInfoDgpi;
    }

    /**
     * @return the nrProcedimento
     */
    public String getNrProcedimento() {
        return nrProcedimento;
    }

    /**
     * @param nrProcedimento the nrProcedimento to set
     */
    public void setNrProcedimento(String nrProcedimento) {
        this.nrProcedimento = nrProcedimento;
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
     * @return the cdProcessoIni
     */
    public String getCdProcessoIni() {
        return cdProcessoIni;
    }

    /**
     * @param cdProcessoIni the cdProcessoIni to set
     */
    public void setCdProcessoIni(String cdProcessoIni) {
        this.cdProcessoIni = cdProcessoIni;
    }

    /**
     * @return the nmSolicitado
     */
    public String getNmSolicitado() {
        return nmSolicitado;
    }

    /**
     * @param nmSolicitado the nmSolicitado to set
     */
    public void setNmSolicitado(String nmSolicitado) {
        this.nmSolicitado = nmSolicitado;
    }

    /**
     * @return the cdOficioResposta
     */
    public String getCdOficioResposta() {
        return cdOficioResposta;
    }

    /**
     * @param cdOficioResposta the cdOficioResposta to set
     */
    public void setCdOficioResposta(String cdOficioResposta) {
        this.cdOficioResposta = cdOficioResposta;
    }

    public Date getDtResposta() {
        return dtResposta;
    }

    public void setDtResposta(Date dtResposta) {
        this.dtResposta = dtResposta;
    }

}
