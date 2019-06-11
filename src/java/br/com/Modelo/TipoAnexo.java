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
public class TipoAnexo {
    
    private int pkTipoAnexo;
    private String sgTipoAnexo, nmTipoAnexo, nmLogin, dthrAtualizacao;

    public TipoAnexo() {
    }

    
    public TipoAnexo(String sgTipoAnexo, String nmTipoAnexo, String nmLogin) {
        this.sgTipoAnexo = sgTipoAnexo;
        this.nmTipoAnexo = nmTipoAnexo;
        this.nmLogin = nmLogin;
    }

    public TipoAnexo(int pkTipoAnexo, String sgTipoAnexo, String nmTipoAnexo, String nmLogin) {
        this.pkTipoAnexo = pkTipoAnexo;
        this.sgTipoAnexo = sgTipoAnexo;
        this.nmTipoAnexo = nmTipoAnexo;
        this.nmLogin = nmLogin;
    }
    
    

    public int getPkTipoAnexo() {
        return pkTipoAnexo;
    }

    public void setPkTipoAnexo(int pkTipoAnexo) {
        this.pkTipoAnexo = pkTipoAnexo;
    }

    public String getSgTipoAnexo() {
        return sgTipoAnexo;
    }

    public void setSgTipoAnexo(String sgTipoAnexo) {
        this.sgTipoAnexo = sgTipoAnexo;
    }

    public String getNmTipoAnexo() {
        return nmTipoAnexo;
    }

    public void setNmTipoAnexo(String nmTipoAnexo) {
        this.nmTipoAnexo = nmTipoAnexo;
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
