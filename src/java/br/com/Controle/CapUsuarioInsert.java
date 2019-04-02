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
public class CapUsuarioInsert implements Logica {
@Override    
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        CapUsuarioDAO capUsDAO = new CapUsuarioDAO();
        HttpSession session = req.getSession();
//Atributo      
        int ativo=0,setor, divisao, cargo, perfil;
        String setorP, login, rf, nome, email, loginSessio;

//Carregando os atributos com as informações do formulário        
        login = req.getParameter("login");
        rf = req.getParameter("rf");
        nome = Transformar.getUFT8(Transformar.getPriMaiuscula(req.getParameter("nome")));
        email = req.getParameter("email");
        loginSessio = (String) session.getAttribute("sessionLogin");
        divisao = Integer.parseInt(req.getParameter("divisao"));
        perfil = Integer.parseInt(req.getParameter("perfil"));
        cargo = Integer.parseInt(req.getParameter("cargo"));
        setorP = req.getParameter("setor");

         
//Validação dos atributos carregdos com as informações do formulário.   
        if (setorP == null) {
            setor = 0;
        } else {
            setor =Integer.parseInt(setorP);
        }
        if ("1".equals(req.getParameter("ativo"))) {
            ativo = 1;
        }
//Populando o objeto e gravando no banco
        CapUsuario capUs = new CapUsuario(divisao, setor, ativo, perfil, cargo, login, nome, rf, email, loginSessio);
        capUsDAO.cUsuarioCap(capUs);
        
        req.setAttribute("msg", "gravou");
        return "CapUsuarioC.jsp";

    }
}
    

