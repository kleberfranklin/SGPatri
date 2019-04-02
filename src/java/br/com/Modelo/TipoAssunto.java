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
public class TipoAssunto {

    private int pkTipoAssunto;
    private String sgTipoAssunto, nmTipoAssunto, nmLogin, dthrAtualizacao;

    public TipoAssunto() {
    }

    public TipoAssunto(String sgTipoAssunto, String nmTipoAssunto, String nmLogin) {
        this.sgTipoAssunto = sgTipoAssunto;
        this.nmTipoAssunto = nmTipoAssunto;
        this.nmLogin = nmLogin;
    }

    public TipoAssunto(int pkTipoAssunto, String sgTipoAssunto, String nmTipoAssunto, String nmLogin) {
        this(sgTipoAssunto, nmTipoAssunto, nmLogin);
        this.pkTipoAssunto = pkTipoAssunto;
    }

    public int getPkTipoAssunto() {
        return pkTipoAssunto;
    }

    public void setPkTipoAssunto(int pkTipoAssunto) {
        this.pkTipoAssunto = pkTipoAssunto;
    }

    public String getSgTipoAssunto() {
        return sgTipoAssunto;
    }

    public void setSgTipoAssunto(String sgTipoAssunto) {
        this.sgTipoAssunto = sgTipoAssunto;
    }

    public String getNmTipoAssunto() {
        return nmTipoAssunto;
    }

    public void setNmTipoAssunto(String nmTipoAssunto) {
        this.nmTipoAssunto = nmTipoAssunto;
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
