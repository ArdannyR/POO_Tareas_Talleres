package Nivel_2;

import Nivel_1.Pasajero;

public class Servicio extends Pasajero {
    protected boolean clase;

    public Servicio(String nombre, int edad, boolean clase) {
        super(nombre, edad);
        this.clase = clase;
    }
}
