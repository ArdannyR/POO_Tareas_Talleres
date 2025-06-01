package Nivel_2;

import Nivel_1_Persona.Persona;

public abstract class Empleado extends Persona { // No se menciona en el deber, peor coloco esto como abstracto 1. porque me pide hacerlo, 2. porque al fin y al cabo no necesito sacar objetos de aqui, si no de las clases hijas que vienen
    private String usuario;
    private String clave;

    public Empleado (String nombre, String cedula, String direccion, String telefono,String rol, String usuario, String clave){
        super(nombre, cedula, direccion, telefono, rol);
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean autentificar_empleado(String usuario, String clave){
        if (this.usuario == usuario & this.clave == clave){
            return true;
        }
        else {
            return false;
        }
    }


}
