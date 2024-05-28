package javaapplication65.entidades;

import java.util.Scanner;

public class Empleado {
    //crear una clase llamada empleado que tenga atributos como:
    //nombre, edad y salario. Luego crear el metodo calcular aumento
    //que calcule el aumento salarial de un empleado en funcion de su
    //edad y salario actual. El aumento salarial sera del 10% si el 
    //empleado tiene mas de 30 años o del 5% si tiene menos de 30 años
    
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }
    
   

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
     public void  calcularAumento(){
         if(edad >= 30){
             salario += salario * 0.1;
         }else {
             salario += salario * 0.05;
         }
     }
     
     public void cargarEmpleado(){
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("ingrese su nombre");
         nombre = scanner.next();
         System.out.println("ingrese su edad");
         edad = scanner.nextInt();
         System.out.println("ingrese su salario");
         salario = scanner.nextDouble();
     }

     public boolean salarioMayorQue(Empleado esclavo){
         return this.salario > esclavo.getSalario();
     }
     
}
