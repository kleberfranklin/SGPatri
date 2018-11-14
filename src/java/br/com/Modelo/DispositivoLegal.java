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
public class DispositivoLegal {
    
    
    private int pkDisplegal,  fkAutoCessao, fkTipoDisplegal;
    private String nrDisp,  nmTitulo,  dtDisp, nmLogin, dthr_atualicacao;

    public DispositivoLegal() {
    }

    public DispositivoLegal( int fkAutoCessao, int fkTipoDisplegal, String nrDisp, String dtDisp, String nmLogin) {
        this.fkAutoCessao = fkAutoCessao;
        this.fkTipoDisplegal = fkTipoDisplegal;
        this.nrDisp = nrDisp;
        this.dtDisp = dtDisp;
        this.nmLogin = nmLogin;
    }

    
    
    
    
    
    public int getPkDisplegal() {
        return pkDisplegal;
    }

    public void setPkDisplegal(int pkDisplegal) {
        this.pkDisplegal = pkDisplegal;
    }

    public int getFkTipoDisplegal() {
        return fkTipoDisplegal;
    }

    public void setFkTipoDisplegal(int fkTipoDisplegal) {
        this.fkTipoDisplegal = fkTipoDisplegal;
    }
    
      public int getFkAutoCessao() {
        return fkAutoCessao;
    }

    public void setFkAutoCessao(int fkAutoCessao) {
        this.fkAutoCessao = fkAutoCessao;
    }
        
    
    public String getNrDisp() {
        return nrDisp;
    }

    public void setNrDisp(String nrDisp) {
        this.nrDisp = nrDisp;
    }

    public String getNmTitulo() {
        return nmTitulo;
    }

    public void setNmTitulo(String nmTitulo) {
        this.nmTitulo = nmTitulo;
    }

    public String getDtDisp() {
        return dtDisp;
    }

    public void setDtDisp(String dtDisp) {
        this.dtDisp = dtDisp;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getDthr_atualicacao() {
        return dthr_atualicacao;
    }

    public void setDthr_atualicacao(String dthr_atualicacao) {
        this.dthr_atualicacao = dthr_atualicacao;
    }
    
    
    
    
    
    
}
