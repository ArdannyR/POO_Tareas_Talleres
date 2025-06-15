package Practica_2;

import Practica_2.Ejercicio_1.Caluladora;
import Practica_2.Ejercicio_2.Mensajero;
import Practica_2.Ejercicio_3.Persona;
import Practica_2.Ejercicio_4.Plato_comida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancias de ayuda
        Scanner sc = new Scanner(System.in);
        // ñ

        // Instancias
        Caluladora caluladora = new Caluladora();
        Mensajero mensajero = new Mensajero();
        Persona persona = new Persona();
        Plato_comida comida = new Plato_comida();

        // Ejercicio 1
        System.out.print("\n\n * * * * Ejercicio 1 * * * * ");
        System.out.printf("\n5 + 3 = %d \n2.5 + 3.1 = %.2f \n1 + 2 + 3 = %d", caluladora.sumar(5,3), caluladora.sumar(2.5, 3.1), caluladora.sumar(1,2,3) );

        // Ejercicio 2
        System.out.print("\n\n * * * * Ejercicio 2 * * * * ");
        mensajero.enviar("Hola mundo");
        mensajero.enviar("Saludos!", "Ardanny");
        mensajero.enviar("Has sido llamado a una reunion de trabajo", "Esau", 4);

        // Ejercicio 3
        System.out.print("\n\n * * * * Ejercicio 3 * * * * ");
        persona.mostrar("Ardanny");
        persona.mostrar("Ardanny", 20);
        persona.mostrar("Ardanny",20,"Quito");

        // Ejercicio 4
        System.out.print("\n\n * * * * Ejercicio 4 * * * * ");
        comida.muestra("Ensalada",true);
        comida.muestra("Beefsteak", false,20.99);


    }
}
