package Nivel_2;

import Nivel_1.Ruta;

public class Ticket extends Ruta {
    protected int num_asiento;

    public Ticket(int ruta, double pasaje, boolean sentido_de_vieje){
        super(ruta, pasaje, sentido_de_vieje);
        this.num_asiento = num_asiento;
    }
}
