package Practica_5.Ejercicio_1.Nivel_1;

public abstract class Curso {
    public String nombre;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcular_costo();

    public void mostrar_info(String nombre) {
        System.out.printf("\n-- Curso: %s", nombre);
    }

    public void mostrar_info(String nombre, double costo) {
        System.out.printf("\n-- Curso: %s Costo: $%.2f", nombre ,costo);
    }

    public double calcular_descuento() {
        double costo = calcular_costo();
        if (costo > 150) {
            return costo * 0.10;
        }
        return 0;
    }
}