package teste.utilitarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.com.Modelo.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author d732229
 */
public class CalcPrazoVencimento {

public static void main(String args[]) throws ParseException {
//    public Date somaDiasMesAno(Date data, int dias, int mes, int ano) {
 
    Calendar cal = new GregorianCalendar();
    String hoje = "21/11/2018";
    DateFormat converter =new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault());
    Date data = converter.parse(hoje);
    
        int dias=0, mes=0, ano=0;
        int altD=0, aldM=0, altAno=0;
        
        cal.setTime(data);
        cal.add(Calendar.DAY_OF_MONTH, +dias);
        cal.add(Calendar.MONTH, +mes+1);// No calendário do java Janeiro = 0, Fevereiro=1, etc.
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
