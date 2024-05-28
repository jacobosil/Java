
package javaapplication61.entidades;

import java.util.Scanner;

public class Circunferencia {
    
        //declarar una clase llamada circunferencia que tenga como atributo privado
        //el radio de tipo real. Se deben crear los metodos de:
        //metodo constructor que inicialice el radio pasado como parametro
        //metodo get y set para el atributo radio de la clase circunferencia
        //metodo para crearCircunferencia() que le pide el radio 
        //y los guarda en el atributo del objeto
        //metodo area() de la circunferencia(area = (pi * radio) elevado al ^2 )
        //metodo perimetro() para calcular el perimetro(perimetro = 2 * pi * radio)
    
    
    
    private double  radio;
    
    public Circunferencia(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese radio");
        this.radio = scanner.nextDouble();
    }
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
    
}
