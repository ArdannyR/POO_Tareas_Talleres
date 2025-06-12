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
        VIP pasajero_vip_1 = null; // estos aunque ya tenga abajo nulls, los necesito para que no de errores al llamar a metodos
        Normal pasajero_normal_1 = null;
        Ruta ruta = null;

        // Login --------------------------------------------------------------------------------
        Pasajero pasajero_1 = pasajero_null.inicio(sc);
        if (pasajero_1.getEdad() >= 18){
            do {
                System.out.print("\n* * * * * * * * * Sistema de Tickets * * * * * * * * * ");
                System.out.print("\n1. Definir clase \n2. Definir ruta \n3. Informacion de selecciones \n4. Aceptar compra \n0. Salir");
                System.out.print("\nSeleccione una opcion (0 para salir): "); opcion_nivel_1 = sc.nextInt(); sc.nextLine();
                switch (opcion_nivel_1){
                    case 1:
                        if (pasajero_1.definir_clase(pasajero_1,sc)){
                            VIP pasajero_vip_null = new VIP(pasajero_1.getNombre(),pasajero_1.getEdad(),true,null,0,false, null);
                            pasajero_vip_1 = pasajero_vip_null.llenar_datos_faltantes(pasajero_1.getNombre(), pasajero_1.getEdad(), true, sc);
                        }
                        else {
                            Normal pasajero_normal_null = new Normal(pasajero_1.getNombre(), pasajero_1.getEdad(), false, null, 0, false);
                            pasajero_normal_1 = pasajero_normal_null.llenar_datos_faltantes(pasajero_normal_null.getNombre(), pasajero_normal_null.getEdad(), false, sc);
                        }
                        break;
                    case 2:
                            ruta = ruta_null.inicializacion_de_ruta(sc);
                        break;
                    case 3:
                        if (pasajero_vip_1 != null){
                            pasajero_vip_1.ver_resumen();
                        }
                        else if (pasajero_normal_1 != null){
                            pasajero_normal_1.ver_resumen();;
                        }
                        else {
                            System.out.print("Pasajero no definido");
                        }
                }
            }  while (opcion_nivel_1 != 0);
        }
        else {
            System.out.print("\nMenores de edad no deberian acceder a este sitio");
        }

    }
}