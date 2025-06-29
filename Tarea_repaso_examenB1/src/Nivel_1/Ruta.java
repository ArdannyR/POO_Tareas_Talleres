package Nivel_1;

import java.util.Scanner;

public class Ruta {
    private int ruta;
    private double pasaje;
    private boolean sentido_de_vieje; // false para ida, y true para regreso

    public Ruta(int ruta, double pasaje, boolean sentido_de_vieje){
        this.ruta = ruta;
        this.pasaje = pasaje;
        this.sentido_de_vieje = sentido_de_vieje;
    }

    public Ruta inicializacion_de_ruta(Scanner sc){
        System.out.print("\nRutas disponibles: \n-- 1. Quito-Guayaquil (pasaje: $20) \n-- 2. Quito-Tulcán (pasaje: $17,50) \n-- 3. Quito-Puyo (pasaje: $15) \n-- 4. Quito-Riobamba (pasaje: $17,50)");
        System.out.print("\nQue ruta desea elegir: "); this.ruta = sc.nextInt(); sc.nextLine();
        switch (ruta){
            case 1:
                this.pasaje = 20;
                String str_ruta = "Quito-Guayaquil";
                break;
            case 2:
                this.pasaje = 17.50;
                break;
            case 3:
                this.pasaje = 15;
                break;
            case 4:
                this.pasaje = 17.50;
                break;
            default:
                inicializacion_de_ruta(sc);
                break;
        }
        System.out.print("\nEn que sentido se dirige (false para ida, true para regreso): "); this.sentido_de_vieje = sc.nextBoolean();
        return new Ruta(ruta, pasaje, sentido_de_vieje);
    }

    public void ver_resumen_ruta(){
        String str_ruta = null;
        String str_sentido_de_vieje = null;
        switch (ruta) {
            case 1:
                str_ruta = "Quito-Guayaquil";
                break;
            case 2:
                str_ruta = "Quito-Tulcán";
                break;
            case 3:
                str_ruta = "Quito-Cuenca";
                break;
            case 4:
                str_ruta = "Quito-Loja";
                break;
            default:
                str_ruta = "Ruta no definida";
        }
        if (sentido_de_vieje){
            str_sentido_de_vieje = "Regreso";
        }
        else {
            str_sentido_de_vieje = "Ida";
        }
        System.out.printf("Ruta: %s \nPasaje: %.2f \nsentido_de_vieje: %s\n * * * * * * * * * * *\n",str_ruta, pasaje, str_sentido_de_vieje);
    }

    // Metodos getter and setter

    public int getRuta() {return ruta;}
    public void setRuta(int ruta) {this.ruta = ruta;}

    public double getPasaje() {return pasaje;}
    public void setPasaje(double pasaje) {this.pasaje = pasaje;}

    public boolean isSentido_de_vieje() {return sentido_de_vieje;}
    public void setSentido_de_vieje(boolean sentido_de_vieje) {this.sentido_de_vieje = sentido_de_vieje;}
}
