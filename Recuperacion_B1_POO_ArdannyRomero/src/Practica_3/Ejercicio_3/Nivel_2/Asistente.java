package Practica_3.Ejercicio_3.Nivel_2;

import Practica_3.Ejercicio_3.Nivel_1.Empleado;

public class Asistente extends Empleado{
    protected String papel;

    public Asistente(){
        this.papel = "asistente de la empresa";
    }

    @Override
    public void mostrar_info() {
        System.out.printf("%s",papel);
    }
}
