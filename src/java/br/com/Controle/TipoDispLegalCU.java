/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoDispositivoLegal;
import br.com.Modelo.TipoDispositivoLegalDAO;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class TipoDispLegalCU implements Logica {
    
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{

        TipoDispositivoLegal tipodisp = new TipoDispositivoLegal();
        TipoDispositivoLegalDAO tipodispDAO = new TipoDispositivoLegalDAO();
        HttpSession session = req.getSession();

//Atributo       
    int pkTipoDispLegal;
    String sigla, tipodispositivo, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    sigla = req.getParameter("sigla").toUpperCase();
    tipodispositivo = Transformar.getRemoveAccents(req.getParameter("tipodispositivo")).toUpperCase().trim();
    loginSessio =(String) session.getAttribute("sessionLogin");
    

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkTipoDispLegal = Integer.parseInt(req.getParameter("pkTipoDispLegal"));
        tipodisp = new TipoDispositivoLegal(pkTipoDispLegal, sigla, tipodispositivo, loginSessio);
        tipodispDAO.upTipoDisp(tipodisp);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        tipodisp = new TipoDispositivoLegal(sigla, tipodispositivo, loginSessio);
        tipodispDAO.cTipoDisp(tipodisp);
        req.setAttribute("msg","gravou");
    }
    
    return "ControllerServlet?acao=TipoDispLegalLista";
    }
    
}
