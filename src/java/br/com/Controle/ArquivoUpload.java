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
        
        Upload up = new Upload(); 
        AutoCessaoDAO autoVaDAO = new AutoCessaoDAO();
        ArquivoDAO arDAO = new ArquivoDAO();
        Arquivo ar = new Arquivo();
        HttpSession session = req.getSession();
        
        
        String nomeDoArquivo="", caminhoArquivo="", tipoArquivo, origem, nome, pgValidacao, execucao, 
                 finalizar, loginSessio, pastaArquivar="", sistemaOperacional;
        int pkArquivo=0, pkAutoStage,nrVerArqAc, nrVerArqPlanta;
        InputStream arquivoCarregado;
                
        
        
        tipoArquivo = req.getParameter("tipoArquivo");
        origem = req.getParameter("Origem");
        nome = req.getParameter("nmNome");
        pkAutoStage = Integer.parseInt(req.getParameter("pkAutoStage"));
        pkArquivo = Integer.parseInt(req.getParameter("pkArquivo"));
        execucao = req.getParameter("execucao");
        pgValidacao = req.getParameter("pgValidacao");
        finalizar = req.getParameter("finalizar");
        loginSessio =(String) session.getAttribute("sessionLogin");
        sistemaOperacional = System.getProperty("os.name");
        
        
        
        
        
        switch(tipoArquivo){
            case "planta":
                
                if (sistemaOperacional.equals("Linux")) {
                    File diretorio = new File("/opt/SGPatri/Arquivo/Planta/");
                    boolean existente = diretorio.exists();
                    if (!existente) {
                        diretorio.mkdirs();
                    }else{
                        res.sendRedirect("Index.jsp");
                    }
                    pastaArquivar = File.separator+"opt"+File.separator+"SGPatri"+File.separator+"Arquivo"+File.separator+"Planta";
                } else {
                    File diretorio = new File("C:/SGPatri/Arquivo/Planta");
                    boolean existente = diretorio.exists();
                    if (!existente) {
                        diretorio.mkdirs();
                    }
                    pastaArquivar = "C:"+File.separator+"SGPatri"+File.separator+"Arquivo"+File.separator+"Planta";
                }

                Part uploadPlanta = req.getPart("UploadPlanta");
                
                nomeDoArquivo = Transformar.substituiEspacoHifen(Transformar.retiraEspacosDuplicados(Transformar.removeAccents(uploadPlanta.getSubmittedFileName())));
                arquivoCarregado = uploadPlanta.getInputStream();
                caminhoArquivo = up.upload(pastaArquivar, nomeDoArquivo, arquivoCarregado);
                nrVerArqPlanta = Integer.parseInt(req.getParameter("nrVerArqPlanta"));
                autoVaDAO.upAutoCessaoVerificadoArquivoPlanta(pkAutoStage, nrVerArqPlanta);
            break;

            case "AC":
                 if (sistemaOperacional.equals("Linux")) {
                    File diretorio = new File("/opt/SGPatri/Arquivo/AC");
                    boolean existente = diretorio.exists();
                    if (!existente) {
                        diretorio.mkdirs();
                    }else{
                        res.sendRedirect("Index.jsp");
                    }
                    pastaArquivar = File.separator+"opt"+File.separator+"SGPatri"+File.separator+"Arquivo"+File.separator+"AC";
                } else {
                    File diretorio = new File("C:/SGPatri/Arquivo/AC");
                    boolean existente = diretorio.exists();
                    if (!existente) {
                        diretorio.mkdirs();
                    }
                    pastaArquivar = "C:"+File.separator+"SGPatri"+File.separator+"Arquivo"+File.separator+"AC";
                }
                
                Part uploadAC = req.getPart("UploadAC");
                nomeDoArquivo = Transformar.substituiEspacoHifen(Transformar.retiraEspacosDuplicados(Transformar.removeAccents(uploadAC.getSubmittedFileName())));
                arquivoCarregado = uploadAC.getInputStream();
                caminhoArquivo = up.upload(pastaArquivar, nomeDoArquivo, arquivoCarregado);
                nrVerArqAc = Integer.parseInt(req.getParameter("nrVerArqAc"));
                autoVaDAO.upAutoCessaoVerificadoArquivoAc(pkAutoStage, nrVerArqAc);
            break;
            
            case "Deletar":
            break;
            
            default:
            break;
            }
        
                
            
            if(pkArquivo != 0){
                ar = new Arquivo(pkArquivo, pkAutoStage, origem, tipoArquivo, nomeDoArquivo, caminhoArquivo, nome, loginSessio);
                arDAO.upArquivo(ar);
            }else{
                boolean duplicidade = arDAO.duplicidade(pkAutoStage,tipoArquivo);
                if(duplicidade == false){
                    ar = new Arquivo(pkAutoStage, origem, tipoArquivo, nomeDoArquivo, caminhoArquivo, nome, loginSessio);
                    arDAO.cArquivo(ar);
                }    
            }
            
            if(null !=finalizar && finalizar.equals("1")){
                autoVaDAO.upAutoCessaoVerificadoValidacao(0, 1, pkAutoStage, "Validado");
                //execucao = "";
                req.setAttribute("execucao", "ola");
                return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkAutoStage+"&execucao=";
            } 
            
            if ((null == pgValidacao || pgValidacao.equals("")) && execucao == "edit") {
                return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkAutoStage+"&execucao=";
           }
        return "ControllerServlet?acao=AutoCessaoValidacaoDetalhe&pkAutoStage="+pkAutoStage+"&execucao="+execucao+"&pgValidacao"+pgValidacao;  
    }   

   
    
}
