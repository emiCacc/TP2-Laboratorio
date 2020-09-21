/* 
Solicite el ingreso de un número y conviértalo a un String 
mediante String.valueOf
*/
package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {

    Scanner n = new Scanner (System.in);
    int x;
    
    
    System.out.println("Ingrese un numero: ");
    
    x = n.nextInt();
    
    String a = String.valueOf(x);
    System.out.println("El numero " + x + " se ha convertido en el String: " +a);
    
}
}

