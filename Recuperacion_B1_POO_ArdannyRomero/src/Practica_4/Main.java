package Practica_4;

import Practica_4.Ejercicio_1.Nivel_2.Cuadrado;
import Practica_4.Ejercicio_1.Nivel_2.Triangulo;
import Practica_4.Ejercicio_2.Nivel_2.Empleado_fijo;
import Practica_4.Ejercicio_2.Nivel_2.Empleado_por_horas;
import Practica_4.Ejercicio_3.Nivel_2.Bicicleta;
import Practica_4.Ejercicio_3.Nivel_2.Bus;
import Practica_4.Ejercicio_4.Persona;
import Practica_4.Ejercicio_5.Estuadiante;
import Practica_4.Ejercicio_6.Usuario;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancias de ayuda
        Scanner sc = new Scanner(System.in);
        // ñ

        // Instancias
        Persona persona = new Persona(0);
        Estuadiante estuadiante = new Estuadiante(0);
        Usuario usuario = new Usuario("");

        // Variables
        double area_c_ej1;
        double area_t_ej1;
        double salario_f_ej2;
        double salario_ph_ej2;
        String info_b_ej3;
        String info_v_ej3;
        String comprobar_edad_ej4;
        int edad_ej4;
        double nota_ej5;
        String password_ej6;

        // Ejercicio 1
        System.out.print("\n\n * * * * Ejercicio 1 * * * * ");
        System.out.printf("\nArea de un cuadrado 4x4 = %.2f m2", area_c_ej1 = new Cuadrado(4).calular_area());
        System.out.printf("\nArea de un triangulo 5x3 = %.2f m2", area_t_ej1 = new Triangulo(5,3).calular_area());

        // Ejercicio 2
        System.out.print("\n\n * * * * Ejercicio 2 * * * * ");
        System.out.printf("\nSalario fijo: $%.2f", salario_f_ej2 = new Empleado_fijo(600).sueldo());
        System.out.printf("\nSalario por horas: $%.2f", salario_ph_ej2 = new Empleado_por_horas(5,40).sueldo());

        // Ejercicio 3
        System.out.print("\n\n * * * * Ejercicio 3 * * * * ");
        System.out.printf("\nBus: %s", info_b_ej3 = new Bus().iniciar_viaje());
        System.out.printf("\nVicicleta: %s", info_v_ej3 = new Bicicleta().iniciar_viaje());

        // Ejercicio 4
        System.out.print("\n\n * * * * Ejercicio 4 * * * * ");
        System.out.print("\nIngrese una edad: "); edad_ej4 = sc.nextInt(); sc.nextLine();
        if (new Persona(edad_ej4).comprobar_edad(edad_ej4)){
            persona.setEdad(edad_ej4);
            System.out.printf("Edad aceptada: %d", persona.getEdad());}
        else {
            System.out.print("Edad no valida, no actualizada");}

        // Ejercicio 5
        System.out.print("\n\n * * * * Ejercicio 5 * * * * ");
        System.out.print("\nIngrese una calificacion: "); nota_ej5 = sc.nextDouble(); sc.nextLine();
        if (new Estuadiante(nota_ej5).comprobar_nota(nota_ej5)){
            estuadiante.setNota(nota_ej5);
            System.out.printf("Nota aceptada: %.2f", estuadiante.getNota());}
        else {
            System.out.print("Nota no valida, fuera de rango");}

        // Ejercicio 6
        System.out.print("\n\n * * * * Ejercicio 6 * * * * ");
        System.out.print("\nIngrese su nueva contraseña: "); password_ej6 = sc.nextLine();
        if (new Usuario(password_ej6).verifica_password(password_ej6)){
            estuadiante.setNota(nota_ej5);
            System.out.print("Contraseña aceptada");}
        else {
            System.out.print("Contraseña rechazada");}

    }
}
