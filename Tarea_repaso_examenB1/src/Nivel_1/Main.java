package Nivel_1;

import Nivel_3.Normal;
import Nivel_3.VIP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int opcion_nivel_1;

        // Objetos
        Scanner sc = new Scanner(System.in);
        Pasajero pasajero_null = new Pasajero(null,0);
        Ruta ruta_null = new Ruta(0,0,false);

        // Login --------------------------------------------------------------------------------
        Pasajero pasajero_1 = pasajero_null.inicio(sc);
        if (pasajero_1.getEdad() >= 18){
            do {
                System.out.print("\n* * * * * * * * * Sistema de Tickets * * * * * * * * * ");
                System.out.print("\n1. Definir clase \n2. Definir ruta \n3. Aceptar compra \n0. Salir");
                System.out.print("\nSeleccione una opcion (0 para salir): "); opcion_nivel_1 = sc.nextInt(); sc.nextLine();
                switch (opcion_nivel_1){
                    case 1:
                        if (pasajero_1.definir_clase(pasajero_1,sc)){
                            VIP pasajero_vip_1 = new VIP(pasajero_1.getNombre(),pasajero_1.getEdad(),true,null,0,false);
                        }
                        else {
                            Normal pasajero_normal_1 = new Normal(pasajero_1.getNombre(), pasajero_1.getEdad(), false, null, 0, false);
                        }
                        break;
                    case 2:
                            Ruta ruta = ruta_null.inicializacion_de_ruta(sc);
                        break;
                }
            }  while (opcion_nivel_1 != 0);
        }
        else {
            System.out.print("\nMenores de edad no deberian acceder a este sitio");
        }

    }
}