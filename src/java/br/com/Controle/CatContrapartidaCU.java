/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CatContrapartida;
import br.com.Modelo.CatContrapartidaDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class CatContrapartidaCU implements Logica{
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
        
    CatContrapartida catContra = new CatContrapartida();
    CatContrapartidaDAO catContraDAO = new CatContrapartidaDAO();
    HttpSession session = req.getSession();

//Atributo       
    int pkCatContrapartida;
    String sigla, catContrapartida, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    sigla = req.getParameter("sigla").toUpperCase();
    catContrapartida = Transformar.utf8(Transformar.priMaiuscula(req.getParameter("catContrapartida")));
    loginSessio =(String) session.getAttribute("sessionLogin");
    

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkCatContrapartida = Integer.parseInt(req.getParameter("pkCatContrapartida"));
        catContra = new CatContrapartida(pkCatContrapartida, sigla, catContrapartida, loginSessio);
        catContraDAO.upCatContra(catContra);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        catContra = new CatContrapartida(sigla, catContrapartida, loginSessio);
        catContraDAO.cCatContra(catContra);
        req.setAttribute("msg","gravou");
    }
    
    return "ControllerServlet?acao=CatContrapartidaLista";
    }
}
