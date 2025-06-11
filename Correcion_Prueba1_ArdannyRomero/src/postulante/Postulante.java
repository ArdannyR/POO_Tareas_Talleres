package postulante;

public class Postulante {
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String correoElectronico;
    private String nacionalidad;
    private int condicionSocioeconomica;
    private String carreraUniversitaria;
    private double promedioAcademico;

    public Postulante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Postulante(String nombre, String apellido, String carreraUniversitaria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carreraUniversitaria = carreraUniversitaria;
    }

    public Postulante(String nombre, String apellido, int edad, String telefono, String correoElectronico, String nacionalidad, int condicionSocioeconomica, String carreraUniversitaria, double promedioAcademico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.nacionalidad = nacionalidad;
        this.condicionSocioeconomica = condicionSocioeconomica;
        this.carreraUniversitaria = carreraUniversitaria;
        this.promedioAcademico = promedioAcademico;
    }

    // Métodos get y set para todos los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCondicionSocioeconomica() {
        return condicionSocioeconomica;
    }
    public void setCondicionSocioeconomica(int condicionSocioeconomica) {
        this.condicionSocioeconomica = condicionSocioeconomica;
    }

    public String getCarreraUniversitaria() {
        return carreraUniversitaria;
    }
    public void setCarreraUniversitaria(String carreraUniversitaria) {
        this.carreraUniversitaria = carreraUniversitaria;
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }
    public void setPromedioAcademico(double promedioAcademico) {
        this.promedioAcademico = promedioAcademico;
    }

    private boolean cumpleRequisitos() {
        if (condicionSocioeconomica == 1 && edad >= 18 && promedioAcademico > 85){
            return true;
        }
        else {
            return false;
        }
    }

    public void mostrarDatos() {
        if (cumpleRequisitos()) {
            System.out.println("\n---------- Postulante Apto ----------");
            System.out.printf("Nombre: %s %s \nEdad: %d \nCarrera: %s \nPromedio: %.2f \nNacionalidad: %s \nCondición socioeconómica: %d \n", nombre, apellido, edad, carreraUniversitaria, promedioAcademico, nacionalidad, condicionSocioeconomica);
        } else {
            System.out.println("\n---------- Postulante No Apto ----------");
            System.out.println("El postulante no cumple los requisitos para aplicar a la beca... :(\n");
        }
    }
}

