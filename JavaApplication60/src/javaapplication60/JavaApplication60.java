
package javaapplication60;

import javaapplication60.Servicios.UsuarioService;
import javaapplication60.entidades.Biblioteca;
import javaapplication60.entidades.Libro;
import javaapplication60.entidades.Usuario;

public class JavaApplication60 {

   
    public static void main(String[] args) {
        //crear una clase llamada libro que contenga los siguientes atributos
        //ISBN, titulo, autor, numero de paginas, y un constructor con todos los
        //atributos pasados por parametros y un construcctor vacio. Crear un 
        //metodo para cargar un libro, pidiendo los datos al usuario, y luego
        //informar mediante otro metodo el numero de ISBN, el titulo, el autor
        //del libro y el numero de paginas
        
        Libro lectura = new Libro(12345, "harry potter", "jkr", 1000);
        
        lectura.informarDetalles();
        
        Libro lectura2 = new Libro();
        
        lectura2.cargarLibro();
        
        lectura2.informarDetalles();
        
        
        
        Usuario usuario1 = new Usuario("Ramon", "Malote");
        
        Usuario usuario2 = new Usuario();
        
        usuario2.cargarUsuario();
        
        UsuarioService user = new UsuarioService();
        
        Biblioteca biblioteca = new Biblioteca();
        
        
        biblioteca.agregarLibro(lectura);
        biblioteca.agregarLibro(lectura2);
        
        
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        
        System.out.println("Libros en la biblioteca");
        biblioteca.mostrarLibro();
        
        System.out.println("usuarios registrados");
        biblioteca.mostrarUsuario(user);
        
        //hacer que la biblioteca preste un libro y luego mostrar la informqacion del usuario
        //despues del prestamo. Hcer que la biblioteca reciba el libro, luego mostrar
        //la informacion del usuario luego de devolver el libro
        
        biblioteca.prestarLibro(lectura, usuario2, user);
        biblioteca.prestarLibro(lectura, usuario1, user);
        
        System.out.println("mostrar informacion despues de prestar libro");
        user.mostrarInformacion(usuario1);
        user.mostrarInformacion(usuario2);
        
        System.out.println("devolver un libro");
        biblioteca.recibirLibro(lectura, usuario1, user);
        biblioteca.recibirLibro(lectura, usuario2, user);
        
        System.out.println("mostrar informacion");
        user.mostrarInformacion(usuario1);
        user.mostrarInformacion(usuario2);
        
        
        
        
        
    }
    
    
    
}
