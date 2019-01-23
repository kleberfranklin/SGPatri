package br.com.Controle;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.Controle;
//
//import br.com.Modelo.Logica;
//import br.com.Utilitario.Transformar;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import br.com.Modelo.CadastroSicDAO;
//import br.com.Modelo.CadastroSic;
//
///**
// *
// * @author x369482
// */
//public class CadastroSicDetalhe implements Logica{
//    @Override
//    public String executa(HttpServletRequest req,
//            HttpServletResponse res) throws Exception {
//
//        CadastroSicDAO cadsicDAO = new CadastroSicDAO();
//
////Atributos
//    int pkCadastroSic = 0;
//    String execucao;
//
////Carregando atributos com a informações do formlário.        
//    pkCadastroSic = Integer.parseInt(req.getParameter("pkCadastroSic"));
//    execucao = req.getParameter("execucao");
//    
////Validação dos atributos carregdos com as informações do formulário.  
//    if (pkCadastroSic ==0){
//        return "ControllerServlet?acao=CadastroSicPagFiltro";
//    }
//
////Consulta no banco e popula o objeto        
//    CadastroSic sic = cadsicDAO.detalheCadastroSic(pkCadastroSic);
//    req.setAttribute("sic", sic);
//    req.setAttribute("execucao", execucao);
//    return "CadastroSic.jsp";
//}
//}