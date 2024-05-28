
package javaapplication45;

import java.util.Scanner;

public class JavaApplication45 {

    
    public static void main(String[] args) {
        //crear un array de dimension 5 y pedirle al usuario que ingrese los datos,
        //mostrar los datos y tambien mostrar la longitud del array
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        int[] datos = new int[5];
        
      for (int i = 0; i < 5; i++){
          System.out.println("ingrese el dato");
          datos[i] = scanner.nextInt();
      }  
        for (int i = 0; i < 5; i++) {
            System.out.println( "posicion" + i + "=" + datos[i]);
        }
      
        
        
    }
    
}
