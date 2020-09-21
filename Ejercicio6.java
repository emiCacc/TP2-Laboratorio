/*
Del siguiente String “La lluvia en Mendoza es escasa” indique cual es 
el tamaño de la cadena es decir su número de caracteres.
 */
package com.mycompany.tpn2;
public class Ejercicio6 {
public static void main(String[] args) {

String lluvia = "La lluvia en Mendoza es escasa";

 int tamaño = (int) lluvia.codePoints().count();
    System.out.println("El tamaño de la cadena es de: " + tamaño + " caracteres");

}
}
