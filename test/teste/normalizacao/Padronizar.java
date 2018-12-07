/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.normalizacao;

import br.com.Modelo.AutoCessaoValidacao;
import br.com.Modelo.AutoCessaoValidacaoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author d732229
 */
public class Padronizar {
    public static void main(String args[]){
    
      AutoCessaoValidacaoDAO autoDAO = new AutoCessaoValidacaoDAO();
        List<AutoCessaoValidacao> lisAuto = new ArrayList();
        lisAuto = autoDAO.listIdAuto();
        
        int PkAutoStage =0;
        String qEndereco="", qReferenciaEnd="";
                
        for (AutoCessaoValidacao auto :lisAuto){
            PkAutoStage = auto.getPkAutoStage();
//            qEndereco = auto.getNmEndereco();
//            qReferenciaEnd = auto.getNmReferencialEndereco();
            
            
//            autoDAO.normalizar(PkAutoStage, qCessionario, qCedente, qEndereco);
              autoDAO.normalizar(PkAutoStage, qReferenciaEnd);
              System.out.println(PkAutoStage);
//            System.out.print(" - "+ qCessionario);
//            System.out.print("- "+ qCedente);
//            System.out.println("- "+qEndereco);
        }
         System.out.println("---------------------------/Concluido/-----------------------------");   
        
        
    }
    
    
    
    
    
    
    
}
