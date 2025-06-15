package Ejercicio_10;

public class Empleado {
    public String departamento = "Ventas";
    public String horario;
    private String nombre = "";
    private double salario = 0.0;

    public Empleado(String departamento, String nombre, double salario) {
        this.departamento = departamento;
        this.horario = horario;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}
}
