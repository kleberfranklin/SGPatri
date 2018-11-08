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
public class CatAutoCessao {
    
    private int pkCatAutoCessao;
    private String sgCatAutoCessao, nmCatAutoCessao, nmLogin, dthrAtualizacao;
    
    
//Construtores
    public CatAutoCessao(){
    }

    public CatAutoCessao(String sgCatAutoCessao, String nmCatAutoCessao, String nmLogin) {
        this.sgCatAutoCessao = sgCatAutoCessao;
        this.nmCatAutoCessao = nmCatAutoCessao;
        this.nmLogin = nmLogin;
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public CatAutoCessao(int pkCatAutoCessao, String sgCatAutoCessao, String nmCatAutoCessao, String nmLogin) {
        this (sgCatAutoCessao, nmCatAutoCessao, nmLogin);
        this.pkCatAutoCessao = pkCatAutoCessao;
        
    }
  
    
//Getters e Setters    

    public int getPkCatAutoCessao() {
        return pkCatAutoCessao;
    }

    public void setPkCatAutoCessao(int pkCatAutoCessao) {
        this.pkCatAutoCessao = pkCatAutoCessao;
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
