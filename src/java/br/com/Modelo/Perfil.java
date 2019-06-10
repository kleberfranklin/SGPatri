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
public class Perfil {
    
//Atributo
private int pkPerfil, nrLer, nrInserir, nrEditar, nrExcluir, nrGerenciar;

    
private String nmPerfil, dsPerfil, nmLogin, dthrAtualizacao;

//Construtor

    public Perfil() {
    }

    public Perfil(int nrLer, int nrInserir, int nrEditar, int nrExcluir, int nrGerenciar, String nmPerfil, String dsPerfil, String nmLogin) {
        this.nrLer = nrLer;
        this.nrInserir = nrInserir;
        this.nrEditar = nrEditar;
        this.nrExcluir = nrExcluir;
        this.nrGerenciar = nrGerenciar;
        this.nmPerfil = nmPerfil;
        this.dsPerfil = dsPerfil;
        this.nmLogin = nmLogin;
    }

    public Perfil(int pkPerfil, int nrLer, int nrInserir, int nrEditar, int nrExcluir, int nrGerenciar, String nmPerfil, String dsPerfil, String nmLogin) {
        this(nrLer, nrInserir, nrEditar, nrExcluir, nrGerenciar, nmPerfil, dsPerfil, nmLogin) ;
        this.pkPerfil = pkPerfil;
    }

//Getters e Setters    

    public int getPkPerfil() {
        return pkPerfil;
    }

    public void setPkPerfil(int pkPerfil) {
        this.pkPerfil = pkPerfil;
    }

    public int getNrLer() {
        return nrLer;
    }

    public void setNrLer(int nrLer) {
        this.nrLer = nrLer;
    }

    public int getNrInserir() {
        return nrInserir;
    }

    public void setNrInserir(int nrInserir) {
        this.nrInserir = nrInserir;
    }

    public int getNrEditar() {
        return nrEditar;
    }

    public void setNrEditar(int nrEditar) {
        this.nrEditar = nrEditar;
    }

    public int getNrExcluir() {
        return nrExcluir;
    }

    public void setNrExcluir(int nrExcluir) {
        this.nrExcluir = nrExcluir;
    }

    public int getNrGerenciar() {
        return nrGerenciar;
    }

    public void setNrGerenciar(int nrGerenciar) {
        this.nrGerenciar = nrGerenciar;
    }
    
    public String getNmPerfil() {
        return nmPerfil;
    }

    public void setNmPerfil(String nmPerfil) {
        this.nmPerfil = nmPerfil;
    }

    public String getDsPerfil() {
        return dsPerfil;
    }

    public void setDsPerfil(String dsPerfil) {
        this.dsPerfil = dsPerfil;
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
