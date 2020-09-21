/*
Convertir una frase a mayúsculas o minúsculas, que daremos opción 
a que el usuario lo pida y mostraremos el resultado por pantalla. */
package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {

    
    Scanner n = new Scanner (System.in);
    System.out.println("Ingrese un texto en minuscula o en mayuscula...");
    
    String frase = n.nextLine();
    
    System.out.println("En mayusculas su frase es: " + frase.toUpperCase());
    System.out.println("En minusculas su frase es: " + frase.toLowerCase());
}
}
