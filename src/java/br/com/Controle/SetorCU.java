/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.Setor;
import br.com.Modelo.SetorDAO;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class SetorCU implements Logica{
@Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
        
    Setor st = new Setor();    
    SetorDAO stDAO = new SetorDAO();
    HttpSession session = req.getSession();

//Atributo       
    int pkSetor, fkDivisao;
    String sigla, setor, nrSimproc, nrSei, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    fkDivisao = Integer.parseInt(req.getParameter("fkDivisao"));
    
    sigla = req.getParameter("sigla").toUpperCase();
    setor = Transformar.getRemoveAccents(req.getParameter("setor")).toUpperCase().trim();
    nrSimproc = req.getParameter("nrSimproc");
    nrSei = req.getParameter("nrSei");
    loginSessio =(String) session.getAttribute("sessionLogin");

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkSetor = Integer.parseInt(req.getParameter("pkSetor"));
        st = new Setor(pkSetor, fkDivisao, sigla, setor, nrSimproc, nrSei, loginSessio);
        stDAO.upSetor(st);
        
        execucao ="view";
        st = stDAO.detalheSetor(pkSetor); //Populo novamente o objeto para exibir as informações do campo Divisao
        req.setAttribute("st", st);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        st = new Setor(fkDivisao, sigla, setor, nrSimproc, nrSei, loginSessio);
        stDAO.cSetor(st);
        req.setAttribute("msg","gravou");
        return "SetorCRU.jsp";
    }
    return "SetorCRU.jsp?execucao="+execucao;
   }  
}
