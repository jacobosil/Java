package javaapplication64.entidades;

public class Cuenta {
    //crear una clase cuenta  que tenga como atributos saldo y titular. 
    //luego crear un metodo retirar dinero que permita retirar una cantidad
    //de dinero del saldo de la cuenta. Asegurate que el saldo no sea negativo
    
    
    private double saldo;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirarDinero(double cantidad){
        if (cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
            System.out.println("retiro exitosamente");
        }else {
            System.out.println("Saldo insuficiente");
        }
    
}
    
    public void depositarDinero(double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("deposito exitosamente");
        }else {
            System.out.println("cantidad invalida para depositar");
        }
    }
}
