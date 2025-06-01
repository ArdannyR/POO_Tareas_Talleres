package Nivel_1_Persona;

import Nivel_2.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion_identificacon;
        Scanner sc = new Scanner(System.in);


        do{
        System.out.println("* * * * * * * Saludos usuario! * * * * * * *\nIdentificate");
        System.out.println("\t1. Cliente \n\t2. Empleado \n\t3. Salir");
        System.out.print("Elige una opción: "); opcion_identificacon = sc.nextInt(); sc.nextLine();

            if (opcion_identificacon == 1){

                Cliente cliente_null = new Cliente(null,null,null,null); // Creo un cliente null y luego le llamo a ponerle datos
                Cliente cliente = cliente_null.datos(); // Creo una variable con la clase y le asigno los datos (con esto quito los null)

                int opcion;
                do {
                    System.out.printf("\n* * * * * * * * * * * Sistema Bancario * * * * * * * * * * * \nBienvenido %s \nRecuerda Ingresar al sistema para cualquier actividad\n", cliente.nombre);
                    System.out.println("\t1. Ingresar al Sistema \n\t2. Registrar Nueva Cuenta \n\t3. Agregar Tarjeta de Crédito a Cuenta \n\t4. Solicitar Préstamo \n\t5. Mostrar Rol del Cliente \n\t6. Actualizar datos del Cliente \n\t7. Ver Resumen financiero \n\t0. Salir");
                    System.out.print("Opcion: "); opcion = sc.nextInt(); sc.nextLine();
                    switch (opcion) {
                        case 1:
                            cliente.ingresar_al_sistema();
                            break;
                        case 2:
                            System.out.print("\nIngrese el tipo de cuenta (ej. Ahorros, Corriente): "); String tipo_cuenta = sc.nextLine();
                            cliente.registrar_cuenta(tipo_cuenta);
                            break;
                        case 3:
                            System.out.print("\nIngrese el número de tarjeta de crédito a agregar: "); String num_tarjeta_credito = sc.nextLine();
                            cliente.agregar_tarjeta_credito(num_tarjeta_credito);
                            break;
                        case 4:
                            System.out.print("\nMonto del préstamo a solicitar: "); double monto = sc.nextDouble(); sc.nextLine();
                            cliente.solicitar_prestamo(monto);
                            break;
                        case 5:
                            cliente.mostrar_rol();
                            break;
                        case 6:
                            System.out.print("\nIngrese sus nuevos datos\n");
                            System.out.print(" -- Nombre: "); String nombre = sc.nextLine();
                            System.out.print(" -- Cedula: "); String cedula = sc.nextLine();
                            System.out.print(" -- Direccion: "); String direccion = sc.nextLine();
                            System.out.print(" -- Telefono: "); String telefono = sc.nextLine();
                            cliente.actualizar_datos(nombre, cedula, direccion, telefono);
                            break;
                        case 7:
                            cliente.ver_resumen_financiero();
                            break;
                        case 0:
                            System.out.println("\nSaliendo del programa. ¡Bye!\n");
                            break;
                        default:
                            System.out.println("\nOpción no válida. Por favor, intenta de nuevo.");
                    }
                } while (opcion != 0);
            }
            else if (opcion_identificacon == 2) {
                System.out.printf("\nEmpelado :)\n");
                int opcion_ident_ramas_empleado;
                // Aqui el empreado ve si se queda en empleado normal o va a una de las subramas
                // Le meto loguin?
            }
        } while (opcion_identificacon != 3);

        sc.close(); // Cierra el scanner cuando ya no se necesite

    }
}