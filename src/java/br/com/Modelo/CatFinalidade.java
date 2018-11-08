/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

/**
 *
 * @author d732229
 */
public class CatFinalidade {
    private int pkCatFinalidade;
    private String sgCatFinalidade, nmCatFinalidade, nmLogin, dthrAtualizacao;

    public CatFinalidade() {
    }

    public CatFinalidade(String sgCatFinalidade, String nmCatFinalidade, String nmLogin) {
        this.sgCatFinalidade = sgCatFinalidade;
        this.nmCatFinalidade = nmCatFinalidade;
        this.nmLogin = nmLogin;
    }

    public CatFinalidade(int pkCatFinalidade, String sgCatFinalidade, String nmCatFinalidade, String nmLogin) {
        this(sgCatFinalidade, nmCatFinalidade, nmLogin);
        this.pkCatFinalidade = pkCatFinalidade;
    }
    
    
    

    public int getPkCatFinalidade() {
        return pkCatFinalidade;
    }

    public void setPkCatFinalidade(int pkCatFinalidade) {
        this.pkCatFinalidade = pkCatFinalidade;
    }

    public String getSgCatFinalidade() {
        return sgCatFinalidade;
    }

    public void setSgCatFinalidade(String sgCatFinalidade) {
        this.sgCatFinalidade = sgCatFinalidade;
    }

    public String getNmCatFinalidade() {
        return nmCatFinalidade;
    }

    public void setNmCatFinalidade(String nmCatFinalidade) {
        this.nmCatFinalidade = nmCatFinalidade;
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
