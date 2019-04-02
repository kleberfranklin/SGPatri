package br.com.Controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.Modelo.*;
        



/**
 *
 * @author x369482
 */
public class AnotacaoCroquiDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        AnotacaoCroquiDAO anotaCroquiDAO = new AnotacaoCroquiDAO();
        LogradouroPadraoDAO lograPadraoDAO = new LogradouroPadraoDAO();
        LogradouroPadrao lograPadrao = new LogradouroPadrao();

//Atributos
        int pkAnotacaoExpediente = 0;
        String execucao;

//Carregando atributos com a informações do formlário.        
        pkAnotacaoExpediente = Integer.parseInt(req.getParameter("pkAnotacaoExpediente"));
        execucao = req.getParameter("execucao");

//Validação dos atributos carregdos com as informações do formulário.  
        if (pkAnotacaoExpediente == 0) {
            return "ControllerServlet?acao=AnotacaoCroquiLista";
        }

//Consulta no banco e popula o objeto        
        AnotacaoCroqui anotCroqui = anotaCroquiDAO.detalheAnotacaoCroqui(pkAnotacaoExpediente);
        lograPadrao = lograPadraoDAO.pequisaPkLogradouro(anotCroqui.getFkLogradouro());
        
        
        
        req.setAttribute("anotCroqui", anotCroqui);
        req.setAttribute("lograPadrao", lograPadrao);
        req.setAttribute("execucao", execucao);
        return "AnotacaoCroquiCRU.jsp";
    }
}
