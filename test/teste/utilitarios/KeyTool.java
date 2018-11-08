package teste.utilitarios;


import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author d732229
 */
public class KeyTool {
     //Ler o certificad do keyStore JKS 
   public static void main(String[] args) throws Exception {

      String pathKeyStore = "C://MeukeyStore.jks";		
      String senhaKeyStore = "changeit";
      String senhaChavePrivada ="123456";
      String alias = "aliasDaMinhaChave";

      InputStream entrada = new FileInputStream(pathKeyStore);

      KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());//JKS 
      try { 
        //carregar o arquivo no keyStore
        ks.load(entrada, senhaKeyStore.toCharArray());

        //obter a chave privada
        KeyStore.PrivateKeyEntry keyEntry = (KeyStore.PrivateKeyEntry)
 
        ks.getEntry(alias, new KeyStore.PasswordProtection(senhaChavePrivada.toCharArray()));
        System.out.println("----------------- chave privada----------------------");
        System.out.println(keyEntry.getPrivateKey());

        //certificado correspondente a chave privada			
        System.out.println("----------------- chave publica (Certificado)----------------------");
        System.out.println(keyEntry.getCertificate());

      } catch (Exception e) {
         e.printStackTrace();			
      }	
    }
    
    
}
