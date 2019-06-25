/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AgendamentoSala;
import br.com.Modelo.AgendamentoSalaDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class AgendamentoSalaLista implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        AgendamentoSalaDAO agendaSalaDAO = new AgendamentoSalaDAO();

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
        String qHorarioIni, qHorarioFim, qNome, dtDataTxt;
        Date qData = null;

        DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");

//Carregando atributos com a informações do formlário.         
        pgS = req.getParameter("pg");
        piS = req.getParameter("pi");
        pfS = req.getParameter("pf");
        q = req.getParameter("q");

        qHorarioIni = req.getParameter("horarioIni");
        qHorarioFim = req.getParameter("horarioFim");
        qNome = req.getParameter("nmNome");
        dtDataTxt = req.getParameter("dtDataTxt");

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

        if (qData != null) {
        }

        if (null == qHorarioIni || qHorarioIni.equals("")) {
            qHorarioIni = "";
        } else {
            qHorarioIni = Transformar.getRemoveAccents(Transformar.getUFT8(qHorarioIni)).trim();
        }

        if (null == qHorarioFim || qHorarioFim.equals("")) {
            qHorarioFim = "";
        } else {
            qHorarioFim = Transformar.getRemoveAccents(Transformar.getUFT8(qHorarioFim)).trim();
        }

        if (null == qNome || qNome.equals("")) {
            qNome = "";
        } else {
            qNome = Transformar.getRemoveAccents(Transformar.getUFT8(qNome)).trim();
        }

//Carregando a quantidade de registro para calculdo da quantidade de paginas        
        qtdRegistro = agendaSalaDAO.qtdAgendamentoSala();
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
        List<AgendamentoSala> listAgendamento = new AgendamentoSalaDAO().listAgendamentoSala(qData, dtDataTxt, qHorarioIni, qHorarioFim, qNome, qtdLinha, offset, q);
        req.setAttribute("listAgendamento", listAgendamento);

        return "AgendamentoSalaLista.jsp?"
                + "pg=" + pg
                + "&pi=" + pi
                + "&pf=" + pf
                + "&qtdPg=" + qtdPg
                + "&totalRes=" + qtdRegistro
                + "&horarioIni=" + qHorarioIni
                + "&horarioFim=" + qHorarioFim
                + "&nmNome=" + qNome
                + "&dtData=" + qData
                + "&dtDataTxt=" + dtDataTxt
                + "&q=" + q;

    }
}
