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
public class CatSubFinalidadeDetalhe implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
//Atributo  
    int pkCatSubFinalidade;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkCatSubFinalidade = Integer.parseInt(req.getParameter("pkCatSubFinalidade"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    CatSubFinalidadeDAO catSubFinDAO = new CatSubFinalidadeDAO();
    CatSubFinalidade catSub = catSubFinDAO.detalheCatSubFinalidade(pkCatSubFinalidade);

    req.setAttribute("catSub", catSub);
    req.setAttribute("execucao", execucao);
        
    return "CatSubFinalidadeCRU.jsp";
    }
}
