/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.TipoAutoCessao;
import br.com.Modelo.TipoAutoCessaoDAO;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class TipoAutoCessaoCU implements Logica{
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
        
    TipoAutoCessao tpCessao = new TipoAutoCessao();
    TipoAutoCessaoDAO tpCessaoDAO = new TipoAutoCessaoDAO();
    HttpSession session = req.getSession();

//Atributo       
    int pkTipoAutoCessao, fkCatAutoCessao;
    String nmTipoAtuoCessao, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    fkCatAutoCessao = Integer.parseInt(req.getParameter("fkCatAutoCessao"));
    nmTipoAtuoCessao = Transformar.getRemoveAccents(req.getParameter("nmTipoAtuoCessao")).toUpperCase().trim();
    loginSessio =(String) session.getAttribute("sessionLogin");
    

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkTipoAutoCessao = Integer.parseInt(req.getParameter("pkTipoAutoCessao"));
        tpCessao = new TipoAutoCessao(pkTipoAutoCessao, fkCatAutoCessao, nmTipoAtuoCessao, loginSessio);
        tpCessaoDAO.upTipoCessao(tpCessao);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        tpCessao = new TipoAutoCessao(fkCatAutoCessao, nmTipoAtuoCessao, loginSessio);
        tpCessaoDAO.cTipoCessao(tpCessao);
        req.setAttribute("msg","gravou");
    }
    
    return "ControllerServlet?acao=TipoAutoCessaoLista";
    }
}
