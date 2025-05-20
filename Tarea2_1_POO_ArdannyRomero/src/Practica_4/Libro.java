package Practica_4;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public Libro() {
        this.autor = "Edgar Allan Poe";
        this.titulo = "El Cuervo";
        this.paginas = 3;
    }

    public void muestra_info() {
        System.out.printf("Esrito por %s, el libro %s cuanta con %d\n", this.autor, this.titulo, this.paginas);
    }
}