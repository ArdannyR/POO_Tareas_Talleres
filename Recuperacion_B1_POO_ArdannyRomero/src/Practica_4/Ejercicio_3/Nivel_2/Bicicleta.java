package Practica_4.Ejercicio_3.Nivel_2;

import Practica_4.Ejercicio_3.Nivel_1.Transporte;

public class Bicicleta extends Transporte {
    protected String info_viaje = "La bicicleta comienza a pedalear";

    public Bicicleta(){
        this.info_viaje = info_viaje;
    }

    public String iniciar_viaje(){
        return info_viaje;
    }
}
