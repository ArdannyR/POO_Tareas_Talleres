import java.util.Scanner;

public class Curso {
    String nombre;
    String codigo;
    int creditos;


    public Curso(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Código del curso: " + codigo);
        System.out.println("Créditos: " + creditos);
    }

    public void actualizarCreditosDesdeTeclado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nueva cantidad de créditos para el curso " + nombre + ": ");
        if (scanner.hasNextInt()) {
            int nuevosCreditos = scanner.nextInt();
            this.creditos = nuevosCreditos;
        } else {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero para los créditos.");
            scanner.next();
        }
        scanner.close();
    }

    public static void main(String[] args) {

        Curso curso1 = new Curso("Programación", "INF101", 5);
        Curso curso2 = new Curso("Arquitectura", "INF102", 5);
        Curso curso3 = new Curso("Interfaces", "INF103", 5);
        Curso curso4 = new Curso("Bases de datos", "INF104", 5);


        System.out.println("Información inicial del curso:");
        curso1.mostrarInformacion();
        curso2.mostrarInformacion();
        curso3.mostrarInformacion();
        curso4.mostrarInformacion();

        System.out.println();

        curso1.actualizarCreditosDesdeTeclado();
        curso2.actualizarCreditosDesdeTeclado();
        curso3.actualizarCreditosDesdeTeclado();
        curso4.actualizarCreditosDesdeTeclado();

        System.out.println();

        System.out.println("Información actualizada del curso:");
        curso1.mostrarInformacion();
        curso2.mostrarInformacion();
        curso3.mostrarInformacion();
        curso4.mostrarInformacion();

    }
}