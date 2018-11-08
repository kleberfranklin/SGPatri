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
public class TipoDispositivoLegal {
    
    private int pkTipoDispLegal;
    private String sgTipoDispLegal, nmTipoDispLegal, nmLogin, dthrAtualizacao;

    
//Construtodres 

    public TipoDispositivoLegal() {
    }

    public TipoDispositivoLegal(String sgTipoDispLegal, String nmTipoDispLegal, String nmLogin) {
        this.sgTipoDispLegal = sgTipoDispLegal;
        this.nmTipoDispLegal = nmTipoDispLegal;
        this.nmLogin = nmLogin;
    }

    public TipoDispositivoLegal(int pkTipoDispLegal, String sgTipoDispLegal, String nmTipoDispLegal, String nmLogin) {
        this(sgTipoDispLegal, nmTipoDispLegal, nmLogin);
        this.pkTipoDispLegal = pkTipoDispLegal;
        
    }
   
    
    
//Getteres e Seetteres

   
public int getPkTipoDispLegal() {
        return pkTipoDispLegal;
    }

    public void setPkTipoDispLegal(int pkTipoDispLegal) {
        this.pkTipoDispLegal = pkTipoDispLegal;
    }
    
    public String getSgTipoDispLegal() {
        return sgTipoDispLegal;
    }

    public void setSgTipoDispLegal(String sgTipoDispLegal) {
        this.sgTipoDispLegal = sgTipoDispLegal;
    }

    public String getNmTipoDispLegal() {
        return nmTipoDispLegal;
    }

    public void setNmTipoDispLegal(String nmTipoDispLegal) {
        this.nmTipoDispLegal = nmTipoDispLegal;
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
