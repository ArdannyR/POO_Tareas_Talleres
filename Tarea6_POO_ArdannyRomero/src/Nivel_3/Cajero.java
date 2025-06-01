package Nivel_3;

import Nivel_2.Cliente;
import Nivel_2.Empleado;

public class Cajero extends Empleado {
    public Cajero(String usuario, String clave) {
        super("Cajero", usuario, clave);
    }

    public void procesarRetiro(Cliente cliente, double monto) {
        if (cliente.getMonto_base() >= monto) {
            cliente.setMonto_base(cliente.getMonto_base() - monto);
            System.out.printf("Retiro de %.2f procesado. Nuevo saldo: %.2f\n", monto, cliente.getMonto_base());
        } else {
            System.out.println("Saldo insuficiente para procesar el retiro.");
        }
    }

    public void consultarSaldo(Cliente cliente) {
        System.out.printf("Saldo actual del cliente %s: %.2f\n", cliente.getNombre(), cliente.getMonto());
    }

    public void procesarDeposito(Cliente cliente, double monto) {
        cliente.setMonto_base(cliente.getMonto_base() + monto);
        System.out.printf("Depósito de %.2f realizado. Nuevo saldo: %.2f\n", monto, cliente.getMonto());
    }
}

