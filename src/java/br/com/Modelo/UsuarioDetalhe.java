/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;


import br.com.Modelo.Usuario;
import br.com.Modelo.UsuarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class UsuarioDetalhe implements Logica{
@Override    
     public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        
        UsuarioDAO usDAO = new UsuarioDAO(); 

//Atributos         
        int pkUsuairo = 0;
        pkUsuairo  = Integer.parseInt(req.getParameter("pkUsuario"));
                
//Consulta no banco e populando o objeto        
        Usuario us = usDAO.detalheUsuario(pkUsuairo);
        req.setAttribute("us", us);
        
        return "UsuarioRU.jsp";
        
    }    
}
