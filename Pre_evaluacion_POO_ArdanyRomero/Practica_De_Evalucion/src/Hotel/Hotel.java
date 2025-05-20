package Hotel;

import java.util.Scanner;

public class Hotel {
    String nombre; //Designacion de atributos
    int habitaciones_disponibles;
    double precio_por_habitacion;

    Scanner sc = new Scanner(System.in); //Un Scanner

    public Hotel(String nombre, int habitaciones_disponibles, double precio_por_habitacion) { //Este metodo constructor va con datos para poder quemarlos en el main
        this.nombre = nombre;
        this.habitaciones_disponibles = habitaciones_disponibles;
        this.precio_por_habitacion = precio_por_habitacion;
    }

    public void Modificar_objeto(){
        System.out.print("Que deseas cambiar de este hotel?\n-1.-Nombre\n-2.-Habitaciones disponibles\n-3.-Precio por habitacion\nRespuesta: "); int respuesta = sc.nextInt(); sc.nextLine();
        switch (respuesta) {
            case 1:
                System.out.print("Nuevo nombre: "); String nomre_new = sc.nextLine();
                this.nombre = nomre_new;
                break;
            case 2:
                System.out.print("Nuevo numero de habitaciones disponibles: "); int habitaciones_disponibles_new = sc.nextInt();sc.nextLine();
                this.habitaciones_disponibles = habitaciones_disponibles_new;
                break;
            case 3:
                System.out.print("Nuevo precio por habitaciones: "); double precio_por_habitacion_new = sc.nextDouble();sc.nextLine();
                this.precio_por_habitacion = precio_por_habitacion_new;
                break;
            default:
                System.out.println("Error en tu respuesta");
        }
    }

    public void Imprimir_hoteles(){
        System.out.printf("Nombre: %s\nHabitaciones disponibles: %d\nPrecio por habitación: $%.2f\n--------------------------------\n", this.nombre, this.habitaciones_disponibles, this.precio_por_habitacion);
    }

    public void Modifica_a_null(String nuevoNombre, int nuevasHabitaciones, double nuevoPrecio) {
        this.nombre = nuevoNombre;
        this.habitaciones_disponibles = nuevasHabitaciones;
        this.precio_por_habitacion = nuevoPrecio;
    }

}
