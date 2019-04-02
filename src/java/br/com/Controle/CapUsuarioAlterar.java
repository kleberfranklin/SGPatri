/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CapUsuario;
import br.com.Modelo.CapUsuarioDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author x369482
 */
public class CapUsuarioAlterar implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        CapUsuarioDAO capUsDAO = new CapUsuarioDAO();
        HttpSession session = req.getSession();

//Atributos
        int pkUsuarioCap, divisao, cargo, perfil, ativo = 0, setor;
        String login, rf, nome, email, loginSession, setorP;

//Carregando atributos com as informações do formulário
        login = req.getParameter("login");
        rf = req.getParameter("rf");
        nome = Transformar.getUFT8(Transformar.getPriMaiuscula(req.getParameter("nome")));
        email = req.getParameter("email");
        loginSession = (String) session.getAttribute("sessionLogin");
        pkUsuarioCap = Integer.parseInt(req.getParameter("pkUsuarioCap"));
        divisao = Integer.parseInt(req.getParameter("divisao"));
        cargo = Integer.parseInt(req.getParameter("cargo"));
        perfil = Integer.parseInt(req.getParameter("perfil"));
        setorP = req.getParameter("setor");

//Validação dos atributos carregdos com as informações do formulário.   
        if (setorP == null) {
            setor = 0;
        } else {
            setor = Integer.parseInt(setorP);
        }
        if ("1".equals(req.getParameter("ativo"))) {
            ativo = 1;
        }

//Populando o objeto e alterando as informações        
        CapUsuario capUs = new CapUsuario(pkUsuarioCap, divisao, setor, cargo, ativo, perfil, login, nome, rf, email, loginSession);
        capUsDAO.altUsuarioCap(capUs);
        capUs = capUsDAO.detalheUsuarioCap(pkUsuarioCap);

        req.setAttribute("capUs", capUs);
        req.setAttribute("msg", "gravou");

        return "CapUsuarioRU.jsp";

    }
}
