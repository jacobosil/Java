package javaapplication56;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication56 {

    public static void main(String[] args) {
        //crear un array que se pase por una funcion y añada a la lista el nuevo dato
        //luego mostrar el array

        Scanner scanner = new Scanner(System.in);

        int[] array = {};
           
        int opcion;
        do{
        
        System.out.println("elija una opcion");
        System.out.println("1 para agregar un dato");
        System.out.println("2 para mostrar la lista");
        System.out.println("3 para salir");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                array = agregarDato(array);
                break;
            case 2:
                mostrarArray(array);
                break;
            case 3:
                System.out.println("saliendo del programa");
                break;

        }
        } while(opcion != 3);

//        array = agregarDato(array);
//
//        mostrarArray(array);
//
//        array = agregarDato(array);
//
//        mostrarArray(array);
    }

    public static int[] agregarDato(int[] array) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un nuevo dato");
        int dato = scanner.nextInt();

        array = Arrays.copyOf(array, array.length + 1);

        array[array.length - 1] = dato;

        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

}
