
package javaapplication25;

import java.util.Scanner;


public class JavaApplication25 {


    public static void main(String[] args) {
        //pedirle a la persona que ingrese una letra de la A a la E y mostrarle 
        //su nota siendo A=100,E=50
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese la nota en caracter de A a E");
        String letra = scanner.next();
        
        letra = letra.toUpperCase();
        
        switch(letra) {
            case "A": System.out.println("nota: 100");
            break;
            case "B": System.out.println("nota: 90");
            break;
            case "C": System.out.println("nota: 80");
            break;
            case "D": System.out.println("nota: 70");
            break;
            case "E": System.out.println("nota: 60");
            break;
            default: System.out.println("letra invalida");
            
        
        }
        
        
        
    }
    
}
