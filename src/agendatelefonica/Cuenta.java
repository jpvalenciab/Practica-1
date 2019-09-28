/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author jenny.valencia
 */
public class Cuenta {
    
private final String titular;
private double saldo;

public Cuenta(String titular){
    this.titular = titular;
}

public Cuenta(String titular, double saldo){
    this.titular = titular;
    this.saldo = saldo;
}

public void ingresar (double cantidad){
    if (cantidad > 0){
       this.saldo += cantidad;
    }
} 

public void retirar (double cantidad){
    if (cantidad > saldo){
        throw new RuntimeException("SALDO INSUFICIENTE");
    }
    else{
    this.saldo -= cantidad;    
    }
  
    
}

    @Override
    public String toString() {
        return "El titular" + titular + "Tiene un saldo de: " + saldo;
    }

    
    public void imprimirCuenta(){
        System.out.println("El titular y el saldo de la cuenta son:"+titular+saldo);
        
         
    }

public static void main (String [] args){
    String titular;
    double saldo;
    
   
    Cuenta miCuenta = new Cuenta ("JENNY PAOLA", 200.000);
    
    //Para ingresar dinero a mi Cuenta
    double ingresar = 100.000;
    System.out.println("Se ingresa a la cuenta:"+ingresar+"$");
   miCuenta.ingresar(ingresar);
    
    //Para retirar dinero de mi Cuenta
    double retirar = 50.000;
    System.out.println("Se retira de la cuenta:"+retirar+"$");
    miCuenta.retirar(retirar);
   
    
    //Imprimir la información de mi cuenta
    System.out.println("Saldo de la cuenta:"+miCuenta.saldo);
    
    
}
}


    


    
    
    


