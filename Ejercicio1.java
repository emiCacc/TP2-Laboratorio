/*
CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y asigne 
el mismo a una variable valorDecimal de tipo double, aplique las operaciones de CASTING 
para convertir la variable a los siguientes tipos de datos, short, int, long, String, 
float investigue las diferentes formas de lograr la conversión. Muestre por pantalla 
el resultado de las conversiones.


-----------------------------------------------------------------------------
| VARIABLES PRIMITIVAS                        VARIABLES DE REFERENCIA       |
-----------------------------------------------------------------------------
| int a = 5;                                  Integer porReferencia = null; |
| double b;                                   Double b;                     |
|                                             String cadena = "cadena";     |
| boolean c = true;                           Boolean c = true;             |
----------------------------------------------------------------------------- 
*/

package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
 
    System.out.println("Ingrese un numero decimal");
    Scanner n = new Scanner(System.in);
    double valorDecimal = n.nextDouble();
    
    System.out.println("El numero ingresado es " + valorDecimal + "\n");
    System.out.println("Ahora haremos un CASTEO \n");

    
    /* 
    short, int, long, String, float
    */
    
    short a = (short) valorDecimal;
    int b = (int) valorDecimal;
    long c = (long) valorDecimal;
    float d = (float) valorDecimal;
    String e = String.valueOf(valorDecimal);
    
    System.out.println("a Short: " + a);
    System.out.println("a Int: " + b);
    System.out.println("a Long: " + c);
    System.out.println("a Float: " + d);
    System.out.println("a String: " +e);
    
    
    
    
    
    
    
    
    









}   
}
