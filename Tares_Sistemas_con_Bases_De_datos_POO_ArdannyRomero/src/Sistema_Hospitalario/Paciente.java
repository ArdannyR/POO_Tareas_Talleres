package Sistema_Hospitalario;

public class Paciente {
    private String cedula;
    private int nHistorialClinico;
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String descripcionEnfermedad;

    public Paciente(String cedula, int nHistorialClinico, String nombre, String apellido, String telefono, int edad, String descripcionEnfermedad) {
        this.cedula = cedula;
        this.nHistorialClinico = nHistorialClinico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.descripcionEnfermedad = descripcionEnfermedad;
    }

    public String getCedula() { return cedula; }
    public int getnHistorialClinico() { return nHistorialClinico; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }
    public int getEdad() { return edad; }
    public String getDescripcionEnfermedad() { return descripcionEnfermedad; }

    public String getInfoCompleta() {
        return String.format(
                "--- Ficha del Paciente ---\n" +
                        "Cédula: %s\n" +
                        "N° Historial: %d\n" +
                        "Nombre: %s %s\n" +
                        "Teléfono: %s\n" +
                        "Edad: %d\n" +
                        "Descripción: %s",
                cedula, nHistorialClinico, nombre, apellido, telefono, edad, descripcionEnfermedad
        );
    }
}
