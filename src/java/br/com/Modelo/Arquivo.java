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
    private String nmOrigem, nmTipo, nmNomeArquivo, nmDiretorio, nmNome, dthrAtualizacao, nmLogin;

    public Arquivo() {
    }

  

    public Arquivo(int fkTipoArquivo, String nmOrigem, String nmTipo, String nmNomeArquivo, String nmDiretorio, String nmNome, String nmLogin) {
        this.fkTipoArquivo = fkTipoArquivo;
        this.nmOrigem = nmOrigem;
        this.nmTipo = nmTipo;
        this.nmNomeArquivo = nmNomeArquivo;
        this.nmDiretorio = nmDiretorio;
        this.nmNome = nmNome;
        this.nmLogin = nmLogin;
    }
    
    
    public Arquivo(int pkArquivo, int fkTipoArquivo, String nmOrigem, String nmTipo, String nmNomeArquivo, String nmDiretorio, String nmNome, String nmLogin) {
        this(fkTipoArquivo, nmOrigem, nmTipo,nmNomeArquivo, nmDiretorio, nmNome, nmLogin);
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

    public String getNmNomeArquivo() {
        return nmNomeArquivo;
    }

    public void setNmNomeArquivo(String nmNomeArquivo) {
        this.nmNomeArquivo = nmNomeArquivo;
    }

    public String getNmDiretorio() {
        return nmDiretorio;
    }

    public void setNmDiretorio(String nmDiretorio) {
        this.nmDiretorio = nmDiretorio;
    }
    
      public String getNmNome() {
        return nmNome;
    }

    public void setNmNome(String nmNome) {
        this.nmNome = nmNome;
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
