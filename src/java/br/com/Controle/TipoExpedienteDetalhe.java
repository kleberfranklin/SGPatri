/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoExpediente;
import br.com.Modelo.TipoExpedienteDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class TipoExpedienteDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

//Atributo  
        int pkTipoExpediente;
        String execucao;

//Carregando os atributos com as informações do formulário     
        pkTipoExpediente = Integer.parseInt(req.getParameter("pkTipoExpediente"));
        execucao = req.getParameter("execucao");

//Consulta no banco e populando o objeto   
        TipoExpedienteDAO tpExDAO = new TipoExpedienteDAO();
        TipoExpediente tpEx = tpExDAO.detalheTipoExpediente(pkTipoExpediente);

        req.setAttribute("tpEx", tpEx);
        req.setAttribute("execucao", execucao);

        return "TipoExpedienteCRU.jsp";
    }
}
