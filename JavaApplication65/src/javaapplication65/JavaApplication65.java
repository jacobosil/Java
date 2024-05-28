
package javaapplication65;

import javaapplication65.entidades.Empleado;


public class JavaApplication65 {

    
    public static void main(String[] args) {
        //crear una clase llamada empleado que tenga atributos como:
        //nombre, edad y salario. Luego crear el metodo calcular aumento
        //que calcule el aumento salarial de un empleado en funcion de su
        //edad y salario actual. El aumento salarial sera del 10% si el 
        //empleado tiene mas de 30 años o del 5% si tiene menos de 30 años
        
        
        Empleado obrero = new Empleado("Jose", 55, 2000.25);
        System.out.println("el nombre es " + obrero.getNombre());
        System.out.println("su edad es " + obrero.getEdad());
        System.out.println("su salario neto " + obrero.getSalario());
        
        obrero.calcularAumento();
        System.out.println("su salario con aumento es " + obrero.getSalario());
        
        
        
        Empleado obrero2 = new Empleado();
        obrero2.cargarEmpleado();
        System.out.println(obrero2.getNombre());
        System.out.println(obrero2.getEdad());
        System.out.println(obrero2.getSalario());
        
        obrero2.calcularAumento();
        System.out.println("el salario con aumento es " + obrero2.getSalario());
        
        if (obrero.salarioMayorQue(obrero2)){
            System.out.println(obrero.getNombre() + " tiene un salario mayor que " + obrero2.getNombre());
            
        }else {
            System.out.println(obrero2.getNombre() + " tiene un salario mayor que " + obrero.getNombre());
        }
        
        
        
        
    }
    
}
