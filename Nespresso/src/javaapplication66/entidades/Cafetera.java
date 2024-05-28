
package javaapplication66.entidades;



public class Cafetera {
    
     //Programa Nespresso. desarrolle una clase Cafetera en el paquete
        //entidades con los atributos capacidadMaxima,
        //(cantidad maxima de cafe que puede contener la cafetera) y cantidadActual
        //(la cantidad actual de cafe que hay en la cafetera). Agregar un constructor vacio 
        //y otro constructor con parametros, tambien los setters y getters. 
        //Crear la clase CafeteraServicio en el paquete servicio con los sigientes
        //metodos: 
        //A- metodo llenarCafetera(): hace que la cantidad actual sea igual a la capacidad maxima
        //B- metodo servirTaza(int): se pide el tamaño de una taza vacia, el metodo recibe el 
               //tamaño de la taza y simula la accion de servir la taza con la capacidad indicada
               // si la cantidad actual de cafe no alcanza para llenar la taza, se sirve 
               //lo que queda. El metodo le informara al usuario si se lleno  o no la taza,
               //y de no haberse llenado en cuanto quedo la taza
        //C- metodo vaciarCafetera(): pone la cantidad de cafe actual en cero
        //D- metodo agregarCafe(int): se le pide al usuario una cantidad de cafe,
             //el metodo lo recibe y se añade a la cafetera la cantidad de cafe indicada
    
    
    
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    
    
}
