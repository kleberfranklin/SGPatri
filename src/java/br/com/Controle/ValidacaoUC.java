/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;


import br.com.Modelo.AutoCessaoDAO;
import br.com.Modelo.Logica;
import br.com.Modelo.Validacao;
import br.com.Modelo.ValidacaoDAO;
import br.com.Utilitario.Transformar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class ValidacaoUC implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
        
    Validacao va = new Validacao();
    ValidacaoDAO vaDAO = new ValidacaoDAO();
    AutoCessaoDAO autoDAO = new AutoCessaoDAO();
    HttpSession session = req.getSession();

//Atributo       
    int pkValidacao, pkAutoCessao, fkDivisao;
    String divisao, nmstatus, nmProblema, nmTarefa, dsObsservacao, loginSessio;
    
//Carregando os atributos com as informações do formulário
    pkAutoCessao = Integer.parseInt(req.getParameter("pkAutoCessao"));
    nmstatus = req.getParameter("nmstatus");
    nmProblema = req.getParameter("nmProblema");
    nmTarefa = req.getParameter("nmTarefa");
    dsObsservacao = req.getParameter("dsObsservacao");
    divisao = req.getParameter("fkDivisao");
    loginSessio =(String) session.getAttribute("sessionLogin");
    
    
    if(divisao == null || divisao.equals("")){
        fkDivisao=0;
    }else{
        fkDivisao = Integer.parseInt(divisao);
    }
    
    if(null == dsObsservacao || !dsObsservacao.equals("")){
        dsObsservacao =  Transformar.getRemoveAccents(dsObsservacao).toUpperCase().trim();
    }
        
    va = new Validacao(pkAutoCessao, fkDivisao, nmProblema, nmTarefa, nmstatus, dsObsservacao, loginSessio);
    pkValidacao = vaDAO.cValidacao(va);
    
    req.setAttribute("msg", "true");
    req.setAttribute("tipoAler", "success");
    req.setAttribute("alert", "Sucesso! ");

    if("Validado".equals(nmstatus)){
        req.setAttribute("txtAlert", "Finalizado o processo de validação do Auto Cessão");
        autoDAO.upAutoCessaoVerificadoValidacao(pkValidacao, 1, pkAutoCessao, nmstatus);
    }else{
        req.setAttribute("txtAlert", "A(s) informação(ões) foi(ram) salva(s).");
        autoDAO.upAutoCessaoVerificadoValidacao(pkValidacao, 0, pkAutoCessao, nmstatus);
    }
    
    return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao="+pkAutoCessao+"&execucao=view";

    
    }
}
