package br.com.Controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.Modelo.AnotacaoCroqui;
import br.com.Modelo.AnotacaoCroquiDAO;
import br.com.Modelo.Logica;
import br.com.Modelo.TipoAssunto;
import br.com.Modelo.TipoAssuntoDAO;
import br.com.Modelo.TipoDespacho;
import br.com.Modelo.TipoDespachoDAO;
import br.com.Modelo.TipoExpediente;
import br.com.Modelo.TipoExpedienteDAO;
import br.com.Utilitario.Transformar;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class AnotacaoCroquiLista implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        AnotacaoCroquiDAO anotCroquiDAO = new AnotacaoCroquiDAO();
        
        TipoExpedienteDAO tpExpDAO = new TipoExpedienteDAO();
        TipoAssuntoDAO tpAssuntoDAO = new TipoAssuntoDAO();
        TipoDespachoDAO tpDespaDAO = new TipoDespachoDAO();
        
        List<TipoExpediente> listaTpExp = tpExpDAO.listSelectTipoExpediente();
        List<TipoAssunto> listTpAssunto = tpAssuntoDAO.listSelectTipoAssunto();
        List<TipoDespacho> listTpDespacho = tpDespaDAO.listSelectTipoDespacho(); 

        /**
         * Atributos: pg = número da página atual pi = número da página inicial
         * pf = número da página final qtdRegistro = quantidade de registro
         * geral qtdPg = número de quantidade de páginas qtdLinha = número de
         * quantidade de linhas por página maxPg = quantidade de paginação a ser
         * exibida (1, 2 , 3 ...) sobraMaxPg = auxiliar para o calculdo da
         * quantidade de pagina
         *
         */
        int pg, pi, pf, qtdRegistro, qtdPg, offset;
        String pgS, piS, pfS;
        int qtdLinha = 5;
        int maxPg = 10;
        int sobraMaxPg = 0;


        String qCroqui, qArea, sgTpExpediente, cdExpediente, qAssunto, qInteressado, qLocal;

//Carregando atributos com a informações do formlário.         
        pgS = req.getParameter("pg");
        piS = req.getParameter("pi");
        pfS = req.getParameter("pf");

        qCroqui = req.getParameter("qCroqui");
        qArea = req.getParameter("qArea");
        sgTpExpediente = req.getParameter("sgTpExpediente");
        cdExpediente = req.getParameter("cdExpediente");
        qAssunto = req.getParameter("qAssunto");
        qInteressado = req.getParameter("qInteressado");
        qLocal = req.getParameter("qLocal");
        
        

        //Validação dos atributos carregdos com as informações do formulário.    
        if (qCroqui == null) {
            qCroqui = "";
        } 
        if (qArea == null) {
            qArea = "";
        } 

        if (sgTpExpediente == null) {
            sgTpExpediente = "";
        }
        
        if (cdExpediente == null) {
            cdExpediente = "";
        } else if (!"".equals(cdExpediente)) {
            cdExpediente = Transformar.getRemoveAccents(cdExpediente.toUpperCase());
        }

        if (qAssunto == null) {
            qAssunto = "";
        } 

        if (qInteressado == null) {
            qInteressado = "";
        } 
        if (qLocal == null) {
            qLocal = "";
        } else if(!"".equals(qLocal)){
             qLocal = qLocal.toUpperCase();
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
        qtdRegistro = anotCroquiDAO.qtdAnotCroquiLista(qCroqui, qArea, sgTpExpediente, cdExpediente, qAssunto, qInteressado, qLocal);
        qtdPg = qtdRegistro / qtdLinha;

//Logica da paginação            
        if ((qtdRegistro % qtdLinha) != 0) {
            qtdPg = qtdPg + 1;
        }

        if (qtdPg < maxPg) {
            maxPg = qtdPg;
        }
        if (qtdPg > maxPg) {
            sobraMaxPg = qtdPg - maxPg;
            if (sobraMaxPg > maxPg) {
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
        } else if (pg == pi) {
            pi = pi - maxPg;
            pf = pf - sobraMaxPg;
            pg = pg - 1;
        }
        offset = ((pg * qtdLinha) - qtdLinha);

        // Populando o objeto lista 
        List<AnotacaoCroqui> listAntCroqui = new AnotacaoCroquiDAO().lisAnotCroquiLista(qCroqui, qArea, sgTpExpediente, cdExpediente, qAssunto, qInteressado, qLocal, qtdLinha, offset);
        req.setAttribute("listaTpExp", listaTpExp);
        req.setAttribute("listTpAssunto", listTpAssunto);
        req.setAttribute("listAntCroqui", listAntCroqui);
        req.setAttribute("qCroqui", qCroqui);
        req.setAttribute("qArea", qArea);
        req.setAttribute("sgTpExpediente", sgTpExpediente);
        req.setAttribute("cdExpediente", cdExpediente);
        req.setAttribute("qAssunto", qAssunto);
        req.setAttribute("qInteressado", qInteressado);
        req.setAttribute("qLocal", qLocal);

//        req.setAttribute("totalRes", qtdRegistro);

        return "AnotacaoCroquiLista.jsp?pg="+pg+"&pi="+pi+"&pf="+pf+"&qtdPg="+qtdPg+"&totalRes="+qtdRegistro;
               
    }

}
