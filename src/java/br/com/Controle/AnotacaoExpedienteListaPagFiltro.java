/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AnotacaoExpediente;
import br.com.Modelo.AnotacaoExpedienteDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import java.net.URLEncoder;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author x369482
 */
public class AnotacaoExpedienteListaPagFiltro implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        AnotacaoExpedienteDAO cadsicDAO = new AnotacaoExpedienteDAO();

        /**
         * Atributos: pg = número da página atual pi = número da página inicial
         * pf = número da página final qtdRegistro = quantidade de registro
         * geral qtdPg = número de quantidade de páginas qtdLinha = número de
         * quantidade de linhas por página maxPg = quantidade de paginação a ser
         * exibida (1, 2 , 3 ...) sobraMaxPg = auxiliar para o calculdo da
         * quantidade de pagina
         *
         */
        int pg, pi, pf, qtdRegistro, qtdPg, sobraMaxPg = 0, offset;
        int qtdLinha = 6;
        int maxPg = 10;

        String pgS, piS, pfS, ter;
        String cdProcesso, nmInteressado, nmNome, qEndereco, cdCroqui, dsAssunto;

//Carregando atributos com a informações do formlário.           
        pgS = req.getParameter("pg");
        piS = req.getParameter("pi");
        pfS = req.getParameter("pf");

        cdProcesso = req.getParameter("cdProcesso");
        nmInteressado = req.getParameter("nmInteressado");
        nmNome = req.getParameter("nmNome");
        dsAssunto = req.getParameter("dsAssunto");
        qEndereco = req.getParameter("qEndereco");
        cdCroqui = req.getParameter("cdCroqui");
        ter = req.getParameter("ter");

//Validação dos atributos carregdos com as informações do formulário.         
        if (cdProcesso == null) {
            cdProcesso = "";
        }

        if (null == nmInteressado || nmInteressado.equals("")) {
            nmInteressado = "";
        } else {
            nmInteressado = Transformar.removeAccents(Transformar.utf8(nmInteressado)).toUpperCase().trim();
        }

        if (null == nmNome || nmNome.equals("")) {
            nmNome = "";
        } else {
            nmNome = Transformar.removeAccents(Transformar.utf8(nmNome)).toUpperCase().trim();
        }
        if (null == dsAssunto || dsAssunto.equals("")) {
            dsAssunto = "";
        } else {
            dsAssunto = Transformar.removeAccents(Transformar.utf8(dsAssunto)).toUpperCase().trim();
        }
//        if (null == qEndereco || qEndereco.equals("")) {
//            qEndereco = "";
//        } else {
//            qEndereco = Transformar.removeAccents(Transformar.utf8(qEndereco)).toUpperCase().trim();
//        }

        if (null == cdCroqui || cdCroqui.equals("")) {
            cdCroqui = "";
        } else {
            cdCroqui = Transformar.removeAccents(cdCroqui).toUpperCase().trim();
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
//        if ("".equals(ter) || null == ter){
        qtdRegistro = cadsicDAO.qtdExpedientePesquisa(cdProcesso, cdCroqui, nmInteressado, nmNome, dsAssunto);
        qtdPg = qtdRegistro / qtdLinha;
//        }else{
//            qtdRegistro = autoDAO.qtdAutoCessaoPesquisaTerceiro(qTpcessao, qAC, qProcesso, qCessionario, qEndereco, qCroqui, qVigor);
//            qtdPg = qtdRegistro / qtdLinha;   
//        }
////Logica da paginação         
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
//        List<AutoCessaoValidacao> listAuto;
//        if ("".equals(ter) || null == ter){
//       List<AnotacaoExpediente> listAuto = new AnotacaoExpedienteDAO().listPagFiltroPesquisa(cdProcesso, nmInteressado, nmNome, dsAssunto, cdCroqui, qtdLinha, offset);
//        }else{
//            listAuto = new AutoCessaoAntigoDAO().listPagFiltroTerceiro(qTpcessao, qAC, qProcesso, qCessionario, qEndereco, qCroqui, qVigor, qtdLinha, offset);
//        }
//        nmInteressado = URLEncoder.encode(nmInteressado, "UTF-8");
//        qCedente = URLEncoder.encode(qCedente,"UTF-8");
//        qEndereco = URLEncoder.encode(qEndereco,"UTF-8");

        //req.setAttribute("listCadSic", listCadSic);
        return "AnotacaoExpedienteLista.jsp?"
                + "pg=" + pg
                + "&pi=" + pi
                + "&pf=" + pf
                + "&qtdPg=" + qtdPg
                + "&totalRes=" + qtdRegistro
                + "&cdProcesso=" + cdProcesso
                + "&nmInteressado=" + nmInteressado
                + "&nmNome=" + nmNome
                //              + "&qEndereco=" + qEndereco
                + "&dsAssunto=" + dsAssunto
                + "&cdCroqui=" + cdCroqui
                + "&ter" + ter;
    }

}
