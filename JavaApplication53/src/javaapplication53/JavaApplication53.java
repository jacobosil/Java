
package javaapplication53;

import java.util.Scanner;


public class JavaApplication53 {

    
    public static void main(String[] args) {
        //una persona debe ingresar su nombre de usuario(jorgito) y su contraseña 
        //(soy cordobes), si lo ingresa bien saldra un msj de exito si no de error
        //usar una funcion para verificar los datos
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingresar usuario");
        String nombre = scanner.next();
        
        System.out.println("ingrese la contraseña");
        String clave = scanner.next();
       
        scanner.close();
        
        verificar(nombre,clave);
        
        
    }
    
    public static void verificar(String nombre, String clave){
    
        if(nombre .equals("jorgito") && clave .equals("soycordobes") ) {
            System.out.println("ingreso correctamente");
        
        }else {
            System.out.println("datos incorrectos");
        }
    
    }
    
    
}
