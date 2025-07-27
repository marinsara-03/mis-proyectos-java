/*Si un numero esta entre 1 y 100, mostrar "Esta dentro del rango", si no, "Fuera del rango"*/
package cond18;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.println("Ingresa un numero: ");
        int numero=read.nextInt();
        if (numero>=1 && numero<=100){
            System.out.println("El numero esta dentro del rango");
        }else{
            System.out.println("El numero esta por fuera del rango");
        }
    }
    
}
