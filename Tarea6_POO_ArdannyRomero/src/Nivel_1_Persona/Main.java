package Nivel_1_Persona;

import Nivel_2.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion_identificacon;
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("Saludos usuario! Identificate");
        System.out.println("1. Cliente \n2. Empleado \n3. Salir\n");
        System.out.print("Elige una opción: "); opcion_identificacon = sc.nextInt(); sc.nextLine();

            if (opcion_identificacon == 1){
                System.out.print("Nesecitamos que ingrese sus datos... pls\n");
                System.out.print("-- Nombre: "); String nombre = sc.nextLine();
                System.out.print("-- Cedula: "); String cedula = sc.nextLine();
                System.out.print("-- Direccion: "); String direccion = sc.nextLine();
                System.out.print("-- Telefono: "); String telefono = sc.nextLine();
                Cliente cliente_de_prueba = new Cliente(nombre, cedula, direccion, telefono); // Deberia poner una lista de clientes?

                int opcion;
                do {
                    System.out.println("\n* * * * Sistema Bancario * * * *");
                    System.out.println("1. Ingresar al Sistema \n2. Registrar Nueva Cuenta \n3. Agregar Tarjeta de Crédito a Cuenta \n4. Solicitar Préstamo \n5. Mostrar Rol del Cliente \n0. Salir");
                    System.out.print("Opcion: "); opcion = sc.nextInt(); sc.nextLine();
                    switch (opcion) {
                        case 1:
                            cliente_de_prueba.ingresar_al_sistema();
                            break;
                        case 2:
                            System.out.print("Ingrese el tipo de cuenta (ej. Ahorros, Corriente): "); String tipo_cuenta = sc.nextLine();
                            cliente_de_prueba.registrar_cuenta(tipo_cuenta);
                            break;
                        case 3:
                            System.out.print("Ingrese el número de tarjeta de crédito a agregar: "); String num_tarjeta_credito = sc.nextLine();
                            cliente_de_prueba.agregar_tarjeta_credito(num_tarjeta_credito);
                            break;
                        case 4:
                            System.out.print("Monto del préstamo a solicitar: "); double monto = sc.nextDouble(); sc.nextLine();
                            cliente_de_prueba.solicitar_prestamo(monto);
                            break;
                        case 5:
                            cliente_de_prueba.mostrar_rol();
                            break;
                        case 0:
                            System.out.println("Saliendo del programa. ¡Bye!\n");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                    }
                } while (opcion != 0);
            }
        } while (opcion_identificacon != 3);

        sc.close(); // Cierra el scanner cuando ya no se necesite

    }
}