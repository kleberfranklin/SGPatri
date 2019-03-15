/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class AutoCessaoGrafico implements Logica{
    @Override    
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        List<AutoCessao>  listGrafico = new ArrayList<AutoCessao>();
        AutoCessaoDAO autoDAO = new AutoCessaoDAO();
        listGrafico = autoDAO.statusValidacao();
      
        
        req.setAttribute("listGrafico", listGrafico);
        return "AutoCessaoGraficoValidacao.jsp";                
    }
    
}
