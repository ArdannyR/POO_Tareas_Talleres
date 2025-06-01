package Nivel_1_Persona;

import Nivel_2.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Persona { // Clase abstracta: clase que no puede ser instanciada directamente
    // No se puede instancias ya que puede contener métodos sin definir
    protected String nombre;
    protected String cedula;
    protected String direccion;
    protected String telefono;

    public Scanner sc = new Scanner(System.in);

    public Persona (String nombre, String cedula, String direccion, String telefono){ // Una clase abstracta puede tener un constructor, pero no puede ser abstracto.
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void actualizar_datos(String nombre, String cedula, String direccion, String telefono){
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public abstract void mostrar_rol(); // Clase abstarcta la cual no se como funciona por el momento

}
