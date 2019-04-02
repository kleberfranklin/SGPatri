/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoDespacho;
import br.com.Modelo.TipoDespachoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class TipoDespachoDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

//Atributo  
        int pkTipoDespacho;
        String execucao;

//Carregando os atributos com as informações do formulário     
        pkTipoDespacho = Integer.parseInt(req.getParameter("pkTipoDespacho"));
        execucao = req.getParameter("execucao");

//Consulta no banco e populando o objeto   
        TipoDespachoDAO tpExDAO = new TipoDespachoDAO();
        TipoDespacho tpEx = tpExDAO.detalheTipoDespacho(pkTipoDespacho);

        req.setAttribute("tpEx", tpEx);
        req.setAttribute("execucao", execucao);

        return "TipoDespachoCRU.jsp";
    }
}
