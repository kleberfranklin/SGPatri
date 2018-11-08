/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Utilitario.Upload;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author d732229
 */
@MultipartConfig
public class ArquivoUploadTest extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    Upload arquivo = new Upload(); 
    String tipoArquivo = request.getParameter("tipoArquivo");
    int pkAutoStage = Integer.parseInt(request.getParameter("pkAutoStage"));
//    String nomeDoArquivo = request.getParameter("nmPlantaAnexa");
    String nomeDoArquivo;
//    String nomeId = nomeDoArquivo+pkAutoStage;
    String caminhoArquivo;
    String pasta = "/Arquivo";
    String arquivar = getServletContext().getRealPath(pasta);
    arquivar+="\\Planta";  
//    String arquivar = "C:\\Users\\d732229\\Documents\\Projects\\CGPatri\\build\\web\\Upload\\Planta";
    InputStream arquivoCarregado;
    
    
//    switch(tipoArquivo){
//        case "planta":
            Part arquivoPart = request.getPart("UploadPlanta");
//            pasta = "\\CGPatri\\web\\Upload\\Planta";
            nomeDoArquivo = arquivoPart.getSubmittedFileName();
            arquivoCarregado = arquivoPart.getInputStream();
            caminhoArquivo = arquivo.upload(arquivar, nomeDoArquivo, arquivoCarregado);
            System.out.println(caminhoArquivo);
            request.getRequestDispatcher("ControllerServlet?acao=AutoCessaoValidacaoLista").forward(request, response);
             
           
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

   

}
