/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import br.com.Modelo.MinisterioPublico;
import br.com.Modelo.MinisterioPublicoDAO;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author x369482
 */
public class MinisterioPublicoUC implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        MinisterioPublico ministPublico = new MinisterioPublico();
        MinisterioPublicoDAO ministPublicoDAO = new MinisterioPublicoDAO();

        HttpSession session = req.getSession();

//Atributo       
        int pkMinisterioPublico = 0;
        String nmOrigem, cdOficioEntrada, cdProcessoIni, cdProcesso, nmInteressado, nmSolicitado, dsAssunto, dsEndereco, nrInfoDgpi,
                cdOficioResposta, nrProcedimento, dsObservacao, nmLogin, dthrAtualizacao, execucao, dtRespostaTxt, dtEntradaTxt, nmTipoProcesso;
        Date dtResposta, dtEntrada;

//Carregando os atributos com as informações do formulário
        nmOrigem = req.getParameter("nmOrigem");
        dtEntradaTxt = req.getParameter("dtEntrada");
        cdOficioEntrada = req.getParameter("cdOficioEntrada");
        cdProcessoIni = req.getParameter("cdProcessoIni");
        cdProcesso = req.getParameter("cdProcesso");
        nmTipoProcesso = req.getParameter("nmTipoProcesso");
        nmInteressado = req.getParameter("nmInteressado");
        nmSolicitado = req.getParameter("nmSolicitado");
        dsAssunto = req.getParameter("dsAssunto");
        dsEndereco = req.getParameter("dsEndereco");
        nrInfoDgpi = req.getParameter("nrInfoDgpi");
        dtRespostaTxt = req.getParameter("dtResposta");
        cdOficioResposta = req.getParameter("cdOficioResposta");
        nrProcedimento = req.getParameter("nrProcedimento");
        dsObservacao = req.getParameter("dsObservacao");
        nmLogin = (String) session.getAttribute("sessionLogin");
        dthrAtualizacao = req.getParameter("dthrAtualizacao");

        execucao = req.getParameter("execucao");

        //Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
        if (null == dtRespostaTxt || dtRespostaTxt.equals("")) {
            dtResposta = null;
        } else {
            dtResposta = Date.valueOf(dtRespostaTxt);
        }

        if (null == dtEntradaTxt || dtEntradaTxt.equals("")) {
            dtEntrada = null;
        } else {
            dtEntrada = Date.valueOf(dtEntradaTxt);
        }

        if ("edit".equals(execucao)) {
            pkMinisterioPublico = Integer.parseInt(req.getParameter("pkMinisterioPublico"));
            ministPublico = new MinisterioPublico(pkMinisterioPublico, nmOrigem, dtEntrada, cdOficioEntrada, cdProcessoIni, cdProcesso, nmInteressado,
                    nmSolicitado, dsAssunto, dsEndereco, nrInfoDgpi, cdOficioResposta, dtResposta, nrProcedimento, dsObservacao, nmLogin, dthrAtualizacao);
            ministPublicoDAO.upMinisterioPublico(ministPublico);
            req.setAttribute("msg", "alterou");

        } else if ("insert".equals(execucao)) {
            ministPublico = new MinisterioPublico(pkMinisterioPublico, nmOrigem, dtEntrada, cdOficioEntrada, cdProcessoIni, cdProcesso, nmInteressado,
                    nmSolicitado, dsAssunto, dsEndereco, nrInfoDgpi, cdOficioResposta, dtResposta, nrProcedimento, dsObservacao, nmLogin, dthrAtualizacao);
            ministPublicoDAO.insMinisterioPublico(ministPublico);
            req.setAttribute("msg", "gravou");
        }

        return "ControllerServlet?acao=MinisterioPublicoLista";
    }

}
