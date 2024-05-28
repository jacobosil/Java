
package javaapplication58;

import java.util.Scanner;


public class JavaApplication58 {

    
    public static void main(String[] args) {
        //crear una clase que tenga un metodo para sumar dos numeros,llamar
        //a la clase y pasarlelos datos por parametros
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el primer numeros");
        int numero1 = scanner.nextInt();
        
        
        System.out.println("ingrese el segumdo numero");
        int numero2 = scanner.nextInt();
        
        
        Metodos sum = new Metodos();
        
        int resultado = sum.suma(numero1, numero2);
        
        System.out.println(resultado);
        
    }
    
}
