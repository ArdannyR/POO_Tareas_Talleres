import Ejercicio_1.Producto;
import Ejercicio_2.Estudiante;
import Ejercicio_3.Persona;
import Ejercicio_4.Cuenta;
import Ejercicio_5.Registro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancias de ayuda
        Scanner sc = new Scanner(System.in);
        // \n
        // System.out.print("\n\n * * * * Ejercicio * * * * ");

        // Instancias
        Producto producto = new Producto();
        Persona persona = new Persona(0);
        Cuenta cuenta = new Cuenta(null);
        Registro registro = new Registro();

        // Variables
        String matricula_ej2;
        int edad_ej3;
        String password_ej4;

        // Ejercicio 1
        System.out.print("\n\n * * * * Ejercicio 1 * * * * ");
        System.out.printf("\nNombre del producto es %s", producto.getNombre());

        // Ejercicio 2
        System.out.print("\n\n * * * * Ejercicio 2 * * * * ");
        System.out.print("\nIngresa el codigo de matricula: "); matricula_ej2 = sc.nextLine(); // 2025A001 (para no olvidarme)
        if (matricula_ej2.equals("2025A001")) {
            System.out.print("La matricula ha sido registrada");}
        else {
            System.out.print("Lo siento, no se ha podido registrar esa matricula");}

        // Ejercicio 3
        System.out.print("\n\n * * * * Ejercicio 3 * * * * ");
        System.out.print("\nIngresa la edad de la persona: "); edad_ej3 = sc.nextInt(); sc.nextLine(); persona.setEdad(edad_ej3);
        System.out.printf("La edad de la persona es de %d años", persona.getEdad());

        // Ejercicio 4
        System.out.print("\n\n * * * * Ejercicio 4 * * * * ");
        System.out.print("\nIngresa una contraseña: "); password_ej4 = sc.nextLine(); cuenta.setPassword(password_ej4);
        if (!password_ej4.isEmpty()){ // Si esque la contrasena no esta vacia (el if no era necesario pero me dio por investigar)
            System.out.print("Tu contraseña ha sido guardada exitosamente");}

        // Ejercicio 5
        System.out.print("\n\n * * * * Ejercicio 5 * * * * ");
        System.out.printf("\nTu codigo de registro es %s", registro.getCodigo());

        // Ejercicio 6

    }
}