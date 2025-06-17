package Practica_5.Ejercicio_2.Nivel_2;

import Practica_5.Ejercicio_2.Nivel_1.Empleado;

public class Empleado_por_comision extends Empleado {
    private double ventas;
    private double comision;

    public Empleado_por_comision(String nombre, double ventas, double comision) {
        super(nombre);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcular_salario() {
        return ventas + (ventas * comision);
    }

    @Override
    public void mostrar_datos() {
        System.out.printf("\nEmpleado: %s - Tipo: Por Comisión - Salario: %.2f", nombre, calcular_salario());
    }

    public void aplicar_bono() {
        if (ventas > 1000) {
            ventas += 100;
        }
    }
}