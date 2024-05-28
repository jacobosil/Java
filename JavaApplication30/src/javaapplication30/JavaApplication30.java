
package javaapplication30;

import java.util.Scanner;


public class JavaApplication30 {

 
    public static void main(String[] args) {
        //escribir un programa que calcule la suma de los N primeros numeros naturales
        //el valor de N se pedira por teclado
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de numeros naturales");
        int n = scanner.nextInt();
        
        int suma = 0;
        int i = 0;
        
        while(i < n){
            System.out.println("ingrese un numero");
            int numero = scanner.nextInt();
            suma += numero;
            i++;
            
        } 
        System.out.println("la suma es " + suma);
        
        
        
    }
    
}
