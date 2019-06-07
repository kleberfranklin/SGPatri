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
public class Arquivo {
    
    private int pkArquivo, fkAutocessao, nrRetiRatificacao;
    private String nmTipo, nmArquivo, nmExtensao, nmDiretorio, nmNomeclatura, dthrAtualizacao, nmLogin;

    public Arquivo() {
    }

    public Arquivo(int fkAutocessao, int nrRetiRatificacao, String nmTipo, String nmArquivo, String nmExtensao, String nmDiretorio, String nmNomeclatura, String nmLogin) {
        this.fkAutocessao = fkAutocessao;
        this.nrRetiRatificacao = nrRetiRatificacao;
        this.nmTipo = nmTipo;
        this.nmArquivo = nmArquivo;
        this.nmExtensao = nmExtensao;
        this.nmDiretorio = nmDiretorio;
        this.nmNomeclatura = nmNomeclatura;
        this.nmLogin = nmLogin;
    }
    
    public Arquivo(int pkArquivo, int fkAutocessao, int nrRetiRatificacao,  String nmTipo, String nmArquivo,String nmExtensao, String nmDiretorio, String nmNomeclatura, String nmLogin) {
        this(fkAutocessao, nrRetiRatificacao, nmTipo, nmArquivo, nmExtensao, nmDiretorio, nmNomeclatura, nmLogin);
        this.pkArquivo = pkArquivo;
    }
    
    public int getPkArquivo() {
        return pkArquivo;
    }

    public void setPkArquivo(int pkArquivo) {
        this.pkArquivo = pkArquivo;
    }

    public int getFkAutocessao() {
        return fkAutocessao;
    }

    public void setFkAutocessao(int fkAutocessao) {
        this.fkAutocessao = fkAutocessao;
    }

    public int getNrRetiRatificacao() {
        return nrRetiRatificacao;
    }

    public void setNrRetiRatificacao(int nrRetiRatificacao) {
        this.nrRetiRatificacao = nrRetiRatificacao;
    }
    
    public String getNmTipo() {
        return nmTipo;
    }

    public void setNmTipo(String nmTipo) {
        this.nmTipo = nmTipo;
    }

    public String getNmArquivo() {
        return nmArquivo;
    }

    public void setNmArquivo(String nmArquivo) {
        this.nmArquivo = nmArquivo;
    }

    public String getNmExtensao() {
        return nmExtensao;
    }

    public void setNmExtensao(String nmExtensao) {
        this.nmExtensao = nmExtensao;
    }

    public String getNmDiretorio() {
        return nmDiretorio;
    }

    public void setNmDiretorio(String nmDiretorio) {
        this.nmDiretorio = nmDiretorio;
    }
    
      public String getNmNomeclatura() {
        return nmNomeclatura;
    }

    public void setNmNomeclatura(String nmNomeclatura) {
        this.nmNomeclatura = nmNomeclatura;
    }
    
    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }
   
}
