package Practica_1.Ejercicio_11;

public class Vehiculo {
    public String tipo = "Automóvil";
    public int velocidad_maxima;
    private String placa = "";
    private String marca = "Toyota";

    public Vehiculo(String tipo, int velocidad_maxima, String placa, String marca) {
        this.tipo = tipo;
        this.velocidad_maxima = velocidad_maxima;
        this.placa = placa;
        this.marca = marca;
    }

    public void mostrar_info(){
        System.out.printf("El %s %s de placa '%s' tiene una velocidad maxima de %d km/h", tipo, marca, placa, velocidad_maxima);
    }

    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
}
