package Practica_4.Ejercicio_4;

public class Persona {
    private int edad;

    public Persona(int edad){
        this.edad = edad;
    }

    public boolean comprobar_edad(int edad){
        if (edad >= 0){
            return true;}
        else {
            return false;}
    }

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
}
