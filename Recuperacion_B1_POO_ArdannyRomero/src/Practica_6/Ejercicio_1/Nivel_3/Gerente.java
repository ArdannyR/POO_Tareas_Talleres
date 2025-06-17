package Practica_6.Ejercicio_1.Nivel_3;

import Practica_6.Ejercicio_1.Nivel_2.Empleado;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, int edad, double salario, double bono) {
        super(nombre, edad, salario);
        this.bono = (salario > 800) ? bono : 0;
        if (salario <= 800) {
            System.out.printf("\nAdvertencia: A %s no se le aplica bono porque el salario es %.2f\n", nombre, salario);
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf(" - Bono: %.2f - Total: %.2f", bono, salario + bono);
    }
}
