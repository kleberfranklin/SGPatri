/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Utilitario.Transformar;
import br.com.Modelo.Logica;
import br.com.Modelo.Perfil;
import br.com.Modelo.PerfilDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class PerfilCU implements Logica{
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception{
        
    Perfil perf = new Perfil();    
    PerfilDAO perfDAO = new PerfilDAO();
    HttpSession session = req.getSession();

//Atributo       
    int pkPerfil, ler=0, inserir=0, editar=0, excluir=0, gerenciar=0;
    String perfil, descricao, loginSessio, execucao;
    
//Carregando os atributos com as informações do formulário
    execucao = req.getParameter("execucao");
    perfil = Transformar.getPriMaiuscula(req.getParameter("perfil"));
    descricao = Transformar.getRemoveAccents(req.getParameter("descricao")).toUpperCase().trim();
    loginSessio =(String) session.getAttribute("sessionLogin");
    
//Validação dos atributos carregdos com as informações do formulário.       
    if("1".equals(req.getParameter("ler")) ){
        ler = 1;
    }
    
    if("1".equals(req.getParameter("inserir")) ){
        inserir = 1;
    }
    
    if("1".equals(req.getParameter("editar")) ){
        editar = 1;
    }
    
    if("1".equals(req.getParameter("excluir")) ){
        excluir = 1;
    }
    
    if("1".equals(req.getParameter("gerenciar")) ){
        gerenciar = 1;
    }
    

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
    if ("edit".equals(execucao)){
        pkPerfil = Integer.parseInt(req.getParameter("pkPerfil"));
        perf = new Perfil(pkPerfil, ler, inserir, editar, excluir, gerenciar, perfil, descricao, loginSessio);
        perfDAO.upPerfil(perf);
        req.setAttribute("msg","alterou");

    }else if ("insert".equals(execucao)) {
        perf = new Perfil(ler, inserir, editar, excluir, gerenciar, perfil, descricao, loginSessio);
        perfDAO.cPerfil(perf);
        req.setAttribute("msg","gravou");
    }
    
    return "ControllerServlet?acao=PerfilLista";
    }

}