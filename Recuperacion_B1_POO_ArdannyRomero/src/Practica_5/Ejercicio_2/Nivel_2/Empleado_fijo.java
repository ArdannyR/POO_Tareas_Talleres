package Practica_5.Ejercicio_2.Nivel_2;

import Practica_5.Ejercicio_2.Nivel_1.Empleado;

public class Empleado_fijo extends Empleado {
    private double salario_base;

    public Empleado_fijo(String nombre, double salario_base) {
        super(nombre);
        this.salario_base = salario_base;
    }

    @Override
    public double calcular_salario() {
        return salario_base;
    }

    @Override
    public void mostrar_datos() {
        System.out.printf("\nEmpleado: %s - Tipo: Fijo - Salario: %.2f", nombre, calcular_salario());
    }

    public void aplicar_bono() {
        if (salario_base > 400) {
            salario_base += 50;
        }
    }
}

