/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AutoCessaoValidacao;
import br.com.Modelo.AutoCessaoValidacaoDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class AutoCessaoValidacaoDetalhe implements Logica{
    @Override    
     public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
         
        AutoCessaoValidacaoDAO autoVaDAO = new AutoCessaoValidacaoDAO();

//Atributos
        int pkAutoStage = 0;
//Carregando atributos com a informações do formlário.        
        pkAutoStage = Integer.parseInt(req.getParameter("pkAutoStage"));

//Validação dos atributos carregdos com as informações do formulário.  
        if (pkAutoStage == 0){
            return "ControllerServlet?acao=AutoCessaoListaPagFiltro";
        }
//Consulta no banco e popula o objeto        
        AutoCessaoValidacao auto = autoVaDAO.detalheAutoCessao(pkAutoStage);
        req.setAttribute("auto", auto);
        
        return "AutoCessaoValidacao.jsp";
        
    }    
}
