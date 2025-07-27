/*Si un auto supera los 80 km/h, mostrar "Multa por exceso de velocidad", si es menor de
80 km/h, "Velocidad correcta".*/
package cond11;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class Cond11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.print("Ingrese la velocidad del vehiculo: ");
        double velocidad=read.nextDouble();
        if (velocidad>80){
            System.out.println("Multa por exceso de velocidad");
        }else {
            System.out.println("Velocidad correcta");
        }
    }
    
}
