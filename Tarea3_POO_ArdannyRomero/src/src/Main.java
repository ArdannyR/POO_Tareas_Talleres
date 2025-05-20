package src;

public class Main {
    public static void main(String[] args) {
        Libro libro_1 = new Libro("Romeo y Julieta","William Shakespeare",1494); //1595
        Libro libro_2 = new Libro("El Principito","Antoine de Saint-Exupéry",1943);

        libro_1.mostrar_informacion();
        libro_2.mostrar_informacion();

        libro_1.establecer_año(1595);

        libro_1.mostrar_informacion();
        libro_2.mostrar_informacion();
    }
}