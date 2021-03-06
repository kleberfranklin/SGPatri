/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.*;
import br.com.Modelo.Logica;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */
public class AutoCessaoDetalhe implements Logica{
    @Override    
     public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        AutoCessao auto = new AutoCessao();
        AutoCessaoDAO autoVaDAO = new AutoCessaoDAO();
        TipoAutoCessaoDAO tpCessaoDAO = new TipoAutoCessaoDAO();
        CatFinalidadeDAO catFinDAO = new CatFinalidadeDAO();
        CatAutoCessaoDAO catAutoDAO = new CatAutoCessaoDAO();
        CatContrapartidaDAO catContraDAO = new CatContrapartidaDAO();
        TipoDispositivoLegalDAO tpDisDAO = new TipoDispositivoLegalDAO();
        SubPrefeituraDAO subPrefDAO = new SubPrefeituraDAO();
        DispositivoLegalDAO dispDAO = new DispositivoLegalDAO();
        CatEntidadeDAO catEntDAO = new CatEntidadeDAO();
        ArquivoDAO arquivoDAO = new ArquivoDAO();
        NivelAdministracaoDAO nvAdmDAO = new NivelAdministracaoDAO();
        CatSubFinalidadeDAO catSubFinDAO = new CatSubFinalidadeDAO();
        ValidacaoDAO valDAO = new ValidacaoDAO();
        DivisaoDAO diviDAO = new DivisaoDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
//Atributos
        int pkAutoCessao = 0;
        String execucao, duplicidade, idAutoCessao, msg;
        
        
//Carregando atributos com a informações do formlário. 
        idAutoCessao = req.getParameter("pkAutoCessao");
        execucao = req.getParameter("execucao");
        duplicidade = req.getParameter("duplicidade");
//        msg = req.getParameter("msg");
        

        
//Validação dos atributos carregdos com as informações do formulário.          
        if(null != idAutoCessao){
            pkAutoCessao = Integer.parseInt(idAutoCessao);
            if (pkAutoCessao == 0){
                return "ControllerServlet?acao=AutoCessaoLista";
            }
//Consulta no banco e popula o objeto        
            auto = autoVaDAO.detalheAutoCessao(pkAutoCessao);            
        }
        
        TipoAutoCessao selTpCessao = tpCessaoDAO.detalheTpCessao(auto.getFkTipoCessaoStage());
        CatAutoCessao selCatAuto = catAutoDAO.detalheCatAuto(auto.getFkCatAutoStage());        
        CatFinalidade selCatFin = catFinDAO.detalheCatFinalidade(auto.getFkCatFinalidadeStage());        
        NivelAdministracao selNvAdm = nvAdmDAO.detalheNivelAdm(auto.getFkNivelAdm());
        CatEntidade selCatEnt = catEntDAO.detalheCatEnt(auto.getFkCatEntidadeStage());
        SubPrefeitura selSubPref = subPrefDAO.detalheSubPref(auto.getFkSubpref());
        CatContrapartida selCatContra = catContraDAO.detalheCatContra(auto.getFkCatContrapartida());
        CatSubFinalidade selCatSubFin = catSubFinDAO.detalheCatSubFinalidade(auto.getFkSubcatfinalidade());
        Validacao selVal = valDAO.detalheValidacaoAutoCessao(auto.getPkAutoCessao());
        Usuario selUsuario = usuarioDAO.nomeUsuario(selVal.getNmLogin());

        List<TipoAutoCessao> lisTpCessao = tpCessaoDAO.listSelectTpCessao();
        List<CatAutoCessao> listCatAuto = catAutoDAO.listSelectCatAutoCessao();
        List<CatFinalidade> listCatFan = catFinDAO.listSelectCatFinalidade();
        List<CatSubFinalidade> lisCatSub = catSubFinDAO.listSelectSubCatFinalidade(selCatFin.getPkCatFinalidade());
        List<NivelAdministracao> ListNvAdm = nvAdmDAO.listNivelAdm();
        List<CatEntidade> lisCatEnt = catEntDAO.listCatEnt();
        List<SubPrefeitura> listSubPref = subPrefDAO.listSelectSubPref();
        List<CatContrapartida> listCatContra =  catContraDAO.listSelectCatContra();        
        List<TipoDispositivoLegal> lisTpDis = tpDisDAO.listSelectTipoDisp();
        List<DispositivoLegal> listDisp = dispDAO.listDispositivo(pkAutoCessao);
        List<Divisao> listDivisao = diviDAO.selectLisDivisao();
        List<Arquivo> listArquivo = arquivoDAO.listArquivo(pkAutoCessao);
        List<Validacao> listValidaco = valDAO.lisValidacao(pkAutoCessao);
        
               
        req.setAttribute("Validacao", listValidaco);
        req.setAttribute("Arquivo", listArquivo);
        req.setAttribute("Divisao", listDivisao);
        req.setAttribute("NivelAdm", ListNvAdm);
        req.setAttribute("CatEnt",lisCatEnt);
        req.setAttribute("Disp", listDisp);
        req.setAttribute("subPref", listSubPref);
        req.setAttribute("TpDis", lisTpDis);
        req.setAttribute("CatContra", listCatContra);
        req.setAttribute("CatAuto", listCatAuto);
        req.setAttribute("CatSubFin", lisCatSub);
        req.setAttribute("CatFin", listCatFan);
        req.setAttribute("TpCessao", lisTpCessao);
        
        req.setAttribute("selTpCessao", selTpCessao);
        req.setAttribute("selCatAuto", selCatAuto);
        req.setAttribute("selCatFin", selCatFin);
        req.setAttribute("selNvAdm", selNvAdm);
        req.setAttribute("selCatEnt", selCatEnt);
        req.setAttribute("selSubPref", selSubPref);
        req.setAttribute("selCatContra", selCatContra);
        req.setAttribute("selCatSubFin", selCatSubFin);
        req.setAttribute("selVal", selVal);
        req.setAttribute("selUsuario", selUsuario);

        req.setAttribute("auto", auto);
        return "AutoCessaoDetalhe.jsp?execucao"+execucao+"&duplicidade="+duplicidade;
        
    }    
}
