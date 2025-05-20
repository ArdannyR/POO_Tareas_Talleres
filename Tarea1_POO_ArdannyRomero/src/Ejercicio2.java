import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hola! Cuantos numeros planeas ingresar? "); int cantidad = sc.nextInt();
        int contador = 0; //Declaro un contador para contar los pares de forma directa (ya que aun no se como colocar listas en java)

        for (int i=0;i<cantidad;i++){ //Es el mismo formato de for que c++ (deecho mucho de java se ve similar a c++)
            System.out.print("Numero: "); int numero = sc.nextInt();
            if (numero % 2 == 0){
                contador += 1;
            }
            else{
                continue;
            }
        }
        System.out.printf("Hay un total de %d numeros pares entre los que ingresaste",contador);
        sc.close();
    }
}
