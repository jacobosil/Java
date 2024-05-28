
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
       //ingrese la edad de una persona y si es menor a 18 años entra gratis
       //si tiene entre 18 y 65 años paga su entrada y si tiene mas de 65 años
       //tiene un descuento 
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("ingrese la edad");
        int edad = scanner.nextInt();
        
        if(edad < 18) {
            System.out.println("entra gratis");
        } else if (edad >= 18 && edad <= 65) {
            System.out.println("pague y pase");
        
        } else {
            System.out.println("usted tiene un descuento pague pase");
        } 
        
        
    }
    
}
