///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.Controle;
//
//import br.com.Modelo.Logica;
//import br.com.Utilitario.Transformar;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.Locale;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import br.com.Modelo.AnotacaoExpediente;
//import br.com.Modelo.AnotacaoExpedienteDAO;
//
///**
// *
// * @author x369482
// */
//public class AnotacaoExpedienteCU implements Logica {
//
//    @Override
//    public String executa(HttpServletRequest req,
//            HttpServletResponse res) throws Exception {
//
//        AnotacaoExpediente cadsic = new AnotacaoExpediente();
//        AnotacaoExpedienteDAO cadsicDAO = new AnotacaoExpedienteDAO();
//        HttpSession session = req.getSession();
//        Calendar calendario = new GregorianCalendar();
//        DateFormat textToDate = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
//
//// Atributo
//        int pkCadastroSic, fkUsuario, fkEnderecos, nrInformacaoDgpi;
//        String cdProcesso, cdCroqui, cdTid, cdArea, cdExpediente, nmInteressado, dsAssunto,
//                dsObservacao, nmLogin, execucao;
//
////Carregando os atributos com as informações do formulário     
//        pkCadastroSic = Integer.parseInt(req.getParameter("pkCadastroSic"));
//        nrInformacaoDgpi = Integer.parseInt(req.getParameter("nrInformacaoDgpi"));
//        cdProcesso = req.getParameter("cdProcesso").trim();
//        cdTid = req.getParameter("cdTid").trim();
//        cdCroqui = req.getParameter("cdCroqui").trim();
//        cdArea = req.getParameter("cdArea").trim();
//        cdExpediente = req.getParameter("cdExpediente").trim();
//        nmInteressado = req.getParameter("nmInteressado").trim();
//        dsAssunto = req.getParameter("dsAssunto").trim();
//        dsObservacao = req.getParameter("dsObservacao").trim();
//        nmLogin = req.getParameter("nmLogin").trim();
//        execucao = req.getParameter("execucao");
//        
//        fkEnderecos = Integer.parseInt(req.getParameter("fkEnderecos"));
//        fkUsuario = Integer.parseInt(req.getParameter("fkUsuario"));
//                
////Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
//        if ("edit".equals(execucao)) {
//            pkCadastroSic = Integer.parseInt(req.getParameter("pkCadastroSic"));
//                cadsic = new AnotacaoExpediente(pkCadastroSic, fkUsuario, fkEnderecos, nrInformacaoDgpi, cdProcesso, cdTid, cdCroqui, cdArea, cdExpediente, nmInteressado, dsAssunto, dsObservacao, nmLogin);
//                cadsicDAO.upCadastroSic(cadsic);
//            req.setAttribute("msg", "alterou");
//
//        } else if ("insert".equals(execucao)) {
//            pkCadastroSic = Integer.parseInt(req.getParameter("pkCadastroSic"));
//                cadsic = new AnotacaoExpediente(pkCadastroSic, fkUsuario, fkEnderecos, nrInformacaoDgpi, cdProcesso, cdTid, cdCroqui, cdArea, cdExpediente, nmInteressado, dsAssunto, dsObservacao, nmLogin);
//                cadsicDAO.upCadastroSic(cadsic);
//            req.setAttribute("msg", "gravou");
//        }
//
//        return "ControllerServlet?acao=CadastroSicDetalhe&pkCadastroSic" + pkCadastroSic + "&execucao=";
//    }
//
//}
