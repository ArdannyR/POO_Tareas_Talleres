package Practica_3.Ejercicio_2.Nivel_2;

import Practica_3.Ejercicio_2.Nivel_1.Vehiculo;

public class Moto extends Vehiculo {
    protected String arranca;

    public Moto(){
        this.arranca = "boton";
    }

    @Override
    public void arrancar() {
        System.out.printf("Arranca con %s",arranca);
    }
}
