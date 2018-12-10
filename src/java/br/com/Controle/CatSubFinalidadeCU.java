/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CatSubFinalidade;
import br.com.Modelo.CatSubFinalidadeDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class CatSubFinalidadeCU  implements Logica{
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
        
    CatSubFinalidade catSub = new CatSubFinalidade();
    CatSubFinalidadeDAO catSubDAO = new CatSubFinalidadeDAO();
    HttpSession session = req.getSession();

//Atributo       
    int pkCatSubFinalidade, fkCategoria;
    String sigla, catSubFinalidade, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    fkCategoria = Integer.parseInt(req.getParameter("fkCategoria"));
    sigla = req.getParameter("sigla").toUpperCase();
    catSubFinalidade = Transformar.removeAccents(req.getParameter("catSubFinalidade")).toUpperCase().trim();
    loginSessio =(String) session.getAttribute("sessionLogin");
    

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkCatSubFinalidade = Integer.parseInt(req.getParameter("pkCatSubFinalidade"));
        catSub = new CatSubFinalidade(pkCatSubFinalidade, fkCategoria, sigla, catSubFinalidade, loginSessio);
        catSubDAO.upCatSubFinalidade(catSub);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        catSub = new CatSubFinalidade(fkCategoria, sigla, catSubFinalidade, loginSessio);
        catSubDAO.cCatSubFinalidade(catSub);
        req.setAttribute("msg","gravou");
    }
    
    return "ControllerServlet?acao=CatSubFinalidadeLista";
    }
}
