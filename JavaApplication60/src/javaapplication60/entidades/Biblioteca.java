
package javaapplication60.entidades;

import java.util.ArrayList;
import javaapplication60.Servicios.UsuarioService;


public class Biblioteca {
    
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;

    public Biblioteca() {
       
        this.libros = new ArrayList <>();
        this.usuarios = new ArrayList <>();
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }    
    
    public void eliminarLibro(Libro libro){
        libros.remove(libro);
    }
    
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void eliminarUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }
    
    public boolean prestarLibro(Libro libro, Usuario usuario, UsuarioService usuarioService){
        if(libros.contains(libro) && usuarios.contains(usuario)){
            return usuarioService.tomarPrestado(libro, usuario);
        }
        return false;
    }
    
    public boolean recibirLibro(Libro libro, Usuario usuario, UsuarioService usuarioService){
        if(libros.contains(libro) && usuarios.contains(usuario)){
            return usuarioService.devolverLibro(libro, usuario);
        }
        return false;
    }
    public void mostrarLibro(){
        for (Libro libro : libros){
            libro.informarDetalles();
        }
    }
    public void mostrarUsuario(UsuarioService usuarioService){
        for(Usuario usuario : usuarios){
            usuarioService.mostrarInformacion(usuario);
        }
    }
}
