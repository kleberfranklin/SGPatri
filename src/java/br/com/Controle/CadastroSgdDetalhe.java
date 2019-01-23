/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CadastroSGD;
import br.com.Modelo.CadastroSgdDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class CadastroSgdDetalhe implements Logica {
        @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
//Atributo  
    int pkCadastroSgd;
    String execucao;
   
//Carregando os atributos com as informações do formulário     
    pkCadastroSgd = Integer.parseInt(req.getParameter("pkCadastroSgd"));
    execucao = req.getParameter("execucao");
        
//Consulta no banco e populando o objeto   
    CadastroSgdDAO cadSgdDAO = new CadastroSgdDAO();
    CadastroSGD cadSgd = cadSgdDAO.detalheCadSgd(pkCadastroSgd);

    req.setAttribute("cadSgd", cadSgd);
    req.setAttribute("execucao", execucao);
        
    return "CadastroSGD.jsp";
    }
    
}

    

