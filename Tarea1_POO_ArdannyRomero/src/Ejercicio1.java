import java.util.Scanner; //Biblioteca para habilitar el uso de Scanner

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Esto es un Scanner el cual permite leer datos ingresados por el usuario desde el teclado. En este caso, 'sc' esta para capturar la entrada (similar al cin en C++)

        System.out.print("Bienvenido estudiante! Ingrese su nombre: ");String nombre = sc.nextLine(); //Aqui estoy asignando la abilidad de leer la variable nombre
        System.out.println("A continuacion ingrese las 3 notas de su parcial ");
        System.out.print("Nota 1: ");double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3)/3;

        if (promedio >= 7){
            System.out.printf("Tu promedio es de %f \nHaz aprobado! :D",promedio); //Aqui esta un ejemplo de print con formato. Se usa el printf y el %? con la variable correspondiente separado con comas fuera del srting
        }
        else{
            System.out.printf("Tu promedio es de %f \nHaz reprobado :(",promedio);
        }
        sc.close(); //Esto cierra el Scanner (Esto en codigos grandes nos evita hacer muchas instancias de Scanner)
    }
}
