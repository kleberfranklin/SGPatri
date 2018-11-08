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
public class TipoDispLegalDetalhe implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
//Atributo  
    int pkTipoDispLegal;
    String execucao;

//Carregando os atributos com as informações do formulário     
    pkTipoDispLegal = Integer.parseInt(req.getParameter("pkTipoDispLegal"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto
    TipoDispositivoLegalDAO tipdispDAO = new TipoDispositivoLegalDAO();
    TipoDispositivoLegal tipodisp = tipdispDAO.detalheTpDisp(pkTipoDispLegal);
    

    req.setAttribute("tipodisp", tipodisp);
    req.setAttribute("execucao", execucao);
        
    return "TipoDispLegalCRU.jsp";
    }
    
    
    
}
