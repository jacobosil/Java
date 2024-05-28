
package javaapplication43;

import java.util.Scanner;


public class JavaApplication43 {

    
    public static void main(String[] args) {
        //crear una array de 5 elementos, pedirle al usuario los valores
        //y mostrarlos por pantalla
        
        Scanner scanner = new Scanner(System.in);
        
        //creamos el array
        
        int[] elemento = new int[5];
        
        //rellenamos el array
        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el valor de la posicion " + i);
            elemento[i] = scanner.nextInt();
        }
        
        //mostramos es array
        
        for (int i = 0; i < 5; i++) {
            System.out.println("posicion " + i + "=" + elemento[i]); 
        }
    }
    
}
