/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.utilitarios;

import br.com.Modelo.AutoCessaoValidacao;
import br.com.Modelo.AutoCessaoValidacaoDAO;
import com.sun.xml.internal.ws.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;





/**
 *
 * @author d732229
 */
public class PrimeiraLetraMaiuscula {
    public static void main(String[] args) throws UnsupportedEncodingException{
        
/**
    Normalização da remover acentos e colocar para tuto maiusculo 
*/
        
//        AutoCessaoValidacaoDAO autoDAO = new AutoCessaoValidacaoDAO();
//        List<AutoCessaoValidacao> lisAuto = new ArrayList();
//        lisAuto = autoDAO.listIdAuto();
//        
//        int PkAutoStage =0;
//        String qCessionario="", qCedente="", qEndereco="";
//                
//        for (AutoCessaoValidacao auto :lisAuto){
//            PkAutoStage = auto.getPkAutoStage();
//            qCessionario = removeAccents(auto.getNmCessionario()).toUpperCase();
//            qCedente = removeAccents(auto.getNmCedente()).toLowerCase().toUpperCase();
//            qEndereco = removeAccents(auto.getNmReferencialEndereco()).toUpperCase();
//            
//            autoDAO.normalizar(PkAutoStage, qCessionario, qCedente, qEndereco);
//            System.out.print(PkAutoStage);
//            System.out.print(" - "+ qCessionario);
//            System.out.print("- "+ qCedente);
//            System.out.println("- "+qEndereco);
//            
//            System.out.println("---------------------------//-----------------------------");
//            
//        }
//        
        
    
        String nome = "À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ð Ñ Ò Ó Ô Õ Ö Ø Ù Ú Û Ü Ý Þ ß à á â ã ä å æ ç è é ê ë ì í î ï ð ñ ò ó ô õ ö ø ù ú û ü ý þ ÿ ";
//        System.out.println(iniMaiuscula(nome));
//        System.out.println(encoder(nome));
//          System.out.println(removeAccents(nome));
          
            
        
        
    }
    public static String iniMaiuscula(String value) {
		String result = "", result2="";
		String[] nomes = value.split("\\s+");
                for(String palavra : nomes){
                    result = result + " " + palavra.replaceFirst(palavra.substring(0, 1), palavra.substring(0, 1).toUpperCase());
		}
                System.out.println("Result: "+result);
		for(String palavra : nomes){
                    result2 = result2 + " " + StringUtils.capitalize(palavra);
		}
                System.out.println("Result2: "+result2);
		return result.trim();
    } 
    
        public static String encoder(String s) throws UnsupportedEncodingException{
           String t;
                System.out.println("-----------------");
                System.out.println("Original "+s);
                t = URLEncoder.encode(s,"ISO-8859-1");
                System.out.println("Encode: "+t);
                t = URLDecoder.decode(s, "ISO-8859-1");
                System.out.println("Decoder: "+t);

            return t;
        }
    
    
        public static String removeAccents(String str) {
            str = Normalizer.normalize(str, Normalizer.Form.NFD);
            str = str.replaceAll("[^\\p{ASCII}]", "");
            return str;
        }
}
