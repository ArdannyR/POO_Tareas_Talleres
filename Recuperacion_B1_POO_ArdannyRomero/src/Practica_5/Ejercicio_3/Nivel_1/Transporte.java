package Practica_5.Ejercicio_3.Nivel_1;

public abstract class Transporte {
    protected String direccion;
    protected String hora;

    public void registrar_ruta(String direccion) {
        if (validar_direccion(direccion)) {
            this.direccion = direccion;
            System.out.printf("\nRuta registrada: %s", direccion);
        }
    }

    public void registrar_ruta(String direccion, String hora) {
        if (validar_direccion(direccion)) {
            this.direccion = direccion;
            this.hora = hora;
            System.out.printf("\nRuta registrada: %s a las %s", direccion, hora);
        }
    }

    public boolean validar_direccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            System.out.println("Error: dirección inválida");
            return false;
        }
        return true;
    }

    public abstract void iniciar_viaje();
    public abstract double calcular_distancia();
}