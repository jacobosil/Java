
package javaapplication42;

import java.util.Scanner;


public class JavaApplication42 {

    
    public static void main(String[] args) {
        //pedirle al usuario que ingrese el tamaño del vector, luego debera
        //ingresar los elementos de ese vector y mostrar el vector generado
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el tamaño del vector");
        int n = scanner.nextInt();
        
        int[] vector = new int[n];
        
       
        System.out.println("ingrese los elementos");
        
        //ingreso de datos
        for(int i = 0; i < n; i++){
            System.out.println("elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt(); //le decimos el valor de la posicion del vector
        }
            
        System.out.println("posicion " + " 0: " + vector[0]);
        System.out.println("posicion " + " 1: " + vector[1]);
        System.out.println("posicion " + " 2: " + vector[2]);
        
        for(int i = 0; i < n; i++){
        
            System.out.println("posicion " + i + "  : " + vector[i]);
        }
        
        
    }
    
}
