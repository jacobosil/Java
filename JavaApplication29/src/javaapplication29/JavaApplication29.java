
package javaapplication29;

import java.util.Scanner;


public class JavaApplication29 {

   
    public static void main(String[] args) {
        //un grupo de alumnos quiere saber cuantos han aprobado y conseguir el promedio
        //de todas sus notas finales 
        
        Scanner scanner = new Scanner(System.in);
        
        int nota;
        int cantidad = 0;
        int suma = 0;
        String respuesta = "si";
        
       while(respuesta.equals("si")) {
       
           System.out.println("cual es su nota?");
           nota = scanner.nextInt();
           
           cantidad++;  //cantidad = cantidad +1
           suma += nota; //suma =  suma + nota
           
           System.out.println("desea ingresar otro alumno?");
           respuesta = scanner.next();
       }
        double promedio = (double) suma / cantidad;
        System.out.println("el promedio es " + promedio);
        
    }
    
}
