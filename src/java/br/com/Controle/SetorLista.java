/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.Logica;
import br.com.Modelo.Setor;
import br.com.Modelo.Setor;
import br.com.Modelo.SetorDAO;
import br.com.Modelo.SetorDAO;
import br.com.Utilitario.Transformar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class SetorLista implements Logica{
    @Override    
    public String executa(HttpServletRequest req, 
                HttpServletResponse res) throws Exception {
        
        
        SetorDAO stDAO = new SetorDAO();
/**
*  Atributos: 
*  pg = número da página atual 
*  pi = número da página inicial
*  pf = número da página final
*  qtdRegistro = quantidade de registro geral
*  qtdPg = número de quantidade de páginas 
*  qtdLinha = número de quantidade de linhas por página
*  maxPg = quantidade de paginação a ser exibida (1, 2 , 3 ...)
*  sobraMaxPg = auxiliar para o calculdo da quantidade de pagina
* */
        int pg, pi, pf, qtdRegistro, qtdPg, offset;
        String q, pgS, piS, pfS;
        int qtdLinha = 8;
        int maxPg = 10;
        int sobraMaxPg = 0;

//Carregando atributos com a informações do formlário.                      
        pgS = req.getParameter("pg");
        piS = req.getParameter("pi");
        pfS = req.getParameter("pf");
        q = req.getParameter("q");
        
//Validação dos atributos carregdos com as informações do formulário.         
        if (q == null){
            q ="";
        }else if(!"".equals(q)) {
            q = Transformar.removeAccents(q).toUpperCase().trim();
        }
        if (pgS == null) {
            pg = 0;
        } else {
            pg = Integer.parseInt(pgS);
        }
        if (piS == null) {
            pi = 0;
        } else {
            pi = Integer.parseInt(piS);
        }
        if (pfS == null) {
            pf = 0;
        } else {
            pf = Integer.parseInt(pfS);
        }
//Carregando a quantidade de registro para calculdo da quantidade de paginas               
        qtdRegistro = stDAO.qdSetor(q);
        qtdPg = qtdRegistro / qtdLinha;

//Logica da paginação          
        if ((qtdRegistro % qtdLinha) != 0) {
            qtdPg = qtdPg+1;
        }

        if (qtdPg < maxPg) {
            maxPg = qtdPg;
        }
        if (qtdPg > maxPg) {
            sobraMaxPg = qtdPg - maxPg;
            if (sobraMaxPg > maxPg){
                sobraMaxPg = maxPg;  
            }
        }
        if (pg == 0) {
            pg = 1;
        }
        if (pf == 0) { 
            pf = maxPg;
        }
        if (pg == pf && pf != qtdPg && pf < qtdPg) {
               pi = pf;
               pf = pf + sobraMaxPg;
        } else if (pg == pi){
            pi = pi - maxPg;
            pf = pf - sobraMaxPg;
            pg = pg - 1;
        }
        offset = ((pg * qtdLinha)- qtdLinha);

//Populando o objeto lista             
        List<Setor> listSetor = new SetorDAO().listSetor(qtdLinha, offset, q);
        req.setAttribute("listSetor", listSetor);
        
    return "SetorLista.jsp?pg="+pg+"&pi="+pi+"&pf="+pf+"&qtdPg="+qtdPg+"&totalRes="+qtdRegistro+"&q="+q;
    }
    
    
    
}
