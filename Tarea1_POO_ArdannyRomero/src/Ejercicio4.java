import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: "); String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: "); int edad = sc.nextInt();
        System.out.print("Ingrese su estatura (en metros): "); float estatura = sc.nextFloat();

        if (edad > 18 && estatura > 1.6){ //Dato que descubri (no se si es solo yo) decimales en codigo va con punto, pero de entrada a termial va con coma
            System.out.printf("Aceptado para el equipo. Felicidades %s! ",nombre);
        }
        else {
            System.out.println("No cumple con los requisitos");
        }
        sc.close();
    }
}