/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AnotacaoCroqui;
import br.com.Modelo.AnotacaoCroquiDAO;
import br.com.Modelo.Logica;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
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

// Atributo
    int  pkAnotacaoExpediente, pkLogradouro, nrAnotacao, nrInformacao;
    String  nmTipoExpediente, cdCroqui, cdArea, nrInformacaoDgpi, nrprocesso, tpProcesso, cdTid, dExpediente, nmInteressado, 
            dsAssunto, nrNumeroEnd, nmCcomplementoEnd, nmReferenciaEnd, dsDespacho, dtPublicacao, dtAnotacao, 
            dsObservacao, dtData, nmLogin, execucao;

//Carregando os atributos com as informações do formulário     
       
                
//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
//        if ("edit".equals(execucao)) {
//           // pkCadastroSic = Integer.parseInt(req.getParameter("pkCadastroSic"));
////                anotCroqui = new AnotacaoCroqui(pkCadastroSic, fkUsuario, fkEnderecos, nrInformacaoDgpi, cdProcesso, cdTid, cdCroqui, cdArea, cdExpediente, nmInteressado, dsAssunto, dsObservacao, nmLogin);
////                anotCroquiDAO.upAnotacaoCroqui(anotCroqui);
//                req.setAttribute("msg", "alterou");
//
//        } else if ("insert".equals(execucao)) {
//        //        pkCadastroSic = Integer.parseInt(req.getParameter("pkCadastroSic"));
////                anotCroqui = new AnotacaoCroqui(pkCadastroSic, fkUsuario, fkEnderecos, nrInformacaoDgpi, cdProcesso, cdTid, cdCroqui, cdArea, cdExpediente, nmInteressado, dsAssunto, dsObservacao, nmLogin);
////                anotCroquiDAO.insAnotacaoCroqui(anotCroqui);
//            req.setAttribute("msg", "gravou");
//        }

        return "ControllerServlet?acao=AnotacaoCroquiDetalhe&pkCadastroSic";

    }

}
