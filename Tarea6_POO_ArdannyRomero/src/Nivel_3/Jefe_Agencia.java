package Nivel_3;

import Nivel_2.Cliente;
import Nivel_2.Empleado;

public class Jefe_Agencia extends Empleado {
    public Jefe_Agencia(String usuario, String clave) {
        super("JefeAgencia", usuario, clave);
    }

    public boolean aprobarPrestamo(Cliente cliente, double monto) {
        if (cliente.getMonto_base() >= monto * 0.2) { // Ejemplo: debe tener 20% del préstamo en saldo
            System.out.printf("Préstamo de %.2f aprobado para %s\n", monto, cliente.getNombre());
            return true;
        } else {
            System.out.println("Préstamo rechazado: el cliente no cumple con los requisitos.");
            return false;
        }
    }

    public void generarReporteOperaciones() {
        System.out.println("Generando reporte de operaciones del día...");
        // Aquí podrías agregar lógica real si llevas registros de operaciones
    }

    public void evaluarEmpleado(Empleado empleado) {
        System.out.printf("Evaluación del empleado %s con rol %s: desempeño adecuado.\n", empleado.getNombre(), empleado.getRol());
        // Puedes agregar métricas si implementas historial de operaciones
    }
}
