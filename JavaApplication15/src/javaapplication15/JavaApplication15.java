
package javaapplication15;

import java.util.Scanner;


public class JavaApplication15 {


    public static void main(String[] args) {
        //pedirle al usuario que ingrese un palabra que tenga minusculas y mayusculas
        //usar metodos  de String que permitan que se vea todo en mayusculas o todo 
        //en minusculas
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese una palabra");
        String palabra = scanner.next();
        
        System.out.println("La palabra en mayusculas es " + palabra.toUpperCase());
        
        System.out.println("La palabra en minuscula es " + palabra.toLowerCase());
        
        String palabra_mayusculas = palabra.toUpperCase();
        
        System.out.println(palabra_mayusculas);
        
        int longitud_palabra = palabra_mayusculas.length();
        
        System.out.println("la longitud de la palabra es " + longitud_palabra);
        
        
    }
    
}
