/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AutoCessao;
import br.com.Modelo.AutoCessaoDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author d732229
 */
public class AutoCessoUC implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        AutoCessao auto = new AutoCessao();
        AutoCessaoDAO autoDAO = new AutoCessaoDAO();
        HttpSession session = req.getSession();
        Calendar calendario = new GregorianCalendar();
        DateFormat textToDate = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

//Atributo       
        int pkAutoCessao = 0, pkCatAutoCessao, pkTpcessao, pkCatEntidade, pkCatFinalidade, pkNivelAdm, pkSubCatFinalidade, pkSubPref,
                pkCatContrapartida, nrVerAc, nrprazoAno = 0, nrprazoMes = 0, duplicidade = 0;
        String codAC, nrprocesso, tpProcesso, nmcessionario, dsFinalidade, nmplanta, nmcroqui, nrarea, nrsetor, nrquadra, nrlote, nmcap, nmMetragemOficial,
                tipoEndereco, tituloEndereco, nmendereco, nrnumeroend, nmcomplementoend, nmreferenciaend, prazoAno, prazoMes, nmprazo, dsContrapartida, dsObservacao,
                loginSessio, execucao, nmStatus, nrvigor, pgValidacao, dtVencimento = "", dtlavraturaTxt;
        Date dtlavratura;

//    
//Carregando os atributos com as informações do formulário
//    pkAutoCessao = Integer.parseInt(req.getParameter("pkAutoCessao"));
        pkCatAutoCessao = Integer.parseInt(req.getParameter("pkCatAutoCessao"));
        pkTpcessao = Integer.parseInt(req.getParameter("pkTpcessao"));
        pkCatEntidade = Integer.parseInt(req.getParameter("pkCatEntidade"));
        pkCatFinalidade = Integer.parseInt(req.getParameter("pkCatFinalidade"));
        pkSubCatFinalidade = Integer.parseInt(req.getParameter("pkSubCatFinalidade"));
        pkNivelAdm = Integer.parseInt(req.getParameter("pkNivelAdm"));
        pkSubPref = Integer.parseInt(req.getParameter("pkSubPref"));
        pkCatContrapartida = Integer.parseInt(req.getParameter("pkCatContrapartida"));
        nrVerAc = Integer.parseInt(req.getParameter("nrVerAc"));

        pgValidacao = req.getParameter("pgValidacao");
        execucao = req.getParameter("execucao");
        nmStatus = req.getParameter("nmStatus");
        prazoAno = req.getParameter("nrprazoAno");
        prazoMes = req.getParameter("nrprazoMes");
        codAC = req.getParameter("codAC");

        dtlavraturaTxt = req.getParameter("dtlavratura");
        nrprocesso = req.getParameter("nrprocesso");
        tpProcesso = req.getParameter("tpProcesso");
        nmcessionario = req.getParameter("nmcessionario");
        dsFinalidade = req.getParameter("dsFinalidade");
        nmplanta = req.getParameter("nmplanta");
        nmcroqui = req.getParameter("nmcroqui");
        nrarea = req.getParameter("nrarea");
        nrsetor = req.getParameter("nrsetor");
        nrquadra = req.getParameter("nrquadra");
        nrlote = req.getParameter("nrlote");
        nmcap = req.getParameter("nmcap");
        nmMetragemOficial = req.getParameter("nmMetragemOficial");
        tipoEndereco = req.getParameter("tipoEndereco");
        tituloEndereco = req.getParameter("tituloEndereco");
        nmendereco = req.getParameter("nmendereco");
        nrnumeroend = req.getParameter("nrnumeroend");
        nmcomplementoend = req.getParameter("nmcomplementoend");
        nmreferenciaend = req.getParameter("nmreferenciaend");
        nmprazo = req.getParameter("nmprazo");
        nrvigor = req.getParameter("nrvigor");
        dsContrapartida = req.getParameter("dsContrapartida");
        dsObservacao = req.getParameter("dsObservacao");
        loginSessio = (String) session.getAttribute("sessionLogin");

        if (null == dtlavraturaTxt || dtlavraturaTxt.equals("")) {
            dtlavratura = null;
        } else {
            dtlavratura = Date.valueOf(dtlavraturaTxt);
        }

        if (null == nmcessionario || nmcessionario.equals("")) {
            nmcessionario = "";
        } else {
            nmcessionario = Transformar.getRemoveAccents(Transformar.getUFT8(nmcessionario)).toUpperCase().trim();
        }

        if (null == dsFinalidade || dsFinalidade.equals("")) {
            dsFinalidade = "";
        } else {
            dsFinalidade = Transformar.getRemoveAccents(Transformar.getUFT8(dsFinalidade)).toUpperCase().trim();
        }

        if (null == nmendereco || nmendereco.equals("")) {
            nmendereco = "";
        } else {
            nmendereco = Transformar.getRemoveAccents(Transformar.getUFT8(nmendereco)).toUpperCase().trim();
        }

        if (null == nmcomplementoend || nmcomplementoend.equals("")) {
            nmcomplementoend = "";
        } else {
            nmcomplementoend = Transformar.getRemoveAccents(Transformar.getUFT8(nmcomplementoend)).toUpperCase().trim();
        }

        if (null == nmreferenciaend || nmreferenciaend.equals("")) {
            nmreferenciaend = "";
        } else {
            nmreferenciaend = Transformar.getRemoveAccents(Transformar.getUFT8(nmreferenciaend)).toUpperCase().trim();
        }

        if (null == dsContrapartida || dsContrapartida.equals("")) {
            dsContrapartida = "";
        } else {
            dsContrapartida = Transformar.getRemoveAccents(Transformar.getUFT8(dsContrapartida)).toUpperCase().trim();
        }

        if (null == dsObservacao || dsObservacao.equals("")) {
            dsObservacao = "";
        } else {
            dsObservacao = Transformar.getRemoveAccents(Transformar.getUFT8(dsObservacao)).toUpperCase().trim();
        }

//Tratando dos dados do formulário
        if ("0".equals(prazoAno) && "0".equals(prazoMes)) {
            nmprazo = "Indeterminado";
        } else if (null == nmprazo || nmprazo.equals("") || !nmprazo.equals("Indeterminado")) {
            if (prazoMes == null || prazoMes.equals("")) {
                nrprazoMes = 0;
            } else {
                nrprazoMes = Integer.parseInt(prazoMes);
            }
            if (prazoAno == null || prazoAno.equals("")) {
                nrprazoAno = 0;
            } else {
                nrprazoAno = Integer.parseInt(prazoAno);
            }
            nmprazo = String.valueOf(nrprazoAno + " ano(s) ") + String.valueOf("e " + nrprazoMes + " mês(es)");
//        Date calcVencimento = textToDate.parse(dtlavratura);
            Date calcVencimento = dtlavratura;
            calendario.setTime(calcVencimento);
            calendario.add(Calendar.YEAR, +nrprazoAno);
            calendario.add(Calendar.MONTH, +nrprazoMes); //O calendário no Java mês de Janeiro = 0, por isso a soma + 1.
            dtVencimento = textToDate.format(calendario.getTime());
        } else {
            nrprazoAno = 0;
            nrprazoMes = 0;
        }

        if (null == nrvigor || nrvigor.equals("")) {
            nrvigor = "false";
        }

// Coloca mo Validado todos os Auto de Cessão novo.    
        if ("NaoVerificado".equals(nmStatus) && "edit".equals(execucao)) {
            nmStatus = "EmConferencia";
        } else if ("insert".equals(execucao)) {
            nmStatus = "Validado";
        }

//Verificar duplicidade
        duplicidade = autoDAO.verificarDuplicidadeAutoCesssao(codAC, nrprocesso, pkTpcessao);
        if (duplicidade != 0 && "insert".equals(execucao)) {
            pkAutoCessao = duplicidade;

            req.setAttribute("msg", "true");
            req.setAttribute("tipoAler", "danger");
            req.setAttribute("alert", "Duplicidade ! ");
            req.setAttribute("txtAlert", "Encontrado outro Auto Cessão como o mesmo nº de AC, nº de processo e Tipo de Cessão");
            return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao=" + pkAutoCessao + "&execucao=edit&duplicidade=true";
        }

//Tratando para executar o inserir ou alterar, populando o objeto e gravando no banco   
        if ("edit".equals(execucao)) {
            pkAutoCessao = Integer.parseInt(req.getParameter("pkAutoCessao"));
            auto = new AutoCessao(pkAutoCessao, pkTpcessao, pkCatEntidade, pkCatAutoCessao, pkCatFinalidade, pkSubCatFinalidade, pkNivelAdm, pkSubPref, pkCatContrapartida,
                    nrprazoAno, nrprazoMes, nrVerAc, codAC, dtlavratura, nrprocesso, tpProcesso, nmcessionario, nmcessionario, nmplanta, nmcroqui, nrarea, nmcap, nmMetragemOficial, nrsetor, nrquadra, nrlote, tipoEndereco,
                    tituloEndereco, nmendereco, nrnumeroend, nmcomplementoend, nmreferenciaend, nmprazo, dtVencimento, nrvigor, dsFinalidade, dsContrapartida, dsObservacao, nmStatus, loginSessio);
            autoDAO.upAutoCessao(auto);

            req.setAttribute("msg", "true");
            req.setAttribute("tipoAler", "success");
            req.setAttribute("alert", "Sucesso! ");
            req.setAttribute("txtAlert", "A(s) informação(ões) foi(ram) alterada(s).");

        } else if ("insert".equals(execucao)) {
            auto = new AutoCessao(pkTpcessao, pkCatEntidade, pkCatAutoCessao, pkCatFinalidade, pkSubCatFinalidade, pkNivelAdm, pkSubPref, pkCatContrapartida,
                    nrprazoAno, nrprazoMes, nrVerAc, codAC, dtlavratura, nrprocesso, tpProcesso, nmcessionario, nmcessionario, nmplanta, nmcroqui, nrarea, nmcap, nmMetragemOficial, nrsetor, nrquadra, nrlote, tipoEndereco,
                    tituloEndereco, nmendereco, nrnumeroend, nmcomplementoend, nmreferenciaend, nmprazo, dtVencimento, nrvigor, dsFinalidade, dsContrapartida, dsObservacao, nmStatus, loginSessio);
            pkAutoCessao = autoDAO.cAutoCessao(auto);
            req.setAttribute("msg", "true");
            req.setAttribute("tipoAler", "success");
            req.setAttribute("alert", "Sucesso! ");
            req.setAttribute("txtAlert", "O Auto Cessão nº " + codAC + " foi salvo.");
        }

//        if ((null==pgValidacao ||pgValidacao.equals("")) && "edit".equals(execucao)){
//               return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao="+pkAutoCessao+"&execucao=";
//           }
        return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao=" + pkAutoCessao + "&execucao=" + execucao;
    }

}
