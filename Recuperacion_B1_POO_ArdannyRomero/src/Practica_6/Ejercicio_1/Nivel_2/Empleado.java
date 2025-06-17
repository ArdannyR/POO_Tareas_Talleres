package Practica_6.Ejercicio_1.Nivel_2;

import Practica_6.Ejercicio_1.Nivel_1.Persona;

public class Empleado extends Persona {
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("\nSalario: %.2f", salario);
    }
}