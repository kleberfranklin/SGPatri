/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import br.com.Modelo.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class SetorDetalhe implements Logica {
@Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
//Atributo  
    int pkSetor;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkSetor = Integer.parseInt(req.getParameter("pkSetor"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    SetorDAO stDAO = new SetorDAO();
    Setor st = stDAO.detalheSetor(pkSetor);

    req.setAttribute("st", st);
    req.setAttribute("execucao", execucao);
        
    return "SetorCRU.jsp";
    }
    
    
}
