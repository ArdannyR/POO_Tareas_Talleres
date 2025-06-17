package Practica_5.Ejercicio_3.Nivel_2;

import Practica_5.Ejercicio_3.Nivel_1.Transporte;

public class Taxi extends Transporte {
    private double velocidad = 50; // km/h
    private double tiempo = 1.5;   // h

    @Override
    public void iniciarViaje() {
        System.out.print("\n* Taxi encendido *");
    }

    @Override
    public double calcularDistancia() {
        return velocidad * tiempo;
    }
}