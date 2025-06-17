package Practica_5.Ejercicio_2.Nivel_1;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre inválido"); // En caso de que se cumpla esto, tira este mensaje y detiene lo siguiente (es como el try and catch que vimos en c++)
        }
        this.nombre = nombre;
    }

    public abstract double calcular_salario();
    public abstract void mostrar_datos();

}

