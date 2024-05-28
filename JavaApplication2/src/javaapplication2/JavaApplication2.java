
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

    public static void main(String[] args) {
        /*pedir al usuario que ingrese su nombre, su edad,su peso 
        y mostrar por pantalla los resultados*/
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        String nombre = scanner.next();
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("ingrese su peso");
        double peso = scanner.nextDouble();
        
        
        System.out.println("su nombre es " + nombre);
        System.out.println("su edad es " + edad);
        System.out.println("su peso es " + peso);
        
        
    }
    
}
