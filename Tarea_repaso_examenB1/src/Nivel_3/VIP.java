package Nivel_3;

import Nivel_2.Servicio;

import java.util.Scanner;

public class VIP extends Servicio {
    public String asientos;
    public int maletas;
    public boolean maletas_extra;
    public String servicios_adicionales;

    public VIP(String nombre, int edad, boolean clase, String asientos, int maletas, boolean maletas_extra, String servicios_adicionales) {
        super(nombre, edad, clase);
        this.asientos = asientos;
        this.maletas = maletas;
        this.maletas_extra = maletas_extra;
        this.servicios_adicionales = servicios_adicionales;
    }

    @Override
    public void ver_resumen(){
        String str_clase = "VIP";
        System.out.printf("\n* * * * * * * * * * *\nPasajero: %s \nEdad: %d \nClase: %s \nAsientos: %s \nMaletas: %d \nMaletas extras: %b \nServicios adicionales: Televisión, internet y %s\n * * * * * * * * * * *\n", getNombre(), getEdad(), str_clase, this.asientos, this.maletas, this.maletas_extra, this.servicios_adicionales);
    }

    @Override
    public VIP llenar_datos_faltantes(String nombre, int edad, boolean clase, Scanner sc){
        System.out.print("Ingrese la localizacion de sus asientos: "); asientos = sc.nextLine();
        System.out.print("Clase VIP solo puede llevar 2 maleta, desea colocar una extra (si o no): "); String maleta_extra = sc.nextLine();
        if (maleta_extra.equals("si")){ // al parecer entre string el == no sirve
            System.out.print("Ingrese numero de maletas: "); maletas = sc.nextInt(); sc.nextLine();
            while (maletas <=2) {
                System.out.print("Error! Ingrese numero de maletas: "); maletas = sc.nextInt(); sc.nextLine();
            }
            this.maletas_extra = true;
        }
        else {
            this.maletas = 2;
            this.maletas_extra = false;
        }
        System.out.print("\nServicios disponibles: \n- Refrigerio \n- Baños exclusivos  \n- Revistas \n- Ninguno");
        System.out.print("\nClase VIP ya cuenta con television e internet, por favor ingrese 2 servicios mas: "); servicios_adicionales = sc.nextLine();
        return new VIP(nombre,edad,clase,this.asientos,this.maletas,this.maletas_extra,this.servicios_adicionales);
    }
}
