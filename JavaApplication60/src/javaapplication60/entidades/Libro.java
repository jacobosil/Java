
package javaapplication60.entidades;

       
import java.util.Scanner;

        //crear una clase llamada libro que contenga los siguientes atributos
        //ISBN, titulo, autor, numero de paginas, y un constructor con todos los
        //atributos pasados por parametros y un construcctor vacio. Crear un 
        //metodo para cargar un libro, pidiendo los datos al usuario, y luego
        //informar mediante otro metodo el numero de ISBN, el titulo, el autor
        //del libro y el numero de paginas

        

public class Libro {
        
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPagina;
    private boolean disponible;
    
    
    public  Libro(){
      this.disponible = true;
      
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPagina){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
        this.disponible = true;
    }
    
    public void cargarLibro(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese el ISBN");
        this.ISBN = scanner.nextInt();
        
        scanner.nextLine();
        //utilizamos el next.Line() para consumir el caracter de nueva linea restante
        //que se origino por el nextInt(), next()
        
        System.out.println("ingrese el titulo");
        this.titulo = scanner.nextLine();
        
        System.out.println("ingrese el autor");
        this.autor = scanner.nextLine();
        
        System.out.println("ingrese el numero de paginas");
        this.numeroPagina = scanner.nextInt();
        
        
        
        
    }
    
    public void informarDetalles(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("numero de paginas: " + numeroPagina);
        System.out.println("estado: " + (disponible ? "disponible " : "prestado"));
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }
    
    
}
