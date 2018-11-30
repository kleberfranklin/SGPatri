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
public class Validacao {
    private int pkValidacao, fkAutoCessao,  fkDivisao;
    private String nmProblema, nmStatus, nmTarefa, dsObsservacao, nmLogin, dthrAtualizacao;

    public Validacao() {
    }

    public Validacao(int fkAutoCessao, int fkDivisao, String nmProblema, String nmTarefa, String nmStatus, String dsObsservacao, String nmLogin) {
        this.fkAutoCessao = fkAutoCessao;
        this.fkDivisao = fkDivisao;
        this.nmProblema = nmProblema;
        this.nmTarefa = nmTarefa;
        this.nmStatus = nmStatus;
        this.dsObsservacao = dsObsservacao;
        this.nmLogin = nmLogin;
    }

    public Validacao(int fkAutoCessao, int fkDivisao, String nmProblema, String nmTarefa, String nmStatus, String dsObsservacao, String nmLogin, int pkValidacao) {
        this(fkAutoCessao, fkDivisao, nmProblema, nmTarefa, nmStatus, dsObsservacao, nmLogin);
        this.pkValidacao = pkValidacao;
    }

    
    
    public int getPkValidacao() {
        return pkValidacao;
    }

    public void setPkValidacao(int pkValidacao) {
        this.pkValidacao = pkValidacao;
    }

    public int getFkAutoCessao() {
        return fkAutoCessao;
    }

    public void setFkAutoCessao(int fkAutoCessao) {
        this.fkAutoCessao = fkAutoCessao;
    }

    public int getFkDivisao() {
        return fkDivisao;
    }

    public void setFkDivisao(int fkDivisao) {
        this.fkDivisao = fkDivisao;
    }

    public String getNmProblema() {
        return nmProblema;
    }

    public void setNmProblema(String nmProblema) {
        this.nmProblema = nmProblema;
    }

    public String getNmStatus() {
        return nmStatus;
    }

    public void setNmStatus(String nmStatus) {
        this.nmStatus = nmStatus;
    }

    public String getNmTarefa() {
        return nmTarefa;
    }

    public void setNmTarefa(String nmTarefa) {
        this.nmTarefa = nmTarefa;
    }

    public String getDsObsservacao() {
        return dsObsservacao;
    }

    public void setDsObsservacao(String dsObsservacao) {
        this.dsObsservacao = dsObsservacao;
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
