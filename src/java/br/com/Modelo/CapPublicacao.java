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
public class CapPublicacao {

//Atributos
    private String stCap, stObs, nomeTec, docDigit, obsGeral, origem, digArea, qlArea, edificacao, afetaAtual, propAntigo, tipoReg, numReg, numCri,
            planta, numPa, numPaOr, disLeg, numCrq, areaCrq, autoRg, lvrRg, nomParc, destOr, procJud, tipoDp, nomMe, cip, tipoEscr, numLvrEs, numFlsEs, numTabEs,
            pastaEsc, tipoImov, logra, tipoLogra, compLogra, numLogra, fracao, motivDesat, capAntigo, capAtual, mVenda, cVenda, dataCri, dataAtuali, dataImiss,
            dataCtAd, dataEscr, geom, viario;
    private int gid, codCap, estag, pkCapPublicacao;
    private double areaOfi, areaPol, difArea, vlPorMun;

//Getter's & Setter's
    public int getPkCapPublicacao() {
        return pkCapPublicacao;
    }

    public void setPkCapPublicacao(int pkCapPublicacao) {
        this.pkCapPublicacao = pkCapPublicacao;
    }

    public String getStCap() {
        return stCap;
    }

    public void setStCap(String stCap) {
        this.stCap = stCap;
    }

    public String getStObs() {
        return stObs;
    }

    public void setStObs(String stObs) {
        this.stObs = stObs;
    }

    public String getNomeTec() {
        return nomeTec;
    }

    public void setNomeTec(String nomeTec) {
        this.nomeTec = nomeTec;
    }

    public String getDocDigit() {
        return docDigit;
    }

    public void setDocDigit(String docDigit) {
        this.docDigit = docDigit;
    }

    public String getObsGeral() {
        return obsGeral;
    }

    public void setObsGeral(String obsGeral) {
        this.obsGeral = obsGeral;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDigArea() {
        return digArea;
    }

    public void setDigArea(String digArea) {
        this.digArea = digArea;
    }

    public String getQlArea() {
        return qlArea;
    }

    public void setQlArea(String qlArea) {
        this.qlArea = qlArea;
    }

    public String getEdificacao() {
        return edificacao;
    }

    public void setEdificacao(String edificacao) {
        this.edificacao = edificacao;
    }

    public String getAfetaAtual() {
        return afetaAtual;
    }

    public void setAfetaAtual(String afetaAtual) {
        this.afetaAtual = afetaAtual;
    }

    public String getPropAntigo() {
        return propAntigo;
    }

    public void setPropAntigo(String propAntigo) {
        this.propAntigo = propAntigo;
    }

    public String getTipoReg() {
        return tipoReg;
    }

    public void setTipoReg(String tipoReg) {
        this.tipoReg = tipoReg;
    }

    public String getNumReg() {
        return numReg;
    }

    public void setNumReg(String numReg) {
        this.numReg = numReg;
    }

    public String getNumCri() {
        return numCri;
    }

    public void setNumCri(String numCri) {
        this.numCri = numCri;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getNumPa() {
        return numPa;
    }

    public void setNumPa(String numPa) {
        this.numPa = numPa;
    }

    public String getNumPaOr() {
        return numPaOr;
    }

    public void setNumPaOr(String numPaOr) {
        this.numPaOr = numPaOr;
    }

    public String getDisLeg() {
        return disLeg;
    }

    public void setDisLeg(String disLeg) {
        this.disLeg = disLeg;
    }

    public String getNumCrq() {
        return numCrq;
    }

    public void setNumCrq(String numCrq) {
        this.numCrq = numCrq;
    }

    public String getAreaCrq() {
        return areaCrq;
    }

    public void setAreaCrq(String areaCrq) {
        this.areaCrq = areaCrq;
    }

    public String getAutoRg() {
        return autoRg;
    }

    public void setAutoRg(String autoRg) {
        this.autoRg = autoRg;
    }

    public String getLvrRg() {
        return lvrRg;
    }

    public void setLvrRg(String lvrRg) {
        this.lvrRg = lvrRg;
    }

    public String getNomParc() {
        return nomParc;
    }

    public void setNomParc(String nomParc) {
        this.nomParc = nomParc;
    }

    public String getDestOr() {
        return destOr;
    }

    public void setDestOr(String destOr) {
        this.destOr = destOr;
    }

    public String getProcJud() {
        return procJud;
    }

    public void setProcJud(String procJud) {
        this.procJud = procJud;
    }

    public String getTipoDp() {
        return tipoDp;
    }

    public void setTipoDp(String tipoDp) {
        this.tipoDp = tipoDp;
    }

    public String getNomMe() {
        return nomMe;
    }

    public void setNomMe(String nomMe) {
        this.nomMe = nomMe;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getTipoEscr() {
        return tipoEscr;
    }

    public void setTipoEscr(String tipoEscr) {
        this.tipoEscr = tipoEscr;
    }

    public String getNumLvrEs() {
        return numLvrEs;
    }

    public void setNumLvrEs(String numLvrEs) {
        this.numLvrEs = numLvrEs;
    }

    public String getNumFlsEs() {
        return numFlsEs;
    }

    public void setNumFlsEs(String numFlsEs) {
        this.numFlsEs = numFlsEs;
    }

    public String getNumTabEs() {
        return numTabEs;
    }

    public void setNumTabEs(String numTabEs) {
        this.numTabEs = numTabEs;
    }

    public String getPastaEsc() {
        return pastaEsc;
    }

    public void setPastaEsc(String pastaEsc) {
        this.pastaEsc = pastaEsc;
    }

    public String getTipoImov() {
        return tipoImov;
    }

    public void setTipoImov(String tipoImov) {
        this.tipoImov = tipoImov;
    }

    public String getLogra() {
        return logra;
    }

    public void setLogra(String logra) {
        this.logra = logra;
    }

    public String getTipoLogra() {
        return tipoLogra;
    }

    public void setTipoLogra(String tipoLogra) {
        this.tipoLogra = tipoLogra;
    }

    public String getCompLogra() {
        return compLogra;
    }

    public void setCompLogra(String compLogra) {
        this.compLogra = compLogra;
    }

    public String getNumLogra() {
        return numLogra;
    }

    public void setNumLogra(String numLogra) {
        this.numLogra = numLogra;
    }

    public String getFracao() {
        return fracao;
    }

    public void setFracao(String fracao) {
        this.fracao = fracao;
    }

    public String getMotivDesat() {
        return motivDesat;
    }

    public void setMotivDesat(String motivDesat) {
        this.motivDesat = motivDesat;
    }

    public String getCapAntigo() {
        return capAntigo;
    }

    public void setCapAntigo(String capAntigo) {
        this.capAntigo = capAntigo;
    }

    public String getCapAtual() {
        return capAtual;
    }

    public void setCapAtual(String capAtual) {
        this.capAtual = capAtual;
    }

    public String getmVenda() {
        return mVenda;
    }

    public void setmVenda(String mVenda) {
        this.mVenda = mVenda;
    }

    public String getcVenda() {
        return cVenda;
    }

    public void setcVenda(String cVenda) {
        this.cVenda = cVenda;
    }

    public String getDataCri() {
        return dataCri;
    }

    public void setDataCri(String dataCri) {
        this.dataCri = dataCri;
    }

    public String getDataAtuali() {
        return dataAtuali;
    }

    public void setDataAtuali(String dataAtuali) {
        this.dataAtuali = dataAtuali;
    }

    public String getDataImiss() {
        return dataImiss;
    }

    public void setDataImiss(String dataImiss) {
        this.dataImiss = dataImiss;
    }

    public String getDataCtAd() {
        return dataCtAd;
    }

    public void setDataCtAd(String dataCtAd) {
        this.dataCtAd = dataCtAd;
    }

    public String getDataEscr() {
        return dataEscr;
    }

    public void setDataEscr(String dataEscr) {
        this.dataEscr = dataEscr;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }

    public String getViario() {
        return viario;
    }

    public void setViario(String viario) {
        this.viario = viario;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getCodCap() {
        return codCap;
    }

    public void setCodCap(int codCap) {
        this.codCap = codCap;
    }

    public int getEstag() {
        return estag;
    }

    public void setEstag(int estag) {
        this.estag = estag;
    }

    public double getAreaOfi() {
        return areaOfi;
    }

    public void setAreaOfi(double areaOfi) {
        this.areaOfi = areaOfi;
    }

    public double getAreaPol() {
        return areaPol;
    }

    public void setAreaPol(double areaPol) {
        this.areaPol = areaPol;
    }

    public double getDifArea() {
        return difArea;
    }

    public void setDifArea(double difArea) {
        this.difArea = difArea;
    }

    public double getVlPorMun() {
        return vlPorMun;
    }

    public void setVlPorMun(double vlPorMun) {
        this.vlPorMun = vlPorMun;
    }

}
