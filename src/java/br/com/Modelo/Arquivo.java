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
    
    private int pkArquivo, fkTipoArquivo;
    private String nmOrigem, nmTipo, nmNome, nmDiretorio, dthrAtualizacao, nmLogin;

    public Arquivo() {
    }

    public Arquivo(int fkTipoArquivo, String nmOrigem, String nmTipo, String nmNome, String nmDiretorio, String nmLogin) {
        this.fkTipoArquivo = fkTipoArquivo;
        this.nmOrigem = nmOrigem;
        this.nmTipo = nmTipo;
        this.nmNome = nmNome;
        this.nmDiretorio = nmDiretorio;
        this.nmLogin = nmLogin;
    }
    
    
    public Arquivo(int pkArquivo, int fkTipoArquivo, String nmOrigem, String nmTipo, String nmNome, String nmDiretorio, String nmLogin) {
        this(fkTipoArquivo, nmOrigem, nmTipo,nmNome, nmDiretorio, nmLogin);
        this.pkArquivo = pkArquivo;
    }

    
    public int getPkArquivo() {
        return pkArquivo;
    }

    public void setPkArquivo(int pkArquivo) {
        this.pkArquivo = pkArquivo;
    }

    public int getFkTipoArquivo() {
        return fkTipoArquivo;
    }

    public void setFkTipoArquivo(int fkTipoArquivo) {
        this.fkTipoArquivo = fkTipoArquivo;
    }

    public String getNmOrigem() {
        return nmOrigem;
    }

    public void setNmOrigem(String nmOrigem) {
        this.nmOrigem = nmOrigem;
    }

    public String getNmTipo() {
        return nmTipo;
    }

    public void setNmTipo(String nmTipo) {
        this.nmTipo = nmTipo;
    }

    public String getNmNome() {
        return nmNome;
    }

    public void setNmNome(String nmNome) {
        this.nmNome = nmNome;
    }

    public String getNmDiretorio() {
        return nmDiretorio;
    }

    public void setNmDiretorio(String nmDiretorio) {
        this.nmDiretorio = nmDiretorio;
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
