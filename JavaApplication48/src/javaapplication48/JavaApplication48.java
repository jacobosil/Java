
package javaapplication48;

import java.util.Scanner;


public class JavaApplication48 {

   
    public static void main(String[] args) {
        //crear un array de n * n y dimensiones, rellenar el array y 
        //mostrar los resultados por pantalla
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("cual es el tamaño de array");
        int n = scanner.nextInt();
        
        int[][] matriz = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("ingrese el dato en la posicion " + i + " " + j);
            matriz[i][j] = scanner.nextInt();
                
            }
            
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    
}
