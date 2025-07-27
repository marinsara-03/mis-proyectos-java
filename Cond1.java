/*Escriba un programa que pida un número al usuario e indique si es positivo o negativo. */
package cond1;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.print("Digita un numero entero:");
        int numero=read.nextInt();
        if (numero>0){
            System.out.println("El numero digita es positivo");
        }else{
            System.out.println("El numero digitado es negativo");
        }
    }
    
}
