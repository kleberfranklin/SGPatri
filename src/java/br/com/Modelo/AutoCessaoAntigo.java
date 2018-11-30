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
public class AutoCessaoAntigo {

//Atributos 
    
    private int pkCessao, pkTipoCessao, pkAdministracao, nrTerceiro, nrPrazoDai, nrPrazoMes, nrPrazoAno, nrPendencia, pkPrefeituraRegional,
            pkSecretaria, nrVigor, nrEncerrado, nrTotal;
   
    private String nmCessao, nmAdministracao, nmAc, nmCessionario, nmTpEndereco, nmEndereco, nmNumeroEndereco, nmComplementoEndereco,
            dsObservacao, nmCodLog, nmSetor, nmQuadra, nmMunicipal, nmCroqui, nmPanta, nmArea, nmPrazo, sgPrefeituraRegional, nmPrefeituraRegional,
            sgSecretaria, nmSecretaria, nmProcesso, dsContrapartida, dsContrapartidaSimplificada, nmFinalidade,  dthtAtualizacao, dtLavraturadate, 
            dtVencimento, dtEncerramento, dtCadastro, nmLogin, nmLoginCadastro;
    

//Contrutores

    public AutoCessaoAntigo() {
    }

    
//Getter e Setters    
    
    public int getPkCessao() {
        return pkCessao;
    }

    public void setPkCessao(int pkCessao) {
        this.pkCessao = pkCessao;
    }

    public int getPkTipoCessao() {
        return pkTipoCessao;
    }

    public void setPkTipoCessao(int pkTipoCessao) {
        this.pkTipoCessao = pkTipoCessao;
    }

    public int getPkAdministracao() {
        return pkAdministracao;
    }

    public void setPkAdministracao(int pkAdministracao) {
        this.pkAdministracao = pkAdministracao;
    }

    public int getNrTerceiro() {
        return nrTerceiro;
    }

    public void setNrTerceiro(int nrTerceiro) {
        this.nrTerceiro = nrTerceiro;
    }

    public int getNrPrazoDai() {
        return nrPrazoDai;
    }

    public void setNrPrazoDai(int nrPrazoDai) {
        this.nrPrazoDai = nrPrazoDai;
    }

    public int getNrPrazoMes() {
        return nrPrazoMes;
    }

    public void setNrPrazoMes(int nrPrazoMes) {
        this.nrPrazoMes = nrPrazoMes;
    }

    public int getNrPrazoAno() {
        return nrPrazoAno;
    }

    public void setNrPrazoAno(int nrPrazoAno) {
        this.nrPrazoAno = nrPrazoAno;
    }

    public int getNrPendencia() {
        return nrPendencia;
    }

    public void setNrPendencia(int nrPendencia) {
        this.nrPendencia = nrPendencia;
    }

    public int getPkPrefeituraRegional() {
        return pkPrefeituraRegional;
    }

    public void setPkPrefeituraRegional(int pkPrefeituraRegional) {
        this.pkPrefeituraRegional = pkPrefeituraRegional;
    }

    public int getPkSecretaria() {
        return pkSecretaria;
    }

    public void setPkSecretaria(int pkSecretaria) {
        this.pkSecretaria = pkSecretaria;
    }

    public int getNrVigor() {
        return nrVigor;
    }

    public void setNrVigor(int nrVigor) {
        this.nrVigor = nrVigor;
    }

    public int getNrEncerrado() {
        return nrEncerrado;
    }

    public void setNrEncerrado(int nrEncerrado) {
        this.nrEncerrado = nrEncerrado;
    }
    public int getNrTotal() {
        return nrTotal;
    }

    public void setNrTotal(int nrTotal) {
        this.nrTotal = nrTotal;
    }

    public String getNmCessao() {
        return nmCessao;
    }

    public void setNmCessao(String nmCessao) {
        this.nmCessao = nmCessao;
    }

    public String getNmAdministracao() {
        return nmAdministracao;
    }

    public void setNmAdministracao(String nmAdministracao) {
        this.nmAdministracao = nmAdministracao;
    }

    public String getNmAc() {
        return nmAc;
    }

    public void setNmAc(String nmAc) {
        this.nmAc = nmAc;
    }

    public String getNmCessionario() {
        return nmCessionario;
    }

    public void setNmCessionario(String nmCessionario) {
        this.nmCessionario = nmCessionario;
    }

    public String getNmTpEndereco() {
        return nmTpEndereco;
    }

    public void setNmTpEndereco(String nmTpEndereco) {
        this.nmTpEndereco = nmTpEndereco;
    }

    public String getNmEndereco() {
        return nmEndereco;
    }

    public void setNmEndereco(String nmEndereco) {
        this.nmEndereco = nmEndereco;
    }

    public String getNmNumeroEndereco() {
        return nmNumeroEndereco;
    }

    public void setNmNumeroEndereco(String nmNumeroEndereco) {
        this.nmNumeroEndereco = nmNumeroEndereco;
    }

    public String getNmComplementoEndereco() {
        return nmComplementoEndereco;
    }

    public void setNmComplementoEndereco(String nmComplementoEndereco) {
        this.nmComplementoEndereco = nmComplementoEndereco;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getNmCodLog() {
        return nmCodLog;
    }

    public void setNmCodLog(String nmCodLog) {
        this.nmCodLog = nmCodLog;
    }

    public String getNmSetor() {
        return nmSetor;
    }

    public void setNmSetor(String nmSetor) {
        this.nmSetor = nmSetor;
    }

    public String getNmQuadra() {
        return nmQuadra;
    }

    public void setNmQuadra(String nmQuadra) {
        this.nmQuadra = nmQuadra;
    }

    public String getNmMunicipal() {
        return nmMunicipal;
    }

    public void setNmMunicipal(String nmMunicipal) {
        this.nmMunicipal = nmMunicipal;
    }

    public String getNmCroqui() {
        return nmCroqui;
    }

    public void setNmCroqui(String nmCroqui) {
        this.nmCroqui = nmCroqui;
    }

    public String getNmPanta() {
        return nmPanta;
    }

    public void setNmPanta(String nmPanta) {
        this.nmPanta = nmPanta;
    }

    public String getNmArea() {
        return nmArea;
    }

    public void setNmArea(String nmArea) {
        this.nmArea = nmArea;
    }

    public String getNmPrazo() {
        return nmPrazo;
    }

    public void setNmPrazo(String nmPrazo) {
        this.nmPrazo = nmPrazo;
    }

    public String getSgPrefeituraRegional() {
        return sgPrefeituraRegional;
    }

    public void setSgPrefeituraRegional(String sgPrefeituraRegional) {
        this.sgPrefeituraRegional = sgPrefeituraRegional;
    }

    public String getNmPrefeituraRegional() {
        return nmPrefeituraRegional;
    }

    public void setNmPrefeituraRegional(String nmPrefeituraRegional) {
        this.nmPrefeituraRegional = nmPrefeituraRegional;
    }

    public String getSgSecretaria() {
        return sgSecretaria;
    }

    public void setSgSecretaria(String sgSecretaria) {
        this.sgSecretaria = sgSecretaria;
    }

    public String getNmSecretaria() {
        return nmSecretaria;
    }

    public void setNmSecretaria(String nmSecretaria) {
        this.nmSecretaria = nmSecretaria;
    }

    public String getNmProcesso() {
        return nmProcesso;
    }

    public void setNmProcesso(String nmProcesso) {
        this.nmProcesso = nmProcesso;
    }

    public String getDsContrapartida() {
        return dsContrapartida;
    }

    public void setDsContrapartida(String dsContrapartida) {
        this.dsContrapartida = dsContrapartida;
    }

    public String getDsContrapartidaSimplificada() {
        return dsContrapartidaSimplificada;
    }

    public void setDsContrapartidaSimplificada(String dsContrapartidaSimplificada) {
        this.dsContrapartidaSimplificada = dsContrapartidaSimplificada;
    }

    public String getNmFinalidade() {
        return nmFinalidade;
    }

    public void setNmFinalidade(String nmFinalidade) {
        this.nmFinalidade = nmFinalidade;
    }

    public String getDthtAtualizacao() {
        return dthtAtualizacao;
    }

    public void setDthtAtualizacao(String dthtAtualizacao) {
        this.dthtAtualizacao = dthtAtualizacao;
    }

    public String getDtLavraturadate() {
        return dtLavraturadate;
    }

    public void setDtLavraturadate(String dtLavraturadate) {
        this.dtLavraturadate = dtLavraturadate;
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

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getNmLoginCadastro() {
        return nmLoginCadastro;
    }

    public void setNmLoginCadastro(String nmLoginCadastro) {
        this.nmLoginCadastro = nmLoginCadastro;
    }
    
    
    
    
    
    
    
    
    
}
