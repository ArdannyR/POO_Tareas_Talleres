package Practica_2.Ejercicio_3;

public class Persona {
    protected String nombre;
    protected int edad;
    protected String ciudad;

    public Persona() {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void mostrar(String nombre){
        System.out.printf("\nNombre: %s",nombre);
    }

    public void mostrar(String nombre, int edad){
        System.out.printf("\nNombre: %s \tEdad: %d años", nombre, edad);
    }

    public void mostrar(String nombre, int edad, String ciudad){
        System.out.printf("\nNombre: %s \tEdad: %d años \tCiudad: %s", nombre, edad, ciudad);
    }
}
