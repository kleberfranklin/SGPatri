//package br.com.Controle;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//import br.com.Modelo.Logica;
//import br.com.Utilitario.Transformar;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import br.com.Modelo.AnotacaoExpedienteDAO;
//import br.com.Modelo.AnotacaoExpediente;
//
///**
// *
// * @author x369482
// */
//public class AnotacaoExpedienteDetalhe implements Logica {
//
//    @Override
//    public String executa(HttpServletRequest req,
//            HttpServletResponse res) throws Exception {
//
//        AnotacaoExpedienteDAO cadsicDAO = new AnotacaoExpedienteDAO();
//
////Atributos
//        int pkCadastroSic = 0;
//        String execucao;
//
////Carregando atributos com a informações do formlário.        
//        pkCadastroSic = Integer.parseInt(req.getParameter("pkCadastroSic"));
//        execucao = req.getParameter("execucao");
//
////Validação dos atributos carregdos com as informações do formulário.  
//        if (pkCadastroSic == 0) {
//            return "ControllerServlet?acao=CadastroSicPagFiltro";
//        }
//
////Consulta no banco e popula o objeto        
//        AnotacaoExpediente expediente = cadsicDAO.detalheAnotacaoExpediente(pkCadastroSic);
//        req.setAttribute("expediente", expediente);
//        req.setAttribute("execucao", execucao);
//        return "AnotacaoExpediente.jsp";
//    }
//}
