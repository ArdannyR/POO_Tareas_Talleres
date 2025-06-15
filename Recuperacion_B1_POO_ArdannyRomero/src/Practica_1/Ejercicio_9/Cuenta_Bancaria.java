package Practica_1.Ejercicio_9;

public class Cuenta_Bancaria {
    private String titular = "";
    private double saldo = 0;

    public Cuenta_Bancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}
    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
}
