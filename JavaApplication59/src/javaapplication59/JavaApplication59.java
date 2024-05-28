
package javaapplication59;

import java.util.Scanner;
import javaapplication59.entidades.Mascota;
import javaapplication59.entidades.Usuario;


public class JavaApplication59 {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
//        Usuario persona = new Usuario();
//        
//        System.out.println("ingrese en nombre");
//        persona.nombre = scanner.next();
//        
//        System.out.println("ingrese el apellido");
//        persona.apellido = scanner.next();
//        
//        System.out.println(persona.nombre + " " + persona.apellido);
        
        
        Mascota p1 = new Mascota();
        
        Mascota p3 = new Mascota("carlos", "bucky", "gato");
        
        System.out.println("el nombre es " + p3.getNombre());
        System.out.println("el apodo es " + p3.getApodo());
        System.out.println("el tipo es " + p3.getTipo());
        
        
        p3.setNombre("luis");
        p3.setApodo("koki");
        p3.setTipo("caballo");
        p3.setCola(false);
        p3.setRaza("agipcia");
        p3.setEdad(15);
        p3.setColor("marron");
        
        System.out.println("el color es " + p3.getColor());
        System.out.println("su edad es " + p3.getEdad() );
        
        if(p3.isCola()){
            System.out.println("la mascota si tiene cola");
        }else {
            System.out.println("la mascota no tiene cola");
        }
//        System.out.println("la mascota tiene cola " + p3.isCola());
        
        
        System.out.println("la nueva raza es " + p3.getRaza());
        System.out.println("el nuevo tipo es " + p3.getTipo()) ;
        System.out.println("el nuevo apodo es " + p3.getApodo());
        System.out.println("el nuevo nombre es " + p3.getNombre());
        
        System.out.println(p3.toString());
        
        p3.pasear(100);
        System.out.println(p3.toString());
        p3.pasear(50, 5);
        System.out.println(p3.toString());
        
        
//        Mascota p2 = new Mascota("raul", scanner.next(), "callejero" , false, 6, "color");
//        
//        System.out.println(p2.nombre + " " + p2.apodo + " " + p2.raza + " " + p2.edad + " " + p2.cola + " " +p2.color);
        
//        System.out.println("ingrese el apodo de su perro");
//        p1.apodo = scanner.next();
//        
//        System.out.println("ingrese la edad del perro");
//        p1.edad = scanner.nextInt();
//        
//        p1.nombre = "raul";
//        
//        p1.raza = "chiwaua";
//        
//        p1.cola = true;
//        
//        
//        System.out.println(p1.apodo + " " + p1.nombre + " " + p1.raza);
//        
//        
//        
        
    }
    
}
