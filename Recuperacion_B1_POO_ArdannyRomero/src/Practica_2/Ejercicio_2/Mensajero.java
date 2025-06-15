package Practica_2.Ejercicio_2;

public class Mensajero {
    protected String texto;
    protected String destinatario;
    protected int prioridad;

    public Mensajero() {
        this.texto = texto;
        this.destinatario = destinatario;
        this.prioridad = prioridad;
    }

    public void enviar(String texto){
        System.out.printf("\n-- Mensaje: %s", texto);
    }

    public void enviar(String texto, String destinatario){
        System.out.printf("\n-- Destinatario: %s \n\tMensaje: %s", destinatario, texto);
    }

    public void enviar(String texto, String destinatario, int prioridad){
        System.out.printf("\n-- Destinatario: %s \n\tMensaje: %s \n\tPrioridad: %d", destinatario, texto, prioridad);
    }

}
