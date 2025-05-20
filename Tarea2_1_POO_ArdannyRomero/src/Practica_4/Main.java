package Practica_4;

public class Main {
    public static void main(String[] args) {
        Libro obra_con_parametros = new Libro("Mary Shelley", "Frankenstein", 250);
        Libro obra_sin_parametros = new Libro();
        obra_con_parametros.muestra_info();
        obra_sin_parametros.muestra_info();
    }
}
