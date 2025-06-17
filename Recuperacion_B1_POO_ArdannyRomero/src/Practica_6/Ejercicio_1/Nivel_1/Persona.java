package Practica_6.Ejercicio_1.Nivel_1;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.printf("\n-- Nombre: %s - Edad: %d", nombre, edad);
    }
}

