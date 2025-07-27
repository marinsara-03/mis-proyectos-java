/*Solicite un número entero y determine si es par o impar.*/
package cond2;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.print("Digita un numero entero: ");
        int numero=read.nextInt();
        if (numero%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}
