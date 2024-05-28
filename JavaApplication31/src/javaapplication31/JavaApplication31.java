
package javaapplication31;

import java.util.Scanner;


public class JavaApplication31 {

    
    public static void main(String[] args) {
        //solicitar al usuario un codigo de usuario y una contraseña, el programa
        //no debe permitir continuar hasta que se introduzca como codigo 1024 y como
        //contraseña 4567 al ingresar los datos correctos mostrar un mensaje por pantalla
        
        Scanner scanner = new Scanner(System.in);
        
        int codigo;
        int contraseña;
        
        do{
            System.out.println("ingrese el codigo de usuario");
             codigo = scanner.nextInt();
            
            System.out.println("ingrese su contraseña");
             contraseña = scanner.nextInt();
            
            
        }while(codigo != 1024 && contraseña != 4567);
        System.out.println("datos correctos");
    }
    
}
