/*
Pedir dos palabras por teclado, indicar si son iguales. 
(equals, compareTo, compareToIgnoreCase)
 */
package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio11 {
public static void main(String[] args) {

    Scanner n = new Scanner (System.in);
  
    System.out.println("Compararemos dos palabras con '==': ");
    System.out.println("Ingrese la primer palabra:");
    String palabra1 = n.nextLine();
    System.out.println("Ingrese la segunda palabra:");
    String palabra2 = n.nextLine();
    
    if (palabra1 == palabra2){
        System.out.println("¡Las palabras son iguales!");
    }else{
        System.out.println("Las palabras son diferentes..");
    }
    
    System.out.println("Ahora las compararemos con 'equals': ");
    if (palabra1.equals(palabra2)){
            System.out.println("¡Las palabras son iguales!");    
    }else{
            System.out.println("Las palabras son diferentes..");
    }
    
    System.out.println("Ahora las compararemos con 'compareTo': ");
    if (palabra1.compareTo(palabra2)==0){
        System.out.println("¡Las palabras son iguales!");
    }else if (palabra1.compareTo(palabra2) < 0){
            System.out.println("La palabra 1 va antes que la palabra2");
    }else if (palabra1.compareTo(palabra2) > 0){
        System.out.println("La palabra 2 va antes que la palabra 1");
    }
    
    System.out.println("Ahora las compararemos con 'equals.IgnoreCase': ");
    if (palabra1.equalsIgnoreCase(palabra2)){
    System.out.println("¡Las palabras son iguales!");
    }else{
        System.out.println("Las palabras son diferentes....");
    }
    
}
}
