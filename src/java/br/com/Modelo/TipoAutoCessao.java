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
public class TipoAutoCessao {
    
    private int pkTipoAutoCessao, fkCatAutoCessao;
    private String  sgCatAutoCessao, nmCatAutoCessao, nmTipoAutoCessao,  nmLogin,  dthrAtualizacao;

    public TipoAutoCessao() {
    }

    public TipoAutoCessao(int fkCatAutoCessao, String nmTipoAutoCessao, String nmLogin) {
        this.fkCatAutoCessao = fkCatAutoCessao;
        this.nmTipoAutoCessao = nmTipoAutoCessao;
        this.nmLogin = nmLogin;
    }

    public TipoAutoCessao(int pkTipoAutoCessao, int fkCatAutoCessao, String nmTipoAutoCessao, String nmLogin) {
        this(fkCatAutoCessao, nmTipoAutoCessao,nmLogin);
        this.pkTipoAutoCessao = pkTipoAutoCessao;
    }

    
    
    
    
    
    
    

    public int getPkTipoAutoCessao() {
        return pkTipoAutoCessao;
    }

    public void setPkTipoAutoCessao(int pkTipoAutoCessao) {
        this.pkTipoAutoCessao = pkTipoAutoCessao;
    }

    public int getFkCatAutoCessao() {
        return fkCatAutoCessao;
    }

    public void setFkCatAutoCessao(int fkCatAutoCessao) {
        this.fkCatAutoCessao = fkCatAutoCessao;
    }

    public String getSgCatAutoCessao() {
        return sgCatAutoCessao;
    }

    public void setSgCatAutoCessao(String sgCatAutoCessao) {
        this.sgCatAutoCessao = sgCatAutoCessao;
    }

    public String getNmCatAutoCessao() {
        return nmCatAutoCessao;
    }

    public void setNmCatAutoCessao(String nmCatAutoCessao) {
        this.nmCatAutoCessao = nmCatAutoCessao;
    }
    
    public String getNmTipoAutoCessao() {
        return nmTipoAutoCessao;
    }

    public void setNmTipoAutoCessao(String nmTipoAutoCessao) {
        this.nmTipoAutoCessao = nmTipoAutoCessao;
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
