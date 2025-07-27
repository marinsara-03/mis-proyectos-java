/*Si el promedio es mayor o igual a 85 y la asistencia es mayor al 90%, otorgar una beca.*/
package cond16;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class Cond16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        System.out.print("Ingrese el promedio: ");
        double promedio=read.nextDouble();
        System.out.print("Ingrese la asistencia en decimal:");
        double asistencia=read.nextDouble();
        if (promedio>=85 && asistencia>0.90){
            System.out.println("Ganaste una beca");
        }else{
            System.out.println("No es posible realizar la beca");
        }
    }
    
}
