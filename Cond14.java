/*Si un numero es menor que 50, mostrar su doble, si no, mostrar el numero sin cambios*/
package cond14;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.println("Digita un numero: ");
        int numero=read.nextInt();
        if (numero<50){
            int doble=numero*2;
            System.out.println("El doble de el numero digitado es: "+doble);
        }else{
            System.out.println(numero);
        }
    }
    
}
