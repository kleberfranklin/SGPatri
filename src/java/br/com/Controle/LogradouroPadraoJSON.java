/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Controle;

import br.com.Modelo.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;



/**
 *
 * @author d732229
 */

public class LogradouroPadraoJSON implements Logica {
    @Override
    public String executa(HttpServletRequest req,
            HttpServletResponse res) throws Exception {
        
        JSONObject jsonEndereco = new JSONObject();
        
        LogradouroPadraoDAO lograDAO = new LogradouroPadraoDAO();
        LogradouroPadrao lograp = new LogradouroPadrao();
        
        String cep, path, enderecoJson;
        
        cep = req.getParameter("cep");
        path = req.getServletContext().getRealPath("/")+"include"+File.separator+"enderecoJson.json";
        enderecoJson = File.separator+"include"+File.separator+"enderecoJson.json";
        
        lograp = lograDAO.pesquisaCepLogradouro(cep);
        
        
        jsonEndereco.put("pkLogradouro", lograp.getPkLogradouroPadrao());
        jsonEndereco.put("cep", lograp.getNrCep());
        jsonEndereco.put("logradouro", lograp.getNmLogradouroCompleto());
        jsonEndereco.put("complemento", lograp.getDsComplemento());
        jsonEndereco.put("bairro", lograp.getNmBairro());
        
        
        
        try {
//            FileWriter file = new FileWriter("C:\\Users\\d732229\\Documents\\PROJETOS\\SGPatri\\build\\web\\include\\enderecoJson.json");
            FileWriter file = new FileWriter(path);
            file.write(jsonEndereco.toString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return enderecoJson;
    }    
}
