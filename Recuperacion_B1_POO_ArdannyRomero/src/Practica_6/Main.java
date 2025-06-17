package Practica_6;

import Practica_6.Ejercicio_1.Nivel_3.Gerente;
import Practica_6.Ejercicio_2.Nivel_2.Cuenta_ahorros;
import Practica_6.Ejercicio_2.Nivel_3.Cuenta_corriente;
import Practica_6.Ejercicio_3.Nivel_2.Auto;
import Practica_6.Ejercicio_3.Nivel_3.Camion;

public class Main {
    public static void main(String[] args){
        // Instancias
        Gerente gerente1 = new Gerente("Luis", 40, 900, 100);
        Gerente gerente2 = new Gerente("Ana", 30, 700, 200);
        Cuenta_ahorros ahorros = new Cuenta_ahorros("001A", 1000, 2);
        Cuenta_corriente corriente = new Cuenta_corriente("", 500, 200); // Aqui deberia reflejarse un error
        Auto auto = new Auto("Toyota", "Yaris");
        Camion camoon = new Camion(null, "Volvo FH");

        // Ejercicio 1
        System.out.print("\n\n * * * * Ejercicio 1 * * * * ");
        gerente1.mostrarInfo();// Sin bono
        gerente2.mostrarInfo();// Con bono

        // Ejercicio 2
        System.out.print("\n\n * * * * Ejercicio 2 * * * * ");
        ahorros.mostrar_datos();
        corriente.mostrar_datos();

        // Ejercicio 3
        System.out.print("\n\n * * * * Ejercicio 3 * * * * ");
        auto.mostrar_info();
        camoon.mostrar_info();

    }
}
