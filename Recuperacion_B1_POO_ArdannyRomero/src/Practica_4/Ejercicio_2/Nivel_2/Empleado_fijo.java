package Practica_4.Ejercicio_2.Nivel_2;

import Practica_4.Ejercicio_2.Nivel_1.Empleado;

public class Empleado_fijo extends Empleado {
    protected double salario;

    public Empleado_fijo(double salario) {
        this.salario = salario;
    }

    @Override
    public double sueldo(){
        return salario;
    }
}
