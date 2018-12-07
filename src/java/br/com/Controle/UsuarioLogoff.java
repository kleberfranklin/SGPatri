/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class UsuarioLogoff implements Logica{
@Override    
      public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {   
    
// remover os atributos das session!          
        HttpSession session = req.getSession();
                session.removeAttribute("sessionPkUs");
                session.removeAttribute("sessionLogin");
                session.removeAttribute("sessionNome");
                session.removeAttribute("sessionPkDivisao");
                session.removeAttribute("sessionSgDivisao");
                session.removeAttribute("sessionNmDivisao");
                session.removeAttribute("sessionPkSetor");
                session.removeAttribute("sessionSgSetor");
                session.removeAttribute("sessionNmSetor");
                session.removeAttribute("sessionPerfil");
                session.removeAttribute("sessionCargo");
                session.removeAttribute("sessionFoto");
                session.removeAttribute("sessionStatus");
                session.removeAttribute("sessionLer");
                session.removeAttribute("sessionInserir");
                session.removeAttribute("sessionEditar");
                session.removeAttribute("sessionExcluir");
                session.removeAttribute("sessionPainel");
                session.removeAttribute("sessionDesPerfil");
            session.invalidate();
        return "Login.jsp";
      }     
    
}
