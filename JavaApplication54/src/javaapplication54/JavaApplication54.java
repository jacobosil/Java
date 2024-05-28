
package javaapplication54;

import java.util.Scanner;

public class JavaApplication54 {

    public static void main(String[] args) {
        //pedirle al usuario dos numeros y crear 4 funciones donde cada una
        //va a sumar, resta, multiplicar y dividir y llamarlas al programa principal

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("ingrese el primer numero");
            int numero1 = scanner.nextInt();

            System.out.println("ingrese el segundo numero");
            int numero2 = scanner.nextInt();

            System.out.println("elija una opcion");
            System.out.println("1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir, 0 para salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int suma = suma(numero1, numero2);
                    System.out.println("la suma es " + suma);
                    break;

                case 2:
                    int resta = resta(numero1, numero2);
                    System.out.println("la resta es " + resta);
                    break;

                case 3:
                    int multiplicacion = multiplicacion(numero1, numero2);
                    System.out.println("la multiplicacion es " + multiplicacion);
                    break;

                case 4:
                    int division = division(numero1, numero2);
                    System.out.println("la division es " + division);
                    break;

            }
        } while (opcion != 0);
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int division(int numero1, int numero2) {
        return numero1 / numero2;
    }

}
