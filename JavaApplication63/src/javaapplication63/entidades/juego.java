package javaapplication63.entidades;


import java.util.Scanner;
//crear una clase Juego que tenga un metodo iniciar juego que permita a dos jugadores
//jugar un juego de adivinanza de numeros. El primer jugador elige un numero
//el segundo jugador intenta adivinarlo. El segundo jugador tiene un numero limitado
//de intentos y recibe una pista que diga mas alto o mas bajo despues de cada intento
//el juego termina cuando el segundo jugador adivina el numero o se queda sin intentos
//registra el numero de intentos necesarion para adivinar el numero y el numero de veces
//que cada jugador ha ganado


public class juego {

    private int jugador1;
    private int jugador2;

    public juego() {
        jugador1 = 0;
        jugador2 = 0;
    }
    
    public void iniciarJuego(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("comienza el juego");
            System.out.println("jugador 1 elige un numero entre 1 y 10");
            int numeroAdivinar = (int) (Math.random() * 10) + 1;
            System.out.println(numeroAdivinar);
            
            int intentos = 0;
            boolean adivinado = false;
            
            while(!adivinado && intentos < 5){
                int numero = scanner.nextInt();
                intentos++;
                
                if (numero == numeroAdivinar){
                    System.out.println("numero encontrado!! el jugador adivino el numero en " + intentos + " intentos" );
                    adivinado = true;
                    jugador2++;
                }else if (numero < numeroAdivinar){
                    System.out.println("el numero es mas alto");
                }else {
                    System.out.println("el numero es mas bajo");
                }
            }
            
            if (!adivinado){
                System.out.println("el jugador dos no adivino el numero. el numero era " + numeroAdivinar);
                jugador1++;
            }
            
            System.out.println("desea seguir jugando? (si/no)");
            String respuesta = scanner.next();
            if(!respuesta.equalsIgnoreCase("si")){
                break;
            }
        }
        
        System.out.println("cantidad de juegos ganados por el jugador 1 " + jugador1 );
        System.out.println("cantidad de juegos ganados por el jugador 2 " + jugador2 );
        
    }
    
    
}
