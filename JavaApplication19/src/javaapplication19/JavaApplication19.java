
package javaapplication19;

import java.util.Scanner;


public class JavaApplication19 {

 
    public static void main(String[] args) {
        //pedirle al usuario dos numeros y guardarlos en variables distintas
        //usar metodos de Math para saber el valor maximo, el valor minimo,el valor absoluto
        //la raiz cuadrada y el numero redondeado
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el primer numero");
        int numero1 = scanner.nextInt();
        
        System.out.println("ingrese el segundo numero");
        int numero2 = scanner.nextInt();
        
        System.out.println("numero mayor " + Math.max(numero1, numero2));
        
        System.out.println("numero menor " + Math.min(numero1, numero2));
        
        System.out.println("valor absoluto1 " + Math.abs(numero1));
        
        System.out.println("valor absoluto2 " + Math.abs(numero2));
        
        
    }
    
}
