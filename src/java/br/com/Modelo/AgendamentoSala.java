/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import java.sql.Date;

/**
 *
 * @author x369482
 */
public class AgendamentoSala {

    private int pkAgendamentoSala;
    private String horarioIni, horarioFim, nmNome, nmSetor, dsObservacao, dthrAtualizacao, nmLogin, dtDataTxt;
    private Date dtData;

    public AgendamentoSala(int pkAgendamentoSala, Date dtData, String horarioIni, String horarioFim, String nmNome, String nmSetor, String dsObservacao,
            String dthrAtualizacao, String nmLogin) {
        this.pkAgendamentoSala = pkAgendamentoSala;
        this.horarioIni = horarioIni;
        this.horarioFim = horarioFim;
        this.nmNome = nmNome;
        this.nmSetor = nmSetor;
        this.dtData = dtData;
        this.dsObservacao = dsObservacao;
        this.dthrAtualizacao = dthrAtualizacao;
        this.nmLogin = nmLogin;

    }

    public AgendamentoSala() {
    }

    public int getPkAgendamentoSala() {
        return pkAgendamentoSala;
    }

    public void setPkAgendamentoSala(int pkAgendamentoSala) {
        this.pkAgendamentoSala = pkAgendamentoSala;
    }

    public String getHorarioIni() {
        return horarioIni;
    }

    public void setHorarioIni(String horarioIni) {
        this.horarioIni = horarioIni;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getNmNome() {
        return nmNome;
    }

    public void setNmNome(String nmNome) {
        this.nmNome = nmNome;
    }

    public String getNmSetor() {
        return nmSetor;
    }

    public void setNmSetor(String nmSetor) {
        this.nmSetor = nmSetor;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
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

    public Date getDtData() {
        return dtData;
    }

    public void setDtData(Date dtData) {
        this.dtData = dtData;
    }

    public String getDtDataTxt() {
        return dtDataTxt;
    }

    public void setDtDataTxt(String dtDataTxt) {
        this.dtDataTxt = dtDataTxt;
    }

}
