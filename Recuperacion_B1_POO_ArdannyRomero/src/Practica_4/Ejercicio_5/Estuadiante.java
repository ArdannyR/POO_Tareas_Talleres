package Practica_4.Ejercicio_5;

public class Estuadiante {
    private double nota;

    public Estuadiante(double nota){
        this.nota = nota;
    }

    public boolean comprobar_nota(double nota){
        if (nota >= 0 && nota <= 10){
            return true;}
        else {
            return false;}
    }

    public double getNota() {return nota;}
    public void setNota(double nota) {this.nota = nota;}
}
