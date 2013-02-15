/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author María Galbis
 */
public class Format {
    
    public static String toMySql(Date fecha) {
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(fecha);
    }
    
    public static String fromMySql(Date fecha) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(fecha);
        int dia = calendar.get(Calendar.DAY_OF_MONTH); //dia del mes 
        int mes = calendar.get(Calendar.MONTH) + 1; //mes, de 0 a 11 
        int anyo = calendar.get(Calendar.YEAR); //año 

        return dia+"-"+toLength(mes, 2)+"-"+anyo;
    }
    
    public static String toLength(int num, int length){
        String numero = String.valueOf(num);
        
        for(int i = numero.length(); i < length; i++){
            numero = "0"+numero;
        }
        
        return numero;
    }
}
