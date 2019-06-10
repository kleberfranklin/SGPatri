/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CatContrapartida;
import br.com.Modelo.CatContrapartidaDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class CatContrapartidaDetalhe implements Logica{
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
//Atributo  
    int pkCatContrapartida;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkCatContrapartida = Integer.parseInt(req.getParameter("pkCatContrapartida"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    CatContrapartidaDAO catContraDAO = new CatContrapartidaDAO();
    CatContrapartida catContra = catContraDAO.detalheCatContra(pkCatContrapartida);

    req.setAttribute("catContra", catContra);
    req.setAttribute("execucao", execucao);
        
    return "CatContrapartidaCRU.jsp";
    }
    
}
