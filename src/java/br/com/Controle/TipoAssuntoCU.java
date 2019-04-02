/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoAssunto;
import br.com.Modelo.TipoAssuntoDAO;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author x369482
 */
public class TipoAssuntoCU implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        TipoAssunto tpAs = new TipoAssunto();
        TipoAssuntoDAO tpAsDAO = new TipoAssuntoDAO();
        HttpSession session = req.getSession();

//Atributo       
        int pkTipoAssunto;
        String sigla, tipoAssunto, loginSessio, execucao;

//Carregando os atributos com as informações do formulário
        execucao = req.getParameter("execucao");
        sigla = req.getParameter("sigla").toUpperCase();
        tipoAssunto = Transformar.getUFT8(Transformar.getPriMaiuscula(req.getParameter("tipoAssunto")));
        loginSessio = (String) session.getAttribute("sessionLogin");

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
        if ("edit".equals(execucao)) {
            pkTipoAssunto = Integer.parseInt(req.getParameter("pkTipoAssunto"));
            tpAs = new TipoAssunto(pkTipoAssunto, sigla, tipoAssunto, loginSessio);
            tpAsDAO.upTipoAssunto(tpAs);
            req.setAttribute("msg", "alterou");

        } else if ("insert".equals(execucao)) {
            tpAs = new TipoAssunto(sigla, tipoAssunto, loginSessio);
            tpAsDAO.insTipoAssunto(tpAs);
            req.setAttribute("msg", "gravou");
        }

        return "ControllerServlet?acao=TipoAssuntoLista";
    }
}
