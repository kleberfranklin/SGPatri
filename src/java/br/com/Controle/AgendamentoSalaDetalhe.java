/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AgendamentoSala;
import br.com.Modelo.AgendamentoSalaDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class AgendamentoSalaDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

//Atributo  
        int pkAgendamentoSala;
        String execucao;

//Carregando os atributos com as informações do formulário     
        pkAgendamentoSala = Integer.parseInt(req.getParameter("pkAgendamentoSala"));
        execucao = req.getParameter("execucao");

        AgendamentoSalaDAO agendaSalaDAO = new AgendamentoSalaDAO();
        AgendamentoSala agendaSala = agendaSalaDAO.detalheAgendamentoSala(pkAgendamentoSala);

        req.setAttribute("agendaSala", agendaSala);
        req.setAttribute("execucao", execucao);

        return "AgendamentoSalaCRU.jsp?execucao" + execucao;
    }
}
