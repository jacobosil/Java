
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

    public static void main(String[] args) {
        
        //System.out.println sirve para mostrar un mensaje por la terminal
        System.out.println("hello world");
        
        //tipos de variables
        String nombre = "soledad"; //String significa: cadena de texto.
        int edad = 18; //int significa entero
        boolean es_mayor = true; // boolean significa hacer verdadero o falso.
        double peso = 50.5; //double permite numeros con decimales
        char letra = 'S'; //char significa; caracteres
        
        System.out.println(nombre);
        System.out.println("Mi nombre es " + nombre + " tengo " + edad + " años de edad y mi peso es " + peso); 
     
        int altura;
        altura = 1;
        System.out.println(altura);
        System.out.println("mi altura es " + altura + " metro"); 
        
        edad = 20;
        System.out.println(edad);
        System.out.println("Mi edad es " + edad); 
        
        final String apodo = "Sol"; //no se puede cambiar el valor de una variable final
       // apodo = "Solcito "; 
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("ingrese su nombre");
        nombre = scanner.nextLine();
        
        System.out.println("su nombre es " + nombre);
    }
    
}


