package Nivel_1_Persona;

import Nivel_2.Cliente;
import Nivel_2.Empleado;
import Nivel_3.Balcon_Servicios;
import Nivel_3.Cajero;
import Nivel_3.Jefe_Agencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion_identificacon;
        Scanner sc = new Scanner(System.in);


        do{
        System.out.println("* * * * * * * Saludos usuario! * * * * * * *\nIdentificate");
        System.out.println("\t1. Cliente \n\t2. Empleado \n\t0. Salir");
        System.out.print("Elige una opción: "); opcion_identificacon = sc.nextInt(); sc.nextLine();

            if (opcion_identificacon == 1){

                Cliente cliente = new Cliente(null,null,null,null, null, null); // Creo un cliente null y luego le llamo a ponerle datos
                cliente.datos(); // Creo una variable con la clase y le asigno los datos (con esto quito los null)

                int opcion;
                do {
                    System.out.printf("\n* * * * * * * * * * * Sistema Bancario * * * * * * * * * * * \nBienvenido %s \nRecuerda Ingresar al sistema para cualquier actividad\n", cliente.nombre);
                    System.out.println("\t1. Ingresar al Sistema \n\t2. Registrar Nueva Cuenta \n\t3. Agregar Tarjeta de Crédito a Cuenta \n\t4. Solicitar Préstamo \n\t5. Mostrar Rol \n\t6. Actualizar datos del Cliente \n\t7. Ver Resumen financiero \n\t0. Salir");
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

                    int opcion_ident_ramas_empleado;
                    System.out.println("* * * * * * * Saludos Empelado! * * * * * * *\nIdentificate");
                    System.out.print("Ingrese su usario: "); String usuario = sc.nextLine();
                    System.out.print("Ingrese su clave: "); String clave = sc.nextLine();
                    Empleado empleado = new Empleado("Empleado", usuario ,clave);

                    if (empleado.autentificar_empleado()) {
                        System.out.println("* * * * * * * Saludos Empelado! * * * * * * *\nSelecciona");
                        System.out.println("\t1. Crear Cuenta para Cliente \n\t2. Modificar Datos del Cliente \n\t3. Registrar Prestamos \n\t4. Cerrar Cuenta \n\t5. Cambiar Rol de Empleado \n\t0. Salir");
                        System.out.print("Opcion: "); opcion_ident_ramas_empleado = sc.nextInt(); sc.nextLine();

                        do {
                            Cliente cliente = new Cliente(null, null, null, null, "Cliente", null); // Neceito u null para luego irlo llenando
                            switch (opcion_ident_ramas_empleado) {
                                case 1:
                                    System.out.print("\nIngrese el nombre de la cuenta a crear para el cliente: "); String nombre_cuenta = sc.nextLine();
                                    empleado.crear_cuenta_para_cliente(cliente, nombre_cuenta);
                                    break;
                                case 2:
                                    empleado.modificar_datos_cliente(cliente);
                                    break;
                                case 3:
                                    System.out.print("\nIngrese el monto del préstamo a registrar: "); double monto_prestamo = sc.nextDouble(); sc.nextLine();
                                    empleado.registrar_prestamo(cliente, monto_prestamo);
                                    break;
                                case 4:
                                    System.out.print("\nIngrese el nombre de la cuenta que desea cerrar: "); String cuenta_cerrar = sc.nextLine();
                                    empleado.cerrar_cuenta(cliente, cuenta_cerrar);
                                    break;
                                case 5:
                                    System.out.println("\nSeleccione su rol:");
                                    System.out.println("\n\t1. Cajero \n\t2. Balcón de Servicios \n\t3. Jefe de Agencia");
                                    System.out.print("Rol (número): ");
                                    int rol_empleado = sc.nextInt();
                                    sc.nextLine();

                                    switch (rol_empleado) {
                                        case 1: // Cajero
                                            int opcion_cajero ;
                                            do {
                                                System.out.print("Ingrese su usario: "); String usuario_cajero = sc.nextLine();
                                                System.out.print("Ingrese su clave: "); String clave_cajero = sc.nextLine();
                                                Cajero cajero = new Cajero(usuario_cajero, clave_cajero);

                                                if (cajero.autentificar_empleado()) {
                                                    System.out.println("\n-- Menú Cajero --");
                                                    System.out.println("1. Procesar Retiro");
                                                    System.out.println("2. Consultar Saldo");
                                                    System.out.println("3. Procesar Depósito");
                                                    System.out.println("0. Volver");
                                                    System.out.print("Opción: ");
                                                    opcion_cajero = sc.nextInt(); sc.nextLine();

                                                    switch (opcion_cajero) {
                                                        case 1:
                                                            System.out.print("Monto a retirar: ");
                                                            double retiro = sc.nextDouble();
                                                            sc.nextLine();
                                                            cajero.procesarRetiro(cliente, retiro);
                                                            break;
                                                        case 2:
                                                            cajero.consultarSaldo(cliente);
                                                            break;
                                                        case 3:
                                                            System.out.print("Monto a depositar: ");
                                                            double deposito = sc.nextDouble();
                                                            sc.nextLine();
                                                            cajero.procesarDeposito(cliente, deposito);
                                                            break;
                                                        case 0:
                                                            System.out.println("Volviendo al menú principal...");
                                                            break;
                                                        default:
                                                            System.out.println("Opción no válida.");
                                                    }
                                                }
                                                else{
                                                        System.out.print("\nCredenciales incorrectas. Intente nuevamente.\n");
                                                        opcion_cajero = -1;
                                                }
                                            } while (opcion_cajero != 0);
                                            break;

                                        case 2: // Balcón de Servicios
                                            int opcion_balcon;
                                            do {
                                                System.out.print("Ingrese su usuario: ");
                                                String usuario_balcon = sc.nextLine();
                                                System.out.print("Ingrese su clave: ");
                                                String clave_balcon = sc.nextLine();

                                                Balcon_Servicios balcon = new Balcon_Servicios(usuario_balcon, clave_balcon);

                                                if (balcon.autentificar_empleado()) {
                                                    do {
                                                        System.out.println("\n-- Menú Balcón de Servicios --");
                                                        System.out.println("1. Actualizar Datos del Cliente");
                                                        System.out.println("2. Consultar Información");
                                                        System.out.println("0. Volver");
                                                        System.out.print("Opción: ");
                                                        opcion_balcon = sc.nextInt(); sc.nextLine();

                                                        switch (opcion_balcon) {
                                                            case 1:
                                                                balcon.registrarNuevoCliente();
                                                                break;
                                                            case 2:
                                                                balcon.actualizarDatosCliente(cliente);
                                                                break;
                                                            case 0:
                                                                System.out.println("Volviendo al menú principal...");
                                                                break;
                                                            default:
                                                                System.out.println("Opción no válida.");
                                                        }
                                                    } while (opcion_balcon != 0);
                                                } else {
                                                    System.out.println("\nCredenciales incorrectas. Intente nuevamente.\n");
                                                    opcion_balcon = -1;
                                                }
                                            } while (opcion_balcon != 0);
                                            break;
                                        case 3: // Jefe de Agencia
                                            int opcion_jefe;
                                            do {
                                                System.out.print("Ingrese su usuario: ");
                                                String usuario_jefe = sc.nextLine();
                                                System.out.print("Ingrese su clave: ");
                                                String clave_jefe = sc.nextLine();

                                                Jefe_Agencia jefe = new Jefe_Agencia(usuario_jefe, clave_jefe);

                                                if (jefe.autentificar_empleado()) {
                                                    do {
                                                        System.out.println("\n-- Menú Jefe de Agencia --");
                                                        System.out.println("1. Aprobar Préstamo");
                                                        System.out.println("2. Generar Reporte de Operaciones");
                                                        System.out.println("3. Evaluar Empleado");
                                                        System.out.println("0. Volver");
                                                        System.out.print("Opción: ");
                                                        opcion_jefe = sc.nextInt(); sc.nextLine();

                                                        switch (opcion_jefe) {
                                                            case 1:
                                                                System.out.print("Monto a aprobar: ");
                                                                double monto = sc.nextDouble(); sc.nextLine();
                                                                boolean aprobado = jefe.aprobarPrestamo(cliente, monto);
                                                                System.out.println(aprobado ? "Préstamo aprobado." : "Préstamo denegado.");
                                                                break;
                                                            case 2:
                                                                jefe.generarReporteOperaciones();
                                                                break;
                                                            case 3:
                                                                jefe.evaluarEmpleado(empleado); // asegúrate de que 'empleado' esté definido
                                                                break;
                                                            case 0:
                                                                System.out.println("Volviendo al menú principal...");
                                                                break;
                                                            default:
                                                                System.out.println("Opción no válida.");
                                                        }
                                                    } while (opcion_jefe != 0);
                                                } else {
                                                    System.out.println("\nCredenciales incorrectas. Intente nuevamente.\n");
                                                    opcion_jefe = -1;
                                                }
                                            } while (opcion_jefe != 0);
                                            break;
                                        default:
                                            System.out.println("Rol no reconocido o sin funciones especiales.");
                                    }
                                    break;
                                case 0:
                                    System.out.println("\nSaliendo del apartado\n");
                                    break;
                            }
                        } while (opcion_ident_ramas_empleado != 0);
                    }
                    else{
                        System.out.print("\nError\n");
                    }

            }
        } while (opcion_identificacon != 0);

        sc.close();

    }
}