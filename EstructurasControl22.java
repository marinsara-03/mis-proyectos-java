/* Mostrar los números entre dos valores dados.*/
package estructurascontrol22;
import java.util.Scanner;
public class EstructurasControl22 {
public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int valor1=0; 
        int valor2=0;

        System.out.print("Ingresa el primer valor: ");
        valor1 = read.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        valor2 = read.nextInt();
        if (valor1 < valor2) {
            System.out.println("Números entre " + valor1 + " y " + valor2 + ":");
            for (int i = valor1 + 1; i < valor2; i++) {
                System.out.print(i + " ");
            }System.out.println(); // Salto de línea
        }else if (valor2 < valor1) {
            System.out.println("Números entre " + valor2 + " y " + valor1 + ":");
            for (int i = valor2 + 1; i < valor1; i++) {
                System.out.print(i + " ");
            }System.out.println();
        } else {
            System.out.println("Los valores ingresados son iguales, no hay números entre ellos.");
        }
    }
    
}
