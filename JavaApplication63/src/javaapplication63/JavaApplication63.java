
package javaapplication63;

import javaapplication63.entidades.juego;


public class JavaApplication63 {

    
    public static void main(String[] args) {
        //crear una clase Juego que tenga un metodo iniciar juego que permita a dos jugadores
        //jugar un juego de adivinanza de numeros. El primer jugador elige un numero
        //el segundo jugador intenta adivinarlo. El segundo jugador tiene un numero limitado
        //de intentos y recibe una pista que diga mas alto o mas bajo despues de cada intento
        //el juego termina cuando el segundo jugador adivina el numero o se queda sin intentos
        //registra el numero de intentos necesarion para adivinar el numero y el numero de veces
        //que cada jugador ha ganado
        
        juego adivinados = new juego();
        adivinados.iniciarJuego();
        
        
        
    }
    
}
