package Nivel_2;

import Nivel_1.Pasajero;

public abstract class Servicio extends Pasajero {
    protected boolean clase;

    public Servicio(String nombre, int edad, boolean clase) {
        super(nombre, edad);
        this.clase = clase;
    }

    public void ver_resumen(String nombre, int edad, boolean clase){
        System.out.printf("\nPasajero: %s \nEdad: %d \nClase", nombre, edad, clase);
    }
}
