/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Arquivo;
import br.com.Modelo.ArquivoDAO;
import br.com.Modelo.AutoCessaoDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Upload;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author d732229
 */
public class AutoCessaoDeleteArquivo implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
        Upload up = new Upload(); 
        ArquivoDAO arDAO = new ArquivoDAO();
        AutoCessaoDAO autoDAO = new AutoCessaoDAO();
        Arquivo ar = new Arquivo();

        int pkArquivo =0, pkAutoCessao;
        String execucao, diretorio, nmTipo;
        boolean deletado;
        
        pkArquivo = Integer.parseInt(req.getParameter("pkArquivo"));
        pkAutoCessao = Integer.parseInt(req.getParameter("pkAutoCessao"));
        diretorio = req.getParameter("diretorio");
        nmTipo = req.getParameter("nmTipo");
        execucao = req.getParameter("execucao");
        
//        ar = arDAO.pkArquivo(pkArquivo);
        deletado = up.deltar(diretorio);
        
        if(deletado){
            arDAO.deleteArquvio(pkArquivo);
            if ("Planta".equals(nmTipo)) {
                autoDAO.upAutoCessaoVerificadoArquivoPlanta(pkAutoCessao, 0);
            } else {
                autoDAO.upAutoCessaoVerificadoArquivoAc(pkAutoCessao, 0);
            }
            
            req.setAttribute("msg", "true");
            req.setAttribute("tipoAler", "success");
            req.setAttribute("alert", "Sucesso! ");
            req.setAttribute("txtAlert", "O arquivo "+nmTipo+" foi excluído com sucesso.");
            return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao="+pkAutoCessao+"&execucao="+execucao;
        }
        
        
        req.setAttribute("msg", "true");
        req.setAttribute("tipoAler", "danger");
        req.setAttribute("alert", "Erro! ");
        req.setAttribute("txtAlert", "Não foi possível excluír o arquivo, por favor contate o administrado do sistema! ");
        
        
 
        return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao="+pkAutoCessao+"&execucao="+execucao;
    }
    
}
