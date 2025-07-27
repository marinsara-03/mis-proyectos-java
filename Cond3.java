/*Pida una calificación de 0 a 100 y muestre si es: "Aprobado" (>=60) o "Reprobado"
(<60).*/
package cond3;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.print("Ingresa la calificación:");
        double numero=read.nextDouble();
        if (numero>=60){
            System.out.println("Has sido aprobado"); 
        }else if(numero>=0 && numero<=60){
            System.out.println("Has sido reprobado");
        }
    }
    
}
