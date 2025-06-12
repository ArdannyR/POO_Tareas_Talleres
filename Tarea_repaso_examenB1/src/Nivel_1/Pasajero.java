package Nivel_1;

import java.util.Scanner;

public class Pasajero {
    private String nombre;
    private int edad;

    public Pasajero(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos normales
    public boolean definir_clase(Pasajero pasajero, Scanner sc){
        System.out.print("\nQue clase desea elegir? (true = VIP, false = Normal)");
        System.out.print("\nOpcion: "); boolean clase = sc.nextBoolean(); sc.nextLine();
        if (clase){
            return true;
        }
        else {
            return false;
        }
    }

    public Pasajero inicio(Scanner sc){
        System.out.print("\n* * * * * * * * * Sistema de Tickets * * * * * * * * * \nAntes de pedir tu ticket");
        System.out.print("\nIngresa tu nombre: "); String nombre = sc.nextLine();
        System.out.print("Ingresa tu edad: "); int edad = sc.nextInt(); sc.nextLine();
        return new Pasajero(nombre, edad);
    }

    // Metodos set and get
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
}
