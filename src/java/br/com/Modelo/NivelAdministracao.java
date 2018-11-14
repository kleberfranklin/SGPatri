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
public class NivelAdministracao {
    //Atributos
    
    private int pkAdm; 
    private String sgAdm,  nmAdm, nmLogin, dthrAtualizacao;
    

    public int getPkAdm() {
        return pkAdm;
    }
    public void setPkAdm(int pkAdm) {   
        this.pkAdm = pkAdm;
    }

    public String getSgAdm() {
        return sgAdm;
    }

    public void setSgAdm(String sgAdm) {
        this.sgAdm = sgAdm;
    }

    public String getNmAdm() {
        return nmAdm;
    }

    public void setNmAdm(String nmAdm) {
        this.nmAdm = nmAdm;
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
