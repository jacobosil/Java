
package javaapplication17;

import java.util.Scanner;


public class JavaApplication17 {


    public static void main(String[] args) {
        //perdirle a la persona que ingrese su nombre y su apellido, guardarlo
        //en dos variables distintas y luego concatenarlos usando su metodo de String
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el nombre");
        String nombre = scanner.next();
        
        System.out.println("ingrese el apellido");
        String apellido = scanner.next();
        
        System.out.println(nombre.concat(" ").concat(apellido));
        
        
        
        
    }
    
}
