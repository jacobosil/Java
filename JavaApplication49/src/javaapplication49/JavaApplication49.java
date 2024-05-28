
package javaapplication49;

import java.util.Scanner;


public class JavaApplication49 {

    
    public static void main(String[] args) {
        //crear una matriz de 3*3 y mostrar la matriz traspuesta
        //la matriz traspuesta se obtiene cambiando sus filas por las columnas
        
        
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese los valores");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println(); 
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
                
            }
            System.out.println();
        }
        
    }
    
}
