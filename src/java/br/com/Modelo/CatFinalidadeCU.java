/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class CatFinalidadeCU  implements Logica{
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
        
    CatFinalidade catFin = new CatFinalidade();
    CatFinalidadeDAO catFinDAO = new CatFinalidadeDAO();
    HttpSession session = req.getSession();

//Atributo       
    int pkCatFinalidade;
    String sigla, catFinalidade, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    sigla = req.getParameter("sigla").toUpperCase();
    catFinalidade = Transformar.utf8(Transformar.priMaiuscula(req.getParameter("catFinalidade")));
    loginSessio =(String) session.getAttribute("sessionLogin");
    

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkCatFinalidade = Integer.parseInt(req.getParameter("pkCatFinalidade"));
        catFin = new CatFinalidade(pkCatFinalidade, sigla, catFinalidade, loginSessio);
        catFinDAO.upCatFinalidade(catFin);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        catFin = new CatFinalidade(sigla, catFinalidade, loginSessio);
        catFinDAO.cCatFinalidade(catFin);
        req.setAttribute("msg","gravou");
    }
    
    return "ControllerServlet?acao=CatFinalidadeLista";
    }
}
