package Nivel_2;

import Nivel_1.Ruta;

import java.util.Scanner;

public class Ticket extends Ruta {
    protected int num_asientos;

    public Ticket(int ruta, double pasaje, boolean sentido_de_vieje){
        super(ruta, pasaje, sentido_de_vieje);
        this.num_asientos = num_asientos;
    }

    private double precio(double pasajes, int num_asientos){
        return pasajes * num_asientos;
    }

    public void compra(Ruta ruta, Scanner sc){
        System.out.print("Ingrese numero de asientos a comprar para la ruta: "); int num_asientos = sc.nextInt(); sc.nextLine();
        System.out.printf("\nPrecio total: %.2f", precio(ruta.getPasaje(), num_asientos));
        System.out.print("\nLa compra se ha completado de froma exitosa. Disfrute su viaje!\n");
    }
}
