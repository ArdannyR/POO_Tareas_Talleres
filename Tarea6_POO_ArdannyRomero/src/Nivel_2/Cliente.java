package Nivel_2;

import Nivel_1_Persona.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Persona {
    boolean cuenta_activa;
    String nombre_cuenta;
    String tipo_cuenta;
    double monto;
    String num_tarjeta_credito;
    private double monto_base; // Este tampoco era necesario, pero... quiero que el codigo tenga sentido :/

    public List<List<String>> cuentas = new ArrayList<>(); // Esta es una lista de listas (matriz) Se que no hemos visto esto a profundidad en clases, mas la anteior se nos dios libertad a indagar y suarlas
    public List<Double> acumulacion_montos = new ArrayList<>(); // Esta lista lo la tenia previsto pero la agrego para el resumane financiero
    // Funcionamiento
    // Lista<String> usuario = new ArrayList<>();
    // usuario.add("alguna info")
    // cuentas.add(usuario)

    // Dato importante: no es lo mismo double que Double, en listas debes de especificar con mayuscula
    // double es un tipo primitivo, Double es de los tipos de referencia (Gracias ChatGPT aprender es divertido :D)

    //Ojala pronto veamos algo como diccionarios para el manejo de estos datos :D

    public Cliente(String nombre, String cedula, String direccion, String telefono) { // Dejo solo esos datos a pedir ya que lo otro dependera de los metodos
        super(nombre, cedula, direccion, telefono);
        this.cuenta_activa = false;
        this.nombre_cuenta = nombre_cuenta;
        this.tipo_cuenta = tipo_cuenta;
        this.monto = monto;
        this.num_tarjeta_credito = num_tarjeta_credito;
        this.monto_base = 0;
    }

    @Override
    public void mostrar_rol() {
        System.out.printf("\nRol: %s\n", tipo_cuenta);
    }

    public boolean ingresar_al_sistema(){
        this.cuenta_activa = true;
        System.out.println("\nIngreso al sistema exitoso.");
        return true;
    }

    public void registrar_cuenta(String tipo_cuenta) {
        if (this.cuenta_activa) {
            List<String> cuenta_nueva = new ArrayList<>();
            System.out.printf("Ingrese el nombre de la cuenta para poder ser identificada: ");this.nombre_cuenta = sc.nextLine();

            cuenta_nueva.add(this.nombre_cuenta);
            cuenta_nueva.add(tipo_cuenta);

            this.cuentas.add(cuenta_nueva); // Añade la "fila" a la matriz principal de cuentas

            System.out.printf("Tu cuenta de tipo %s ha sido registrada exitosamente.\n", tipo_cuenta);
        } else {
            System.out.println("Por favor, ingresa primero al sistema antes de registrar una cuenta.");
        }
    }

    public void solicitar_prestamo(double monto){
        if (monto > 0 & this.cuenta_activa){
            System.out.printf("Su solicitud de préstamo por $%.2f ha sido enviada a revisión.\n", monto);
            acumulacion_montos.add(monto);
        }
        else{
            System.out.print("Error\n");
        }
    }

    public void agregar_tarjeta_credito(String num_tarjeta_credito){
        System.out.print("Por favor, ingrese el nombre de la cuenta a la que desea agregar la tarjeta de credito: "); String cuenta_buscada = sc.nextLine();
        boolean cuenta_existente = false;

        for (int i = 0; i < cuentas.size(); i++) {
            List<String> cuenta_actual = cuentas.get(i); // Obtengo el indice
            String str_cuenta_actual = cuenta_actual.get(i); // Transformo en string pada porder comparar
                if (cuenta_buscada.equalsIgnoreCase(str_cuenta_actual)) { // Compara los nombres (ignorando mayúsculas/minúsculas) al parecer para esto esta el .equalsIgnoreCase
                    cuenta_actual.add(num_tarjeta_credito);
                    System.out.printf("Tarjeta de crédito '%s' agregada a la cuenta de nombre '%s'.\n", num_tarjeta_credito, cuenta_buscada);
                    cuenta_existente = true;
                    break; // Sale del bucle porque ya encontramos y modificamos la cuenta
                }
        }
        if (!cuenta_existente){
            System.out.printf("No se encontró ninguna cuenta con el nombre '%s'.\n", cuenta_buscada);
        }
    }

    public void ver_resumen_financiero(){
        if (acumulacion_montos.isEmpty()){
            System.out.print("\nNo hay nada... \nIntenta solicitar un prestamo \n");
        }
        System.out.printf("\nTu monto actual es de $%d\nAun esta en revision los pedidos de: ", this.monto_base);
        for (int i = 0; i < acumulacion_montos.size(); i++) {
            System.out.printf("Monto %d: %d\n", i + 1, acumulacion_montos.get(i)); // Recorrer con un for y imprimir por indices, esto es basico
        }
    }

    public Cliente datos(){ // Este metodo no es parte del deber pero lo coloco para ahorrar lineas
        System.out.print("\nNesecitamos que ingrese sus datos... pls\n");
        System.out.print(" -- Nombre: "); String nombre = sc.nextLine();
        System.out.print(" -- Cedula: "); String cedula = sc.nextLine();
        System.out.print(" -- Direccion: "); String direccion = sc.nextLine();
        System.out.print(" -- Telefono: "); String telefono = sc.nextLine();
        Cliente cliente_de_prueba = new Cliente(nombre, cedula, direccion, telefono);
        return cliente_de_prueba; // Descubir que colocando la clase se hace un metodo que retoner objetos. Los objetos chocan?
    }

}

