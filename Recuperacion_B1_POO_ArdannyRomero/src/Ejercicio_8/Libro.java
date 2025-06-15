package Ejercicio_8;

public class Libro {
    private String titulo = "";
    private int año_de_publicacion = 0;

    public Libro(String titulo, int año_de_publicacion) {
        this.titulo = titulo;
        this.año_de_publicacion = año_de_publicacion;
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public int getAño_de_publicacion() {return año_de_publicacion;}
    public void setAño_de_publicacion(int año_de_publicacion) {this.año_de_publicacion = año_de_publicacion;}
}
