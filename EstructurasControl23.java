/*Mostrar los divisores de un número ingresado por pantalla.*/
package estructurascontrol23;
import java.util.Scanner;
public class EstructurasControl23 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numero;
        System.out.print("Ingresa un número entero para mostrar sus divisores: ");
        numero = read.nextInt();
        System.out.println("Los divisores de " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
