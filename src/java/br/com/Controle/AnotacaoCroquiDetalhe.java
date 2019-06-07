package br.com.Controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.Modelo.AnexoCroqui;
import br.com.Modelo.AnexoCroquiDAO;
import br.com.Modelo.Logica;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import br.com.Modelo.Usuario;
import br.com.Modelo.UsuarioDAO;
import java.util.List;
        



/**
 *
 * @author x369482
 */
public class AnotacaoCroquiDetalhe implements Logica {

    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {

        AnotacaoCroquiDAO anotaCroquiDAO = new AnotacaoCroquiDAO();
        TipoAssunto tpAssunto = new TipoAssunto();
        TipoAssuntoDAO tpAssuntoDAO = new TipoAssuntoDAO();
        TipoExpediente tpExpediente = new TipoExpediente();
        TipoExpedienteDAO tpExpedienteDAO = new TipoExpedienteDAO();
        TipoDespacho tpDesp = new TipoDespacho();
        TipoAnexoDAO tpAnDAO = new TipoAnexoDAO();
        TipoDespachoDAO tpDespDAO = new TipoDespachoDAO();
        AnexoCroquiDAO anexoDAO = new AnexoCroquiDAO();
        Usuario u = new Usuario();
        UsuarioDAO uDAO = new UsuarioDAO();


//Atributos
        int pkAnotacaoExpediente = 0;
        String execucao, bntBack;

//Carregando atributos com a informações do formlário.        
        pkAnotacaoExpediente = Integer.parseInt(req.getParameter("pkAnotacaoExpediente"));
        execucao = req.getParameter("execucao");
        bntBack = req.getParameter("bntBack");

//Validação dos atributos carregdos com as informações do formulário.  
        if (pkAnotacaoExpediente == 0) {
            return "ControllerServlet?acao=AnotacaoCroquiPesquisa.java";
        }

//Consulta no banco e popula o objeto        
 
        
        AnotacaoCroqui anotCroqui = anotaCroquiDAO.detalheAnotacaoCroqui(pkAnotacaoExpediente);
        
        List<TipoExpediente> listTpExpediente = tpExpedienteDAO.listSelectTipoExpediente();
        List<TipoAssunto> listTpAssunto = tpAssuntoDAO.listSelectTipoAssunto();
        List<TipoDespacho> listTpDespacho = tpDespDAO.listSelectTipoDespacho();
        List<TipoAnexo> listTpAnexo = tpAnDAO.listSelectTipoAnexo();
        List<AnexoCroqui> listAnexo = anexoDAO.listAnexo(anotCroqui.getPkAnotacaoExpediente());
        
        
        tpAssunto = tpAssuntoDAO.detalheTipoAssunto(anotCroqui.getTpAssunto().getPkTipoAssunto());
        tpExpediente = tpExpedienteDAO.detalheTipoExpediente(anotCroqui.getTpExpediente().getPkTipoExpediente());
        tpDesp = tpDespDAO.detalheTipoDespacho(anotCroqui.getTpDespacho().getPkTipoDespacho());
        u = uDAO.nomeUsuario(anotCroqui.getNmLogin());
        
        
        anotCroqui.setTpAssunto(tpAssunto);
        anotCroqui.setTpExpediente(tpExpediente);
        anotCroqui.setTpDespacho(tpDesp);
        
        req.setAttribute("bntBack", bntBack);
        req.setAttribute("tabCroquiActive", "in active");
        req.setAttribute("listaTpExp", listTpExpediente);
        req.setAttribute("listTpAssunto", listTpAssunto);
        req.setAttribute("listTpDespacho", listTpDespacho);
        req.setAttribute("listTpAnexo", listTpAnexo);
        req.setAttribute("listAnexo", listAnexo);
        req.setAttribute("anotCroqui", anotCroqui);
        req.setAttribute("u", u);
        req.setAttribute("execucao", execucao);
        return "AnotacaoCroquiCRU.jsp";
    }
}
