package Nivel_2;

import Nivel_1_Persona.Persona;

import java.util.Scanner;

public class Empleado extends Persona {
    private String usuario;
    private String clave;

    public Empleado (String rol, String usuario, String clave){
        super(rol);
        this.usuario = usuario; // trabajo = job + "sufijo acreedor" = trabajador :: jober in english ... Este deber esta demas largo
        this.clave = clave;
        this.rol = "Empleado";
    }

    @Override
    public void mostrar_rol() {
        System.out.printf("\nRol: %s\n", rol);
    }

    public boolean autentificar_empleado(){
        if (("jober".equals(this.usuario) && "1234".equals(this.clave))){
            return true;
        }
        else {
            return false;
        }
    }

    public void crear_cuenta_para_cliente(Cliente cliente, String nombre_cuenta){
        cliente.nombre_cuenta = nombre_cuenta;
        System.out.printf("\nLa cuneta %s del usuario cliente ha sido creada\n", nombre_cuenta);
    }

    public void modificar_datos_cliente(Cliente cliente){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese los nuevos datos del cliente:");
        System.out.print(" -- Nombre: "); String nuevo_nombre = sc.nextLine();
        System.out.print(" -- Cédula: "); String nueva_cedula = sc.nextLine();
        System.out.print(" -- Dirección: "); String nueva_direccion = sc.nextLine();
        System.out.print(" -- Teléfono: "); String nuevo_telefono = sc.nextLine();

        cliente.actualizar_datos(nuevo_nombre, nueva_cedula, nueva_direccion, nuevo_telefono);
        System.out.println("\nDatos del cliente actualizados con éxito.");
    }

    public void registrar_prestamo(Cliente cliente, double monto){
        if (!cliente.acumulacion_montos.contains(monto)) {
            System.out.println("\nEse monto no fue solicitado por el cliente.");
            return;
        }

        cliente.acumulacion_montos.remove(Double.valueOf(monto));
        cliente.prestamos.add(monto);
        System.out.printf("\nPréstamo de %.2f registrado exitosamente para el cliente.\n", monto);
    }

    public void cerrar_cuenta(Cliente cliente, String nombre_cuenta){
        if (cliente.nombre_cuenta != null && cliente.nombre_cuenta.equals(nombre_cuenta)) {
            cliente.nombre_cuenta = null;
            System.out.println("\nLa cuenta ha sido cerrada con éxito.");
        } else {
            System.out.println("\nNo se encontró una cuenta con ese nombre.");
        }
    }
}
