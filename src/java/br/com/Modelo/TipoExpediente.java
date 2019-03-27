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
public class TipoExpediente {

    private int pkTipoExpediente;
    private String sgTipoExpediente, nmTipoExpediente, nmLogin, dthrAtualizacao;

    public TipoExpediente() {
    }

    public TipoExpediente(String sgTipoExpediente, String nmTipoExpediente, String nmLogin) {
        this.sgTipoExpediente = sgTipoExpediente;
        this.nmTipoExpediente = nmTipoExpediente;
        this.nmLogin = nmLogin;
    }

    public TipoExpediente(int pkTipoExpediente, String sgTipoExpediente, String nmTipoExpediente, String nmLogin) {
        this(sgTipoExpediente, nmTipoExpediente, nmLogin);
        this.pkTipoExpediente = pkTipoExpediente;
    }

    public int getPkTipoExpediente() {
        return pkTipoExpediente;
    }

    public void setPkTipoExpediente(int pkTipoExpediente) {
        this.pkTipoExpediente = pkTipoExpediente;
    }

    public String getSgTipoExpediente() {
        return sgTipoExpediente;
    }

    public void setSgTipoExpediente(String sgTipoExpediente) {
        this.sgTipoExpediente = sgTipoExpediente;
    }

    public String getNmTipoExpediente() {
        return nmTipoExpediente;
    }

    public void setNmTipoExpediente(String nmTipoExpediente) {
        this.nmTipoExpediente = nmTipoExpediente;
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

}
