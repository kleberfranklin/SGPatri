/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.Usuario;
import br.com.Modelo.UsuarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class UsuarioAltStatus implements Logica {
    @Override
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {    
    
                 
        UsuarioDAO usDAO = new UsuarioDAO();
        HttpSession session = req.getSession();

//Atributos        
        int status=0, pkUs;
        String loginSession = (String) session.getAttribute("sessionLogin");

//Carregando os atributos com as informações do formulário                
        status = Integer.parseInt(req.getParameter("status"));
        pkUs = Integer.parseInt(req.getParameter("pkUs"));

//Populando o objeto e alterando informações        
        Usuario us = new Usuario(pkUs, status, loginSession);
        usDAO.atuStatus(us);
        us = usDAO.detalheUsuario(pkUs);
        
                    
        
        return "ControllerServlet?acao=UsuarioListaPaginada";
    }
    
}
