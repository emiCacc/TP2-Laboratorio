/* 
Si se asigna un valor a una variable fuera de rango (mayor de lo establecido). 
¿Qué ocurre? ¿Existe alguna forma de resolverlo? 

Si le asigno un valor fuera de rango a una variable me dara un error.
Una posible solucion seria CASTEAR el tipo de variable.

Por ejemplo:
para long c = 4654655456;

Hacemos el casteo:

*/
package com.mycompany.tpn2;
public class Ejercicio2 {
public static void main(String[] args) {
        
    /* Voy a sacarle la ultima cifra al long para poder declararlo, ya que si no
    lo hagom no me dejaria guardar este trabajo para enviarlo, por lo tanto
    quedaria declarado asi: 
    */
    
    long c = 465465545;
    

/* Ahora hago el casteo: */    
  String a = String.valueOf(c);
  
/* Y muestro el resultado*/
    System.out.println(c);          
        
}
}
