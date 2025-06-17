package Practica_7.Nivel_2;

import Practica_7.Nivel_1.Persona;

public class Estudiante extends Persona {
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        super(nombre, edad);
        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public void mostrar_datos(){
        System.out.printf("\nNombre: %s - Edad: %d años - Carrera: %s - Promedio: %.2f/10", nombre, edad, carrera, promedio);
    }

    public boolean es_apto_beca(){
        if (promedio >= 8.5){
            return true;
        }
        return false;
    }

    /* // El deber pedia ests metodos pero ya esta lo de carrera... asi que no se si debo de implementar esto
    public void inscribir(String semestre){
        System.out.printf("\nSemestre: %s", semestre);
    }
    public void inscribir(String semestre, String modalidad){
        System.out.printf("\nSemestre: %s - Modalidad: %s", semestre, modalidad);
    }
    */

    // Get and set
    public String getCarrera() {return carrera;}
    public void setCarrera(String carrera) {this.carrera = carrera;}
    public double getPromedio() {return promedio;}
    public void setPromedio(double promedio) {this.promedio = promedio;}
}
