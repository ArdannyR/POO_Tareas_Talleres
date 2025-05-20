package Libro;

public class Libro {
    String titulo;
    String autor;
    int año_de_publicacion;

    public Libro(String titulo, String autor, int año_de_publicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.año_de_publicacion = año_de_publicacion;
    }

    public void mostrar_informacion(){
        System.out.printf("El libro titulado %s, fue estrito por %s y publicado en el año de %d\n",titulo,autor,año_de_publicacion);
    }

    public void establecer_año(int nuevo_año){
        this.año_de_publicacion = nuevo_año;
        System.out.printf("------------------------------------------------------------------------------------\nActualizacion de año de publicacion del libro: %s\n",titulo);
        //mostrar_informacion();
        System.out.printf("------------------------------------------------------------------------------------\n");
    }
}
