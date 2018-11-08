/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.utilitarios;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author d732229
 */
public class Encoding {
    public static void main(String... args) throws UnsupportedEncodingException{
    
    String[] codes = { "ISO-8859-1", "UTF-8", "UTF-16" };
    String palavra = "a";
 
    for (String encoding : codes) {
      byte[] b = palavra.getBytes(encoding);
      System.out.printf("%10s\t%d\t", encoding, b.length);
      for (int k = 0; k < b.length; k++) {
        String hex = Integer.toHexString((b[k] + 256) % 256);
        if (hex.length() == 1)
          hex = "0" + hex;
        System.out.print(hex);
      }
      System.out.println();
    }
    
        
        System.out.println("ç escrito em UTF-8 mas lido em ISO-8859-1");
        System.out.println(new String("ção".getBytes("UTF-8"), "ISO-8859-1"));
        System.out.println("ç escrito em ISO-8859-1 mas lido em UTF-8");
        System.out.println(new String("ção".getBytes("ISO-8859-1"), "UTF-8"));
        
        System.out.println(new String("ç".getBytes("UTF-8"), "UTF-8"));
    
    
    
    }
    
    
    
}
