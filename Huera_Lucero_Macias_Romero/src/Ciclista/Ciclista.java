// Estudiante: Ariel Macias

package Ciclista;

import java.util.Scanner;

public class Ciclista {

    // Crear un Scanner
    Scanner sc = new Scanner(System.in);

    // Atributos de la clase 'Ciclista'
    String nombre;
    int edad;
    double kmRecorridos;

    // Constructor (con parametros)
    public Ciclista (String nombre, int edad, double kmRecorridos) {

        this.nombre = nombre;
        this.edad = edad;
        this.kmRecorridos = kmRecorridos;

    }

    // Metodos de la clase

    public void informacionCiclista () {

        System.out.println("\n** Información del ciclista **");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Kilómetros recorridos: " + kmRecorridos + " km");

    }

    public void actualizarKilometrosRecorridos () {

        System.out.println("\n** Actualización de kilómetros **");
        System.out.print("Ingrese los kilómetros de la nueva competencia: ");
        double kmNuevos = sc.nextDouble();

        this.kmRecorridos = kmNuevos + kmRecorridos;

        System.out.println("Ahora los kilómetros recorridos del cilista " + nombre + " son: " + kmRecorridos + " km");

    }

    public void estimacionPromedioKilometros () {

        System.out.println("\n** Promedio estimado de kilómetros recorridos por mes **");
        System.out.println("Estimación del promedio de kilómetros recorridos del ciclista " + nombre + " : "+ (kmRecorridos/12.0));

    }

    public void promedioKilometros () {

        System.out.println("\n** Promedio kilómetros recorridos por mes **");

        double sumatoria = 0.0;

        for (int i = 0; i <= 11; i++) {

            System.out.print("Ingrese los kilómetros recorridos en el mes (" + (i+1) + "): ");
            double kmEntrada = sc.nextDouble();

            sumatoria += kmEntrada;

        }

        System.out.println("El promedio de kilómetros recorrios por mes del ciclista " + nombre + " es: " + (sumatoria/12.0));

    }


}
