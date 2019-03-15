/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.Setor;
import br.com.Modelo.SetorDAO;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class SetorListaSelect implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
       
        SetorDAO stDAO = new SetorDAO();
        
        int idDivivisao = Integer.parseInt(req.getParameter("idDivivisao"));
        String execucao = req.getParameter("execucao");
        
        List<Setor> selecSetor = new ArrayList<Setor>();
        selecSetor = stDAO.selecSetor(idDivivisao);
                
        req.setAttribute("selecSetor", selecSetor);
        
        if ("edit".equals(execucao)){
            return "include/selectSetorAlterar.jsp";
        }
    
    return "include/selectSetorInserir.jsp";
    }
    
}
