package Practica_6.Ejercicio_3.Nivel_2;

import Practica_6.Ejercicio_3.Nivel_1.Vehiculo;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.print(" - Vehículo liviano");
    }
}
