
package javaapplication4;

import java.util.Scanner;


public class JavaApplication4 {

    
    public static void main(String[] args) {
     
        //pedirle dos numeros al usuario y realizar las cuatro operaciones matematicas
        //suma,resta,multiplicacion y division
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el primer numero");
        int numero1 = scanner.nextInt();
        
        System.out.println("ingrese el segundo numero");
        int numero2 = scanner.nextInt();
        
      int suma = numero1 + numero2;
      int resta = numero1 - numero2;
      int multiplicacion = numero1 * numero2;
      int division = numero1 / numero2;
      
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multiplicacion es " + multiplicacion);
        System.out.println("la division es " + division);
        
        System.out.println("la suma es " + (numero1 + numero2));
              
        
        
        
    }
    
}
