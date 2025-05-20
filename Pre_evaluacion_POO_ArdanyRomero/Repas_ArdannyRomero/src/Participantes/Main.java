package Participantes;

public class Main {
    public static void main(String[] args) {
        Participantes atleta_1 = new Participantes("Ardanny", "Romero");
        Participantes atleta_2 = new Participantes("Esau",20,"0997827246");
        Participantes atleta_3 = new Participantes("Andres",25,"Gonzalez", "5551234567", "andres.g@gmail.com", "mexicano", true, true);

        //Usando constructor con nombre y apellido
        atleta_1.setEdad(30);
        atleta_1.setTelefono("0987654321");
        atleta_1.setCorreo_electronico("ardanny.romero@example.com");
        atleta_1.setNacionalidad("ecuatoriana");
        atleta_1.setCertificado_medico(true);
        atleta_1.setTerminos_y_condiciones(true);

        //Datos
        System.out.println("\nAtleta 1:");
        atleta_1.mostrarDatos();
        System.out.printf(" * ¿Cumple requisitos? = %b\n", atleta_1.cumpleRequisitos(atleta_1.getEdad(), atleta_1.getCertificado_medico(), atleta_1.getTerminos_y_condiciones()));

        //Usando constructor con nombre, edad y teléfono
        atleta_2.setApellido("Villamar");
        atleta_2.setCorreo_electronico("esau.villamar@example.com");
        atleta_2.setNacionalidad("colomiana");
        atleta_2.setCertificado_medico(false);
        atleta_2.setTerminos_y_condiciones(false);

        //Datos
        System.out.println("\nAtleta 2:");
        atleta_2.mostrarDatos();
        System.out.printf(" * ¿Cumple requisitos? = %b\n", atleta_2.cumpleRequisitos(atleta_2.getEdad(), atleta_2.getCertificado_medico(), atleta_2.getTerminos_y_condiciones()));

        //Usando constructor con todos los datos
        //No meto set porque ya se tienen todos lo datos

        //Datos
        System.out.println("\nAtleta 3:");
        atleta_3.mostrarDatos();
        System.out.printf(" * ¿Cumple requisitos? = %b\n", atleta_3.cumpleRequisitos(atleta_3.getEdad(), atleta_3.getCertificado_medico(), atleta_3.getTerminos_y_condiciones()));

    }
}