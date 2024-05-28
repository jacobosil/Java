
package javaapplication34;

import java.util.Scanner;


public class JavaApplication34 {

  
    public static void main(String[] args) {
        //pedirle a tus alumnos que ingresen su nota y sacarel promedio de todos
        
        Scanner scanner = new Scanner(System.in);
        
        int suma = 0;
        int cantidad = 0;
        String respuesta = "si";
        
//        while(respuesta.equals("si")) {
//            System.out.println("ingrese la nota del alumno");
//            int nota = scanner.nextInt();
//            
//            suma += nota;
//            cantidad++;
//            
//            System.out.println("desea agregar otro alumno?");
//            respuesta = scanner.next();
//        }
//        
//        System.out.println("el promedio es " + (suma / cantidad));
        
//        do{
//             System.out.println("ingrese la nota del alumno");
//            int nota = scanner.nextInt();
//            
//            suma += nota;
//            cantidad++;
//            
//            System.out.println("desea agregar otro alumno?");
//            respuesta = scanner.next();
//            
//            
//        }while(respuesta.equals("si"));
//        
//        System.out.println("el promedio es " + (suma / cantidad));
        
            
               System.out.println("bienvenidos");
               System.out.println("curso 1");

            System.out.println("ingrese la cantidad de alumnos");
            int alumnos = scanner.nextInt();
            
        for(int i = 1; i <= alumnos; i++){
             System.out.println("ingrese la nota del alumno");
            int nota = scanner.nextInt();
            
            suma += nota;
            cantidad++;
     
        }
        System.out.println("el promedio es " + (suma / cantidad));
        
        
    }
    
}
