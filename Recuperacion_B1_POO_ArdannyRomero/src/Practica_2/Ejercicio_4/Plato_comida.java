package Practica_2.Ejercicio_4;

public class Plato_comida {
    protected String nombre;
    protected double precio;
    protected boolean vegetariano;

    public Plato_comida() {
        this.nombre = nombre;
        this.precio = precio;
        this.vegetariano = vegetariano;
    }

    public void muestra(String nombre, boolean vegetariano){
        System.out.printf("\nPlato: %s \tVegetariano: %b", nombre, vegetariano);
    }

    public void muestra(String nombre, boolean vegetariano, double precio){
        System.out.printf("\nPlato: %s \tVegetariano: %b \tPrecio: $%.2f", nombre, vegetariano, precio);
    }
}
