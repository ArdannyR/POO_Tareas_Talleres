package Practica_1;

import Practica_1.Ejercicio_1.Producto;
import Practica_1.Ejercicio_10.Empleado;
import Practica_1.Ejercicio_11.Vehiculo;
import Practica_1.Ejercicio_12.Cliente;
import Practica_1.Ejercicio_13.Pelicula;
import Practica_1.Ejercicio_3.Persona;
import Practica_1.Ejercicio_4.Cuenta;
import Practica_1.Ejercicio_5.Registro;
import Practica_1.Ejercicio_6.Estudiante;
import Practica_1.Ejercicio_8.Libro;
import Practica_1.Ejercicio_9.Cuenta_Bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancias de ayuda
        Scanner sc = new Scanner(System.in);
        // ñ   el Alt + 0241 no me sirve en IJ

        // Instancias
        Producto producto = new Producto();
        Practica_1.Ejercicio_2.Estudiante estudiante = new Practica_1.Ejercicio_2.Estudiante();
        Persona persona = new Persona(0);
        Cuenta cuenta = new Cuenta(null);
        Registro registro = new Registro();
        Estudiante estudiante_ej6 = new Estudiante("","");
        Practica_1.Ejercicio_7.Producto producto_ej7 = new Practica_1.Ejercicio_7.Producto("",0); // Se fueron 2 clases prod, pero como les tenia en diferentes packages me permitio llamar con punto
        Libro libro = new Libro("",0);
        Cuenta_Bancaria cuentaBancaria = new Cuenta_Bancaria("",0);
        Empleado empleado = new Empleado("Ventas","",0);
        Vehiculo vehiculo = new Vehiculo("Automóvil", 0,"","Toyota");
        Cliente cliente = new Cliente(true,"","");
        Pelicula pelicula = new Pelicula("", 2024, "", 0);

        // Variables
        String matricula_ej2;
        int edad_ej3;
        String password_ej4;
        String nombre_ej6;
        String carrera_ej6;
        String nombre_ej7;
        double precio_ej7;
        String titulo_ej8;
        int año_publicacion_ej8;
        String titular_ej9;
        double saldo_ej9;
        String nombre_ej10;
        double salario_ej10;
        String placa_ej11;
        String nombre_ej12;
        String telefono_ej12;
        String director_ej13;
        double duracion_ej13;

        // Ejercicio 1
        System.out.print("\n\n * * * * Ejercicio 1 * * * * ");
        System.out.printf("\nNombre del producto es %s", producto.getNombre());

        // Ejercicio 2
        System.out.print("\n\n * * * * Ejercicio 2 * * * * ");
        System.out.print("\nIngresa el codigo de matricula: "); matricula_ej2 = sc.nextLine(); // 2025A001 (para no olvidarme)
        if (matricula_ej2.equals("2025A001")) {
            estudiante.setMatricula(matricula_ej2);
            System.out.print("La matricula ha sido registrada");}
        else {
            System.out.print("Lo siento, no se ha podido registrar esa matricula");}

        // Ejercicio 3
        System.out.print("\n\n * * * * Ejercicio 3 * * * * ");
        System.out.print("\nIngresa la edad de la persona: "); edad_ej3 = sc.nextInt(); sc.nextLine(); persona.setEdad(edad_ej3);
        System.out.printf("La edad de la persona es de %d años", persona.getEdad());

        // Ejercicio 4
        System.out.print("\n\n * * * * Ejercicio 4 * * * * ");
        System.out.print("\nIngresa una contraseña: "); password_ej4 = sc.nextLine(); cuenta.setPassword(password_ej4);
        if (!password_ej4.isEmpty()){ // Si esque la contrasena no esta vacia (el if no era necesario pero me dio por investigar)
            System.out.print("Tu contraseña ha sido guardada exitosamente");}

        // Ejercicio 5
        System.out.print("\n\n * * * * Ejercicio 5 * * * * ");
        System.out.printf("\nTu codigo de registro es %s", registro.getCodigo());

        // Ejercicio 6
        System.out.print("\n\n * * * * Ejercicio 6 * * * * ");
        System.out.print("\nIngresa nombre del estudiante: "); nombre_ej6 = sc.nextLine(); estudiante_ej6.setNombre(nombre_ej6);
        System.out.print("Ingresa carrera del estudiante: "); carrera_ej6 = sc.nextLine(); estudiante_ej6.setCarrera(carrera_ej6);
        System.out.printf("El/la estudiante %s pertenece a la carrera de %s", estudiante_ej6.getNombre(), estudiante_ej6.getCarrera());

        // Ejercicio 7
        System.out.print("\n\n * * * * Ejercicio 7 * * * * ");
        System.out.print("\nIngresa nombre del producto: "); nombre_ej7 = sc.nextLine(); producto_ej7.setNombre(nombre_ej7);
        System.out.print("Ingresa el precio del producto: "); precio_ej7 = sc.nextDouble(); sc.nextLine(); producto_ej7.setPrecio(precio_ej7);
        System.out.printf("%s tiene un precio de $%.2f", producto_ej7.getNombre(), producto_ej7.getPrecio());

        // Ejercicio 8
        System.out.print("\n\n * * * * Ejercicio 8 * * * * ");
        System.out.print("\nIngresa titulo del libro: "); titulo_ej8 = sc.nextLine(); libro.setTitulo(titulo_ej8);
        System.out.print("Ingresa el año de publicacion del libro: "); año_publicacion_ej8 = sc.nextInt(); sc.nextLine(); libro.setAño_de_publicacion(año_publicacion_ej8);
        System.out.printf("La obra '%s' fue pulicada en el año de %d", libro.getTitulo(),libro.getAño_de_publicacion());

        // Ejercicio 9
        System.out.print("\n\n * * * * Ejercicio 9 * * * * ");
        System.out.print("\nIngresa titular relacionado a la cuenta: "); titular_ej9 = sc.nextLine(); cuentaBancaria.setTitular(titular_ej9);
        System.out.print("Ingresa saldo almacenado en la cuenta: "); saldo_ej9 = sc.nextDouble(); sc.nextLine(); cuentaBancaria.setSaldo(saldo_ej9);
        System.out.printf("La cuenta titulada %s posee un saldo almacenado de $%.2f", cuentaBancaria.getTitular(), cuentaBancaria.getSaldo());

        // Ejercicio 10
        System.out.print("\n\n * * * * Ejercicio 10 * * * * ");
        System.out.print("\nIngresa el horario del empleado: "); empleado.horario = sc.nextLine();
        System.out.print("Ingresa el nombre del empleado: "); nombre_ej10 = sc.nextLine(); empleado.setNombre(nombre_ej10);
        System.out.print("Ingresa el salario del empleado: "); salario_ej10 = sc.nextDouble(); sc.nextLine(); empleado.setSalario(salario_ej10);
        System.out.printf("El empleado/a %s del departamento de %s, trabaja en el horario de %s y gana un salario de $%.2f", empleado.getNombre(), empleado.departamento, empleado.horario, empleado.getSalario() );

        // Ejercicio 11
        System.out.print("\n\n * * * * Ejercicio 11 * * * * ");
        System.out.print("\nIngresa la velocidad maxima del vehiculo: "); vehiculo.velocidad_maxima = sc.nextInt(); sc.nextLine();
        System.out.print("Ingresa la placa del vehiculo: "); placa_ej11 = sc.nextLine(); vehiculo.setPlaca(placa_ej11);
        vehiculo.mostrar_info();

        // Ejercicio 12
        System.out.print("\n\n * * * * Ejercicio 12 * * * * ");
        System.out.print("\nIngresa el codigo del cliente: "); cliente.codigo_cliente = sc.nextInt(); sc.nextLine();
        System.out.print("Ingresa el nombre del cliente: "); nombre_ej12 = sc.nextLine(); cliente.setNombre(nombre_ej12);
        System.out.print("Ingresa el telefono del cliente: "); telefono_ej12 = sc.nextLine(); cliente.setTelefono(telefono_ej12);
        cliente.ver_cliente();

        // Ejercicio 13
        System.out.print("\n\n * * * * Ejercicio 13 * * * * ");
        System.out.print("\nIngresa el titulo de la pelicula: "); pelicula.titulo = sc.nextLine();
        System.out.print("Ingresa el nombre del director de la pelicula: "); director_ej13 = sc.nextLine(); pelicula.setDirector(director_ej13);
        System.out.print("Ingresa la duracion de la pelicula en horas: "); duracion_ej13 = sc.nextDouble(); sc.nextLine(); pelicula.setDuracion(duracion_ej13);
        pelicula.mostrar_ficha(); // la duracion en double es para minutos o para horas? o era de hacer algun calculo?
    }
}