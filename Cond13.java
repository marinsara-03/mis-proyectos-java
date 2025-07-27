/*Verifique si un número ingresado es de un solo dígito (0-9)*/
package cond13;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero=read.nextInt();
        if (numero>=0 && numero<=9){
            System.out.println("El numero es de un solo digito");
        }else{
            System.out.println("El numero tiene mas de un digito");
        }
    }
    
}
