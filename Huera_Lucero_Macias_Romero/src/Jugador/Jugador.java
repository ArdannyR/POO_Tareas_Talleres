package Jugador;

public class Jugador {

    String nombre;
    int numeroJugador;
    String posicionJugador;

    public Jugador(String nombre, int numeroJugador, String posicionJugador) {

        this.nombre = nombre;
        this.numeroJugador = numeroJugador;
        this.posicionJugador = posicionJugador;

    }

    public void mostrarJugador() {

        System.out.print("\n------------------------------" +
                         "\nNombre: " + nombre +
                         "\nCamiseta: " + numeroJugador +
                         "\nPosición: " + posicionJugador + "\n");

    }

    public void actualizarPosicionJugador(String nuevaPosicion) {

        System.out.print("\n¡Cambio realizado con éxito!" +
                         "\n------------------------------" +
                         "\nNombre: " + nombre +
                         "\nCamiseta: " + numeroJugador +
                         "\nPosición: " + nuevaPosicion + "\n");

    }

}
