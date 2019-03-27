/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.CapPublicacao;
import br.com.Modelo.CapPublicacaoDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import java.sql.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class CapPublicacaoLista implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        CapPublicacaoDAO publiDAO = new CapPublicacaoDAO();

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
        int qtdLinha = 6;
        int maxPg = 10;
        int sobraMaxPg = 0;

        int codCap = 0;
        Date dtIni = null, dtFim = null;
        String dtIniS, dtFimS, qCodCap;

//Carregando atributos com a informações do formlário.         
        pgS = req.getParameter("pg");
        piS = req.getParameter("pi");
        pfS = req.getParameter("pf");

        qCodCap = req.getParameter("qCodCap");
        dtIniS = req.getParameter("dtIni");
        dtFimS = req.getParameter("dtFim");

        //Validação dos atributos carregdos com as informações do formulário.    
        if (qCodCap == null|| "".equals(qCodCap)) {
            codCap = 0;
        }else{
            codCap = Integer.parseInt(qCodCap);
        } 

        if (dtIniS == null || "".equals(dtIniS)) {
            dtIni = Date.valueOf("1500-01-01");
        } else {
            dtIni = Date.valueOf(dtIniS);
        }

        if (dtFimS == null || "".equals(dtFimS)) {
            dtFim = Date.valueOf("3000-12-31");
        } else {
            dtFim = Date.valueOf(dtFimS);
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
        qtdRegistro = publiDAO.qtdPubliCap(codCap, dtIni, dtFim);
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
        List<CapPublicacao> listPublicacao = new CapPublicacaoDAO().listPubliCap(codCap, dtIni, dtFim, qtdLinha, offset);
        req.setAttribute("listPublicacao", listPublicacao);
        req.setAttribute("codCap", codCap);
        req.setAttribute("dtIni", dtIni);
        req.setAttribute("dtFim", dtFim);
        

        return "CapPublicacaoLista.jsp?pg=" + pg
                + "&pi=" + pi
                + "&pf=" + pf
                + "&qtdPg=" + qtdPg
                + "&totalRes=" + qtdRegistro
                + "&codCap=" + codCap
                + "&dtIni=" + dtIni
                + "&dtFim=" + dtFim;

    }

}
