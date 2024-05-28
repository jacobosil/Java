
package javaapplication20;

import java.util.Scanner;


public class JavaApplication20 {


    public static void main(String[] args) {
      //pedirle al usuario un numero y usar el metodo Round para redondear 
    //ese numero decimal
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        double numero = scanner.nextDouble();
        
        int numero2 = (int)(Math.round(numero)); 
        
        System.out.println(numero2);
      
    }
    
}
