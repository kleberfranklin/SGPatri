/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AnotacaoCroqui;
import br.com.Modelo.AnotacaoCroquiDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author x369482
 */
public class AnotacaoCroquiUC implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {
// Objetos
    AnotacaoCroqui anotaCroqui = new AnotacaoCroqui();
    AnotacaoCroquiDAO anotaCroquiDAO = new AnotacaoCroquiDAO();
    HttpSession session = req.getSession();
        

// Atributo
    int  pkAnotacaoExpediente=0, pkLogradouro, verExpediente;
    String  nmTipoExpediente, cdCroqui, cdArea, nrInformacaoDgpi, nrProcesso, tpProcesso, cdTid, cdExpediente, nmInteressado, 
            dsAssunto, nrNumeroEnd, nmComplementoEnd, nmReferenciaEnd, nrAnotacao, nrInformacao, dsDespacho, dtAnotacao, 
            dsObservacao, loginSessio, nmAutor, execucao, strPublicacao, strData;
    Date dtPublicacao, dtData;

//Carregando os atributos com as informações do formulário  
    pkLogradouro = Integer.parseInt(req.getParameter("pkLogradouro")); 
    nmTipoExpediente = Transformar.removeAccents(req.getParameter("nmTipoExpediente")).toUpperCase().trim();
    cdCroqui =  Transformar.removeAccents(req.getParameter("cdCroqui")).toUpperCase().trim(); 
    cdArea =  Transformar.removeAccents(req.getParameter("cdArea")).toUpperCase().trim(); 
    nrInformacaoDgpi =  Transformar.removeAccents(req.getParameter("nrInformacaoDgpi")).toUpperCase().trim();
    nrProcesso =  req.getParameter("nrprocesso");
    tpProcesso =  req.getParameter("tpProcesso"); 
    cdTid =  req.getParameter("cdTid"); 
    cdExpediente =  Transformar.removeAccents(req.getParameter("cdExpediente")).toUpperCase().trim();
    nmInteressado =  Transformar.removeAccents(req.getParameter("nmInteressado")).toUpperCase().trim();
    dsAssunto =  Transformar.removeAccents(req.getParameter("dsAssunto")).toUpperCase().trim();
    nrNumeroEnd =  req.getParameter("nrNumeroEnd");
    nmComplementoEnd =  req.getParameter("nmComplementoEnd").toUpperCase().trim();
    nmReferenciaEnd =  req.getParameter("nmReferenciaEnd").toUpperCase().trim();
    nrAnotacao =  req.getParameter("nrAnotacao");
    nrInformacao =  req.getParameter("nrInformacao");
    dsDespacho =  req.getParameter("dsDespacho").toUpperCase().trim();
    strPublicacao =  req.getParameter("dtPublicacao");
    dtAnotacao =  req.getParameter("dtAnotacao");
    dsObservacao =  Transformar.removeAccents(req.getParameter("dsObservacao")).toUpperCase().trim();
    strData =  req.getParameter("dtData");
    execucao  =  req.getParameter("execucao");
    loginSessio = (String) session.getAttribute("sessionLogin");
    nmAutor =  (String) session.getAttribute("sessionNome");
    nmAutor = nmAutor.toUpperCase().trim();
    verExpediente = Integer.parseInt(req.getParameter("verExpediente"));
    
            
    
    
    
    
    
                
//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
        if ("".equals(strPublicacao)){
            dtPublicacao = null;
        }else{
            dtPublicacao = java.sql.Date.valueOf(strPublicacao);
        }
            
        if ("".equals(strData)){
            dtData = null;
        }else{
            dtData = java.sql.Date.valueOf(strData);
        }


//        
        if ("edit".equals(execucao)) {
                pkAnotacaoExpediente = Integer.parseInt(req.getParameter("pkAnotacaoExpediente"));
                anotaCroqui = new AnotacaoCroqui(pkAnotacaoExpediente, pkLogradouro, nmTipoExpediente, cdCroqui, cdArea, cdExpediente, 
                        nmInteressado, dsAssunto, dsDespacho, dsObservacao, nmAutor, nrProcesso, cdTid, dtAnotacao, nrInformacaoDgpi, 
                        dtPublicacao, nmReferenciaEnd, dtData, tpProcesso, nrAnotacao, nrInformacao, nrNumeroEnd, nmComplementoEnd, 
                        loginSessio,verExpediente);
                anotaCroquiDAO.upAnotacaoCroqui(anotaCroqui);
                req.setAttribute("msg", "alterou");
                
        
        } else if ("insert".equals(execucao)) {
                anotaCroqui = new AnotacaoCroqui(pkLogradouro, nmTipoExpediente, cdCroqui, cdArea, cdExpediente, 
                        nmInteressado, dsAssunto, dsDespacho, dsObservacao, nmAutor, nrProcesso, cdTid, dtAnotacao, nrInformacaoDgpi, 
                        dtPublicacao, nmReferenciaEnd, dtData, tpProcesso, nrAnotacao, nrInformacao, nrNumeroEnd, nmComplementoEnd, 
                        loginSessio, verExpediente);
               pkAnotacaoExpediente = anotaCroquiDAO.cAnotacaoCroqui(anotaCroqui);
            req.setAttribute("msg", "gravou");
        }

        return "ControllerServlet?acao=AnotacaoCroquiDetalhe&pkAnotacaoExpediente="+pkAnotacaoExpediente+"&execucao=view";

    }

}
