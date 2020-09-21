/*
Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas 
vocales tiene en total (recorre el String con charAt)
 */
package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {

    System.out.println("Dame un texto...");
    int contador = 0;
    Scanner n = new Scanner(System.in);
    String texto = n.nextLine();
    char x = texto.charAt(0);
    int tamaño = (int) texto.codePoints().count();  
    for(int i=0; i < texto.length(); i++) {
 
        if ((texto.charAt(i)=='a') 
            || (texto.charAt(i)=='e') 
            || (texto.charAt(i)=='i') 
            || (texto.charAt(i)=='o') 
            || (texto.charAt(i)=='u')){ 
               
            contador++;
          
        }else{}
                 
    System.out.println("El tamaño de la cadena es de: " + tamaño + " caracteres y tiene: " + contador + " vocales"); 
      

    
 

       
}
}
}
