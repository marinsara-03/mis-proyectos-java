/*Pida al usuario que adivine un número y verifique si acertó (el número secreto es 7).*/
package cond12;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class Cond12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero=read.nextInt();
        if (numero==7){
            System.out.println("Acerstaste");
        }else{
            System.out.println("Sigue intentando");
        }
    }
    
}
