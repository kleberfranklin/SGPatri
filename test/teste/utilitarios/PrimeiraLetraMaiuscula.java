/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.utilitarios;

import br.com.Modelo.AutoCessao;
import br.com.Modelo.AutoCessaoDAO;
import com.sun.xml.internal.ws.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





/**
 *
 * @author d732229
 */
public class PrimeiraLetraMaiuscula {
    public static void main(String[] args) throws UnsupportedEncodingException{
        
        String nome = "À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ð Ñ Ò Ó Ô Õ Ö Ø Ù Ú Û Ü Ý Þ ß à á â ã ä å æ ç è é ê ë ì í î ï ð ñ ò ó ô õ ö ø ù ú û ü ý þ ÿ ";
//        System.out.println(iniMaiuscula(nome));
//        System.out.println(encoder(nome));
//        System.out.println(removeAccents(nome));
        //System.out.println(removeAccents(nome));
        System.out.println(removeEspaco(retiraEspacosDuplicados(removeAccents(nome))));
        
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
        
         public static String removeEspaco(String str){
            str = str.trim();
            str = str.replaceAll("\\s+","-");
        return str;
    }
         
         
        public static String retiraEspacosDuplicados(String string) {
            String patternStr = "\\s+";
            String replaceStr = " ";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(string);
            string = matcher.replaceAll(replaceStr);
        return string;
}
         
}
