package Nivel_2;

import Nivel_1_Persona.Persona;

public class Empleado extends Persona {
    private String usuario;
    private String clave;

    public Empleado (String nombre, String cedula, String direccion, String telefono,String rol, String usuario, String clave){
        super(nombre, cedula, direccion, telefono, rol);
        this.usuario = "jober"; // trabajo = job + "sufijo acreedor" = trabajador :: jober in english ... Este deber esta demas largo
        this.clave = "1234";
        this.rol = "Empleado";
    }

    @Override
    public void mostrar_rol() {
        System.out.printf("\nRol: %s\n", rol);
    }

    public boolean autentificar_empleado(String usuario, String clave){
        if (this.usuario == usuario & this.clave == clave){
            return true;
        }
        else {
            return false;
        }
    }

    public void crear_cuenta_para_cliente(Cliente cliente, String nombre_cuenta){
        // idea: como el menu esta metido en bucle, primero se debe crear un cliente y luego ya se puede usar empleado
        // esto es poco practico, pero la verdad al no usar bases de datos es lo que hay
    }

    public void modificar_datos_cliente(Cliente cliente){
        // esta esta facil, ya hay un metodo de actualizacion de datos
        System.out.printf("A");
    }

    public void registrar_prestamo(Cliente cliente, double monto){
        // Esta un poco aja... el plan es usar la lista acumulacion_montos y sacar el monto para registrarlo
        // en plan buscar el monto de 1000$ o mas facil creo mejor solo por indices
        // tipo monto 1 esta aqui, y aceptado, con ello el monto del la lista acumulacion_montos se elimina
        System.out.printf("A");
    }

    public void cerrar_cuenta(Cliente cliente, String nombre_cuenta){
        // sera que esto deja un bool para saber si la cuenta de un cliente esta creada o cerrada?
    }
}
