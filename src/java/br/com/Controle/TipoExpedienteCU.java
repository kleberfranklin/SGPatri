/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoExpediente;
import br.com.Modelo.TipoExpedienteDAO;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author x369482
 */
public class TipoExpedienteCU implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        TipoExpediente tpEx = new TipoExpediente();
        TipoExpedienteDAO tpExDAO = new TipoExpedienteDAO();
        HttpSession session = req.getSession();

//Atributo       
        int pkTipoExpediente;
        String sigla, tipoExpediente, loginSession, execucao;

//Carregando os atributos com as informações do formulário
        execucao = req.getParameter("execucao");
        sigla = req.getParameter("sigla").toUpperCase();
        tipoExpediente = Transformar.utf8(Transformar.priMaiuscula(req.getParameter("TipoExpediente")));
        loginSession = (String) session.getAttribute("sessionLogin");

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
        if ("edit".equals(execucao)) {
            pkTipoExpediente = Integer.parseInt(req.getParameter("pkTipoExpediente"));
            tpEx = new TipoExpediente(pkTipoExpediente, sigla, tipoExpediente, loginSession);
            tpExDAO.upTipoExpediente(tpEx);
            req.setAttribute("msg", "alterou");

        } else if ("insert".equals(execucao)) {
            tpEx = new TipoExpediente(sigla, tipoExpediente, loginSession);
            tpExDAO.insTipoExpediente(tpEx);
            req.setAttribute("msg", "gravou");
        }

        return "ControllerServlet?acao=TipoExpedienteLista";
    }
}
