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
    
    private int pkNiveladm; 
    private String sgAdm,  nnAdm, nmLogin, dthrAtualizacao;
    



    //Getteres e Setteres
    public int getPkNiveladm() {
        return pkNiveladm;
    }

    public void setPkNiveladm(int pkNiveladm) {
        this.pkNiveladm = pkNiveladm;
    }

    public String getSgAdm() {
        return sgAdm;
    }

    public void setSgAdm(String sgAdm) {
        this.sgAdm = sgAdm;
    }

    public String getNnAdm() {
        return nnAdm;
    }

    public void setNnAdm(String nnAdm) {
        this.nnAdm = nnAdm;
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
