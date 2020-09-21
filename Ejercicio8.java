/*
Reemplaza todas las a del String anterior por una e. (aplique replace)
 */
package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio8 {
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
    System.out.println("Reemplazando todas las 'a' del string ingresado por 'e': " + texto.replace('a', 'e'));
}
}