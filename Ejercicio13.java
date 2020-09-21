/*
Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena 
se encuentra dentro de la primera (usar indexOf o contains).
 */
package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args) {

    Scanner n = new Scanner (System.in);
    System.out.println("Comprobaremos dos cadenas.");
    System.out.println("Ingrese la primer cadena");
    String cadena1 = n.nextLine();
    System.out.println("Ingrese la segunda cadena");
    String cadena2 = n.nextLine();
        
    if (cadena2.contains(cadena1)) {
	      
        System.out.println("La segunda cadena se encuentra en la cadena 1");

}else{
        System.out.println("La segunda cadena NO se encuentra en la cadena 1");
}
}
}