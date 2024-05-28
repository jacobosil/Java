
package javaapplication24;

import java.util.Scanner;


public class JavaApplication24 {

   
    public static void main(String[] args) {
        //condicional Switch (segun de pseint)
        //pedirle a la persona que ingrese un numero del uno al 7
        //usar ese numero para decirle el dia de la semana correspondiente
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese un numero del 1 al 7");
        int numero = scanner.nextInt();
        
        switch(numero){
            case 1: System.out.println("dia Lunes");
            break;
            case 2: System.out.println("dia Martes");
            break;
            case 3: System.out.println("dia miercoles");
            break;
            case 4: System.out.println("dia jueves");
            break;
            case 5: System.out.println("dia viernes");
            break;
            case 6: System.out.println("dia sabado");
            break;
            case 7: System.out.println("dia domingo");
            break;
            default: System.out.println("numero invalido");
        
        }
        
    }
    
}
