package Practica_6.Ejercicio_3.Nivel_1;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        if (validar_marca(marca)) {
            this.marca = marca;
        } else {
            this.marca = "N/A";
        }
        this.modelo = modelo;
    }

    public boolean validar_marca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            System.out.println("Error: la marca no puede ser nula");
            return false;
        }
        return true;
    }

    public void mostrar_info() {
        System.out.printf("\nMarca: %s - Modelo: %s", marca, modelo);
    }
}
