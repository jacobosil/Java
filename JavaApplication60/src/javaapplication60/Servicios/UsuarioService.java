

package javaapplication60.Servicios;

import java.util.ArrayList;
import javaapplication60.entidades.Libro;
import javaapplication60.entidades.Usuario;


public class UsuarioService {
    //informacion , metodo tomar prestado, metodo devolver libro
    
    
    public void mostrarInformacion(Usuario usuario){
        System.out.println("nombre " + usuario.getNombre());
        System.out.println("id " + usuario.getId());
        System.out.println("Libros Prestados " );
        
        for(Libro libro : usuario.getLibrosPrestados()){
            libro.informarDetalles();
        }
        
    }
    
    public boolean tomarPrestado(Libro libro, Usuario usuario){
       ArrayList <Libro> librosPrestados = usuario.getLibrosPrestados();
        
        if(libro.isDisponible()){
            librosPrestados.add(libro);
            libro.setDisponible(false);
            System.out.println("el libro se presto correctamente");
            return true;
        }
        System.out.println("no se pudo prestar el libro");
        return false;
    }
    
    public boolean devolverLibro(Libro libro, Usuario usuario){
        ArrayList <Libro> librosPrestados = usuario.getLibrosPrestados();
        if(librosPrestados.contains(libro)){
            librosPrestados.remove(libro);
            libro.setDisponible(true);
            System.out.println("el libro se devolvio correctamente");
            return true;
        }
        System.out.println("no se pudo devolver el libro");
                return false;
    }
    
}
