/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.normalizacao;
import br.com.Modelo.*;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author d732229
 */
public class Padronizar {
    public static void main(String args[]){
        
        int pk =0;
        String qTb="", qOrder="", colunaPk="", coluna1="", coluna2="";
        String qTxt1="", qTxt2="", dados="";
               
        qTb = "tbl_anotacao_expediente";
        qOrder = "id_anotacao_expediente";
        coluna1 ="cd_croqui";
//        coluna2 ="ds_assunto";
        colunaPk ="id_anotacao_expediente";
        
        DaoPadronizar d = new DaoPadronizar();

////Cria uma lista de objeto         
        List<AnotacaoExpediente> lisExp = new ArrayList();

////Popula a lista com as informações do banco        
        lisExp = d.listaObjeto(qTb, qOrder);
           
                
        for (AnotacaoExpediente expedi :lisExp){
            pk = expedi.getPkAnotacaoExpediente();
            qTxt1 = removeAccents(expedi.getCdCroqui()).toUpperCase().trim();
//            Txt2 = removeAccents(expedi.getDsAssunto()).toUpperCase();
            
////           REMOVAER O PONTOS DE UMA STRING 
               String [] t = qTxt1.split("\\- ");
                String result="";    
                for (String t1:t){
                  result= result+=t1;
                }       
              qTxt1=result;
              System.out.print("ID: "+pk);
              System.out.println(" | Txt1: "+ qTxt1);
//              System.out.println(" | Txt2: "+ qAssun);

////Atualizando as informações no banco
//            d.upInformacao(qTb, coluna1, qTxt1, coluna2, qTxt2, colunaPk, pk);
//            d.upInformacao(qTb, coluna1, qTxt1, colunaPk, pk);
        }
           
          

////    --PEGAR TODOS OS DADOS DO CAMPOS DADOS DA TB AUDITORIA DO CAP OFICIAL
//        dados = d.capDados();
//        System.out.println("CAP: "+ dados+"\n");
//        String [] tx= dados.split(";");
//        for(String texto : tx){
//            System.out.println(texto);
//        }
//        
       
       System.out.println("------FIM-----------");
    }
    
    public static String removeAccents(String str) {
        str = Normalizer.normalize(str, Normalizer.Form.NFD);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        return str;
    }    
    
    
    
    
    
}
