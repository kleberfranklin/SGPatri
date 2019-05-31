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
public class CadastroAreaPublica {

    //Atributos
    private String nmOrigem, stCap, nmLogin, dthrAtualizacao, stObservacao, nmTecnico, dtCriacao, docDigitalizado, nrAreaCap, nrAreaPoligono, edificacao,
            nmPropietarioAntigo, tpRegistro, nrRegistro, nrCri, cdPlanta, cdProcesso, cdProcessoOrigem, dsDispLegal, cdCroqui, cdArea, nmParc, dsDestinoOr,
            cdProcessoJudicial, tpDp, nmMe, dsCip, dtImissao, tpEscritura, dtEscritura, nmLogradouro, dsObservacao, geojson;
    private int pkCap, cdCap;

    //Getter's && Setter's
    public String getNmOrigem() {
        return nmOrigem;
    }

    public void setNmOrigem(String nmOrigem) {
        this.nmOrigem = nmOrigem;
    }

    public String getStCap() {
        return stCap;
    }

    public void setStCap(String stCap) {
        this.stCap = stCap;
    }

    public int getCdCap() {
        return cdCap;
    }

    public void setCdCap(int cdCap) {
        this.cdCap = cdCap;
    }

    public int getPkCap() {
        return pkCap;
    }

    public void setPkCap(int pkCap) {
        this.pkCap = pkCap;
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

    public String getStObservacao() {
        return stObservacao;
    }

    public void setStObservacao(String stObservacao) {
        this.stObservacao = stObservacao;
    }

    public String getNmTecnico() {
        return nmTecnico;
    }

    public void setNmTecnico(String nmTecnico) {
        this.nmTecnico = nmTecnico;
    }

    public String getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(String dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public String getDocDigitalizado() {
        return docDigitalizado;
    }

    public void setDocDigitalizado(String docDigitalizado) {
        this.docDigitalizado = docDigitalizado;
    }

    public String getNrAreaCap() {
        return nrAreaCap;
    }

    public void setNrAreaCap(String nrAreaCap) {
        this.nrAreaCap = nrAreaCap;
    }

    public String getNrAreaPoligono() {
        return nrAreaPoligono;
    }

    public void setNrAreaPoligono(String nrAreaPoligono) {
        this.nrAreaPoligono = nrAreaPoligono;
    }

    public String getEdificacao() {
        return edificacao;
    }

    public void setEdificacao(String edificacao) {
        this.edificacao = edificacao;
    }

    public String getNmPropietarioAntigo() {
        return nmPropietarioAntigo;
    }

    public void setNmPropietarioAntigo(String nmPropietarioAntigo) {
        this.nmPropietarioAntigo = nmPropietarioAntigo;
    }

    public String getTpRegistro() {
        return tpRegistro;
    }

    public void setTpRegistro(String tpRegistro) {
        this.tpRegistro = tpRegistro;
    }

    public String getNrRegistro() {
        return nrRegistro;
    }

    public void setNrRegistro(String nrRegistro) {
        this.nrRegistro = nrRegistro;
    }

    public String getNrCri() {
        return nrCri;
    }

    public void setNrCri(String nrCri) {
        this.nrCri = nrCri;
    }

    public String getCdPlanta() {
        return cdPlanta;
    }

    public void setCdPlanta(String cdPlanta) {
        this.cdPlanta = cdPlanta;
    }

    public String getCdProcesso() {
        return cdProcesso;
    }

    public void setCdProcesso(String cdProcesso) {
        this.cdProcesso = cdProcesso;
    }

    public String getCdProcessoOrigem() {
        return cdProcessoOrigem;
    }

    public void setCdProcessoOrigem(String cdProcessoOrigem) {
        this.cdProcessoOrigem = cdProcessoOrigem;
    }

    public String getDsDispLegal() {
        return dsDispLegal;
    }

    public void setDsDispLegal(String dsDispLegal) {
        this.dsDispLegal = dsDispLegal;
    }

    public String getCdCroqui() {
        return cdCroqui;
    }

    public void setCdCroqui(String cdCroqui) {
        this.cdCroqui = cdCroqui;
    }

    public String getCdArea() {
        return cdArea;
    }

    public void setCdArea(String cdArea) {
        this.cdArea = cdArea;
    }

    public String getNmParc() {
        return nmParc;
    }

    public void setNmParc(String nmParc) {
        this.nmParc = nmParc;
    }

    public String getDsDestinoOr() {
        return dsDestinoOr;
    }

    public void setDsDestinoOr(String dsDestinoOr) {
        this.dsDestinoOr = dsDestinoOr;
    }

    public String getCdProcessoJudicial() {
        return cdProcessoJudicial;
    }

    public void setCdProcessoJudicial(String cdProcessoJudicial) {
        this.cdProcessoJudicial = cdProcessoJudicial;
    }

    public String getTpDp() {
        return tpDp;
    }

    public void setTpDp(String tpDp) {
        this.tpDp = tpDp;
    }

    public String getNmMe() {
        return nmMe;
    }

    public void setNmMe(String nmMe) {
        this.nmMe = nmMe;
    }

    public String getDsCip() {
        return dsCip;
    }

    public void setDsCip(String dsCip) {
        this.dsCip = dsCip;
    }

    public String getDtImissao() {
        return dtImissao;
    }

    public void setDtImissao(String dtImissao) {
        this.dtImissao = dtImissao;
    }

    public String getTpEscritura() {
        return tpEscritura;
    }

    public void setTpEscritura(String tpEscritura) {
        this.tpEscritura = tpEscritura;
    }

    public String getDtEscritura() {
        return dtEscritura;
    }

    public void setDtEscritura(String dtEscritura) {
        this.dtEscritura = dtEscritura;
    }

    public String getNmLogradouro() {
        return nmLogradouro;
    }

    public void setNmLogradouro(String nmLogradouro) {
        this.nmLogradouro = nmLogradouro;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getGeojson() {
        return geojson;
    }

    public void setGeojson(String geojson) {
        this.geojson = geojson;
    }

}
