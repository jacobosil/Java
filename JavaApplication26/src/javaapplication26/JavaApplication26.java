
package javaapplication26;

import java.util.Scanner;


public class JavaApplication26 {

  
    public static void main(String[] args) {
        //operador ternario
        //pedirle a la persona que ingrese su edad y usando un operador ternario 
        //si tiene mas o igual a 18 años es mayor de edad y sino es menor de edad
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        
        String resultado = (edad >= 18) ? "es mayor de edad" : "es menor de edad";
        
        System.out.println(resultado);
                

        }
            
        
    }
    

