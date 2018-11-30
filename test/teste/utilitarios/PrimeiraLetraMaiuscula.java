/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.utilitarios;

import com.sun.xml.internal.ws.util.StringUtils;





/**
 *
 * @author d732229
 */
public class PrimeiraLetraMaiuscula {
    public static void main(String[] args){
    
        String nome = "ffdsafsad fas iofsd        amoifaisdsfasd fdsfdsaf  ";
        System.out.println(iniMaiuscula(nome));
        System.out.println();
        
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
    
    
}
