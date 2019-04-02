/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CapUsuario;
import br.com.Modelo.CapUsuarioDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author x369482
 */
public class CapUsuarioAlterarStatus implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        CapUsuarioDAO capUsDAO = new CapUsuarioDAO();
        HttpSession session = req.getSession();

//Atributos        
        int status = 0, pkUsCap;
        String loginSession = (String) session.getAttribute("sessionLogin");

//Carregando os atributos com as informações do formulário                
        status = Integer.parseInt(req.getParameter("status"));
        pkUsCap = Integer.parseInt(req.getParameter("pkUsCap"));

//Populando o objeto e alterando informações        
        CapUsuario capUs = new CapUsuario(pkUsCap, status, loginSession);
        capUsDAO.atuStatus(capUs);

        return "ControllerServlet?acao=CapUsuarioListaPaginada";
    }

}
