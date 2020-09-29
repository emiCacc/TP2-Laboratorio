/*
Cree una clase FuncionesPrograma y codifique una función estática que reciba 
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función getFechaString.
 */
package com.mycompany.tpn2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FuncionesPrograma {


    public static String getFechaString(Date fecha) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String fechaStr = dateFormat.format(fecha);

        return fechaStr;
}
    
    public static Date getFechaDate(int day, int month, int year){
        
        Date dateRatio = new Date();
        dateRatio.setDate(day);
        dateRatio.setMonth(month - 1);
        dateRatio.setYear(year - 1900);
        
        
        return dateRatio;

}
}