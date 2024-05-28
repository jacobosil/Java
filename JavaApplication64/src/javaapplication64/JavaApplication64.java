
package javaapplication64;

import javaapplication64.entidades.Cuenta;


public class JavaApplication64 {

    
    public static void main(String[] args) {
        //crear una clase cuenta  que tenga como atributos saldo y titular. 
        //luego crear un metodo retirar dinero que permita retirar una cantidad
        //de dinero del saldo de la cuenta. Asegurate que el saldo no sea negativo
        
        
        
        Cuenta Bancaria = new Cuenta(500, "Maria");
        System.out.println("nombre de la cuenta " + Bancaria.getTitular());
        System.out.println("saldo de la cuenta " + Bancaria.getSaldo());
        
        Bancaria.retirarDinero(350);
        System.out.println("saldo de la cuenta " + Bancaria.getSaldo());
        
        Bancaria.retirarDinero(200);
        System.out.println("saldo de la cuenta " + Bancaria.getSaldo());
        
        Bancaria.setTitular("Anastasio");
        Bancaria.setSaldo(10000);
        
        System.out.println("nuevo titular " + Bancaria.getTitular());
        System.out.println("saldo de la cuenta " + Bancaria.getSaldo());
        
        
        Bancaria.depositarDinero(20000.55);
        System.out.println("su nuevo saldo es " + Bancaria.getSaldo());
    }
    
}
