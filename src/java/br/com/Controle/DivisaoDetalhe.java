/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.*;
import br.com.Modelo.Divisao;
import br.com.Modelo.DivisaoDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class DivisaoDetalhe implements Logica{
 @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
     
//Atributo  
    int pkDivisao;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkDivisao = Integer.parseInt(req.getParameter("pkDivisao"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    DivisaoDAO dvDAO = new DivisaoDAO();
    
    Divisao dv = dvDAO.detalheDivisao(pkDivisao);

    req.setAttribute("dv", dv);
    req.setAttribute("execucao", execucao);
    
    return "DivisaoCRU.jsp";    
    }
    
    
    
}
