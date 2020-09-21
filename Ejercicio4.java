/* 
Desarrolle un programa que ayude a una cajera a determinar el número de billetes 
y monedas que se necesitan de cada una de las siguientes denominaciones 
200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y 0.05 centavos 
para una cantidad de dinero dada. 
Ejemplo si la cantidad es 1390,55 se necesitan 6 billetes de 200, 
1 billete de 100, 1 billete de 50, 2 billetes de 20, 1 moneda 
de 0.50 y una moneda de 0.05 centavos.
*/
package com.mycompany.tpn2;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {

Scanner n = new Scanner(System.in);
int b200 = 0; 
int b100 = 0;
int b50 = 0;
int b20 = 0; 
int b10 = 0; 
int b5 = 0;
int b1 = 0;

int m50 = 0;
int m25 = 0; 
int m10 = 0; 
int m5 = 0;
int x = 0;
int caja = 0;
int monto;


System.out.println("Cuanto hay que cobrar?");
monto = n.nextInt();

System.out.println("Verificando cifra ingresada... " +monto);

if (monto > 0){
    
    b200 = monto / 200;
    caja = monto % 200;
    
    b100 = caja / 100;
    caja = caja % 100;
    
    b50 = caja / 50;
    caja = caja % 50;
    
    b20 = caja / 20;
    caja = caja % 20;
    
    b10 = caja / 10;
    caja = caja % 10;
    
    b5 = caja / 5;
    caja = caja % 5;
    
    x = caja / 1;
    
    m50 = (int) (caja / 0.50);
    caja = (int) (caja % 0.50);
    
     m25 = (int) (caja / 0.25);
    caja = (int) (caja % 0.25);
    
    m10 = (int) (caja / 0.10);
    caja = (int) (caja % 0.10);
    
    m5 = (int) (caja / 0.5);
    caja = (int) (caja % 0.5);
    
    
    System.out.println("Su cambio es: "); 
    System.out.println("Billetes de 200: " +b200);
    System.out.println("Billetes de 100: " +b100);
    System.out.println("Billetes de 50: " +b50);
    System.out.println("Billetes de 20: " +b20);
    System.out.println("Billetes de 10: " +b10);
    System.out.println("Billetes de 5: " +b5);
    System.out.println("Billetes de 200: " +b1);
    System.out.println("Monedas de 50 centavos: " +m50);
    System.out.println("Monedas de 25 centavos: " +m25);
    System.out.println("Monedas de 10 centavos: " +m10);
    System.out.println("Monedas de 5 centavos: " +m5);
    
}else{
    System.out.println("No es posible operar con esa cifra!");
}

}
}
