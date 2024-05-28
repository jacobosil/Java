
package javaapplication60.entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Usuario {
    
    
   private  String nombre;
   private  String id;
   private  ArrayList <Libro> librosPrestados;

    public Usuario() {
        this.librosPrestados = new ArrayList <>();
    }
   
   
   
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList <>();
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
   
   
   public void cargarUsuario(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese su nombre");
       this.nombre = scanner.nextLine();
       
       System.out.println("ingrese su Id");
       this.id = scanner.next();
   }
}
