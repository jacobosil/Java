
package javaapplication66.servicio;

import javaapplication66.entidades.Cafetera;


public class CafeteraServicio {
    
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
    
    
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("la Cafetera ha sido llenada completamente");
    }
    public void servirTaza(int tamañoTaza, Cafetera cafetera){
        if(cafetera.getCantidadActual() < tamañoTaza){
            System.out.println("la taza de cafe no se ha llenado. Se ha servido " + cafetera.getCantidadActual() + " ml de cafe");
            cafetera.setCantidadActual(0);
        }else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamañoTaza);
            System.out.println("la taza se ha llenado completamente");
        }
        
       
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("la cafetera se ha vaciado completamenta");
    }
    
    public void agregarCafe(int cantidadCafe, Cafetera cafetera){
        int nuevaCantidad = cafetera.getCantidadActual() + cantidadCafe;
        if(nuevaCantidad > cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("la cafetera se ha llenado y ha sobrado " + (nuevaCantidad - cafetera.getCapacidadMaxima()) + " ml de cafe");
        }else {
            cafetera.setCantidadActual(nuevaCantidad);
            System.out.println("se ha añadido " + cantidadCafe + " ml de cafe a la cafetera. y faltan " + (cafetera.getCapacidadMaxima() - nuevaCantidad) +" ml de cafe" );
        }
    }
}
