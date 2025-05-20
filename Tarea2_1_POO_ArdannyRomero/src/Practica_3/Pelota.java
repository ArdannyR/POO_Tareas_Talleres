package Practica_3;

public class Pelota {
    String tipo;
    String color;
    double precio;

    public Pelota(String tipo, String color, double precio) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
    }

    public void muestra_caracteristicas() {
        System.out.printf("La pelota de %s color %s cuesta: $%.2f\n", this.tipo, this.color, this.precio);
    }
}