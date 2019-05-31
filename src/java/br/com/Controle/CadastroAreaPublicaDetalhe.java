/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CadastroAreaPublica;
import br.com.Modelo.CadastroAreaPublicaDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.*;

/**
 *
 * @author x369482
 */
public class CadastroAreaPublicaDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

//Atributo  
        int pkCap;
        String execucao, geojson, centralizarMapa;

//Carregando os atributos com as informações do formulário     
        pkCap = Integer.parseInt(req.getParameter("pkCap"));
        execucao = req.getParameter("execucao");
        geojson = req.getParameter("geojson");

        CadastroAreaPublicaDAO capDAO = new CadastroAreaPublicaDAO();
        CadastroAreaPublica cap = capDAO.detalheCadastroAreaPublica(pkCap);

//        centralizarMapa = cap.getGeojson().substring(1, 35) + "]";
        //centraliza o mapa
        String[] centraMapa = cap.getGeojson().substring(1).split(", ");
        String centraMapa1 = centraMapa[0];
        String centraMapa2 = centraMapa[1];
        centralizarMapa = centraMapa1 + ", " + centraMapa2;

        req.setAttribute("geojson", geojson);
        req.setAttribute("cap", cap);
        req.setAttribute("execucao", execucao);
        req.setAttribute("centralizarMapa", centralizarMapa);

        System.out.println(centralizarMapa);

        return "CadastroAreaPublicaCRU.jsp?execucao";
    }
}
