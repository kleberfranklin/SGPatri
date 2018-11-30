/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.DispositivoLegalDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class DispositivoLegalDelete implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
        DispositivoLegalDAO disDAO = new DispositivoLegalDAO();
        
        int pkDispLegal, pkAutoStage;
        
        pkDispLegal = Integer.parseInt(req.getParameter("pkDispLegal"));
        pkAutoStage = Integer.parseInt(req.getParameter("pkAutoStage"));
        
        disDAO.delDispositivo(pkDispLegal, pkAutoStage);
        
        
        return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkAutoStage;
    }
    
}
