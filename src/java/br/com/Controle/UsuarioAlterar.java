/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;


import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import br.com.Modelo.Usuario;
import br.com.Modelo.Usuario;
import br.com.Modelo.UsuarioDAO;
import br.com.Modelo.UsuarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class UsuarioAlterar implements Logica{
@Override    
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        
        UsuarioDAO usDAO = new UsuarioDAO();
        HttpSession session = req.getSession();

//Atributos
        
        int pkUsuario, divisao, cargo, perfil, ativo=0, setor;
        String login, rf, nome, email, loginSession, setorP;

//Carregando atributos com as informações do formulário
        login = req.getParameter("login");
        rf = req.getParameter("rf");
        nome = Transformar.utf8(Transformar.priMaiuscula(req.getParameter("nome")));
        email = req.getParameter("email");
        loginSession = (String) session.getAttribute("sessionLogin");
        pkUsuario = Integer.parseInt(req.getParameter("pkUsuario"));
        divisao = Integer.parseInt(req.getParameter("divisao"));
        cargo = Integer.parseInt(req.getParameter("cargo"));
        perfil = Integer.parseInt(req.getParameter("perfil"));
        setorP = req.getParameter("setor");

         
//Validação dos atributos carregdos com as informações do formulário.   
        if (setorP == null) {
            setor =0;
        } else {
            setor =Integer.parseInt(setorP);
        }
        if ("1".equals(req.getParameter("ativo"))) {
            ativo = 1;
        }

//Populando o objeto e alterando as informações        
        Usuario us = new Usuario(pkUsuario, divisao, setor, cargo, ativo, perfil, login, nome, rf, email, loginSession);
        usDAO.altUsuario(us);
        us = usDAO.detalheUsuario(pkUsuario);
        
        req.setAttribute("us", us);
        req.setAttribute("msg", "gravou");
        
        return "UsuarioRU.jsp";

    }
}
