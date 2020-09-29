package com.mycompany.tpn2;

public class OperacionMatematica {
       private double valor1;
       private double valor2;
       private String operacion;

public double getvalor1(){
    return valor1;
    }

public double getvalor2(){
    return valor2;
    }

public void setvalor1(double valor1){
    this.valor1 = valor1;
    }
    

public void setvalor2(double valor2){
    this.valor2 = valor2;
    }

public String getOperacion(){
    return operacion;
}

public void setOperacion (String operacion){
    this.operacion = operacion;
}

private double sumarNumeros(){
    return valor1 + valor2;
    }

private double restarNumeros(){
    return valor1 - valor2;
    }

private double multiplicarNumeros(){
    return valor1 * valor2;
    }

private double dividirNumeros(){
    return valor1 / valor2;
    }


public double aplicarOperacion(String operacion){
    double cuentasRealiz = 0;
    
switch (operacion){
    
    case "+":
       cuentasRealiz = this.sumarNumeros();
        System.out.println(cuentasRealiz);
        break;
    
    case "-":
       cuentasRealiz = this.restarNumeros();
        System.out.println(cuentasRealiz);
        break;
        
    case "*":
       cuentasRealiz = this.multiplicarNumeros();
        System.out.println(cuentasRealiz);
        break;
        
    case "/":
       cuentasRealiz = this.dividirNumeros();
        System.out.println(cuentasRealiz);
        break;
    
    default:
        System.out.println("La informacion ingresada no es correcta. (Intente + , - , * o / )");

}

return cuentasRealiz;

}
}