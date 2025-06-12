package Nivel_1;

import java.util.Scanner;

public class Ruta {
    protected int ruta;
    protected double pasaje;
    protected boolean sentido_de_vieje; // false para ida, y true para regreso

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
}
