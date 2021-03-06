/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AutoCessao;
import br.com.Modelo.AutoCessaoDAO;
import br.com.Modelo.Logica;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class AutoCessaoListaValidacao implements Logica {
@Override    
    public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
    AutoCessaoDAO autoVaDAO = new AutoCessaoDAO();
    
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
        
        int pg, pi, pf, qtdRegistro, qtdPg, sobraMaxPg=0, offset;
        int qtdLinha = 6;
        int maxPg = 10;
        
        String pgS, piS, pfS;
        
        String  qAC, qProcesso, qTpProcesso, qVigor, qStatus;
        
//Carregando atributos com a informações do formlário.           
        pgS = req.getParameter("pg");
        piS = req.getParameter("pi");
        pfS = req.getParameter("pf");
        
        qProcesso = req.getParameter("qProcesso");
        qTpProcesso = req.getParameter("qTpProcesso");
        qAC = req.getParameter("qAC");
        qVigor = req.getParameter("qVigor");
        qStatus = req.getParameter("qStatus");

        
//Validação dos atributos carregdos com as informações do formulário.         
       
        if (qAC == null){
            qAC ="";
        }
        if (qProcesso == null){
            qProcesso ="";
        }
        if (qVigor == null){
            qVigor="";
        }
        if (qStatus == null){
            qStatus="";
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
     
        qtdRegistro = autoVaDAO.qtdAutoCessaoPesquisa(qAC, qProcesso, qVigor, qStatus);
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
        List<AutoCessao>  listAuto = new AutoCessaoDAO().listPagFiltro(qAC, qProcesso, qVigor, qStatus, qtdLinha, offset);
        req.setAttribute("listAuto", listAuto);
        req.setAttribute("qAC", qAC);
        req.setAttribute("qProcesso", qProcesso);
        req.setAttribute("qTpProcesso", qTpProcesso);
        req.setAttribute("qVigor", qVigor);
        req.setAttribute("qStatus", qStatus);
                   
        return  "AutoCessaoListaValidacao.jsp?pg="+pg+"&pi="+pi+"&pf="+pf+"&qtdPg="+qtdPg+"&totalRes="+qtdRegistro; 
    
    }    
    
}
