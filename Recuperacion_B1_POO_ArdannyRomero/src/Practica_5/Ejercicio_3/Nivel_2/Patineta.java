package Practica_5.Ejercicio_3.Nivel_2;

import Practica_5.Ejercicio_3.Nivel_1.Transporte;

public class Patineta extends Transporte {
    private double velocidad = 10; // km/h
    private double tiempo = 1.0;   // h

    @Override
    public void iniciar_viaje() {
        System.out.print("\n* Patineta activada *");
    }

    @Override
    public double calcular_distancia() {
        return velocidad * tiempo;
    }
}
