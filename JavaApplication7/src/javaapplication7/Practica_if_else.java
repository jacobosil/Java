
package javaapplication7;

import java.util.Scanner;


public class Practica_if_else {

    
    public static void main(String[] args) {
        
        //ingrese la nota del alumno y si es mayor a 6 aprueba y si no desaprueba la materia
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese la nota");
        int nota1 = scanner.nextInt();
        
        if(nota1 >= 6) {
            System.out.println("aprueba la materia");
        
        } else {
            System.out.println("no aprueba la materia");
        }
        
    }
    
}
