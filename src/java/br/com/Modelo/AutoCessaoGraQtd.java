/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;


import br.com.Modelo.AutoCessao;
import br.com.Modelo.AutoCessaoDAO;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class AutoCessaoGraQtd implements Logica{
@Override    
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {

//Atributos        
        String ter ="";
        ter = req.getParameter("ter");

        List<AutoCessao> listAuto;
        
//        if("".equals(ter) || null == ter){
            listAuto = new AutoCessaoDAO().listQtdPorCessao();
//        }else{
//            listAuto = new AutoCessaoDAO().listQtdPorCessaoTerceiro();
//        }
//Popula lista do objeto            
        req.setAttribute("listAuto", listAuto);
    
        return "AutoCessaoGrafico.jsp&ter="+ter;
    }
    
    
}
