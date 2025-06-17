package Practica_7;

import Practica_7.Nivel_3.Estudiante_Becado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Instancias de ayuda
        Scanner sc = new Scanner(System.in);

        // Instancias quemadas
        Estudiante_Becado est1 = new Estudiante_Becado("Luis", 20, "Sistemas", 9.2, "Academica");
        Estudiante_Becado est2 = new Estudiante_Becado("Ana", 19, "Derecho", 8.0, "Economica");

        // Resultados
        est1.mostrar_datos();
        System.out.printf("%s\n",est1.aplicar_descuento());
        est2.mostrar_datos();
        System.out.printf("%s\n",est2.aplicar_descuento());

        // Testeo con Instancia ingresada (Esto noe staba reflejado en la actividad pero creo que para lamenos este ejercicio necito eso para comprobar)
        System.out.print("\n\n--- Ingreso de nuevo estudiante becado ---");
        System.out.print("\nNombre: "); String nombre = sc.nextLine();
        System.out.print("Edad: "); int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Carrera: "); String carrera = sc.nextLine();
        System.out.print("Promedio: "); double promedio = Double.parseDouble(sc.nextLine());
        System.out.print("Tipo de beca (Academica, Economica, Deportiva, Cultural): "); String tipo_beca = sc.nextLine();

        Estudiante_Becado est3 = new Estudiante_Becado(nombre, edad, carrera, promedio, tipo_beca);

        // Resultados
        est3.mostrar_datos(); // Intente hacer que pase los vacios en numeros (int y double) pero para ello creo que necesito cosas mas complejas. POr el momento valida vacio en la partes String
        System.out.printf("%s\n", est3.aplicar_descuento());

    }
}