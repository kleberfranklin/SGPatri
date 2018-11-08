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
public class Divisao {


//Atributos    
  private int  pkDivisao;
  private String sgDivisao, nmDivisao, nmNrSimproc,nmNrSei, nmLogin, dthrAtualizacao;

//Construtores
    public Divisao() {
    }

    public Divisao(int pkDivisao) {
        this.pkDivisao = pkDivisao;
    }
    
    
    public Divisao(String sgDivisao, String nmDivisao, String nmNrSimproc, String nmNrSei, String nmLogin) {
        this.sgDivisao = sgDivisao;
        this.nmDivisao = nmDivisao;
        this.nmNrSimproc = nmNrSimproc;
        this.nmNrSei = nmNrSei;
        this.nmLogin = nmLogin;
    }

    public Divisao(int pkDivisao, String sgDivisao, String nmDivisao, String nmNrSimproc, String nmNrSei, String nmLogin) {
        this(sgDivisao, nmDivisao, nmNrSimproc, nmNrSei, nmLogin);
        this.pkDivisao = pkDivisao;
    }

//Getters e Setters    
    
    public int getPkDivisao() {
        return pkDivisao;
    }

    public void setPkDivisao(int pkDivisao) {
        this.pkDivisao = pkDivisao;
    }

    public String getSgDivisao() {
        return sgDivisao;
    }

    public void setSgDivisao(String sgDivisao) {
        this.sgDivisao = sgDivisao;
    }

    public String getNmDivisao() {
        return nmDivisao;
    }

    public void setNmDivisao(String nmDivisao) {
        this.nmDivisao = nmDivisao;
    }
    
    public String getnmNrSei(){
        return nmNrSei; 
    }
     
    public void setNmNrSei (String nmNrSei){
        this.nmNrSei = nmNrSei;
    }    

    public String getNmNrSimproc() {
        return nmNrSimproc;
    }

    public void setNmNrSimproc(String nmNrSimproc) {
        this.nmNrSimproc = nmNrSimproc;
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
