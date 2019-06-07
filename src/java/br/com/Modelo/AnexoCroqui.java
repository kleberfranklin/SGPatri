/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import java.util.List;

/**
 *
 * @author d732229
 */
public class AnexoCroqui {
    
    private int pkAnexoCroqui, fkTipoAnexo;
    private String nmAnexo, dsAnexo, nmDiretorio, nmExtensao, nmLogin, dthrAtualizacao;
    private AnotacaoCroqui [] anotCrqui;
    private TipoAnexo tpAnexo;
            
            
    public AnexoCroqui() {
    }


    public AnexoCroqui(int fkTipoAnexo, String nmAnexo, String dsAnexo, String nmDiretorio, String nmExtensao, String nmLogin) {
        this.fkTipoAnexo = fkTipoAnexo;
        this.nmAnexo = nmAnexo;
        this.dsAnexo = dsAnexo;
        this.nmDiretorio = nmDiretorio;
        this.nmExtensao = nmExtensao;
        this.nmLogin = nmLogin;
    }

    public int getPkAnexoCroqui() {
        return pkAnexoCroqui;
    }

    public void setPkAnexoCroqui(int pkAnexoCroqui) {
        this.pkAnexoCroqui = pkAnexoCroqui;
    }

    public int getFkTipoAnexo() {
        return fkTipoAnexo;
    }

    public void setFkTipoAnexo(int fkTipoAnexo) {
        this.fkTipoAnexo = fkTipoAnexo;
    }

    public String getNmAnexo() {
        return nmAnexo;
    }

    public void setNmAnexo(String nmAnexo) {
        this.nmAnexo = nmAnexo;
    }

    public String getDsAnexo() {
        return dsAnexo;
    }

    public void setDsAnexo(String dsAnexo) {
        this.dsAnexo = dsAnexo;
    }
    
    public String getNmDiretorio() {
        return nmDiretorio;
    }

    public void setNmDiretorio(String nmDiretorio) {
        this.nmDiretorio = nmDiretorio;
    }

    public String getNmExtensao() {
        return nmExtensao;
    }

    public void setNmExtensao(String nmExtensao) {
        this.nmExtensao = nmExtensao;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public AnotacaoCroqui[] getAnotCrqui() {
        return anotCrqui;
    }

    public void setAnotCrqui(AnotacaoCroqui[] anotCrqui) {
        this.anotCrqui = anotCrqui;
    }

    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public TipoAnexo getTpAnexo() {
        return tpAnexo;
    }

    public void setTpAnexo(TipoAnexo tpAnexo) {
        this.tpAnexo = tpAnexo;
    }
    
    
    
    
}
