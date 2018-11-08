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
public class AutoCessaoValidacao {
    
    private int pkAutoStage, fkTipoCessaoStage, fkCatEntidadeStage, fkCatAutoStage, fkCatFinalidadeStage, fkDisplegalStage;
    private String dtLavratura, nmProcesso, nmCessionario, nmCedente, nmPlanta, nmCroqui,nrArea, nrSetor, nrQuadra, nrLote,
            nmTipoEndereco, nmTituloEndereco, nmEndereco, nrEndereco, nmComplementoEndereco, nmReferencialEndereco, nmMunicipal,
            nrPrazo, dtVencimento, dtEncerramento, dsContrapartida, nrVigor, dtCadastro, dsObservacao, nmLogin,  status, dthrAtualizacao;



    public int getPkAutoStage() {
        return pkAutoStage;
    }

    public void setPkAutoStage(int pkAutoStage) {
        this.pkAutoStage = pkAutoStage;
    }

    public int getFkTipoCessaoStage() {
        return fkTipoCessaoStage;
    }

    public void setFkTipoCessaoStage(int fkTipoCessaoStage) {
        this.fkTipoCessaoStage = fkTipoCessaoStage;
    }

    public int getFkCatEntidadeStage() {
        return fkCatEntidadeStage;
    }

    public void setFkCatEntidadeStage(int fkCatEntidadeStage) {
        this.fkCatEntidadeStage = fkCatEntidadeStage;
    }

    public int getFkCatAutoStage() {
        return fkCatAutoStage;
    }

    public void setFkCatAutoStage(int fkCatAutoStage) {
        this.fkCatAutoStage = fkCatAutoStage;
    }

    public int getFkCatFinalidadeStage() {
        return fkCatFinalidadeStage;
    }

    public void setFkCatFinalidadeStage(int fkCatFinalidadeStage) {
        this.fkCatFinalidadeStage = fkCatFinalidadeStage;
    }

    public int getFkDisplegalStage() {
        return fkDisplegalStage;
    }

    public void setFkDisplegalStage(int fkDisplegalStage) {
        this.fkDisplegalStage = fkDisplegalStage;
    }

    public String getDtLavratura() {
        return dtLavratura;
    }

    public void setDtLavratura(String dtLavratura) {
        this.dtLavratura = dtLavratura;
    }

    public String getNmProcesso() {
        return nmProcesso;
    }

    public void setNmProcesso(String nmProcesso) {
        this.nmProcesso = nmProcesso;
    }

    public String getNmCessionario() {
        return nmCessionario;
    }

    public void setNmCessionario(String nmCessionario) {
        this.nmCessionario = nmCessionario;
    }

    public String getNmCedente() {
        return nmCedente;
    }

    public void setNmCedente(String nmCedente) {
        this.nmCedente = nmCedente;
    }

    public String getNmPlanta() {
        return nmPlanta;
    }

    public void setNmPlanta(String nmPlanta) {
        this.nmPlanta = nmPlanta;
    }

    public String getNmCroqui() {
        return nmCroqui;
    }

    public void setNmCroqui(String nmCroqui) {
        this.nmCroqui = nmCroqui;
    }

    public String getNrArea() {
        return nrArea;
    }

    public void setNrArea(String nrArea) {
        this.nrArea = nrArea;
    }

    public String getNrSetor() {
        return nrSetor;
    }

    public void setNrSetor(String nrSetor) {
        this.nrSetor = nrSetor;
    }

    public String getNrQuadra() {
        return nrQuadra;
    }

    public void setNrQuadra(String nrQuadra) {
        this.nrQuadra = nrQuadra;
    }

    public String getNrLote() {
        return nrLote;
    }

    public void setNrLote(String nrLote) {
        this.nrLote = nrLote;
    }

    public String getNmTipoEndereco() {
        return nmTipoEndereco;
    }

    public void setNmTipoEndereco(String nmTipoEndereco) {
        this.nmTipoEndereco = nmTipoEndereco;
    }

    public String getNmTituloEndereco() {
        return nmTituloEndereco;
    }

    public void setNmTituloEndereco(String nmTituloEndereco) {
        this.nmTituloEndereco = nmTituloEndereco;
    }

    public String getNmEndereco() {
        return nmEndereco;
    }

    public void setNmEndereco(String nmEndereco) {
        this.nmEndereco = nmEndereco;
    }

    public String getNrEndereco() {
        return nrEndereco;
    }

    public void setNrEndereco(String nrEndereco) {
        this.nrEndereco = nrEndereco;
    }

    public String getNmComplementoEndereco() {
        return nmComplementoEndereco;
    }

    public void setNmComplementoEndereco(String nmComplementoEndereco) {
        this.nmComplementoEndereco = nmComplementoEndereco;
    }

    public String getNmReferencialEndereco() {
        return nmReferencialEndereco;
    }

    public void setNmReferencialEndereco(String nmReferencialEndereco) {
        this.nmReferencialEndereco = nmReferencialEndereco;
    }

    public String getNmMunicipal() {
        return nmMunicipal;
    }

    public void setNmMunicipal(String nmMunicipal) {
        this.nmMunicipal = nmMunicipal;
    }

    public String getNrPrazo() {
        return nrPrazo;
    }

    public void setNrPrazo(String nrPrazo) {
        this.nrPrazo = nrPrazo;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public String getDtEncerramento() {
        return dtEncerramento;
    }

    public void setDtEncerramento(String dtEncerramento) {
        this.dtEncerramento = dtEncerramento;
    }

    public String getDsContrapartida() {
        return dsContrapartida;
    }

    public void setDsContrapartida(String dsContrapartida) {
        this.dsContrapartida = dsContrapartida;
    }

    public String getNrVigor() {
        return nrVigor;
    }

    public void setNrVigor(String nrVigor) {
        this.nrVigor = nrVigor;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }
    
    
    
    
    
    
}
