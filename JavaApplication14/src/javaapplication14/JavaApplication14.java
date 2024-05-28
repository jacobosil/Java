
package javaapplication14;

import java.util.Scanner;


public class JavaApplication14 {

    public static void main(String[] args) {
       //pedirle al usuario una palabra y usar el metodo length para calcular la 
       //longitud del texto
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("ingrese una palabra");
        String palabra = scanner.nextLine();
        
        System.out.println("la longitud de la palabra es " + palabra.length());
       
       
    }
    
}
