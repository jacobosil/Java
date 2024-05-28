
package javaapplication5;

import java.util.Scanner;


public class JavaApplication5 {

    
    public static void main(String[] args) {
       //escribe un programa y pidele al usuario que ingrese un nombre y un apellido
       //mostrar ambos en una sola linea de codigo
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("ingrese el nombre");
        String nombre = scanner.next();
        
        System.out.println("ingrese el apellido");
        String apellido = scanner.next();
        
        System.out.println(nombre + " " + apellido);
        
        String nombre_completo = nombre + apellido;
        
        System.out.println(nombre_completo);
       
    }
    
}
