package br.com.Controle;

import br.com.Modelo.AnotacaoCroqui;
import br.com.Modelo.AnotacaoCroquiTesteDAO;
import br.com.Modelo.Logica;
import br.com.Modelo.MinisterioPublico;
import br.com.Modelo.MinisterioPublicoDAO;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author x369482
 */
public class MinisterioPublicoDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {


//Atributo  
        int pkMinisterioPublico;
        String execucao;

//Carregando os atributos com as informações do formulário     
        pkMinisterioPublico = Integer.parseInt(req.getParameter("pkMinisterioPublico"));
        execucao = req.getParameter("execucao");

//pegando a lista dos tipos de expedientes  
        AnotacaoCroquiTesteDAO anotaCroquiTDAO = new AnotacaoCroquiTesteDAO();

        List<AnotacaoCroqui> listTpExpediente = anotaCroquiTDAO.listTpExpediente();
//        for (AnotacaoCroqui L : listTpExpediente) {
//            System.out.println(L.getSgTipoExpediente());
//        }
        req.setAttribute("listaTpExp", listTpExpediente);

        MinisterioPublicoDAO ministPublicoDAO = new MinisterioPublicoDAO();
        MinisterioPublico ministPublico = ministPublicoDAO.detalheMinisterioPublico(pkMinisterioPublico);

        req.setAttribute("ministPublico", ministPublico);
        req.setAttribute("execucao", execucao);

        return "MinisterioPublicoCRU.jsp?execucao";
    }
}
