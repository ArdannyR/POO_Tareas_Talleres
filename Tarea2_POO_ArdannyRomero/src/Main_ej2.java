import static java.lang.System.out; //Clase para no usar System.out -> .out

public class Main_ej2 {
    public static void main(String[] args) {
        out.printf("\nHola! Esto estoy haciendo desde clases ");

        Empleado Empleado_1 = Empleado.ingresar_datos();
        Empleado_1.datos_empleado();

        Empleado Empleado_2 = Empleado.ingresar_datos();
        Empleado_2.datos_empleado();

        Empleado Empleado_3 = Empleado.ingresar_datos();
        Empleado_3.datos_empleado();

    }
}