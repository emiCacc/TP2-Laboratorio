/* 
Cree una clase OperacionMatematica con dos atributos numéricos decimales, valor1 y valor2 y un atributo String de 
nombre operación. Cree los correspondientes métodos get/set.

Cree una clase Calculo que contenga un método main, donde cree una instancia de la clase OperacionMatematica, 
asigne 2 valores para las variables de la instancia y ejecute la función aplicarOperacion, pasando como parámetro 
primero “+”, después “-”, a continuación “*” y finalmente “/”. Muestre por pantalla el resultado de las operaciones.
*/
package com.mycompany.tpn2;
public class Ejercicio19 {
    
public static void main(String[] args) {
    
OperacionMatematica opera = new OperacionMatematica();

opera.setvalor1(4.5);
opera.setvalor2(5.4);
opera.setOperacion("+");
opera.aplicarOperacion(opera.getOperacion());
opera.setOperacion("-");
opera.aplicarOperacion(opera.getOperacion());
opera.setOperacion("*");
opera.aplicarOperacion(opera.getOperacion());
opera.setOperacion("/");
opera.aplicarOperacion(opera.getOperacion());

}
}