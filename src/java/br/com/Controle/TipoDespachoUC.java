/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoDespacho;
import br.com.Modelo.TipoDespachoDAO;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author x369482
 */
public class TipoDespachoUC implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        TipoDespacho tpDes = new TipoDespacho();
        TipoDespachoDAO tpDesDAO = new TipoDespachoDAO();
        HttpSession session = req.getSession();

//Atributo       
        int pkTipoDespacho;
        String sigla, tipoDespacho, loginSession, execucao;

//Carregando os atributos com as informações do formulário
        execucao = req.getParameter("execucao");
        sigla = req.getParameter("sigla").toUpperCase();
        tipoDespacho = Transformar.getUFT8(Transformar.getPriMaiuscula(req.getParameter("TipoDespacho")));
        loginSession = (String) session.getAttribute("sessionLogin");

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
        if ("edit".equals(execucao)) {
            pkTipoDespacho = Integer.parseInt(req.getParameter("pkTipoDespacho"));
            tpDes = new TipoDespacho(pkTipoDespacho, sigla, tipoDespacho, loginSession);
            tpDesDAO.upTipoDespacho(tpDes);
            req.setAttribute("msg", "alterou");

        } else if ("insert".equals(execucao)) {
            tpDes = new TipoDespacho(sigla, tipoDespacho, loginSession);
            tpDesDAO.insTipoDespacho(tpDes);
            req.setAttribute("msg", "gravou");
        }

        return "ControllerServlet?acao=TipoDespachoLista";
    }
}
