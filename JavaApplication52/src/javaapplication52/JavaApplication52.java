
package javaapplication52;

import java.util.Scanner;


public class JavaApplication52 {

   
    public static void main(String[] args) {
        //crear una funcion que determine si la edad ingresada por el usuario
        //es mayor a 18 años es mayor de edad y si no es menor de edad 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        
        verificar(edad);
        
        
        
    }
    
    public static void verificar(int edad){
    
    if(edad >= 18){
        System.out.println("es mayor de edad");
    }else{
        System.out.println("es menor de edad");
    }
    }
    
}
