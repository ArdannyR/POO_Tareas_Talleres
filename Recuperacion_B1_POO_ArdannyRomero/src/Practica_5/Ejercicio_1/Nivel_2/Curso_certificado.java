package Practica_5.Ejercicio_1.Nivel_2;

import Practica_5.Ejercicio_1.Nivel_1.Curso;

public class Curso_certificado extends Curso {
    public double costoBase;
    public double recargo;

    public Curso_certificado(String nombre, double costoBase, double recargo) {
        super(nombre);
        this.costoBase = costoBase;
        this.recargo = recargo;
    }

    @Override
    public double calcular_costo() {
        return costoBase + recargo;
    }
}