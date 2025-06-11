package Nivel_1;

public class Ruta {
    protected int ruta;
    protected double pasaje;
    protected boolean sentido_de_vieje; // false para ida, y true para regreso

    public Ruta(int ruta, double pasaje, boolean sentido_de_vieje){
        this.ruta = ruta;
        this.pasaje = pasaje;
        this.sentido_de_vieje = sentido_de_vieje;
    }
}
