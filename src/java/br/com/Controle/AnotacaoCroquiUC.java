/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Endereco;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import br.com.Modelo.AnotacaoCroqui;
import br.com.Modelo.AnotacaoCroquiDAO;
import br.com.Modelo.TipoAnexo;
import br.com.Modelo.TipoAnexoDAO;
import br.com.Modelo.TipoAssunto;
import br.com.Modelo.TipoAssuntoDAO;
import br.com.Modelo.TipoDespacho;
import br.com.Modelo.TipoDespachoDAO;
import br.com.Modelo.TipoExpediente;
import br.com.Modelo.TipoExpedienteDAO;
import br.com.Utilitario.Transformar;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author x369482
 */
public class AnotacaoCroquiUC implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        
        AnotacaoCroquiDAO anotCroquiDAO = new AnotacaoCroquiDAO();
        TipoAssunto tpAssunto = new TipoAssunto();
        TipoDespacho tpDespacho = new TipoDespacho();
        TipoExpediente tpExp = new TipoExpediente();
        TipoExpedienteDAO tpExpDAO = new TipoExpedienteDAO();
        TipoAnexoDAO tpAnDAO = new TipoAnexoDAO();
        TipoAssuntoDAO tpAssuntoDAO = new TipoAssuntoDAO();
        TipoDespachoDAO tpDespaDAO = new TipoDespachoDAO();
        
        
        
        
        List<AnotacaoCroqui> lisAnotCroqui = new ArrayList<AnotacaoCroqui>();
        List<Endereco> lisEndereco = new ArrayList<Endereco>();
        List<TipoExpediente> listTpExpediente = tpExpDAO.listSelectTipoExpediente();
        List<TipoAnexo> listTpAnexo = tpAnDAO.listSelectTipoAnexo();
        List<TipoAssunto> listTpAssunto = tpAssuntoDAO.listSelectTipoAssunto();
        List<TipoDespacho> listTpDespacho = tpDespaDAO.listSelectTipoDespacho();
        HttpSession session = req.getSession();
        
            

// Atributo
        int pkAnotacaoExpediente=0, pkTpExpediente, cont; 
        String nmPkAnotacaoExpediente, sgTpExpediente, cdExpediente, nmInteressado, assunto, despacho, dtPublicacao, dtTramitacao, dsObservacao, loginSessio, execucao;
        String[] cdCroqui, cdArea, tipoEndereco, tituloEndereco, nmendereco, nrnumeroend, nmcomplementoend, nmreferenciaend;
           
        
//Carregando os atributos com as informações do formulário 
        nmPkAnotacaoExpediente = req.getParameter("pkAnotacaoExpediente");
        sgTpExpediente = req.getParameter("sgTpExpediente");
        cdExpediente = Transformar.getRemoveAccents(req.getParameter("cdExpediente").toUpperCase());
        nmInteressado = req.getParameter("nmInteressado");
        assunto = req.getParameter("assunto");
        despacho = req.getParameter("despacho");
        dtPublicacao = req.getParameter("dtPublicacao");
        dtTramitacao = req.getParameter("dtTramitacao");
        dsObservacao = req.getParameter("dsObservacao");
        
        loginSessio = (String) session.getAttribute("sessionLogin");
        execucao = req.getParameter("execucao");
        cdCroqui = req.getParameterValues("cdCroqui");
        cdArea = req.getParameterValues("cdArea");
        tipoEndereco = req.getParameterValues("tipoEndereco");
        tituloEndereco = req.getParameterValues("tituloEndereco");
        nmendereco = req.getParameterValues("nmendereco");
        nrnumeroend = req.getParameterValues("nrnumeroend");
        nmcomplementoend = req.getParameterValues("nmcomplementoend");
        nmreferenciaend = req.getParameterValues("nmreferenciaend");
        cont = cdCroqui.length;
        
        pkTpExpediente = tpExpDAO.pesquisaPorNome(sgTpExpediente);
        tpExp.setPkTipoExpediente(pkTpExpediente);
        tpAssunto.setPkTipoAssunto(Integer.parseInt(assunto));
        
        if (!"".equals(despacho) || despacho == null){
            tpDespacho.setPkTipoDespacho(Integer.parseInt(despacho));
        }else{
            tpDespacho.setPkTipoDespacho(0);
        }
        
        
        for (int i=0; i < cont; i++){
            Endereco endereco = new Endereco();
                endereco.setTipo(tipoEndereco[i]);
                endereco.setTitulo(tituloEndereco[i]);
                endereco.setEndereco(nmendereco[i].toUpperCase().trim());
                endereco.setNumero(nrnumeroend[i]);
                endereco.setComplemento(nmcomplementoend[i].toUpperCase().trim());
                endereco.setReferencia(nmreferenciaend[i].toUpperCase().trim());
            lisEndereco.add(endereco);
        }    
        
        for (int i=0; i < cont; i++){
            AnotacaoCroqui anotCroqui = new AnotacaoCroqui();
                anotCroqui.setTpExpediente(tpExp);
                anotCroqui.setCdExpediente(cdExpediente);
                anotCroqui.setCdCroqui(cdCroqui[i]);
                anotCroqui.setCdArea(cdArea[i]);
                anotCroqui.setEndereco(lisEndereco.get(i));
                anotCroqui.setNmInteressado(nmInteressado);
                anotCroqui.setTpAssunto(tpAssunto);
                anotCroqui.setTpDespacho(tpDespacho);
                if("".equals(dtPublicacao) || null == dtPublicacao){
                    anotCroqui.setDtPublicacao(null);
                }else{
                    anotCroqui.setDtPublicacao(Date.valueOf(dtPublicacao));
                }
                if("".equals(dtTramitacao) || null == dtTramitacao){
                    anotCroqui.setDtTramitacao(null);
                }else{
                    anotCroqui.setDtTramitacao(Date.valueOf(dtTramitacao));
                }
                if(!"".equals(nmPkAnotacaoExpediente)){
                    anotCroqui.setPkAnotacaoExpediente(Integer.parseInt(nmPkAnotacaoExpediente));
                }
                anotCroqui.setDsLocal(anotCroqui.getEndereco().getTipo()+" "+anotCroqui.getEndereco().getTitulo()+
                                    " "+anotCroqui.getEndereco().getEndereco()+", "+anotCroqui.getEndereco().getNumero()+
                                    " "+anotCroqui.getEndereco().getComplemento()+" "+anotCroqui.getEndereco().getReferencia());
                anotCroqui.setDsObservacao(dsObservacao);
                anotCroqui.setNmLogin(loginSessio);
            lisAnotCroqui.add(anotCroqui);
        }
        
        if("edit".equals(execucao)){
////          forEach usando lambda             
            lisAnotCroqui.forEach(a ->{
                try {
                    anotCroquiDAO.upAnotacao(a);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            });
            if(!"".equals(nmPkAnotacaoExpediente)){
                pkAnotacaoExpediente = Integer.parseInt(nmPkAnotacaoExpediente);
            }
            req.setAttribute("msg", "true");
            req.setAttribute("typeAlert", "success");
            req.setAttribute("msgAlert", "Sucesso! ");
            req.setAttribute("txtAlert", "A(s) alteração(ões) foi(ram) realizada(s) no documento.");
            req.setAttribute("pkAnotacaoExpediente", pkAnotacaoExpediente);
        return "ControllerServlet?acao=AnotacaoCroquiDetalhe&execucao=view&bntBack=newSearch";
        }else{
            
            List<AnotacaoCroqui> lisAnotCroquiCriado = new ArrayList<AnotacaoCroqui>();
            for (AnotacaoCroqui a : lisAnotCroqui){
                a.setPkAnotacaoExpediente(anotCroquiDAO.cAnotacao(a));
                a = anotCroquiDAO.detalheAnotacaoCroqui(a.getPkAnotacaoExpediente());
            lisAnotCroquiCriado.add(a);
            }
            req.setAttribute("bntBack","newSearch");
            req.setAttribute("execucao","duplicate");
            req.setAttribute("tabCroquiActive", "in active");
            req.setAttribute("msg","true");
            req.setAttribute("typeAlert", "success");
            req.setAttribute("msgAlert", "Sucesso! ");
            req.setAttribute("txtAlert", "O(s) documento(s) foi(ram) cadastrado(s).");
            req.setAttribute("lisAnotCroquiCriado", lisAnotCroquiCriado);
            req.setAttribute("listaTpExp", listTpExpediente);
            req.setAttribute("listTpAssunto", listTpAssunto);
            req.setAttribute("listTpDespacho", listTpDespacho);
            req.setAttribute("listTpAnexo", listTpAnexo);
        return "AnotacaoCroquiCRU.jsp";
        }
      
    }

}
