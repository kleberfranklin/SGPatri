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
public class CatContrapartida {
    private int pkCatContrapartida;
    private String sgCatContrapartida, nmCatContrapartida,  nmLogin,  dthrAtualizacao;

    public CatContrapartida() {
    }

    
    public CatContrapartida(String sgCatContrapartida, String nmCatContrapartida, String nmLogin) {
        this.sgCatContrapartida = sgCatContrapartida;
        this.nmCatContrapartida = nmCatContrapartida;
        this.nmLogin = nmLogin;
    }

    public CatContrapartida(int pkCatContrapartida, String sgCatContrapartida, String nmCatContrapartida, String nmLogin) {
        this(sgCatContrapartida, nmCatContrapartida, nmLogin);
        this.pkCatContrapartida = pkCatContrapartida;
    }
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    public int getPkCatContrapartida() {
        return pkCatContrapartida;
    }

    public void setPkCatContrapartida(int pkCatContrapartida) {
        this.pkCatContrapartida = pkCatContrapartida;
    }

    public String getSgCatContrapartida() {
        return sgCatContrapartida;
    }

    public void setSgCatContrapartida(String sgCatContrapartida) {
        this.sgCatContrapartida = sgCatContrapartida;
    }

    public String getNmCatContrapartida() {
        return nmCatContrapartida;
    }

    public void setNmCatContrapartida(String nmCatContrapartida) {
        this.nmCatContrapartida = nmCatContrapartida;
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
