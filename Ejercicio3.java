/* 
Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 - 999) 
y por medio del uso de las operaciones matemáticas módulo 10 y división por 10 efectué 
la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida del algoritmo 14.
*/
package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio3 {
public static void main(String[] args) {
    
    Scanner n = new Scanner (System.in);
    int c;
    int suma = 0;
    
    System.out.println("Ingrese un numero de 3 cifras ");
     c = n.nextInt();
   
    
    
    while (c > 0){
        suma += c % 10;
        c = c / 10;
    }
    System.out.println("La suma es: " + suma);
    
    







}
}
