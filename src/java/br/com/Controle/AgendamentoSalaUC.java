/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.AgendamentoSala;
import br.com.Modelo.AgendamentoSalaDAO;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author x369482
 */
public class AgendamentoSalaUC implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        AgendamentoSala agendaSala = new AgendamentoSala();
        AgendamentoSalaDAO agendaSalaDAO = new AgendamentoSalaDAO();

        HttpSession session = req.getSession();

//Atributo       
        int pkAgendamentoSala = 0;
        String horarioIni, horarioFim, nmNome, nmSetor, dsObservacao, dthrAtualizacao, nmLogin, execucao, dtDataTxt;
        Date dtData;

//Carregando os atributos com as informações do formulário
        horarioIni = req.getParameter("horarioIni");
        horarioFim = req.getParameter("horarioFim");
        nmNome = req.getParameter("nmNome");
        nmSetor = req.getParameter("nmSetor");
        dtDataTxt = req.getParameter("dtData");
        dsObservacao = req.getParameter("dsObservacao");
        nmLogin = (String) session.getAttribute("sessionLogin");
        dthrAtualizacao = req.getParameter("dthrAtualizacao");

        execucao = req.getParameter("execucao");

        //Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
        if (null == dtDataTxt || dtDataTxt.equals("")) {
            dtData = null;
        } else {
            dtData = Date.valueOf(dtDataTxt);
        }

        if ("edit".equals(execucao)) {
            pkAgendamentoSala = Integer.parseInt(req.getParameter("pkAgendamentoSala"));
            agendaSala = new AgendamentoSala(pkAgendamentoSala, dtData, horarioIni, horarioFim, nmNome, nmSetor, dsObservacao, nmLogin, dthrAtualizacao);
            agendaSalaDAO.upAgendamentoSala(agendaSala);
            req.setAttribute("msg", "alterou");

        } else if ("insert".equals(execucao)) {
            agendaSala = new AgendamentoSala(pkAgendamentoSala, dtData, horarioIni, horarioFim, nmNome, nmSetor, dsObservacao, nmLogin, dthrAtualizacao);
            agendaSalaDAO.insAgendamentoSala(agendaSala);
            req.setAttribute("msg", "gravou");
        }

        return "ControllerServlet?acao=AgendamentoSalaLista";
    }

}
