package javaapplication62.entidades;

//crear una clase llamada operacion que tenga como atributos privados 

import java.util.Scanner;

//numero1 y numero2. Crear los siguientes metodos
//metodo constructor con todos los atributos pasados por parametros
//METODO CONSTRUCTOR SIN LOS ATRIBUTOS PASADOS POR PARAMETROS
//metodos get y set para ambos atributos
//metodo crearOperacion(): que le pide al usuario los dos numeros y
//los guarda en los atributos del objeto
//metodo sumar(): que sumen los numeros y devuelva el resultado
//metodo restar que reste los numeros y devuelva el resultado
//metodo multiplicar(): primero validar que no se  haga una multiplicacion por cero
//si fuera cero el metodo devolvera cero y se informara un error al usuario 
//si no hacer la multiplicacion y devolver el resultado
//metodo dividir(): primero validar que no se  haga una division por cero
//si fuera cero el metodo devolvera cero y se informara un error al usuario 
//si no hacer la division y devolver el resultado



public class Operacion {
    
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        this.numero1 = scanner.nextInt();
        
        System.out.println("ingrese el segundo numero");
        this.numero2 = scanner.nextInt();
}
    
    public int sumar(){
        return numero1 + numero2;
    }

    public int restar(){
        return numero1 - numero2;
    }
    
    public int multiplicar(){
        if (numero1 == 0 || numero2 == 0){
            System.out.println("error al multiplicar por cero");
            return 0;
        }else {
            return numero1 * numero2;
        }
    }
    
    public int division(){
        if( numero2 ==0){
            System.out.println("error al dividir por cero");
            return 0;
        }else{
            return numero1 / numero2;
        }
    }
    
    
}
