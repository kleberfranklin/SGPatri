/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;


import br.com.Modelo.AutoCessaoValidacaoDAO;
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
    AutoCessaoValidacaoDAO autoDAO = new AutoCessaoValidacaoDAO();
    
    HttpSession session = req.getSession();

//Atributo       
    int pkValidacao=0, pkAutoStage, fkDivisao, nrVerValidacao;
    String divisao, nmstatus, nmProblema, nmTarefa, dsObsservacao, loginSessio, pgValidacao, execucao, qAC;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    pgValidacao = req.getParameter("pgValidacao");
    nmstatus = req.getParameter("nmstatus");
    qAC = req.getParameter("qAC");
    nrVerValidacao = Integer.parseInt(req.getParameter("nrVerValidacao"));
    pkAutoStage = Integer.parseInt(req.getParameter("pkAutoStage"));
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
        dsObsservacao =  Transformar.removeAccents(dsObsservacao).toUpperCase().trim();
    }
    
        
//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkValidacao = Integer.parseInt(req.getParameter("pkValidacao"));
        va = new Validacao(pkAutoStage, fkDivisao, nmProblema, nmTarefa, nmstatus, dsObsservacao, loginSessio, pkValidacao);
        vaDAO.upValidacao(va);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        va = new Validacao(pkAutoStage, fkDivisao, nmProblema, nmTarefa, nmstatus, dsObsservacao, loginSessio);
        pkValidacao = vaDAO.cValidacao(va);
        req.setAttribute("msg","gravou");
    }
//    if ("EmCorrecao".equals(nmstatus)){
//        autoDAO.upAutoCessaoVerificadoArquivoAc(pkAutoStage, 0);
//        autoDAO.upAutoCessaoVerificadoArquivoPlanta(pkAutoStage, 0);
//        autoDAO.upAutoCessaoVerificadoDisLegal(pkAutoStage, 0);
//        autoDAO.upAutoCessaoVerificadoAuto(pkAutoStage,0);
//        autoDAO.upAutoCessaoVerificadoValidacao(pkValidacao, 0, pkAutoStage, nmstatus);
//    }else{
//        autoDAO.upAutoCessaoVerificadoValidacao(pkValidacao, nrVerValidacao, pkAutoStage, nmstatus);
//        return "ControllerServlet?acao=AutoCessaoValidacaoLista";
//    }
//    
        
    
    autoDAO.upAutoCessaoVerificadoValidacao(pkValidacao, nrVerValidacao, pkAutoStage, nmstatus);
    req.setAttribute("qAC", qAC);
    return "ControllerServlet?acao=AutoCessaoValidacaoLista";
//    return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkAutoStage;
    
    }
}
