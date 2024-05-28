
package javaapplication11;

import java.util.Scanner;


public class JavaApplication11 {

    
    public static void main(String[] args) {
     //PEDIR AL USUARIO DOS VARIABLES DE TIPO ENTERO, EL PROGRAMA DEBE INTERCAMBIAR
     //LOS VALORES DE AMBAS VARIABLES, USANDO UNA VARIBLE AUXILIAR.
     
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("ingrese el primer numero");
        int dato1 = scanner.nextInt();
        
        System.out.println("ingrese el segundo numero");
        int dato2 = scanner.nextInt();
        
        int auxiliar = dato1;
        dato1 = dato2;
        dato2 = auxiliar;
        
        System.out.println("el dato 1 es " + dato1);
        System.out.println("el dato 2 es " + dato2);
                       
    }
    
}
