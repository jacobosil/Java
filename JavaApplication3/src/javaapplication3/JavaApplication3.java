
package javaapplication3;

import java.util.Scanner;


public class JavaApplication3 {

 
    public static void main(String[] args) {
       //pedirle al usuario que ingrese las 3 notas y saque el promedio
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("ingrese la primera nota");
        int nota1 = scanner.nextInt();
        
        System.out.println("ingrese la segunda nota");
        int nota2 = scanner.nextInt();
        
        System.out.println("ingrese la tercer nota");
        int nota3 = scanner.nextInt();
        
        int promedio = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("el promedio es " + promedio);
       
    }
    
}
