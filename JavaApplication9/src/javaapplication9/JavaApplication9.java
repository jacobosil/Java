
package javaapplication9;

import java.util.Scanner;


public class JavaApplication9 {

    
    public static void main(String[] args) {
     
       //una persona debe ingresar a su cuenta usando su nombre de usuario
       //que es jorgito y su contraseña es soy cordobes, si lo ingresa bien
       //saldra un mensaje de exito sino de error.
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("ingrese su nombre de usuario");
        String nombre = scanner.next();
        
        System.out.println("ingrese la contraseña");
        String contraseña = scanner.next();
        
        if(nombre.equals("jorgito") && contraseña.equals("soycordobes")) {
            System.out.println("puede ingresar");
    
    } else {
            System.out.println("usuario y contraseña incorrecto");
        }

    }
    
}
