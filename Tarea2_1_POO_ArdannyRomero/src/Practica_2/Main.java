package Practica_2;

public class Main {
    public static void main(String[] args) {
        Coche carro_con_param = new Coche("PYB-296", 23000.1);
        carro_con_param.mostrar_info();
        Coche carro_sin_param = new Coche();
        carro_sin_param.mostrar_info();
    }
}
