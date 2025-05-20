import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingresa un numero del 1 al 10: "); int numero_base = sc.nextInt();

        if (0 < numero_base && numero_base < 11){ //Comprobamos que este en el rango de lo pedido
            for (int i=0;i<11;i++){
                int resultado = i * numero_base; //Sacamos el resultado de la multiplicacion
                System.out.printf("%d * %d = %d\n",numero_base,i,resultado); //Imprmimos con el formato (se me hace mas facil asi)
            }
        }
        sc.close();
    }
}