package teste.utilitarios;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author d732229
 */
public class TesteDatas {
    
    public static void main(String args[]) {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Date dataBase = null;
      Date vencimento = null;
      try {
         dataBase = sdf.parse("03/10/1993");
         vencimento = sdf.parse("28/09/2018");
      } catch (java.text.ParseException e) { return; }
     
      long diferencaMS = vencimento.getTime() - dataBase.getTime();
      long diferencaSegundos = diferencaMS / 1000;
      long diferencaMinutos = diferencaSegundos / 60;
      long diferencaHoras = diferencaMinutos / 60;
      long diferencaDias = diferencaHoras / 24;
      long diferencaMes = (diferencaDias/ 365)*12 ;
      long diferencaAno = diferencaMes / 12;
      System.out.println("milisegundos "+diferencaMS);
      System.out.println("segundos  "+diferencaSegundos);
      System.out.println("minutos "+diferencaMinutos);
      System.out.println("horas "+diferencaHoras);
      System.out.println("Dias "+diferencaDias);
      System.out.println("Mes "+diferencaMes);
      System.out.println("Anos "+diferencaAno);
  }
    
}
