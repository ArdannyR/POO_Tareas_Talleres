package Practica_5;

import Practica_5.Ejercicio_1.Nivel_2.Curso_certificado;
import Practica_5.Ejercicio_1.Nivel_2.Curso_regular;
import Practica_5.Ejercicio_2.Nivel_2.Empleado_fijo;
import Practica_5.Ejercicio_2.Nivel_2.Empleado_por_comision;
import Practica_5.Ejercicio_3.Nivel_2.Patineta;
import Practica_5.Ejercicio_3.Nivel_2.Taxi;

public class Main {
    public static void main(String[] args){

        //Instancias
        // Nota: voy a empezar a poner las mismas variables del documento para comprobar su funcionamiento
        Curso_regular curso1 = new Curso_regular("Java Básico", 100);
        Curso_certificado curso2 = new Curso_certificado("Java Avanzado", 150, 50);
        Empleado_fijo emp1 = new Empleado_fijo("Luis", 500);
        Empleado_por_comision emp2 = new Empleado_por_comision("María", 1000, 0.10);
        Taxi taxi = new Taxi();
        Patineta patineta = new Patineta();

        // Ejercicio 1
        System.out.print("\n\n * * * * Ejercicio 1 * * * * ");
        System.out.printf("\nCosto base del Curso Regular: %.2f", curso1.calcular_costo());
        System.out.printf("\nCosto base del Curso Certificado: %.2f", curso2.calcular_costo());
        curso1.mostrar_info(curso1.nombre); System.out.printf("\nDescuento Curso Regular: $%.2f", curso1.calcular_descuento());
        curso2.mostrar_info(curso2.nombre, curso2.calcular_costo()); System.out.printf("\nDescuento Curso Certificado: $%.2f", curso2.calcular_descuento());

        // Ejercicio 2
        System.out.print("\n\n * * * * Ejercicio 2 * * * * ");
        emp1.mostrar_datos();
        emp2.mostrar_datos();
        emp1.aplicar_bono();
        emp2.aplicar_bono();
        emp1.mostrar_datos();
        emp2.mostrar_datos();

        // Ejercicio 3
        System.out.print("\n\n * * * * Ejercicio 3 * * * * ");
        taxi.registrarRuta("Av. Quito", "08:00"); taxi.iniciarViaje();
        patineta.registrarRuta("Parque Central"); patineta.iniciarViaje();
        System.out.printf("\nDistancia recorrida por Taxi: %.2f km", taxi.calcularDistancia());
        System.out.printf("\nDistancia recorrida por Patineta: %.2f km", patineta.calcularDistancia());

    }
}
