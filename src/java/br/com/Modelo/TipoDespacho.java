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
public class TipoDespacho {

    private int pkTipoDespacho;
    private String sgTipoDespacho, nmTipoDespacho, nmLogin, dthrAtualizacao;

    public TipoDespacho() {
    }

    public TipoDespacho(String sgTipoDespacho, String nmTipoDespacho, String nmLogin) {
        this.sgTipoDespacho = sgTipoDespacho;
        this.nmTipoDespacho = nmTipoDespacho;
        this.nmLogin = nmLogin;
    }

    public TipoDespacho(int pkTipoDespacho, String sgTipoDespacho, String nmTipoDespacho, String nmLogin) {
        this(sgTipoDespacho, nmTipoDespacho, nmLogin);
        this.pkTipoDespacho = pkTipoDespacho;
    }

    public int getPkTipoDespacho() {
        return pkTipoDespacho;
    }

    public void setPkTipoDespacho(int pkTipoDespacho) {
        this.pkTipoDespacho = pkTipoDespacho;
    }

    public String getSgTipoDespacho() {
        return sgTipoDespacho;
    }

    public void setSgTipoDespacho(String sgTipoDespacho) {
        this.sgTipoDespacho = sgTipoDespacho;
    }

    public String getNmTipoDespacho() {
        return nmTipoDespacho;
    }

    public void setNmTipoDespacho(String nmTipoDespacho) {
        this.nmTipoDespacho = nmTipoDespacho;
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
