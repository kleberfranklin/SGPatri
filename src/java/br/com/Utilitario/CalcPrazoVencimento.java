/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Utilitario;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author d732229
 */
public class CalcPrazoVencimento {

    public Date somaDiasMesAno(Date data, int dias, int mes, int ano) {

    Calendar cal = new GregorianCalendar();
        
//        cal.setTime(data);
//        cal.add(Calendar.DAY_OF_MONTH, +dias);
//        cal.add(Calendar.MONTH, +mes);
//        cal.add(Calendar.YEAR, +ano);
        
        
        return cal.getTime();
    }
    
}
