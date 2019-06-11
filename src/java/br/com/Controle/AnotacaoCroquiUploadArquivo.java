/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.AnexoCroqui;
import br.com.Modelo.AnexoCroquiDAO;
import br.com.Modelo.Logica;
import br.com.Utilitario.Transformar;
import br.com.Utilitario.Upload;
import java.io.File;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


/**
 *
 * @author d732229
 */
public class AnotacaoCroquiUploadArquivo implements Logica {
    @Override
    public String executa(HttpServletRequest req, 
            HttpServletResponse res) throws Exception {
        
        
        Upload up = new Upload();
        HttpSession session = req.getSession();
        AnexoCroqui anexo = new AnexoCroqui();
        AnexoCroquiDAO anexoDAO = new AnexoCroquiDAO();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        
        
        
        int pkAnexoCroqui, fktipoArquivo;
        String [] listPkAnotCroqui;
        InputStream arquivoStream;
        String pkAnotCroqui, extensaoArquivo, nmAnexo, dsAnexo, nmDiretorio, loginSessio, pastaArquivar, sistemaOperacional;
        Date data = c.getTime();
        
        
        pkAnotCroqui = req.getParameter("pkAnotCroqui"); 
        fktipoArquivo = Integer.parseInt(req.getParameter("fktipoArquivo"));
        listPkAnotCroqui = req.getParameterValues("listPkAnotCroqui");
        dsAnexo = req.getParameter("nomeDoArquivo");
        loginSessio =(String) session.getAttribute("sessionLogin");
        sistemaOperacional = System.getProperty("os.name");
        
        if(listPkAnotCroqui==null){
            listPkAnotCroqui = new String[1];
            listPkAnotCroqui[0] = pkAnotCroqui;
        }
        
        if (sistemaOperacional.equals("Linux")) {
            File diretorio = new File("/opt/SGPatri/Arquivo/Croqui");
            boolean existente = diretorio.exists();
            if (!existente) {
                diretorio.mkdirs();
            }
            pastaArquivar = File.separator+"opt"+File.separator+"SGPatri"+File.separator+"Arquivo"+File.separator+"Croqui";
        } else {
            File diretorio = new File("C:/SGPatri/Arquivo/Croqui");
            boolean existente = diretorio.exists();
            if (!existente) {
                diretorio.mkdirs();
            }
            pastaArquivar = "C:"+File.separator+"SGPatri"+File.separator+"Arquivo"+File.separator+"Croqui";
        }
        
        Part ArquivoUpload = req.getPart("UploadCroqui");
        extensaoArquivo = Transformar.getFileExtension(ArquivoUpload.getSubmittedFileName());
        arquivoStream = ArquivoUpload.getInputStream();
        nmAnexo = sdf.format(data)+"+"+ArquivoUpload.getSubmittedFileName();
        nmDiretorio = up.upload(pastaArquivar, nmAnexo, arquivoStream);
        
        anexo = new AnexoCroqui(fktipoArquivo, nmAnexo, dsAnexo, nmDiretorio, extensaoArquivo, loginSessio);
        pkAnexoCroqui = anexoDAO.cAnexoCroqui(anexo);
        
        for (String pk : listPkAnotCroqui){
            anexoDAO.cCrossAnexoCroqui(Integer.parseInt(pk), pkAnexoCroqui,loginSessio);
            //listIntegerAnotCroqui.add(Integer.parseInt(pk));
        }
               
        
        List<AnexoCroqui> listAnexo = new ArrayList<AnexoCroqui>();
        listAnexo.add(anexoDAO.detalheAnexo(pkAnexoCroqui));
        
        
        req.setAttribute("bntBack","newSearch");
        req.setAttribute("execucao", "duplicate");
        req.setAttribute("tabAnexoActive", "in active");
        req.setAttribute("msg", "true");
        req.setAttribute("anexoGravado", "true");
        req.setAttribute("typeAlert", "success");
        req.setAttribute("msgAlert", "Sucesso! ");
        req.setAttribute("txtAlert", "O arquivo foi anexo e vinculados  ao(s) Croqui(s).");
        
        //req.setAttribute("listAnexo", listAnexo);
        return "AnotacaoCroquiCRU.jsp?execucao=view";
    }
    
}
