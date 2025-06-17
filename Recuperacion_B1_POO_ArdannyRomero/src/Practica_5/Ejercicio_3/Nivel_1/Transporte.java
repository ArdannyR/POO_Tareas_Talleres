package Practica_5.Ejercicio_3.Nivel_1;

public abstract class Transporte {
    protected String direccion;
    protected String hora;

    public void registrarRuta(String direccion) {
        validarDireccion(direccion);
        this.direccion = direccion;
        System.out.printf("\nRuta registrada: %s", direccion);
    }

    public void registrarRuta(String direccion, String hora) {
        validarDireccion(direccion);
        this.direccion = direccion;
        this.hora = hora;
        System.out.printf("\nRuta registrada: %s a las %s", direccion, hora);
    }

    protected void validarDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("Dirección inválida");
        }
    }

    public abstract void iniciarViaje();
    public abstract double calcularDistancia();
}