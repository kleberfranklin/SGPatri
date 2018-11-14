/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CatFinalidade;
import br.com.Modelo.CatFinalidadeDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class CatFinalidadeDetalhe implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
//Atributo  
    int pkCatFinalidade;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkCatFinalidade = Integer.parseInt(req.getParameter("pkCatFinalidade"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    CatFinalidadeDAO catFinDAO = new CatFinalidadeDAO();
    CatFinalidade catFin = catFinDAO.detalheCatFinalidade(pkCatFinalidade);

    req.setAttribute("catFin", catFin);
    req.setAttribute("execucao", execucao);
        
    return "CatFinalidadeCRU.jsp";
    }
}
