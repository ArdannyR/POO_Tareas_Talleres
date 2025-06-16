package Practica_3;

import Practica_3.Ejercicio_1.Nivel_1.Animal;
import Practica_3.Ejercicio_1.Nivel_2.Gato;
import Practica_3.Ejercicio_1.Nivel_2.Perro;
import Practica_3.Ejercicio_2.Nivel_1.Vehiculo;
import Practica_3.Ejercicio_2.Nivel_2.Carro;
import Practica_3.Ejercicio_2.Nivel_2.Moto;
import Practica_3.Ejercicio_3.Nivel_1.Empleado;
import Practica_3.Ejercicio_3.Nivel_2.Asistente;
import Practica_3.Ejercicio_3.Nivel_2.Gerente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancias de ayuda
        Scanner sc = new Scanner(System.in);
        // ñ

        // Instancias
        Animal[] animales = {new Perro(),new Gato()};
        Vehiculo[] vehiculos = {new Carro(), new Moto()};
        Empleado[] empleados = {new Gerente(), new Asistente()}; // No estoy usando de todo esto pero mas luego ere como

        // Ejercicio 1
        System.out.print("\n\n * * * * Ejercicio 1 * * * * ");
        System.out.print("\nEl perro hace: "); new Perro().hacer_sonido(); // No sabia que se podria llamar asi los metdods
        System.out.print("\nEl gato hace: "); new Gato().hacer_sonido();

        // Ejercicio 2
        System.out.print("\n\n * * * * Ejercicio 2 * * * * ");
        System.out.print("\nEl carro: "); new Carro().arrancar();
        System.out.print("\nLa moto: "); new Moto().arrancar();

        // Ejercicio 3
        System.out.print("\n\n * * * * Ejercicio 3 * * * * ");
        System.out.print("\nSoy "); new Gerente().mostrar_info();
        System.out.print("\nSoy "); new Asistente().mostrar_info();


    }
}
