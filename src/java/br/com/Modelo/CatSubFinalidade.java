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
public class CatSubFinalidade {
    
      
    private int pkCatSubFinalidade, fkCatFinalidade;
    private String sgCatFinalidade, nmCatFinalidade, sgCatSubFinalidade, nmCatSubFinalidade, nmLogin ,dthrAtualizacao;

    
    public CatSubFinalidade() {
    }

    public CatSubFinalidade(int fkCatFinalidade, String sgCatSubFinalidade, String nmCatSubFinalidade, String nmLogin) {
        this.fkCatFinalidade = fkCatFinalidade;
        this.sgCatSubFinalidade = sgCatSubFinalidade;
        this.nmCatSubFinalidade = nmCatSubFinalidade;
        this.nmLogin = nmLogin;
    }

    public CatSubFinalidade(int pkCatSubFinalidade, int fkCatFinalidade, String sgCatSubFinalidade, String nmCatSubFinalidade, String nmLogin) {
        this(fkCatFinalidade, sgCatSubFinalidade, nmCatSubFinalidade, nmLogin);
        this.pkCatSubFinalidade = pkCatSubFinalidade;
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
    
    public int getPkCatSubFinalidade() {
        return pkCatSubFinalidade;
    }

    public void setPkCatSubFinalidade(int pkCatSubFinalidade) {
        this.pkCatSubFinalidade = pkCatSubFinalidade;
    }

    public int getFkCatFinalidade() {
        return fkCatFinalidade;
    }

    public void setFkCatFinalidade(int fkCatFinalidade) {
        this.fkCatFinalidade = fkCatFinalidade;
    }

    public String getSgCatSubFinalidade() {
        return sgCatSubFinalidade;
    }

    public void setSgCatSubFinalidade(String sgCatSubFinalidade) {
        this.sgCatSubFinalidade = sgCatSubFinalidade;
    }

    public String getNmCatSubFinalidade() {
        return nmCatSubFinalidade;
    }

    public void setNmCatSubFinalidade(String nmCatSubFinalidade) {
        this.nmCatSubFinalidade = nmCatSubFinalidade;
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
