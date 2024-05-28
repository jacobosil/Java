
package javaapplication12;

import java.util.Scanner;


public class JavaApplication12 {

   
    public static void main(String[] args) {
        //preguntar la edad de la persona y si tiene menos de 10 años
        //o mas de 60 años entra gratis y si no, paga y pase.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        
        if(edad < 10 || edad > 60) {
            System.out.println("pasa gratis");
        } else {
            System.out.println("paga y pase");
        } 
        
    }
    
}
