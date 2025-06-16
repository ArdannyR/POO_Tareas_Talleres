package Practica_3.Ejercicio_1.Nivel_2;

import Practica_3.Ejercicio_1.Nivel_1.Animal;

public class Perro extends Animal {
    protected String sonido;

    public Perro() {
        this.sonido = "Guau Guau!";
    }

    @Override
    public void hacer_sonido() {
        System.out.printf("%s",sonido);
    }
}
