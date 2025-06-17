package Practica_6.Ejercicio_2.Nivel_2;

import Practica_6.Ejercicio_2.Nivel_1.Cuenta_Bancaria;

public class Cuenta_ahorros extends Cuenta_Bancaria {
    private double interes;

    public Cuenta_ahorros(String numero, double saldo, double interes) {
        super(numero, saldo);
        this.interes = interes;
    }

    public void aplicar_interes() {
        saldo += saldo * (interes / 100);
    }

    @Override
    public void mostrar_datos() {
        aplicar_interes();
        System.out.printf("\nCuenta de Ahorros - ");
        super.mostrar_datos();
    }
}
