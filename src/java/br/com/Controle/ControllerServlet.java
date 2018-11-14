/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.Logica;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author d732229
 */

@MultipartConfig
public class ControllerServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String acao = request.getParameter("acao");
            String ClasseAcao = "br.com.Controle." + acao;
        
        try {
               Class classe = Class.forName(ClasseAcao);
               Logica logica = (Logica) classe.newInstance();
                
               String pagina = logica.executa(request, response);
               request.getRequestDispatcher(pagina).forward(request, response);

             } catch (Exception e) {
                 throw new ServletException(
                     "\nA lógica de negócios causou uma exceção", e);
             }
         
        
       
        }
    }

   
   

