/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class TipoAutoCessaoDetalhe implements Logica{
     @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
//Atributo  
    int pkTipoAutoCessao;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkTipoAutoCessao = Integer.parseInt(req.getParameter("pkTipoAutoCessao"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    TipoAutoCessaoDAO tpCessaoDAO = new TipoAutoCessaoDAO();
    TipoAutoCessao tpCessao  = tpCessaoDAO.detalheTpCessao(pkTipoAutoCessao);

    req.setAttribute("tpCessao", tpCessao);
    req.setAttribute("execucao", execucao);
        
    return "TipoAutoCessaoCU.jsp";
    }
    
}
