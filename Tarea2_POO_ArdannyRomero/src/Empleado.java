import java.util.Scanner;

public class Empleado {
    String nombre;
    double salario;
    String cargo;
    /* Todo esto da la fecha de ingreso (no se porque este comentario esta en verde)*/
    int dia;
    int mes;
    int año;

    public Empleado(String nombre, double salario, String cargo, int dia, int mes ,int año) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    //Profe si lee esto, espero que me deje usar este codigo.
    //Principalemte buscaba algo que no usara un objeto desde el inicio con el fin de no repetir los Scanners a cada rato, y termine encontrando esto
    //Nota explicatoria: "Public static" es un metodo el cual no inicializa con un objeto y que me permite devolver/crear un objeto
    public static Empleado ingresar_datos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n---------------------------------------\nPorfavor llene los siguientes apartados con los datos del empleado");
        System.out.print("Nombre: "); String nombre = sc.nextLine();
        System.out.print("Salario: "); double salario = sc.nextDouble(); sc.nextLine();
        while (salario <= 0 ) {
            System.out.print("Error con salario negativo/nulo! Salario: ");salario = sc.nextDouble(); sc.nextLine();
        }

        System.out.print("Cargo: "); String cargo = sc.nextLine();
        System.out.println("Fecha de ingreso: ");
        System.out.print("Dia: "); int dia = sc.nextInt(); sc.nextLine();
        while (dia <= 0 || dia > 31) {
            System.out.print("Numero de dia invalido. Dia: "); dia = sc.nextInt(); sc.nextLine();
        }
        System.out.print("Mes: "); int mes = sc.nextInt(); sc.nextLine();
        while (mes <= 0 || mes > 12) {
            System.out.print("Numero de mes invalido. Mes: "); mes = sc.nextInt(); sc.nextLine();
        }
        System.out.print("Año: "); int año = sc.nextInt(); sc.nextLine();
        while (año <= 0 || año > 2025) {
            System.out.print("Numero de año invalido. Año: ");
            año = sc.nextInt();
            sc.nextLine();
        }
<<<<<<< HEAD
=======
        
>>>>>>> 12fd1f14e32b48e676002c5c033a5c1d54387578
        return new Empleado(nombre,salario,cargo,dia,mes,año);
    }

    public void datos_empleado() {
        System.out.printf("---------------------------------------\nDatos personales: %s es el/la %s\nSalario: %.2f$\nFecha de ingreso a la empresa: %d/%d/%d",nombre,cargo,salario,dia,mes,año);
        //Nota personal: en print con formato (printf) el %f es para double o float, el numero (.2) es para definir el numero de decimales
    }

}
