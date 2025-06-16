package Practica_4.Ejercicio_1.Nivel_2;

import Practica_4.Ejercicio_1.Nivel_1.Figura;

public class Cuadrado extends Figura {
    protected int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calular_area(){
        return lado * lado;
    }

}
