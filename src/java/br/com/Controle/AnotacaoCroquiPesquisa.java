/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import java.util.List;
import br.com.Modelo.AnotacaoCroqui;
import br.com.Modelo.AnotacaoCroquiDAO;
import br.com.Modelo.TipoExpediente;
import br.com.Modelo.TipoExpedienteDAO;
import br.com.Modelo.TipoAssunto;
import br.com.Modelo.TipoAssuntoDAO;
import br.com.Modelo.TipoDespacho;
import br.com.Modelo.TipoDespachoDAO;
import br.com.Utilitario.Transformar;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author x369482
 */
public class AnotacaoCroquiPesquisa implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception, SQLException {

        
        AnotacaoCroquiDAO anotaCroquiDAO = new AnotacaoCroquiDAO();
        TipoExpedienteDAO tpExpDAO = new TipoExpedienteDAO();
        TipoAssuntoDAO tpAssuntoDAO = new TipoAssuntoDAO();
        TipoDespachoDAO tpDespaDAO = new TipoDespachoDAO();

//Atributos
       int pkTpExpediente = 0;
        String  sgTpExpediente, cdExpediente,primeiro, execucao, alert="visible";
        
        int pg, pi, pf, qtdRegistro, qtdPg, sobraMaxPg=0, offset;
        int qtdLinha = 4;
        int maxPg = 10;
        
        String pgS, piS, pfS;
        
//Carregando atributos com a informações do formlário.        
        execucao = req.getParameter("execucao");
        primeiro = req.getParameter("primeiro");
        sgTpExpediente = req.getParameter("sgTpExpediente");
        cdExpediente = req.getParameter("cdExpediente");
        pgS = req.getParameter("pg");
        piS = req.getParameter("pi");
        pfS = req.getParameter("pf");
        
        pkTpExpediente = tpExpDAO.pesquisaPorNome(sgTpExpediente);
            
        List<AnotacaoCroqui> listAnotCroqui = new ArrayList<AnotacaoCroqui>();
        List<TipoExpediente> listTpExpediente = tpExpDAO.listSelectTipoExpediente();
        List<TipoAssunto> listTpAssunto = tpAssuntoDAO.listSelectTipoAssunto();
        List<TipoDespacho> listTpDespacho = tpDespaDAO.listSelectTipoDespacho(); 
        
//Validação dos atributos carregdos com as informações do formulário.  

        if("true".equals(primeiro)){
            alert = "hidden";
            req.setAttribute("alert",alert);
            req.setAttribute("primeiro", primeiro);
            req.setAttribute("listaTpExp", listTpExpediente);
        return "AnotacaoCroquiPesquisa.jsp";
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
        
        qtdRegistro = anotaCroquiDAO.qtdAnotCroqui(pkTpExpediente, Transformar.getRemoveAccents(cdExpediente.toUpperCase()));
        qtdPg = qtdRegistro / qtdLinha;
     
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
        
        
        listAnotCroqui = anotaCroquiDAO.pesquisaCroqui(pkTpExpediente, Transformar.getRemoveAccents(cdExpediente.toUpperCase()), qtdLinha, offset);
        
        
        
        for (AnotacaoCroqui a : listAnotCroqui){
            TipoExpediente tpExp = tpExpDAO.detalheTipoExpediente(a.getTpExpediente().getPkTipoExpediente());
            a.setTpExpediente(tpExp);
        }
                
        if( "insert".equals(execucao) ){
            req.setAttribute("execucao", execucao);
            req.setAttribute("sgTpExpediente", sgTpExpediente);
            req.setAttribute("cdExpediente", Transformar.getRemoveAccents(cdExpediente.toUpperCase()));
            req.setAttribute("listaTpExp", listTpExpediente);
            req.setAttribute("listTpAssunto", listTpAssunto);
            req.setAttribute("listTpDespacho", listTpDespacho);
            req.setAttribute("disabled", "disabled-li-menu");
            req.setAttribute("tabCroquiActive", "in active");
        return "AnotacaoCroquiCRU.jsp?execucao=insert";
        
        }else if(!listAnotCroqui.isEmpty()){
            req.setAttribute("alert","hidden");
            req.setAttribute("resultado", "visible");
            req.setAttribute("sgTpExpediente", sgTpExpediente);
            req.setAttribute("cdExpediente", Transformar.getRemoveAccents(cdExpediente.toUpperCase())); 
            req.setAttribute("listaTpExp", listTpExpediente);
            req.setAttribute("listAnotCroqui", listAnotCroqui);
            req.setAttribute("pg", pg);
            req.setAttribute("pi", pi);
            req.setAttribute("pf", pf);
            req.setAttribute("qtdPg", qtdPg);
            req.setAttribute("totalRes", qtdRegistro);
        return "AnotacaoCroquiPesquisa.jsp";
        }
        
            req.setAttribute("alert",alert);
            req.setAttribute("resultado", "hidden");
            req.setAttribute("sgTpExpediente", sgTpExpediente);
            req.setAttribute("cdExpediente", Transformar.getRemoveAccents(cdExpediente.toUpperCase()));
            req.setAttribute("primeiro", primeiro);
            req.setAttribute("listaTpExp", listTpExpediente);
        return "AnotacaoCroquiPesquisa.jsp?";
        
    }
}
