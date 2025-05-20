package Practica_3;

public class Main {
    public static void main(String[] args) {
        Pelota pelota_basket = new Pelota("Basket", "Naranja", (double)20.5F);
        Pelota pelota_tenis = new Pelota("Tenis", "Verde claro", (double)3.25F);
        Pelota pelota_voley = new Pelota("Voley", "Amarillo y azul", (double)12.0F);
        pelota_basket.muestra_caracteristicas();
        pelota_tenis.muestra_caracteristicas();
        pelota_voley.muestra_caracteristicas();
    }
}