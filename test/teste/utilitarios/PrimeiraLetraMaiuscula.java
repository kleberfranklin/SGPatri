/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.utilitarios;

/**
 *
 * @author d732229
 */
public class PrimeiraLetraMaiuscula {
    public static void main(String[] args){
    
        String nome = "   ola tudo em teste ! ";
        System.out.println(iniMaiuscula(nome.trim()));
    }
    public static String iniMaiuscula(String value) {
		String result = "";
		String[] nomes = value.split(" ");
		for(String palavra : nomes){
			result = result + " " + palavra.replaceFirst(palavra.substring(0, 1), palavra.substring(0, 1).toUpperCase());
		}
		return result.trim();
	} 
    
    
}
