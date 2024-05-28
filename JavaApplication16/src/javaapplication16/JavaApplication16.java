
package javaapplication16;

import java.util.Scanner;




public class JavaApplication16 {


    public static void main(String[] args) {
        //pedir al usuario una palabra y usar el metodo para localizar un texto
        //especifico dentro de la palabra
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("ingrese una palabra");
        String palabra = scanner.nextLine();
        
        System.out.println(palabra.indexOf("martes")+1 );
        
    }
    
}
