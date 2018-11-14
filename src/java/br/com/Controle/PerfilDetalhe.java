/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.*;
import br.com.Modelo.Logica;
import br.com.Modelo.Perfil;
import br.com.Modelo.PerfilDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class PerfilDetalhe implements Logica  {
@Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
//Atributo  
    int pkPerfil;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkPerfil = Integer.parseInt(req.getParameter("pkPerfil"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    PerfilDAO pfDAO = new PerfilDAO();
    Perfil per = pfDAO.detalhePerfil(pkPerfil);

    req.setAttribute("per", per);
    req.setAttribute("execucao", execucao);
        
    return "PerfilCRU.jsp";
    }
    
}
