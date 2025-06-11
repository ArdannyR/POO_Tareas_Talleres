package postulante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del postulante 1: "); String nombre1 = sc.nextLine();
        System.out.print("Ingrese apellido del postulante 1: "); String apellido1 = sc.nextLine();
        System.out.print("Ingrese edad del postulante 1: "); int edad1 = sc.nextInt(); sc.nextLine();
        System.out.print("Ingrese teléfono del postulante 1: "); String telefono1 = sc.nextLine();
        System.out.print("Ingrese correo electrónico del postulante 1: "); String correo1 = sc.nextLine();
        System.out.print("Ingrese nacionalidad del postulante 1: "); String nacionalidad1 = sc.nextLine();
        System.out.print("Ingrese condición socioeconómica del postulante 1 (1 = Baja): "); int condicion1 = sc.nextInt(); sc.nextLine();
        System.out.print("Ingrese carrera universitaria del postulante 1: "); String carrera1 = sc.nextLine();
        System.out.print("Ingrese promedio académico del postulante 1: "); double promedio1 = sc.nextDouble(); sc.nextLine();
        System.out.print("\n----------------new----------------\n");

        Postulante p1 = new Postulante(nombre1, apellido1, edad1, telefono1, correo1, nacionalidad1, condicion1, carrera1, promedio1);

        System.out.print("Ingrese nombre del postulante 2: "); String nombre2 = sc.nextLine();
        System.out.print("Ingrese apellido del postulante 2: "); String apellido2 = sc.nextLine();
        System.out.print("Ingrese carrera universitaria del postulante 2: "); String carrera2 = sc.nextLine();

        Postulante p2 = new Postulante(nombre2, apellido2, carrera2);

        p2.setEdad(18);
        p2.setPromedioAcademico(78);
        System.out.print("Ingrese nacionalidad del postulante 2: "); p2.setNacionalidad(sc.nextLine());
        System.out.print("Ingrese condición socioeconómica del postulante 2 (1 = Baja): "); p2.setCondicionSocioeconomica(sc.nextInt()); sc.nextLine();
        System.out.print("\n----------------new----------------\n");

        System.out.print("Ingrese nombre del postulante 3: "); String nombre3 = sc.nextLine();
        System.out.print("Ingrese apellido del postulante 3: "); String apellido3 = sc.nextLine();

        Postulante p3 = new Postulante(nombre3, apellido3);

        System.out.print("Ingrese edad del postulante 3: "); p3.setEdad(sc.nextInt()); sc.nextLine();
        System.out.print("Ingrese carrera universitaria del postulante 3: "); p3.setCarreraUniversitaria(sc.nextLine());
        System.out.print("Ingrese promedio académico del postulante 3: "); p3.setPromedioAcademico(sc.nextDouble()); sc.nextLine();
        System.out.print("Ingrese nacionalidad del postulante 3: "); p3.setNacionalidad(sc.nextLine());
        System.out.print("Ingrese condición socioeconómica del postulante 3 (1 = Baja): "); p3.setCondicionSocioeconomica(sc.nextInt()); sc.nextLine();

        System.out.println();
        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();

        sc.close();
    }
}