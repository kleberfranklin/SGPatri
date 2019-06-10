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
public class Setor {

//Atributoss    
    private int pkSetor, fkDivisao;
    private String sgDivisao, nmDivisao, sgSetor, nmSetor, nmNrSimprocSetor, nmNrSei, nmLogin, dthrAtualiza;

    
//Construtor    
    public Setor() {
    }
    
    public Setor(int fkDivisao, String sgSetor, String nmSetor, String nmNrSimprocSetor, String nmNrSei, String nmLogin) {
        this.fkDivisao = fkDivisao;
        this.sgSetor = sgSetor;
        this.nmSetor = nmSetor;
        this.nmNrSimprocSetor = nmNrSimprocSetor;
        this.nmNrSei = nmNrSei;
        this.nmLogin = nmLogin;
    }

    public Setor(int pkSetor, int fkDivisao, String sgSetor, String nmSetor, String nmNrSimprocSetor, String nmNrSei, String nmLogin) {
        this(fkDivisao, sgSetor, nmSetor, nmNrSimprocSetor, nmNrSei, nmLogin);
        this.pkSetor = pkSetor;
    }



//Getters e Setters
    public int getPkSetor() {
        return pkSetor;
    }

    public void setPkSetor(int pkSetor) {
        this.pkSetor = pkSetor;
    }

    public int getFkDivisao() {
        return fkDivisao;
    }

    public void setFkDivisao(int fkDivisao) {
        this.fkDivisao = fkDivisao;
    }

    public String getSgDivisao(){
         return sgDivisao;   
    }
    
    public void setSgDivisao(String sgDivisao){
        this.sgDivisao = sgDivisao;
    }
            
    public String getNmDivisao(){
        return nmDivisao;
    }
    
    public void setNmDivisao(String nmDivisao){
        this.nmDivisao = nmDivisao;
    }
    
    public String getSgSetor() {
        return sgSetor;
    }

    public void setSgSetor(String sgSetor) {
        this.sgSetor = sgSetor;
    }

    public String getNmSetor() {
        return nmSetor;
    }

    public void setNmSetor(String nmSetor) {
        this.nmSetor = nmSetor;
    }

    public String getNmNrSimprocSetor() {
        return nmNrSimprocSetor;
    }

    public void setNmNrSimprocSetor(String nmNrSimprocSetor) {
        this.nmNrSimprocSetor = nmNrSimprocSetor;
    }

    public String getNmNrSei(){
        return nmNrSei;
    }
    
    public void SetNmNrSei (String nmNrSei){
        this.nmNrSei = nmNrSei;
    }
    
    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getDthrAtualiza() {
        return dthrAtualiza;
    }

    public void setDthrAtualiza(String dthrAtualiza) {
        this.dthrAtualiza = dthrAtualiza;
    }
    
    
    
    
    
    
    
    
    
    
    
}
