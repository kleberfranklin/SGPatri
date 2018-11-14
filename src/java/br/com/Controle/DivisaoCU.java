/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Utilitario.Transformar;
import br.com.Modelo.*;
import br.com.Modelo.Divisao;
import br.com.Modelo.DivisaoDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class DivisaoCU implements Logica{
@Override
public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
    
    Divisao dv = new Divisao();    
    DivisaoDAO dvDAO = new DivisaoDAO();
    HttpSession session = req.getSession();

//Atributo       
    int pkDivisao;
    String sigla, divisao, nrSimproc, nrSei, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    sigla = req.getParameter("sigla").toUpperCase();
    divisao = Transformar.utf8(Transformar.priMaiuscula(req.getParameter("divisao")));
    nrSimproc = req.getParameter("nrSimproc");
    nrSei = req.getParameter("nrSei");
    loginSessio =(String) session.getAttribute("sessionLogin");

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkDivisao = Integer.parseInt(req.getParameter("pkDivisao"));
        dv = new Divisao(pkDivisao, sigla, divisao, nrSimproc, nrSei, loginSessio);
        dvDAO.upDivisao(dv);
        execucao ="view";
        req.setAttribute("dv", dv);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        dv = new Divisao(sigla, divisao, nrSimproc, nrSei, loginSessio);
        dvDAO.cDivisao(dv);
        req.setAttribute("msg","gravou");
        return "DivisaoCRU.jsp";
    }
    return "DivisaoCRU.jsp?execucao="+execucao;
    } 
}
