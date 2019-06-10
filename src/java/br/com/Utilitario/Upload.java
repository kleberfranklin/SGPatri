/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Utilitario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author d732229
 */
public class Upload {
    
    public String upload(String pasta, String nomeDoArquivo,
            InputStream arquivoCarregado) throws FileNotFoundException {

        String caminhoArquivo = pasta + File.separator + nomeDoArquivo;
        File novoArquivo = new File(caminhoArquivo);
        FileOutputStream saida = new FileOutputStream(novoArquivo);
        copiar(arquivoCarregado, saida);
       return caminhoArquivo; 
    }
    
   private void copiar(InputStream origem, OutputStream destino) {
    int bite;
    byte[] tamanhoMaximo = new byte[1024 * 8]; // 8KB
    try {
    // enquanto bytes forem sendo lidos
      while((bite = origem.read(tamanhoMaximo)) >= 0) {

    // pegue o byte lido e escreva no destino
            destino.write(tamanhoMaximo, 0, bite);
        
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
}

   public boolean deltar(String pasta) throws FileNotFoundException {
        boolean deletar;
        File file = new File(pasta);
        if(file.exists()){
            file.deleteOnExit();
            deletar = file.delete();
        }else{
            deletar = false;
       }            
       return deletar; 
    }

   
//    public boolean deltar(String pasta, String nomeDoArquivo) throws FileNotFoundException {
//        boolean deletar;
//        
//        String caminhoArquivo = pasta + File.separator + nomeDoArquivo;
//        File file = new File(caminhoArquivo);
//        
//        if(file.exists()){
//            file.deleteOnExit();
//            deletar = true;
//        }else{
//            deletar = false;
//       }            
//       return deletar; 
//    }
    
}
