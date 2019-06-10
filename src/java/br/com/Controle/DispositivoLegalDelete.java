/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AutoCessaoDAO;
import br.com.Modelo.DispositivoLegal;
import br.com.Modelo.DispositivoLegalDAO;
import br.com.Modelo.Logica;
import java.util.List;
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
        AutoCessaoDAO autoDAO = new AutoCessaoDAO();
        String execucao;
        int pkDispLegal, pkAutoCessao;
        
        execucao = req.getParameter("execucao");
        pkDispLegal = Integer.parseInt(req.getParameter("pkDispLegal"));
        pkAutoCessao = Integer.parseInt(req.getParameter("pkAutoCessao"));
        
        disDAO.delDispositivo(pkDispLegal, pkAutoCessao);
        
        List <DispositivoLegal> listDisp = disDAO.listDispositivo(pkAutoCessao);
        
        if(listDisp.isEmpty()){
            autoDAO.upAutoCessaoVerificadoDisLegal(pkAutoCessao, 0);
        }
        
        req.setAttribute("msg", "true");
        req.setAttribute("tipoAler", "success");
        req.setAttribute("alert", "Sucesso! ");
        req.setAttribute("txtAlert", "O dispositivo legal foi excluido.");
        return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao="+pkAutoCessao+"&execucao="+execucao;
    }
    
}
