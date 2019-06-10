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
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class AutoCessaoDispLegalUC implements Logica {
@Override      
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        HttpSession session = req.getSession();
        
        DispositivoLegalDAO dispDAO = new DispositivoLegalDAO();
        AutoCessaoDAO autoDAO = new AutoCessaoDAO();
        List<DispositivoLegal> lisDis = new ArrayList<DispositivoLegal>();
   
        String[] tpDispositivo;
        String[] nrDispositivo;
        String[] dtDispositivo;
        String execucao,loginSessio;
        int pkAutoStage, cont, nrVerDisplegal;
        
        execucao = req.getParameter("execucao");
        
        tpDispositivo = req.getParameterValues("tpDispositivo");
        nrDispositivo = req.getParameterValues("numDispositivo");
        dtDispositivo = req.getParameterValues("dtDispositivo");
        pkAutoStage = Integer.parseInt(req.getParameter("pkAutoCessao"));
        loginSessio = (String) session.getAttribute("sessionLogin");
        nrVerDisplegal = Integer.parseInt(req.getParameter("nrVerDisplegal"));
        cont = tpDispositivo.length;
        
        for (int i=0; i<cont; i++){
        DispositivoLegal disp = new DispositivoLegal();
            disp.setFkAutoCessao(pkAutoStage);
            disp.setFkTipoDisplegal(Integer.parseInt(tpDispositivo[i]));
            disp.setNrDisp(nrDispositivo[i]);
            disp.setDtDisp(dtDispositivo[i]);
            disp.setNmLogin(loginSessio);
        lisDis.add(disp);             
        }
        
        for(DispositivoLegal d : lisDis){
            dispDAO.cDisLegal(d);
        }
        autoDAO.upAutoCessaoVerificadoDisLegal(pkAutoStage, nrVerDisplegal);
        req.setAttribute("msg", "true");
        req.setAttribute("tipoAler", "success");
        req.setAttribute("alert", "Sucesso! ");
        req.setAttribute("txtAlert", "O(s) dispositivo(s) legal(is) foi(ram) salvo(s)");
        return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoStage="+pkAutoStage+"&execucao="+execucao;  
    }
}
