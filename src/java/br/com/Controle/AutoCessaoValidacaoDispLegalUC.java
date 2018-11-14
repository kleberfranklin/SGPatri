/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

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
public class AutoCessaoValidacaoDispLegalUC implements Logica {
@Override      
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        HttpSession session = req.getSession();
        
        DispositivoLegalDAO dispDAO = new DispositivoLegalDAO();
        List<DispositivoLegal> lisDis = new ArrayList<DispositivoLegal>();
   
        String[] tpDispositivo;
        String[] nrDispositivo;
        String[] dtDispositivo;
        String loginSessio;
        int pkAutoStage, cont;
        
        tpDispositivo = req.getParameterValues("tpDispositivo");
        nrDispositivo = req.getParameterValues("numDispositivo");
        dtDispositivo = req.getParameterValues("dtDispositivo");
        pkAutoStage = Integer.parseInt(req.getParameter("pkAutoStage"));
        loginSessio = (String) session.getAttribute("sessionLogin");
        cont = tpDispositivo.length;
        
        for (int i=0; i<cont; i++){
        DispositivoLegal disp = new DispositivoLegal();
            disp.setFkAutoCessao(pkAutoStage);
            disp.setFkTipoDisplegal(Integer.parseInt(tpDispositivo[i]));
            disp.setNrDisp(nrDispositivo[i]);
            disp.setDtDisp(dtDispositivo[i]);
            disp.setNmLogin(loginSessio);
            System.out.println(dtDispositivo[i]);
        lisDis.add(disp);             
        }
        
//        for(int i=0; i<lisDis.size(); i++){
//            dispDAO.cDisLegal(d);
//            System.out.println(lisDis.get(i).getDtDisp());
//        }
            for(DispositivoLegal d : lisDis){
                dispDAO.cDisLegal(d);
                System.out.println(d);
            }
        
        return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkAutoStage;  
    }
}
