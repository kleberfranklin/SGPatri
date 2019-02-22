/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;


import br.com.Modelo.Arquivo;
import br.com.Modelo.*;
import br.com.Utilitario.Transformar;
import br.com.Utilitario.Upload;
import java.io.File;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


/**java servlet pathinfo
 *
 * @author d732229
 */
public class ArquivoUpload implements Logica{
    @Override    
     public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {

//Objetos          
        Upload up = new Upload(); 
        AutoCessaoValidacaoDAO autoVaDAO = new AutoCessaoValidacaoDAO();
        ArquivoDAO arDAO = new ArquivoDAO();
        AnotacaoCroquiDAO anotoCroquiDAO = new AnotacaoCroquiDAO();
        Arquivo ar = new Arquivo();
        HttpSession session = req.getSession();

//Atributos        
        String nomeDoArquivo="", caminhoArquivo="", tipoArquivo, origem, nome, pgValidacao, execucao, finalizar, loginSessio;
        int pkArquivo, pkAutoStage,nrVerArqAc, nrVerArqPlanta, pkDocumento;
        InputStream arquivoCarregado;
                
        
//Populando atritubos        
        tipoArquivo = req.getParameter("tipoArquivo");
        origem = req.getParameter("Origem");
        nome = req.getParameter("nmNome");
//        pkAutoStage = Integer.parseInt(req.getParameter("pkAutoStage")); //remover esse e patronizar todos para pkDocumento
        pkDocumento = Integer.parseInt(req.getParameter("pkDocumento"));
        pkArquivo = Integer.parseInt(req.getParameter("pkArquivo"));
        execucao = req.getParameter("execucao");
        pgValidacao = req.getParameter("pgValidacao");
        finalizar = req.getParameter("finalizar");
        loginSessio =(String) session.getAttribute("sessionLogin");
        
        String pastaArquivar = req.getServletContext().getRealPath("/");
        switch(tipoArquivo){
            case "planta":
           
                pastaArquivar+= "Arquivo"+File.separator+"Planta";
                Part uploadPlanta = req.getPart("UploadPlanta");
                nomeDoArquivo = Transformar.substituiEspacoHifen(Transformar.retiraEspacosDuplicados(Transformar.removeAccents(uploadPlanta.getSubmittedFileName())));
                arquivoCarregado = uploadPlanta.getInputStream();
                caminhoArquivo = up.upload(pastaArquivar, nomeDoArquivo, arquivoCarregado);
                nrVerArqPlanta = Integer.parseInt(req.getParameter("nrVerArqPlanta"));
                autoVaDAO.upAutoCessaoVerificadoArquivoPlanta(pkDocumento, nrVerArqPlanta);
            break;

            case "AC":
                pastaArquivar+= "Arquivo"+File.separator+"AC";
                Part uploadAC = req.getPart("UploadAC");
                nomeDoArquivo = Transformar.substituiEspacoHifen(Transformar.retiraEspacosDuplicados(Transformar.removeAccents(uploadAC.getSubmittedFileName())));
                arquivoCarregado = uploadAC.getInputStream();
                caminhoArquivo = up.upload(pastaArquivar, nomeDoArquivo, arquivoCarregado);
                nrVerArqAc = Integer.parseInt(req.getParameter("nrVerArqAc"));
                autoVaDAO.upAutoCessaoVerificadoArquivoAc(pkDocumento, nrVerArqAc);
            break;
            
            case "Croqui":
                pastaArquivar+= "Arquivo"+File.separator+"Croqui";
                Part uploadCroqui = req.getPart("UploadCroqui");
                nomeDoArquivo = Transformar.substituiEspacoHifen(Transformar.retiraEspacosDuplicados(Transformar.removeAccents(uploadCroqui.getSubmittedFileName())));
                arquivoCarregado = uploadCroqui.getInputStream();
                caminhoArquivo = up.upload(pastaArquivar, nomeDoArquivo, arquivoCarregado);
                anotoCroquiDAO.upAnotacaoCroquiVerificadoArquivo(pkDocumento);
            break;
            case "Deletar":
            break;
            default:
            break;
            }
        
                
            
            if(pkArquivo != 0){
                ar = new Arquivo(pkArquivo, pkDocumento, origem, tipoArquivo, nomeDoArquivo, caminhoArquivo, nome, loginSessio);
                arDAO.upArquivo(ar);
            }else{
                boolean duplicidade = arDAO.duplicidade(pkDocumento,tipoArquivo);
                if(duplicidade == false){
                    ar = new Arquivo(pkDocumento, origem, tipoArquivo, nomeDoArquivo, caminhoArquivo, nome, loginSessio);
                    arDAO.cArquivo(ar);
                }    
            }
            
            if("Croqui".equals(tipoArquivo)){
                req.setAttribute("msg", "gravou");
                return  "ControllerServlet?acao=AnotacaoCroquiDetalhe&pkAnotacaoExpediente="+pkDocumento
                        +"&execucao=view"
//                        +"&msg=gravou"
                        ;
            }
            
            if(null !=finalizar && finalizar.equals("1")){
                autoVaDAO.upAutoCessaoVerificadoValidacao(0, 1, pkDocumento, "Validado");
                //execucao = "";
                req.setAttribute("execucao", "ola");
                return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkDocumento+"&execucao=";
            } 
            
            if ((null == pgValidacao || pgValidacao.equals("")) && execucao == "edit") {
                return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkDocumento+"&execucao=";
           }
        return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkDocumento+"&execucao="+execucao+"&pgValidacao"+pgValidacao;  
    }   
     
   
    
}
