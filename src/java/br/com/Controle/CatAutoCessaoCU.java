/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CatAutoCessao;
import br.com.Modelo.CatAutoCessaoDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class CatAutoCessaoCU implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
        
    CatAutoCessao catauto = new CatAutoCessao();
    CatAutoCessaoDAO catautoDAO = new CatAutoCessaoDAO();
    
    HttpSession session = req.getSession();

//Atributo       
    int pkCatAutoCessao;
    String sigla, catautocessao, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    sigla = req.getParameter("sigla").toUpperCase();
    catautocessao = Transformar.getRemoveAccents(req.getParameter("catautocessao")).toUpperCase().trim();
    loginSessio =(String) session.getAttribute("sessionLogin");
    

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkCatAutoCessao = Integer.parseInt(req.getParameter("pkCatAutoCessao"));
        catauto = new CatAutoCessao(pkCatAutoCessao, sigla, catautocessao, loginSessio);
        catautoDAO.upCatAutoCessao(catauto);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        catauto = new CatAutoCessao(sigla, catautocessao, loginSessio);
        catautoDAO.cCatAutoCessao(catauto);
        req.setAttribute("msg","gravou");
    }
    
    return "ControllerServlet?acao=CatAutoCessaoLista";
    }
}
