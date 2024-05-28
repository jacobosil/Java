
package javaapplication35;

import java.util.Scanner;


public class JavaApplication35 {

  
    public static void main(String[] args) {
        //ingresar el numero de serie fibonacci
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el numero de serie fibonacci");
        int n = scanner.nextInt();
        
        int a = 0;
        int b = 1;
        
        System.out.println("------");
        
        for(int i = 0; i < n; i++){
             System.out.println("------");
            System.out.println(a);
           
            System.out.println(b);
            System.out.println("------");
            
            
            int aux = a + b;
            a = b;
            b = aux;
        }
                
    }
    
}
