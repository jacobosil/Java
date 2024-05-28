
package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    
    public static void main(String[] args) {
   
        //un colegio desea saber que porcentaje de niños y niñas hay en el curso
        //se debe solicitar al usuario que ingrese la cantidad total de niños y niñas
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el total de niños");
        int niños = scanner.nextInt();
        
        System.out.println("ingrese el total de niñas");
        int niñas = scanner.nextInt();
        
        double porcentaje_niños = (niños * 100) / (niños + niñas);
        double porcentaje_niñas = (niñas * 100) / (niñas + niños);
        
        System.out.println("el porcentaje de niños es " + porcentaje_niños);
        System.out.println("el porcentaje de niñas es " + porcentaje_niñas);
        
        
                
        
    }
    
}
