package Practica_1.Ejercicio_13;

public class Pelicula {
    public String titulo = "";
    public int año = 2024;
    private String director = "";
    private double duracion = 0.0;

    public Pelicula(String titulo, int año, String director, double duracion) {
        this.año = año;
        this.director = director;
        this.duracion = duracion;
        this.titulo = titulo;
    }

    public void mostrar_ficha(){
        System.out.printf("La pelicula titulada '%s', dirigida por %s y estrenada en el %d, tiene una duracion de %.2f horas", titulo, director, año, duracion);
    }

    public String getDirector() {return director;}
    public void setDirector(String director) {this.director = director;}
    public double getDuracion() {return duracion;}
    public void setDuracion(double duracion) {this.duracion = duracion;}
}
