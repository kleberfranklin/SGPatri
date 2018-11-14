/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
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
            session.removeAttribute("sessionLogin");
            session.removeAttribute("sessionNome");
            session.removeAttribute("sessionDivisao");
            session.removeAttribute("sessionPefil");
            session.removeAttribute("sessionFoto");
            session.removeAttribute("sessionStatus");
        return "Login.jsp";
         
      }     
    
}
