
package javaapplication50;


public class JavaApplication50 {

    
    public static void main(String[] args) {
        //crear una funcion que realice la suma de dos numeros
        //llamar a esa funcion para que muestre el resultado
        //de los numeros ingresados 
        
        int numero1 = 5;
        int numero2 = 10;
        
        int resultado = sumar(numero1, numero2);
        
        System.out.println(resultado);
    }
    
    public static int sumar(int a, int b){
    
        return a + b;
    }
    
}
