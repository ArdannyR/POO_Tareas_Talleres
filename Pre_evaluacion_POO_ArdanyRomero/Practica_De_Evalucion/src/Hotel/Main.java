package Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Aqui creo un scanner para setear los hoteles 6 y 7

        Hotel hotel_1 = new Hotel("Marriott", 10, 120.7); //Aqui estan los 5 hoteles con los datos quemados
        Hotel hotel_2 = new Hotel("Hilton", 15, 150.5);
        Hotel hotel_3 = new Hotel("Holiday Inn", 8, 95.0);
        Hotel hotel_4 = new Hotel("Sheraton", 20, 180.2);
        Hotel hotel_5 = new Hotel("Ibis", 12, 80.0);

        System.out.println("Porfavor ingrese los datos para los 2 nuevos hoteles: "); //Se ve un poco feo pero es la parte para ingresar datos a los 2 nuevos hoteles. No puse esto en un metodo para evitar confusion con los otros metodos
        System.out.print("Nombre: "); String nombre_h6 = sc.nextLine();
        System.out.print("Habitaciones disponibles: "); int habitaciones_disponibles_h6 = sc.nextInt(); sc.nextLine();
        System.out.print("Precio por habitaciones (1 noche): "); double precio_por_habitacion_h6 = sc.nextDouble(); sc.nextLine();
        Hotel hotel_6 = new Hotel(nombre_h6,habitaciones_disponibles_h6,precio_por_habitacion_h6);

        System.out.print("Nombre: "); String nombre_h7 = sc.nextLine(); //Esta es la otra parte donde pido datos para el ultimo hotel
        System.out.print("Habitaciones disponibles: "); int habitaciones_disponibles_h7 = sc.nextInt(); sc.nextLine();
        System.out.print("Precio por habitaciones (1 noche): "); double precio_por_habitacion_h7 = sc.nextDouble(); sc.nextLine();
        Hotel hotel_7 = new Hotel(nombre_h7,habitaciones_disponibles_h7,precio_por_habitacion_h7);

        hotel_1.Imprimir_hoteles(); //Esta parte es para imprimir la info de los hoteles
        hotel_2.Imprimir_hoteles(); //Nota importante: Muchos aspectos de este codigo podria simplificarse con el uso de listas/arreglos, mas como no hemos provado en clase no lo agrego
        hotel_3.Imprimir_hoteles();
        hotel_4.Imprimir_hoteles();
        hotel_5.Imprimir_hoteles();
        hotel_6.Imprimir_hoteles();
        hotel_7.Imprimir_hoteles();

        hotel_4.Modificar_objeto(); //Aqui me hubiera gustado poner a Que hotel se refieren los cambios, mas por la falta de listas/arreglos es mas dificil
        hotel_5.Modificar_objeto(); //Pensandolo bien si podria poner con un for. Mas por evitar sobrecargar el main con lineas creo que alli lo dejare :(

        hotel_1.Modifica_a_null(null, 0, 0.0); //Aqui cambio sus valores a null (nulos... en realidad creo que a eso se referia)
        hotel_2.Modifica_a_null(null, 0, 0.0);
        hotel_3.Modifica_a_null(null, 0, 0.0);

        System.out.println("***Hoteles con valores modificados/null\n--------------------------------\n"); //Este es solo para dividir los prints y hacer mas facil ver cuales fueron los valores cambiados
        hotel_1.Imprimir_hoteles(); //Otros metodos de imprimir
        hotel_2.Imprimir_hoteles();
        hotel_3.Imprimir_hoteles();
        hotel_4.Imprimir_hoteles();
        hotel_5.Imprimir_hoteles();

        sc.close();
    }
}