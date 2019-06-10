/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;


import br.com.Modelo.Logica;
import br.com.Modelo.Arquivo;
import br.com.Modelo.ArquivoDAO;
import br.com.Modelo.AutoCessaoDAO;
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
public class AutoCessaoUploadArquivo implements Logica{
    @Override    
     public String executa(HttpServletRequest req,
                     HttpServletResponse res) throws Exception {
        
        Upload up = new Upload(); 
        AutoCessaoDAO autoDAO = new AutoCessaoDAO();
        ArquivoDAO arDAO = new ArquivoDAO();
        Arquivo ar = new Arquivo();
        HttpSession session = req.getSession();
        
        int pkAutoCessao, retiRati=0;
        InputStream arquivoCarregado;
        String nomeDoArquivo, retiRatificacao, extensaoArquivo, caminhoArquivo, tipoArquivo, nmNomeclatura, execucao, loginSessio, pastaArquivar, sistemaOperacional;
       
        tipoArquivo = req.getParameter("tipoArquivo");
        nmNomeclatura = req.getParameter("nmNomeclatura");
        pkAutoCessao = Integer.parseInt(req.getParameter("pkAutoCessao"));
        retiRatificacao = req.getParameter("retiRatificacao");
        execucao = req.getParameter("execucao");
        loginSessio =(String) session.getAttribute("sessionLogin");
        sistemaOperacional = System.getProperty("os.name");
        
        if(null != retiRatificacao){
            retiRati = Integer.parseInt(retiRatificacao);
        }
        
                
        if (sistemaOperacional.equals("Linux")) {
            File diretorio = new File("/opt/SGPatri/Arquivo/"+tipoArquivo);
            boolean existente = diretorio.exists();
            if (!existente) {
                diretorio.mkdirs();
            }
            pastaArquivar = File.separator+"opt"+File.separator+"SGPatri"+File.separator+"Arquivo"+File.separator+tipoArquivo;
        } else {
            File diretorio = new File("C:/SGPatri/Arquivo/"+tipoArquivo);
            boolean existente = diretorio.exists();
            if (!existente) {
                diretorio.mkdirs();
            }
            pastaArquivar = "C:"+File.separator+"SGPatri"+File.separator+"Arquivo"+File.separator+tipoArquivo;
        }
        int qtdRepetidos = arDAO.qtdRepetidos(pkAutoCessao, tipoArquivo);
        
        Part ArquivoUpload = req.getPart("ArquivoUpload");
        extensaoArquivo = Transformar.getFileExtension(ArquivoUpload.getSubmittedFileName());
        nomeDoArquivo = "idAC-"+String.valueOf(pkAutoCessao)+"-"+tipoArquivo+extensaoArquivo;
        
        if(qtdRepetidos > 0){
            qtdRepetidos = qtdRepetidos-1;
            nomeDoArquivo = String.valueOf(pkAutoCessao)+"-"+tipoArquivo+"-ratificacao-"+qtdRepetidos+extensaoArquivo;
            retiRati = 1;
        }
//        nomeDoArquivo = Transformar.getSubstituiEspacoHifen(Transformar.getRetiraEspacosDuplicados(Transformar.getRemoveAccents(ArquivoUpload.getSubmittedFileName())));
        arquivoCarregado = ArquivoUpload.getInputStream();
        caminhoArquivo = up.upload(pastaArquivar, nomeDoArquivo, arquivoCarregado);
        ar = new Arquivo(pkAutoCessao, retiRati, tipoArquivo, nomeDoArquivo, extensaoArquivo, caminhoArquivo, nmNomeclatura, loginSessio);
        arDAO.cArquivo(ar);
            
        if("Planta".equals(tipoArquivo)){
            autoDAO.upAutoCessaoVerificadoArquivoPlanta(pkAutoCessao, 1);
        }else{
            autoDAO.upAutoCessaoVerificadoArquivoAc(pkAutoCessao, 1);
        } 
            
        req.setAttribute("msg", "true");
        req.setAttribute("tipoAler", "success");
        req.setAttribute("alert", "Sucesso! ");
            
//            if( pkAutoCessao > 4675){
//                req.setAttribute("txtAlert", "Finalizado os cadastro do Auto Cessão");
//                return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoStage="+pkAutoCessao+"&execucao=view";
//            }else{
        req.setAttribute("txtAlert", "O arquivo "+tipoArquivo+" foi incluido corretamente.");
//            return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoStage="+pkAutoCessao+"&execucao="+execucao;
//            }
//        } else{
//            
//            req.setAttribute("msg", "true");
//            req.setAttribute("tipoAler", "danger");
//            req.setAttribute("alert", "Duplicidade ! ");
//            req.setAttribute("txtAlert", "Excluir o arquivo para anexar um novo arquipo do tipo "+tipoArquivo+".");
//            return"ControllerServlet?acao=AutoCessaoDetalhe&pkAutoCessao="+pkAutoCessao+"&execucao="+execucao;
//        }        
        return "ControllerServlet?acao=AutoCessaoDetalhe&pkAutoStage="+pkAutoCessao+"&execucao="+execucao;  
    }   

   
    
}
