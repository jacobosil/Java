
package javaapplication13;

import java.util.Scanner;


public class JavaApplication13 {

   
    public static void main(String[] args) {
   //pedirle a la persona que ingrese un numero y si el numero es positivo
   //se le agrega 5 de valor y si es negativo se le resta 5 de valor
   
   Scanner scanner = new Scanner(System.in);
   
        System.out.println("ingrese un numero");
        int numero = scanner.nextInt();
        
        if(numero > 0) {
            numero -= 5; //numero = numero + 5
            System.out.println("el numero es " + numero);
        } else {
            numero += 5;
            System.out.println("el numero es" + numero);
        }
    }
    
}
