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
public class CatAutoCessaoDetalhe implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
//Atributo  
    int pkCatAutoCessao;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkCatAutoCessao = Integer.parseInt(req.getParameter("pkCatAutoCessao"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    CatAutoCessaoDAO catautoDAO = new CatAutoCessaoDAO();
    CatAutoCessao catauto = catautoDAO.detalheCatAuto(pkCatAutoCessao);

    req.setAttribute("catauto", catauto);
    req.setAttribute("execucao", execucao);
        
    return "CatAutoCessaoCRU.jsp";
    }
    
}
