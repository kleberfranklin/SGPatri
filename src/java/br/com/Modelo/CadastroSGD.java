/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

/**
 *
 * @author x369482
 */
public class CadastroSGD {

//Atributos
    private int pkCadastroSgd, fkCatInteressado, fkEnderecos, fkDispLegal, fkCatFormularios, nrIncorporado, nrParticular, nrAutos, nrContribuinte,
            nrOrdemCronologica, nrAutoRg, nrRegistro, nrPasta, nrCodigo;

    private String cdProcessoOriginario, dtAno, cdVara, dsPlano, cdPlanta, nmTipo, dsRegistroImoveis, dsObservacao, cdArea, cdPerimetro,
            dtImissaoPosse, nmArea, nmForeiro, nmSitDominial, cdExpediente, nmNome, nmLogin, dthrAtualizacao, cdPasta, nmAssunto,
            nmDireitoPreferencia, cdCroqui, cdProcesso, nmInteressado;

//Construtor form Escrituras lavradas
    public CadastroSGD(int pkCadastroSgd, int fkEnderecos, int nrRegistro, int nrPasta, String cdProcesso, String nmNome, String dsObservacao,
            String nmTipo) {
        this.pkCadastroSgd = pkCadastroSgd;
        this.fkEnderecos = fkEnderecos;
        this.nrRegistro = nrRegistro;
        this.nrPasta = nrPasta;
        this.cdProcesso = cdProcesso;
        this.nmNome = nmNome;
        this.dsObservacao = dsObservacao;
        this.nmTipo = nmTipo;
    }

//Construtor form Ficha eletronica
    public CadastroSGD(int pkCadastroSgd, int fkEnderecos, int nrCodigo, String cdPasta, int fkCatInteressado, String nmAssunto,
            String cdProcesso, String cdProcessoOriginario, String nmArea, String cdPerimetro, String dtImissaoPosse, int nrAutoRg, String dtAno,
            String cdVara, int nrContribuinte, String dsPlano, String cdPlanta, String cdCroqui, int fkDispLegal, String dsRegistroImoveis,
            String nmDireitoPreferencia, String dsObservacao) {
        this.pkCadastroSgd = pkCadastroSgd;
        this.fkEnderecos = fkEnderecos;
        this.nrCodigo = nrCodigo;
        this.cdPasta = cdPasta;
        this.fkCatInteressado = fkCatInteressado;
        this.nmAssunto = nmAssunto;
        this.cdProcesso = cdProcesso;
        this.cdProcessoOriginario = cdProcessoOriginario;
        this.nmArea = nmArea;
        this.cdPerimetro = cdPerimetro;
        this.dtImissaoPosse = dtImissaoPosse;
        this.nrAutoRg = nrAutoRg;
        this.dtAno = dtAno;
        this.cdVara = cdVara;
        this.nrContribuinte = nrContribuinte;
        this.dsPlano = dsPlano;
        this.cdPlanta = cdPlanta;
        this.cdCroqui = cdCroqui;
        this.fkDispLegal = fkDispLegal;
        this.dsRegistroImoveis = dsRegistroImoveis;
        this.nmDireitoPreferencia = nmDireitoPreferencia;
        this.dsObservacao = dsObservacao;
    }

//Construtor form Aforamento    
    public CadastroSGD(int pkCadastroSgd, String cdArea, String nmForeiro, String nmSitDominial, String cdExpediente, String dsObservacao,
            int fkEnderecos) {
        this.pkCadastroSgd = pkCadastroSgd;
        this.cdArea = cdArea;
        this.nmForeiro = nmForeiro;
        this.nmSitDominial = nmSitDominial;
        this.cdExpediente = cdExpediente;
        this.dsObservacao = dsObservacao;
        this.fkEnderecos = fkEnderecos;
    }
//Construtor PesquisaSGD

    public CadastroSGD(int pkCadastroSgd, String cdProcesso, String nmInteressado, String nmAssunto, String cdCroqui) {
        this.pkCadastroSgd = pkCadastroSgd;
        this.cdProcesso = cdProcesso;
        this.nmInteressado = nmInteressado;
        this.nmAssunto = nmAssunto;
        this.cdCroqui = cdCroqui;
    }

    public CadastroSGD() {
    }

//Getter's & Setter's
    public int getPkCadastroSgd() {
        return pkCadastroSgd;
    }

    public void setPkCadastroSgd(int pkCadastroSgd) {
        this.pkCadastroSgd = pkCadastroSgd;
    }

    public int getFkCatInteressado() {
        return fkCatInteressado;
    }

    public void setFkCatInteressado(int fkCatInteressado) {
        this.fkCatInteressado = fkCatInteressado;
    }

    public int getFkEnderecos() {
        return fkEnderecos;
    }

    public void setFkEnderecos(int fkEnderecos) {
        this.fkEnderecos = fkEnderecos;
    }

    public int getFkDispLegal() {
        return fkDispLegal;
    }

    public void setFkDispLegal(int fkDispLegal) {
        this.fkDispLegal = fkDispLegal;
    }

    public int getFkCatFormularios() {
        return fkCatFormularios;
    }

    public void setFkCatFormularios(int fkCatFormularios) {
        this.fkCatFormularios = fkCatFormularios;
    }

    public int getNrIncorporado() {
        return nrIncorporado;
    }

    public void setNrIncorporado(int nrIncorporado) {
        this.nrIncorporado = nrIncorporado;
    }

    public int getNrParticular() {
        return nrParticular;
    }

    public void setNrParticular(int nrParticular) {
        this.nrParticular = nrParticular;
    }

    public int getNrAutos() {
        return nrAutos;
    }

    public void setNrAutos(int nrAutos) {
        this.nrAutos = nrAutos;
    }

    public int getNrContribuinte() {
        return nrContribuinte;
    }

    public void setNrContribuinte(int nrContribuinte) {
        this.nrContribuinte = nrContribuinte;
    }

    public String getCdCroqui() {
        return cdCroqui;
    }

    public void setCdCroqui(String cdCroqui) {
        this.cdCroqui = cdCroqui;
    }

    public String getCdProcesso() {
        return cdProcesso;
    }

    public void setCdProcesso(String cdProcesso) {
        this.cdProcesso = cdProcesso;
    }

    public int getNrOrdemCronologica() {
        return nrOrdemCronologica;
    }

    public void setNrOrdemCronologica(int nrOrdemCronologica) {
        this.nrOrdemCronologica = nrOrdemCronologica;
    }

    public int getNrAutoRg() {
        return nrAutoRg;
    }

    public void setNrAutoRg(int nrAutoRg) {
        this.nrAutoRg = nrAutoRg;
    }

    public int getNrRegistro() {
        return nrRegistro;
    }

    public void setNrRegistro(int nrRegistro) {
        this.nrRegistro = nrRegistro;
    }

    public int getNrPasta() {
        return nrPasta;
    }

    public void setNrPasta(int nrPasta) {
        this.nrPasta = nrPasta;
    }

    public int getNrCodigo() {
        return nrCodigo;
    }

    public void setNrCodigo(int nrCodigo) {
        this.nrCodigo = nrCodigo;
    }

    public String getCdProcessoOriginario() {
        return cdProcessoOriginario;
    }

    public void setCdProcessoOriginario(String cdProcessoOriginario) {
        this.cdProcessoOriginario = cdProcessoOriginario;
    }

    public String getDtAno() {
        return dtAno;
    }

    public void setDtAno(String dtAno) {
        this.dtAno = dtAno;
    }

    public String getCdVara() {
        return cdVara;
    }

    public void setCdVara(String cdVara) {
        this.cdVara = cdVara;
    }

    public String getDsPlano() {
        return dsPlano;
    }

    public void setDsPlano(String dsPlano) {
        this.dsPlano = dsPlano;
    }

    public String getCdPlanta() {
        return cdPlanta;
    }

    public void setCdPlanta(String cdPlanta) {
        this.cdPlanta = cdPlanta;
    }

    public String getNmTipo() {
        return nmTipo;
    }

    public void setNmTipo(String nmTipo) {
        this.nmTipo = nmTipo;
    }

    public String getDsRegistroImoveis() {
        return dsRegistroImoveis;
    }

    public void setDsRegistroImoveis(String dsRegistroImoveis) {
        this.dsRegistroImoveis = dsRegistroImoveis;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getCdArea() {
        return cdArea;
    }

    public void setCdArea(String cdArea) {
        this.cdArea = cdArea;
    }

    public String getCdPerimetro() {
        return cdPerimetro;
    }

    public void setCdPerimetro(String cdPerimetro) {
        this.cdPerimetro = cdPerimetro;
    }

    public String getDtImissaoPosse() {
        return dtImissaoPosse;
    }

    public void setDtImissaoPosse(String dtImissaoPosse) {
        this.dtImissaoPosse = dtImissaoPosse;
    }

    public String getNmArea() {
        return nmArea;
    }

    public void setNmArea(String nmArea) {
        this.nmArea = nmArea;
    }

    public String getNmForeiro() {
        return nmForeiro;
    }

    public void setNmForeiro(String nmForeiro) {
        this.nmForeiro = nmForeiro;
    }

    public String getNmSitDominial() {
        return nmSitDominial;
    }

    public void setNmSitDominial(String nmSitDominial) {
        this.nmSitDominial = nmSitDominial;
    }

    public String getCdExpediente() {
        return cdExpediente;
    }

    public void setCdExpediente(String cdExpediente) {
        this.cdExpediente = cdExpediente;
    }

    public String getNmNome() {
        return nmNome;
    }

    public void setNmNome(String nmNome) {
        this.nmNome = nmNome;
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

    public String getCdPasta() {
        return cdPasta;
    }

    public void setCdPasta(String cdPasta) {
        this.cdPasta = cdPasta;
    }

    public String getNmAssunto() {
        return nmAssunto;
    }

    public void setNmAssunto(String nmAssunto) {
        this.nmAssunto = nmAssunto;
    }

    public String getNmDireitoPreferencia() {
        return nmDireitoPreferencia;
    }

    public void setNmDireitoPreferencia(String nmDireitoPreferencia) {
        this.nmDireitoPreferencia = nmDireitoPreferencia;
    }

    public String getNmInteressado() {
        return nmInteressado;
    }

    public void setNmInteressado(String nmInteressado) {
        this.nmInteressado = nmInteressado;
    }

}
