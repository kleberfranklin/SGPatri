/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;


import br.com.Modelo.AutoCessao;
import br.com.Modelo.AutoCessao;
import br.com.Modelo.AutoCessaoDAO;
import br.com.Modelo.AutoCessaoDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class AutoCessaoDetalhe implements Logica{
@Override    
     public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
         
        AutoCessaoDAO autoDAO = new AutoCessaoDAO();

//Atributos
        int pkCessao = 0;
//Carregando atributos com a informações do formlário.        
        pkCessao = Integer.parseInt(req.getParameter("pkCessao"));

//Validação dos atributos carregdos com as informações do formulário.  
        if (pkCessao == 0){
            return "ControllerServlet?acao=AutoCessaoListaPagFiltro";
        }
//Consulta no banco e popula o objeto        
        AutoCessao auto = autoDAO.detalheAutoCessao(pkCessao);
        req.setAttribute("auto", auto);
        
        return "AutoCessaoDetalhe.jsp";
        
    }    
}
