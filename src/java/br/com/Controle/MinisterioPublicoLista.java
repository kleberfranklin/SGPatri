/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.MinisterioPublico;
import br.com.Modelo.MinisterioPublicoDAO;
import br.com.Utilitario.Transformar;
import java.sql.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class MinisterioPublicoLista implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        MinisterioPublicoDAO ministPublicoDAO = new MinisterioPublicoDAO();

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
        String q, pgS, piS, pfS;
        int qtdLinha = 8;
        int maxPg = 10;
        int sobraMaxPg = 0;
        Date dtIni = null, dtFim = null;
        String dtIniS, dtFimS;
        String qOrigem, qEndereco, qAssunto, qProcedimento, qSolicitado, qOficioResposta, dtRespostaTxt;
        Date dtResposta;

//Carregando atributos com a informações do formlário.         
        pgS = req.getParameter("pg");
        piS = req.getParameter("pi");
        pfS = req.getParameter("pf");
        q = req.getParameter("q");
        dtIniS = req.getParameter("dtIni");
        dtFimS = req.getParameter("dtFim");

        qOrigem = req.getParameter("nmOrigem");
        qEndereco = req.getParameter("dsEndereco");
        qSolicitado = req.getParameter("qSolicitado");
        qAssunto = req.getParameter("dsAssunto");
        qOficioResposta = req.getParameter("qOficioResposta");
        qProcedimento = req.getParameter("nrProcedimento");
        dtRespostaTxt = req.getParameter("dtResposta");

        //Validação dos atributos carregdos com as informações do formulário.            
        if (q == null) {
            q = "";
        } else if (!"".equals(q)) {
            q = Transformar.getPriMaiuscula(q);
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

        if (dtRespostaTxt == null || "".equals(dtRespostaTxt)) {
            dtResposta = null;
        } else {
            dtResposta = Date.valueOf(dtRespostaTxt);
        }

        if (null == qOrigem || qOrigem.equals("")) {
            qOrigem = "";
        } else {
            qOrigem = Transformar.getRemoveAccents(Transformar.getUFT8(qOrigem)).trim();
        }

        if (null == qEndereco || qEndereco.equals("")) {
            qEndereco = "";
        } else {
            qEndereco = Transformar.getRemoveAccents(Transformar.getUFT8(qEndereco)).trim();
        }

        if (null == qOficioResposta || qOficioResposta.equals("")) {
            qOficioResposta = "";
        } else {
            qOficioResposta = Transformar.getRemoveAccents(Transformar.getUFT8(qOficioResposta)).trim();
        }

        if (null == qSolicitado || qSolicitado.equals("")) {
            qSolicitado = "";
        } else {
            qSolicitado = Transformar.getRemoveAccents(Transformar.getUFT8(qSolicitado)).trim();
        }

        if (null == qAssunto || qAssunto.equals("")) {
            qAssunto = "";
        } else {
            qAssunto = Transformar.getRemoveAccents(Transformar.getUFT8(qAssunto)).trim();
        }

        if (null == qProcedimento || qProcedimento.equals("")) {
            qProcedimento = "";
        } else {
            qProcedimento = Transformar.getRemoveAccents(Transformar.getUFT8(qProcedimento)).trim();
        }

//Carregando a quantidade de registro para calculdo da quantidade de paginas        
        qtdRegistro = ministPublicoDAO.qtdMinisterioPublico(qOrigem, qEndereco, qAssunto, qProcedimento, qSolicitado, qOficioResposta, dtIni, dtFim);
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

        //Populando o objeto lista 
        List<MinisterioPublico> listMinistPublico = new MinisterioPublicoDAO().listMinisterioPublico(qOrigem, qEndereco, qAssunto, qProcedimento, qSolicitado, qOficioResposta, dtRespostaTxt, dtIni, dtFim, qtdLinha, offset, q);
        req.setAttribute("listMinistPublico", listMinistPublico);

        return "MinisterioPublicoLista.jsp?"
                + "pg=" + pg
                + "&pi=" + pi
                + "&pf=" + pf
                + "&qtdPg=" + qtdPg
                + "&totalRes=" + qtdRegistro
                + "&nmOrigem=" + qOrigem
                + "&dsEndereco=" + qEndereco
                + "&dsAssunto=" + qAssunto
                + "&nrProcedimento=" + qProcedimento
                + "&nmSolicitado=" + qSolicitado
                + "&cdOficioResposta=" + qOficioResposta
                + "&dtResposta=" + dtRespostaTxt
                + "&dtIni=" + dtIni
                + "&dtFim=" + dtFim
                + "&q=" + q;

    }
}
