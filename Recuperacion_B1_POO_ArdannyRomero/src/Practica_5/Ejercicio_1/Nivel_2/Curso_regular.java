package Practica_5.Ejercicio_1.Nivel_2;

import Practica_5.Ejercicio_1.Nivel_1.Curso;

public class Curso_regular extends Curso {
    public double costoBase;

    public Curso_regular(String nombre, double costoBase) {
        super(nombre);
        this.costoBase = costoBase;
    }

    @Override
    public double calcular_costo() {
        return costoBase;
    }
}
