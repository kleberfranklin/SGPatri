package teste.utilitarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.Modelo.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author d732229
 */
public class CalcPrazoVencimento {

public static void main(String args[]) {
//    public Date somaDiasMesAno(Date data, int dias, int mes, int ano) {
 
    Calendar cal = new GregorianCalendar();
    Date data = cal.getTime();
        int dias=0, mes=0, ano=0;
        int altD=0, aldM=0, altAno=0;
        
        cal.setTime(data);
        cal.add(Calendar.DAY_OF_MONTH, +dias);
        cal.add(Calendar.MONTH, +mes);
        cal.add(Calendar.YEAR, +ano);
        
        System.out.println("Data: "+data);
        System.out.println("\nData: "+cal.getTime());
        
        //cal.setTime(cal.getTime());
        
        altD = cal.get(Calendar.DAY_OF_MONTH);
        aldM = cal.get(Calendar.MONTH);
        altAno = cal.get(Calendar.YEAR);
        
        System.out.println("\nDia alt "+altD);
        System.out.println("\nMês alt "+aldM);
        System.out.println("\nAno alt "+altAno);
//        

        
      //  return cal.getTime();
    }
    
}
