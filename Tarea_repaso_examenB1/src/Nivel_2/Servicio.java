package Nivel_2;

import Nivel_1.Pasajero;

import java.util.Scanner;

public abstract class Servicio extends Pasajero {
    protected boolean clase;

    public Servicio(String nombre, int edad, boolean clase) {
        super(nombre, edad);
        this.clase = clase;
    }

    public void ver_resumen(){
        System.out.printf("\nPasajero: %s \nEdad: %d \nClase", getNombre(), getEdad(), clase);
    }

    public abstract Servicio llenar_datos_faltantes(String nombre, int edad, boolean clase, Scanner sc); // Nota: aunque la clase sea abstracta, un metodo lo puedo definir para que me de una instancia, a la final, los metodos abstractos no actuan asi que esta bien
}
