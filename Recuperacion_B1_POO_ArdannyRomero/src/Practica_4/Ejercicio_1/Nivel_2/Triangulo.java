package Practica_4.Ejercicio_1.Nivel_2;

import Practica_4.Ejercicio_1.Nivel_1.Figura;

public class Triangulo extends Figura {
    protected int base;
    protected int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calular_area(){
        return 0.5 * base * altura;
    }
}
