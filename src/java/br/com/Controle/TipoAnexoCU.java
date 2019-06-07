/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoAnexo;
import br.com.Modelo.TipoAnexoDAO;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author x369482
 */
public class TipoAnexoCU implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        TipoAnexo tpAn = new TipoAnexo();
        TipoAnexoDAO tpAnDAO = new TipoAnexoDAO();
        HttpSession session = req.getSession();

//Atributo       
        int pkTipoAnexo;
        String sigla, tipoAnexo, loginSessio, execucao;

//Carregando os atributos com as informações do formulário
        execucao = req.getParameter("execucao");
        sigla = req.getParameter("sigla").toUpperCase();
        tipoAnexo = Transformar.getUFT8(req.getParameter("tipoAnexo"));
        loginSessio = (String) session.getAttribute("sessionLogin");

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
        if ("edit".equals(execucao)) {
            pkTipoAnexo = Integer.parseInt(req.getParameter("pkTipoAnexo"));
            tpAn = new TipoAnexo(pkTipoAnexo, sigla, tipoAnexo, loginSessio);
            tpAnDAO.upTipoAnexo(tpAn);
            req.setAttribute("msg", "alterou");

        } else if ("insert".equals(execucao)) {
            tpAn = new TipoAnexo(sigla, tipoAnexo, loginSessio);
            tpAnDAO.insTipoAnexo(tpAn);
            req.setAttribute("msg", "gravou");
        }

        return "ControllerServlet?acao=TipoAnexoLista";
    }
}
