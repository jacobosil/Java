
package javaapplication23;

import java.util.Scanner;


public class JavaApplication23 {

 
    public static void main(String[] args) {
        //pedirle a la persona su edad y si es mayor o igual a 18 años decirle 
        //ve a trabajar y si no decirle ve a estudiar
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        
        if(edad >= 18){ 
            System.out.println("ve a trabajar");
        
        } else {
        
            System.out.println("ve a estudiar");
        }
    }
    
}
