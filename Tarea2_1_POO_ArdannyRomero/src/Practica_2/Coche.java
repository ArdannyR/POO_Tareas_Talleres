package Practica_2;

public class Coche {
    String placa;
    Double kilometraje;

    public Coche(String placa, double kilometraje) {
        this.placa = placa;
        this.kilometraje = kilometraje;
    }

    public Coche() {
        this.placa = "ARV-041";
        this.kilometraje = (double)410000.0F;
    }

    public void mostrar_info() {
        System.out.printf("El auto de placa %s, lleva un kilometraje de %.2f\n", this.placa, this.kilometraje);
    }
}