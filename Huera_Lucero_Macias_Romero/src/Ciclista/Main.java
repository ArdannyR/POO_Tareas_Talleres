package Ciclista;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        // Crear un Scanner
        Scanner sc = new Scanner(System.in);

        // Creación de los 3 objetos
        System.out.println("\nCiclista N. 1");
        System.out.print("Ingrese el nombre: ");
        String nombreC1 = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edadC1 = sc.nextInt();
        System.out.print("Ingrese los kilómetros recorridos durante la temporada: ");
        double kmRecorridosC1 = sc.nextDouble();

        Ciclista c1 = new Ciclista(nombreC1, edadC1, kmRecorridosC1);

        System.out.println("\nCiclista N. 2");
        System.out.print("Ingrese el nombre: ");
        String nombreC2 = sc.nextLine(); sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edadC2 = sc.nextInt();
        System.out.print("Ingrese los kilómetros recorridos durante la temporada: ");
        double kmRecorridosC2 = sc.nextDouble();

        Ciclista c2 = new Ciclista(nombreC2, edadC2, kmRecorridosC2);

        System.out.println("\nCiclista N. 3");
        System.out.print("Ingrese el nombre: ");
        String nombreC3 = sc.nextLine(); sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edadC3 = sc.nextInt();
        System.out.print("Ingrese los kilómetros recorridos durante la temporada: ");
        double kmRecorridosC3 = sc.nextDouble();

        Ciclista c3 = new Ciclista(nombreC3, edadC3, kmRecorridosC3);

        // Llamada a los métodos
        c1.informacionCiclista();
        c1.actualizarKilometrosRecorridos();
        c1.estimacionPromedioKilometros();
        c1.promedioKilometros();

    }
}
