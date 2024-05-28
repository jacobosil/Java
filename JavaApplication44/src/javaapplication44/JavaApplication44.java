
package javaapplication44;

import java.util.Scanner;


public class JavaApplication44 {

    
    public static void main(String[] args) {
        //crear un array del tamaño que pida el usuario, rellenar el array
        //con numeros enteros y mostrar el array usando un for each
        
        Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese el tamaño del array");
            int valor = scanner.nextInt();
            
            int[] numeros = new int[valor];
            
            for (int i = 0; i < valor; i++) {
                System.out.println("ingrese numeros enteros " + i);
                numeros[i] = scanner.nextInt();
        }
            for(int i : numeros){
                System.out.println("valor " + i);
            }
            
            
    }
    
}
