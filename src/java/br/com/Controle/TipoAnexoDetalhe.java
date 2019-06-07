/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoAnexo;
import br.com.Modelo.TipoAnexoDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class TipoAnexoDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

//Atributo  
        int pkTipoAnexo;
        String execucao;

//Carregando os atributos com as informações do formulário     
        pkTipoAnexo = Integer.parseInt(req.getParameter("pkTipoAnexo"));
        execucao = req.getParameter("execucao");

//Consulta no banco e populando o objeto   
        TipoAnexoDAO tpAnDAO = new TipoAnexoDAO();
        TipoAnexo tpAn = tpAnDAO.detalheTipoAnexo(pkTipoAnexo);

        req.setAttribute("tpAn", tpAn);
        req.setAttribute("execucao", execucao);

        return "TipoAnexoCRU.jsp";
    }
}
