package Practica_7.Nivel_3;

import Practica_7.Nivel_2.Estudiante;

public class Estudiante_Becado extends Estudiante {
    private String tipo_beca; // Acdemica - Economica - Deportiva - Cultural (no se como hacer enum aqui asi que alli queda )

    public Estudiante_Becado(String nombre, int edad, String carrera, double promedio, String tipo_beca) {
        super(nombre, edad, carrera, promedio);
        this.tipo_beca = tipo_beca;
    }

    public String aplicar_descuento(){
        if (validacion()){
            if (es_apto_beca()){
                if (tipo_beca.equals("Academica") && getPromedio() >= 9){
                    return "\nDescuento del 50%";
                } else if (tipo_beca.equals("Economica")) {
                    return "\nDescuento del 40%";
                } else if (tipo_beca.equals("Deportiva") || tipo_beca.equals("Cultural")){
                    return "\nDescueto del 30%";
                }
                else {
                    return "\nNo se ha podido registrar esa beca (revisa tu tipo de beca y/o promedio)";
                }
            }
            else {
                return "\nNo es apto para la beca";
            }
        }
        else {
            return "\n *** Datos vacios ***";
        }
    }
}
