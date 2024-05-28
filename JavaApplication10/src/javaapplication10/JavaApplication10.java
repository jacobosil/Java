
package javaapplication10;

import java.util.Scanner;


public class JavaApplication10 {

   
    public static void main(String[] args) {
       //escribir un programa que tome la calificacion de un examen y devuelva
       //la calificacion equivalente en letras
       //A : 90 o mas . B : 80 A 89 . C : 70 a 79 . D : 60 a 69 . E : menos de 60
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("ingrese la nota del 1 al 100");
        int nota = scanner.nextInt();
        
        if(nota >= 90) {
            System.out.println("A");
        } else if (nota >= 80) {
            System.out.println("B");
        } else if (nota >= 70) {
            System.out.println("C");
        } else if(nota >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E REPROBADO");
        }
    }
    
}
