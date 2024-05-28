
package javaapplication62;

import javaapplication62.entidades.Operacion;


public class JavaApplication62 {

    
    public static void main(String[] args) {
        //crear una clase llamada operacion que tenga como atributos privados 
        //numero1 y numero2. Crear los sigueientes metodos
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
        
        Operacion calculadora = new Operacion(5, 5);
        int suma = calculadora.sumar();
         System.out.println("la suma es " + suma);
        int resta = calculadora.restar();
        System.out.println("la resta es " + resta);
        int multiplicar = calculadora.multiplicar();
        System.out.println("la multiplicacion es " + multiplicar);
        int division = calculadora.division();
        System.out.println("la division es " + division);
        
        
        Operacion calculadora2 = new Operacion();
        calculadora2.crearOperacion();
        System.out.println("la suma es " + calculadora2.sumar());
        System.out.println("la resta es " + calculadora2.restar());
        System.out.println("la multiplicacion es " + calculadora2.multiplicar());
        System.out.println("la division es " + calculadora2.division());
        
        
    
}
}
