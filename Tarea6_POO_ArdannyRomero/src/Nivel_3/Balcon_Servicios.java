package Nivel_3;

import Nivel_2.Cliente;
import Nivel_2.Empleado;

import java.util.Scanner;

public class Balcon_Servicios extends Empleado {
    public Balcon_Servicios(String usuario, String clave) {
        super("BalconServicios", usuario, clave);
    }

    public Cliente registrarNuevoCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, cedula, direccion, telefono, "Cliente", correo);
        System.out.println("Nuevo cliente registrado con éxito.");
        return nuevoCliente;
    }

    public void actualizarDatosCliente(Cliente cliente) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nuevo nombre: "); String nuevo_nombre = sc.nextLine();
        cliente.setNombre(nuevo_nombre);
        System.out.print("Nueva cédula: "); String nueva_cedula = sc.nextLine();
        cliente.setCedula(nueva_cedula);
        System.out.print("Nueva dirección: "); String nueva_direccion = sc.nextLine();
        cliente.setDireccion(nueva_direccion);
        System.out.print("Nuevo teléfono: "); String nuevo_telefono = sc.nextLine();
        cliente.setTelefono(nuevo_telefono);
        System.out.println("Datos actualizados correctamente.");
    }
}
