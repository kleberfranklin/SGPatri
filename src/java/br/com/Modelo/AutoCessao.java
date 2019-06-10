/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import java.sql.Date;

/**
 *
 * @author d732229
 */
public class AutoCessao {

    private int pkAutoCessao, fkTipoCessaoStage, fkCatEntidadeStage, fkCatAutoStage, fkCatFinalidadeStage, fkSubcatfinalidade,
            fkNivelAdm, fkSubpref, fkCatContrapartida, fkValidacao, nrPrazoAno, nrPrazoMes, nrVerAc, nrVerDispLegal, nrVerArqAc, nrVerArqPlanta, nrVerValidacao,
            nrVerContrapartida, nrVerVitoria;

    private String nmCodAc, nmProcesso, nmTipoProcesso, nmCessionario, nmCedente, nmPlanta, nmCroqui, nrArea, nrCap, nmMetragem, nrSetor, nrQuadra, nrLote,
            nmTipoEndereco, nmTituloEndereco, nmEndereco, nrEndereco, nmComplementoEndereco, nmReferencialEndereco, nmMunicipal,
            nrPrazo, dtVencimento, dtEncerramento, dsContrapartida, nrVigor, dtCadastro, dsFinalidade, dsObservacao, nmLogin, nmStatus, dthrAtualizacao;

    private Date dtLavratura;

    private TipoAutoCessao tipoAutoCessao;

    public AutoCessao() {
    }

    public AutoCessao(int nrVerDispLegal) {
        this.nrVerDispLegal = nrVerDispLegal;
    }

    public AutoCessao(int fkTipoCessaoStage, int fkCatEntidadeStage, int fkCatAutoStage, int fkCatFinalidadeStage, int fkSubcatfinalidade, int fkNivelAdm,
            int fkSubpref, int fkCatContrapartida, int nrPrazoAno, int nrPrazoMes, int nrVerAc, String nmCodAc, Date dtLavratura, String nmProcesso, String nmTipoProcesso, String nmCessionario, String nmCedente, String nmPlanta, String nmCroqui,
            String nrArea, String nrCap, String nmMetragem, String nrSetor, String nrQuadra, String nrLote, String nmTipoEndereco, String nmTituloEndereco, String nmEndereco,
            String nrEndereco, String nmComplementoEndereco, String nmReferencialEndereco, String nrPrazo, String dtVencimento, String nrVigor, String dsFinalidade, String dsContrapartida, String dsObservacao, String nmStatus, String nmLogin) {
        this.fkTipoCessaoStage = fkTipoCessaoStage;
        this.fkCatEntidadeStage = fkCatEntidadeStage;
        this.fkCatAutoStage = fkCatAutoStage;
        this.fkCatFinalidadeStage = fkCatFinalidadeStage;
        this.fkSubcatfinalidade = fkSubcatfinalidade;
        this.fkNivelAdm = fkNivelAdm;
        this.fkSubpref = fkSubpref;
        this.fkCatContrapartida = fkCatContrapartida;
        this.nrPrazoAno = nrPrazoAno;
        this.nrPrazoMes = nrPrazoMes;
        this.nrVerAc = nrVerAc;
        this.nmCodAc = nmCodAc;
        this.dtLavratura = dtLavratura;
        this.nmProcesso = nmProcesso;
        this.nmTipoProcesso = nmTipoProcesso;
        this.nmCessionario = nmCessionario;
        this.nmCedente = nmCedente;
        this.nmPlanta = nmPlanta;
        this.nmCroqui = nmCroqui;
        this.nrArea = nrArea;
        this.nrCap = nrCap;
        this.nmMetragem = nmMetragem;
        this.nrSetor = nrSetor;
        this.nrQuadra = nrQuadra;
        this.nrLote = nrLote;
        this.nmTipoEndereco = nmTipoEndereco;
        this.nmTituloEndereco = nmTituloEndereco;
        this.nmEndereco = nmEndereco;
        this.nrEndereco = nrEndereco;
        this.nmComplementoEndereco = nmComplementoEndereco;
        this.nmReferencialEndereco = nmReferencialEndereco;
        this.nrPrazo = nrPrazo;
        this.dtVencimento = dtVencimento;
        this.nrVigor = nrVigor;
        this.dsFinalidade = dsFinalidade;
        this.dsContrapartida = dsContrapartida;
        this.dsObservacao = dsObservacao;
        this.nmStatus = nmStatus;
        this.nmLogin = nmLogin;
    }

    public AutoCessao(int pkAutoStage, int fkTipoCessaoStage, int fkCatEntidadeStage, int fkCatAutoStage, int fkCatFinalidadeStage, int fkSubcatfinalidade, int fkNivelAdm,
            int fkSubpref, int fkCatContrapartida, int nrPrazoAno, int nrPrazoMes, int nrVerAc, String nmCodAc, Date dtLavratura, String nmProcesso, String nmTipoProcesso, String nmCessionario, String nmCedente, String nmPlanta, String nmCroqui,
            String nrArea, String nrCap, String nmMetragem, String nrSetor, String nrQuadra, String nrLote, String nmTipoEndereco, String nmTituloEndereco, String nmEndereco,
            String nrEndereco, String nmComplementoEndereco, String nmReferencialEndereco, String nrPrazo, String dtVencimento, String nrVigor, String dsFinalidade, String dsContrapartida, String dsObservacao, String nmStatus, String nmLogin) {
        this.pkAutoCessao = pkAutoStage;
        this.fkTipoCessaoStage = fkTipoCessaoStage;
        this.fkCatEntidadeStage = fkCatEntidadeStage;
        this.fkCatAutoStage = fkCatAutoStage;
        this.fkCatFinalidadeStage = fkCatFinalidadeStage;
        this.fkSubcatfinalidade = fkSubcatfinalidade;
        this.fkNivelAdm = fkNivelAdm;
        this.fkSubpref = fkSubpref;
        this.fkCatContrapartida = fkCatContrapartida;
        this.nrPrazoAno = nrPrazoAno;
        this.nrPrazoMes = nrPrazoMes;
        this.nrVerAc = nrVerAc;
        this.nmCodAc = nmCodAc;
        this.dtLavratura = dtLavratura;
        this.nmProcesso = nmProcesso;
        this.nmTipoProcesso = nmTipoProcesso;
        this.nmCessionario = nmCessionario;
        this.nmCedente = nmCedente;
        this.nmPlanta = nmPlanta;
        this.nmCroqui = nmCroqui;
        this.nrArea = nrArea;
        this.nrCap = nrCap;
        this.nmMetragem = nmMetragem;
        this.nrSetor = nrSetor;
        this.nrQuadra = nrQuadra;
        this.nrLote = nrLote;
        this.nmTipoEndereco = nmTipoEndereco;
        this.nmTituloEndereco = nmTituloEndereco;
        this.nmEndereco = nmEndereco;
        this.nrEndereco = nrEndereco;
        this.nmComplementoEndereco = nmComplementoEndereco;
        this.nmReferencialEndereco = nmReferencialEndereco;
        this.nrPrazo = nrPrazo;
        this.dtVencimento = dtVencimento;
        this.nrVigor = nrVigor;
        this.dsFinalidade = dsFinalidade;
        this.dsContrapartida = dsContrapartida;
        this.dsObservacao = dsObservacao;
        this.nmStatus = nmStatus;
        this.nmLogin = nmLogin;
    }

    public int getPkAutoCessao() {
        return pkAutoCessao;
    }

    public void setPkAutoCessao(int pkAutoCessao) {
        this.pkAutoCessao = pkAutoCessao;
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

    public int getFkSubcatfinalidade() {
        return fkSubcatfinalidade;
    }

    public void setFkSubcatfinalidade(int fkSubcatfinalidade) {
        this.fkSubcatfinalidade = fkSubcatfinalidade;
    }

    public int getFkNivelAdm() {
        return fkNivelAdm;
    }

    public void setFkNivelAdm(int fkNivelAdm) {
        this.fkNivelAdm = fkNivelAdm;
    }

    public int getFkSubpref() {
        return fkSubpref;
    }

    public void setFkSubpref(int fkSubpref) {
        this.fkSubpref = fkSubpref;
    }

    public int getFkCatContrapartida() {
        return fkCatContrapartida;
    }

    public void setFkCatContrapartida(int fkCatContrapartida) {
        this.fkCatContrapartida = fkCatContrapartida;
    }

    public int getFkValidacao() {
        return fkValidacao;
    }

    public void setFkValidacao(int fkValidacao) {
        this.fkValidacao = fkValidacao;
    }

    public int getNrPrazoAno() {
        return nrPrazoAno;
    }

    public void setNrPrazoAno(int nrPrazoAno) {
        this.nrPrazoAno = nrPrazoAno;
    }

    public int getNrPrazoMes() {
        return nrPrazoMes;
    }

    public void setNrPrazoMes(int nrPrazoMes) {
        this.nrPrazoMes = nrPrazoMes;
    }

    public int getNrVerAc() {
        return nrVerAc;
    }

    public void setNrVerAc(int nrVerAc) {
        this.nrVerAc = nrVerAc;
    }

    public int getNrVerDispLegal() {
        return nrVerDispLegal;
    }

    public void setNrVerDispLegal(int nrVerDispLegal) {
        this.nrVerDispLegal = nrVerDispLegal;
    }

    public int getNrVerArqAc() {
        return nrVerArqAc;
    }

    public void setNrVerArqAc(int nrVerArqAc) {
        this.nrVerArqAc = nrVerArqAc;
    }

    public int getNrVerArqPlanta() {
        return nrVerArqPlanta;
    }

    public void setNrVerArqPlanta(int nrVerArqPlanta) {
        this.nrVerArqPlanta = nrVerArqPlanta;
    }

    public int getNrVerValidacao() {
        return nrVerValidacao;
    }

    public void setNrVerValidacao(int nrVerValidacao) {
        this.nrVerValidacao = nrVerValidacao;
    }

    public String getNmCodAc() {
        return nmCodAc;
    }

    public void setNmCodAc(String nmCodAc) {
        this.nmCodAc = nmCodAc;
    }

    public Date getDtLavratura() {
        return dtLavratura;
    }

    public void setDtLavratura(Date dtLavratura) {
        this.dtLavratura = dtLavratura;
    }

    public String getNmProcesso() {
        return nmProcesso;
    }

    public void setNmProcesso(String nmProcesso) {
        this.nmProcesso = nmProcesso;
    }

    public String getNmTipoProcesso() {
        return nmTipoProcesso;
    }

    public void setNmTipoProcesso(String nmTipoProcesso) {
        this.nmTipoProcesso = nmTipoProcesso;
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

    public String getNrCap() {
        return nrCap;
    }

    public void setNrCap(String nrCap) {
        this.nrCap = nrCap;
    }

    public String getNmMetragem() {
        return nmMetragem;
    }

    public void setNmMetragem(String nmMetragem) {
        this.nmMetragem = nmMetragem;
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

    public String getDsFinalidade() {
        return dsFinalidade;
    }

    public void setDsFinalidade(String dsFinalidade) {
        this.dsFinalidade = dsFinalidade;
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

    public String getNmStatus() {
        return nmStatus;
    }

    public void setNmStatus(String nmStatus) {
        this.nmStatus = nmStatus;
    }

    public String getDthrAtualizacao() {
        return dthrAtualizacao;
    }

    public void setDthrAtualizacao(String dthrAtualizacao) {
        this.dthrAtualizacao = dthrAtualizacao;
    }

    public int getNrVerContrapartida() {
        return nrVerContrapartida;
    }

    public void setNrVerContrapartida(int nrVerContrapartida) {
        this.nrVerContrapartida = nrVerContrapartida;
    }

    public int getNrVerVitoria() {
        return nrVerVitoria;
    }

    public void setNrVerVitoria(int nrVerVitoria) {
        this.nrVerVitoria = nrVerVitoria;
    }

    public TipoAutoCessao getTipoAutoCessao() {
        return tipoAutoCessao;
    }

    public void setTipoAutoCessao(TipoAutoCessao tipoAutoCessao) {
        this.tipoAutoCessao = tipoAutoCessao;
    }

}
