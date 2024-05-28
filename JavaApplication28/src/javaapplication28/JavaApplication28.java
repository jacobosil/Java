
package javaapplication28;

import java.util.Scanner;


public class JavaApplication28 {

 
    public static void main(String[] args) {
        //contar una persona cada vez que ingrese a un establecimieto usando un
        //bucle while. para finalizar debera preguntarle a la persona si hay 
        //mas personas para ingresar, mostrar la cantidad de personas.
        
        
        Scanner scanner = new Scanner(System.in);
        
        int cantidad = 0;
        String respuesta = "si";
        
        while(respuesta.equals("si")) {
         
           
            System.out.println("va a ingresar otra persona?");
            respuesta = scanner.next();
        
             if(respuesta.equals("si")) {
                 cantidad++;
            }
            
        }
        System.out.println("la cantidad de personas es " + cantidad);
        
    }
    
}
