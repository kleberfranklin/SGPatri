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
public class Cargo {
    
//Atribudos

    private int pkCargo; 
    private String nmCargo, dsCargo, nmLogin, dthrAtualizacao;


//Construtores    

    public Cargo() {
    }

    public Cargo(int pkCargo) {
        this.pkCargo = pkCargo;
    }

    public Cargo(String nmCargo, String dsCargo, String nmLogin, String dthrAtualizacao) {
        this.nmCargo = nmCargo;
        this.dsCargo = dsCargo;
        this.nmLogin = nmLogin;
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public Cargo(int pkCargo, String nmCargo, String dsCargo, String nmLogin, String dthrAtualizacao) {
        this(nmCargo,dsCargo,nmLogin,dthrAtualizacao);
        this.pkCargo = pkCargo;
    }
    
//Gettes e Setters
    
    public int getPkCargo() {
        return pkCargo;
    }

    public void setPkCargo(int pkCargo) {
        this.pkCargo = pkCargo;
    }

    public String getNmCargo() {
        return nmCargo;
    }

    public void setNmCargo(String nmCargo) {
        this.nmCargo = nmCargo;
    }

    public String getDsCargo() {
        return dsCargo;
    }

    public void setDsCargo(String dsCargo) {
        this.dsCargo = dsCargo;
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
