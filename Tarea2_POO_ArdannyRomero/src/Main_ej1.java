import java.util.Scanner;

public class Main_ej1 {
    public static void main(String[] args) {
        System.out.print("\nHola! Esto estoy haciendo desde clases ");
        Scanner sc = new Scanner(System.in);

        Juagdor Player_1 = new Juagdor("Lionel Messi",10,"Delantero",37);
        Player_1.presentacion();
        System.out.println(" ");
        Juagdor Player_2 = new Juagdor("Cristiano Ronaldo",7,"Delantero",40);
        Player_2.presentacion();

        System.out.print("\n\nNombre del siguiente jugador: "); String nombre_PLayer_3 = sc.nextLine();
        System.out.print("Edad del jugador: "); int edad_Player_3 = sc.nextInt(); sc.nextLine();
        while (edad_Player_3 <=0 || edad_Player_3 > 60) { //60 como maximo años en retirarse del futbol
            System.out.print("Edad de jugador (no negativo/jubilados): ");edad_Player_3 = sc.nextInt();sc.nextLine();
        }

        System.out.print("Numero de camiseta del jugador : "); int numero_identificador_PLayer_3 = sc.nextInt(); sc.nextLine();
        while (numero_identificador_PLayer_3 < 0) { //dato: si ya defines el tipo de dato a scannear, la siguiente ves no se coloca o da error
            System.out.print("Numero de camiseta del jugador (no negativo): ");numero_identificador_PLayer_3 = sc.nextInt();sc.nextLine();
        }

        System.out.print("Posicion del jugador: "); String posicion_PLayer_3 = sc.nextLine();

        Juagdor Player_3 = new Juagdor(nombre_PLayer_3,numero_identificador_PLayer_3,posicion_PLayer_3,edad_Player_3);
        Player_3.presentacion();
        sc.close();
    }
}
