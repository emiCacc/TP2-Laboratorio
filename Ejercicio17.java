/*
Cree una clase FuncionesPrograma y codifique una función estática que reciba 
como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función getFechaString.
 */
package com.mycompany.tpn2;
import java.time.Instant;
import java.util.Date;
public class Ejercicio17 {
  
public static void main(String[] args) {
       
        String actualDate = FuncionesPrograma.getFechaString(Date.from(Instant.EPOCH));
        System.out.println("Fecha: "+actualDate);
      
}
}