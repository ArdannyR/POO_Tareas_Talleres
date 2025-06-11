package Nivel_2;

import Nivel_1.Ruta;

public class Ticket extends Ruta {
    protected boolean activo;
    protected int num_asiento;
    protected int dias_para_el_viaje;

    public Ticket(boolean activo, int mes, int dias_para_el_viaje, int ruta, double pasaje, boolean sentido_de_vieje){
        super(ruta, pasaje, sentido_de_vieje);
        this.activo = false;
        this.num_asiento = num_asiento;
        this.dias_para_el_viaje = dias_para_el_viaje;
    }
}
