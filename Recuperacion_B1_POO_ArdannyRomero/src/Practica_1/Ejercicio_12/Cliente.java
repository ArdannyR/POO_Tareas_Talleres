package Practica_1.Ejercicio_12;

public class Cliente {
    public int codigo_cliente;
    public boolean activo = true;
    private String nombre = "";
    private String telefono = "";

    public Cliente( boolean activo, String nombre, String telefono) {
        this.codigo_cliente = codigo_cliente;
        this.activo = activo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void ver_cliente(){
        System.out.printf("El cliente de codigo %d se llama '%s' y su contacto es %s\nEstado de cuenta activo: %b", codigo_cliente, nombre, telefono, activo);
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
}
