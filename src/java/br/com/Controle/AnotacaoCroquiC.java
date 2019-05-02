/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AnotacaoCroqui;
import br.com.Modelo.AnotacaoCroquiDAO;
import br.com.Modelo.AnotacaoCroquiTeste;
import br.com.Modelo.AnotacaoCroquiTesteDAO;
import br.com.Modelo.Logica;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class AnotacaoCroquiC implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        AnotacaoCroquiDAO anotaCroquiDAO = new AnotacaoCroquiDAO();
        AnotacaoCroquiTesteDAO anotaCroquiTDAO = new AnotacaoCroquiTesteDAO();

        //Atributos
        int pkAnotacaoExpediente;
        String execucao;

//Carregando atributos com a informações do formlário.        
//        pkAnotacaoExpediente = Integer.parseInt(req.getParameter("pkAnotacaoExpediente"));
        execucao = req.getParameter("execucao");

//Validação dos atributos carregdos com as informações do formulário.  

        List<AnotacaoCroqui> listTpExpediente = anotaCroquiTDAO.listTpExpediente();
        for (AnotacaoCroqui L : listTpExpediente) {
            System.out.println(L.getSgTipoExpediente());
        }
        req.setAttribute("listaTpExp", listTpExpediente);

        //Consulta no banco e popula o objeto        
//        AnotacaoCroquiTeste anotCroquiT = anotaCroquiTDAO.detalheAnotacaoCroqui(pkAnotacaoExpediente);
//        req.setAttribute("anotCroqui", anotCroquiT);
        req.setAttribute("execucao", execucao);

//        if (pkAnotacaoExpediente != null) {
//            req.setAttribute("edit", execucao);
//        } else if (pkAnotacaoExpediente == null) {
//            req.setAttribute("insert", execucao);
//        }
        return "AnotacaoCroquiC.jsp";
//        return "ControllerServlet?acao=AnotacaoCroquiC&pkAnotacaoExpediente" + pkAnotacaoExpediente + "&execucao=";
//        <a  href = "ControllerServlet?acao=AnotacaoCroquiC&pkAnotacaoExpediente=${anotCroqui.pkAnotacaoExpediente}&pg=${pg}&pi=${pi}&pf=${pf}&execucao=view" > <i 
//        class="ace-icon fa fa-search-plus"></i > < / a >
    }
}
