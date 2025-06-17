package Practica_6.Ejercicio_2.Nivel_1;

public class Cuenta_Bancaria {
    protected String numero;
    protected double saldo;

    public Cuenta_Bancaria(String numero, double saldo) {
        if (validar_numero(numero)) {
            this.numero = numero;
        } else {
            this.numero = "N/A";
        }
        this.saldo = saldo;
    }

    public boolean validar_numero(String numero) {
        if (numero == null || numero.trim().isEmpty()) {
            System.out.println("Error: Número de cuenta inválido");
            return false;
        }
        return true;
    }

    public void mostrar_datos() {
        System.out.printf("Cuenta N°: %s - Saldo: %.2f", numero, saldo);
    }
}
