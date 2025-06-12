package Nivel_3;

import Nivel_2.Servicio;

import java.util.Scanner;

public class Normal extends Servicio {
    public String asientos;
    public int maletas;
    public boolean maletas_extra;

    public Normal(String nombre, int edad, boolean clase, String asientos, int maletas, boolean maletas_extra) {
        super(nombre, edad, clase);
        this.asientos = asientos;
        this.maletas = maletas;
        this.maletas_extra = maletas_extra;
    }

    @Override
    public void ver_resumen(){
        String str_clase = "Normal";
        System.out.printf("\n* * * * * * * * * * *\nPasajero: %s \nEdad: %d \nClase: %s \nAsientos: %s \nMaletas: %d \nMaletas extras: %b\n* * * * * * * * * * *\n", getNombre(), getEdad(), str_clase, this.asientos, this.maletas, this.maletas_extra);
    }

    @Override
    public Normal llenar_datos_faltantes(String nombre, int edad, boolean clase, Scanner sc){
        System.out.print("Ingrese la localizacion de sus asientos: "); asientos = sc.nextLine();
        System.out.print("Clase normal solo puede llevar 1 maleta, desea colocar una extra (si o no): "); String maleta_extra = sc.nextLine();
        if (maleta_extra.equals("si")){
            System.out.print("Ingrese numero de maletas: "); maletas = sc.nextInt(); sc.nextLine();
            while (maletas <=1) {
                System.out.print("Error! Ingrese numero de maletas: "); maletas = sc.nextInt(); sc.nextLine();
            }
            this.maletas_extra = true;
        }
        else {
            this.maletas = 1;
            this.maletas_extra = false;
        }
        return new Normal(nombre,edad,clase,this.asientos,this.maletas,this.maletas_extra);
    }
}
