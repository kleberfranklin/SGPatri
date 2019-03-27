/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoAssunto;
import br.com.Modelo.TipoAssuntoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class TipoAssuntoDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

//Atributo  
        int pkTipoAssunto;
        String execucao;

//Carregando os atributos com as informações do formulário     
        pkTipoAssunto = Integer.parseInt(req.getParameter("pkTipoAssunto"));
        execucao = req.getParameter("execucao");

//Consulta no banco e populando o objeto   
        TipoAssuntoDAO tpAsDAO = new TipoAssuntoDAO();
        TipoAssunto tpAs = tpAsDAO.detalheTipoAssunto(pkTipoAssunto);

        req.setAttribute("tpAs", tpAs);
        req.setAttribute("execucao", execucao);

        return "TipoAssuntoCRU.jsp";
    }
}
