/*Si el numero es 2, 3, 5 o 7, mostrar "Es primo"; de lo contrario, "No es primo"*/
package cond19;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.println("Digite un numero");
        int numero=read.nextInt();
        if (numero==2||numero==3||numero==5||numero==7){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
    
}
