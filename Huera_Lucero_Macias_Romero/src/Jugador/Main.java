package Jugador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el nombre del jugador que desea registrar: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el número de su camiseta: ");
        int numeroJugador = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese la posición del jugador: ");
        String posicionJugador = sc.nextLine();

        Jugador jg1 = new Jugador(nombre, numeroJugador, posicionJugador);
        System.out.print("\n¡Jugador creado con éxito!");
        Jugador original = new Jugador("Lionel Messi", 10, "Delantero");

        System.out.print("\nA continuación veremos la información de los jugadores:");
        jg1.mostrarJugador(); original.mostrarJugador();

        System.out.print("\nIngrese la nueva posición del jugador " + nombre + ": ");
        String nuevaPosicionJugador = sc.nextLine();
        jg1.actualizarPosicionJugador(nuevaPosicionJugador);

    }
}