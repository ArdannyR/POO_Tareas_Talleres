package Participantes;

public class Participantes {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correo_electronico;
    private String nacionalidad;
    private boolean certificado_medico;
    private boolean terminos_y_condiciones;

    // Constructores sobrecargados
    public Participantes(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Participantes(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Participantes(String nombre, int edad, String apellido, String telefono, String correo_electronico, String nacionalidad, boolean certificado_medico, boolean terminos_y_condiciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.nacionalidad = nacionalidad;
        this.certificado_medico = certificado_medico;
        this.terminos_y_condiciones = terminos_y_condiciones;
    }

    // Métodos get y set
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo_electronico() { return correo_electronico; }
    public void setCorreo_electronico(String correo_electronico) { this.correo_electronico = correo_electronico; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public boolean getCertificado_medico() { return certificado_medico; }
    public void setCertificado_medico(boolean certificado_medico) { this.certificado_medico = certificado_medico; }

    public boolean getTerminos_y_condiciones() { return terminos_y_condiciones; }
    public void setTerminos_y_condiciones(boolean terminos_y_condiciones) { this.terminos_y_condiciones = terminos_y_condiciones; }

    // Metodos aparte
    public boolean cumpleRequisitos(int edad, boolean certificado_medico, boolean terminos_y_condiciones) {
        if (edad >= 18 && edad <= 50 && certificado_medico && terminos_y_condiciones) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarDatos() {
        if (cumpleRequisitos(this.edad, this.certificado_medico, this.terminos_y_condiciones)) {
            System.out.printf("----Participante Inscrito----\nNombre: %s\nEdad: %d\nTelefono: %s\nNacionalidad: %s\n", this.nombre, this.edad, this.telefono, this.nacionalidad);
        }
        else {
            System.out.printf("----Participante Inscrito----\n * No se han cumplido los requisitos...\n");
        }
    }
}
