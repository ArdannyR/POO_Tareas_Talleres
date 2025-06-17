package Practica_6.Ejercicio_2.Nivel_3;

import Practica_6.Ejercicio_2.Nivel_1.Cuenta_Bancaria;

public class Cuenta_corriente extends Cuenta_Bancaria {
    private double sobregiro;

    public Cuenta_corriente(String numero, double saldo, double sobregiro) {
        super(numero, saldo);
        this.sobregiro = sobregiro;
    }

    @Override
    public void mostrar_datos() {
        System.out.printf("\nCuenta Corriente - ");
        super.mostrar_datos();
        System.out.printf(" - Límite sobregiro: %.2f", sobregiro);
    }
}
