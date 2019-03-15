/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.*;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class CatSubFinalidadeListaSelect implements Logica{
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
        CatSubFinalidadeDAO catSubDAO = new CatSubFinalidadeDAO();
        
        int pkCatFinalidade = Integer.parseInt(req.getParameter("pkCatFinalidade"));
        List<CatSubFinalidade> listSubFinalidade = catSubDAO.listSelectSubCatFinalidade(pkCatFinalidade);
        
    req.setAttribute("listSubFinalidade", listSubFinalidade);
    return "include/selectSubFinalidade.jsp";
    }
    
}
