package Practica_4.Ejercicio_2.Nivel_2;

import Practica_4.Ejercicio_2.Nivel_1.Empleado;

public class Empleado_por_horas extends Empleado {
    protected int tarifa;
    protected int horas;

    public Empleado_por_horas(int tarifa, int horas) {
        this.tarifa = tarifa;
        this.horas = horas;
    }

    @Override
    public double sueldo(){
        return tarifa * horas;
    }
}
