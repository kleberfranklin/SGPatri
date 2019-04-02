/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CapUsuario;
import br.com.Modelo.CapUsuarioDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class CapUsuarioDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        CapUsuarioDAO capUsDAO = new CapUsuarioDAO();

//Atributos         
        int pkUsuarioCap = 0;
        pkUsuarioCap = Integer.parseInt(req.getParameter("pkUsuarioCap"));

//Consulta no banco e populando o objeto        
        CapUsuario capUs = capUsDAO.detalheUsuarioCap(pkUsuarioCap);
        req.setAttribute("capUs", capUs);

        return "CapUsuarioRU.jsp";

    }
}
