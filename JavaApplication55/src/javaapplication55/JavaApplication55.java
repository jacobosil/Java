
package javaapplication55;


public class JavaApplication55 {

    
    public static void main(String[] args) {
        //hacer una recursion de numeros usando una funcion
        
        int resultado = recursion(3);
        
        System.out.println(resultado);
        
    }
    
    public static int recursion(int x){
        if(x > 0){
            return x + recursion(x - 1);
        } else {
            return 0;
        }
    }
    
}
