public class Juagdor {
    String nombre;
    int numero_identificador;
    String posicion;
    int edad;

    public Juagdor (String nombre, int numero_identificador, String posicion, int edad) {
        this.nombre = nombre;
        this.numero_identificador = numero_identificador;
        this.posicion = posicion;
        this.edad = edad;
    }

    public void presentacion() {
        System.out.printf("\n---Con %d años de edad, el numero %d en la posicion de %s: %s!",edad,numero_identificador,posicion,nombre);
    }
}