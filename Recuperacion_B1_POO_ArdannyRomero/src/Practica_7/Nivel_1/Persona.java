package Practica_7.Nivel_1;

public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void mostrar_datos();

    public boolean validacion() {
        String edad_str = String.valueOf(edad);
        if (nombre != null && !nombre.trim().isEmpty() && edad  >= 18 && !edad_str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
