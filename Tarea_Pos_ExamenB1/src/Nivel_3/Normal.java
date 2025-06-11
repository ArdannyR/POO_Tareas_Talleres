package Nivel_3;

import Nivel_2.Servicio;

public class Normal extends Servicio {
    public String asientos;
    public int maletas;
    public boolean maletas_extra;

    public Normal(String nombre, int edad, boolean clase, String asientos, int maletas, boolean maletas_extra) {
        super(nombre, edad, clase);
        this.asientos = asientos;
        this.maletas = maletas;
        this.maletas_extra = maletas_extra;
    }
}
