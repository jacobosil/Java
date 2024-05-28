
package javaapplication61;

import javaapplication61.entidades.Circunferencia;


public class JavaApplication61 {

   
    public static void main(String[] args) {
        //declarar una clase llamada circunferencia que tenga como atributo privado
        //el radio de tipo real. Se deben crear los metodos de:
        //metodo constructor que inicialice el radio pasado como parametro
        //metodo get y set para el atributo radio de la clase circunferencia
        //metodo para crearCircunferencia() que le pide el radio 
        //y los guarda en el atributo del objeto
        //metodo area() de la circunferencia(area = (pi * radio) elevado al ^2 )
        //metodo perimetro() para calcular el perimetro(perimetro = 2 * pi * radio)
   
        
        Circunferencia circulo = new Circunferencia(5);
        double area = circulo.area();
        double perimetro = circulo.perimetro();
        
        System.out.println("el area es " + area);
        System.out.println("el perimetro es " + perimetro);
        
        
        circulo.crearCircunferencia();
        System.out.println("el area es " + circulo.area());
        System.out.println("el perimetro es " + circulo.perimetro());
        
    
    
    }
    
    
    
}
