/*Sumar los números del 1 al 100.*/
package estructurascontrol2;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class EstructurasControl2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int suma=0;
        for(int i=1; i<=100; i++){
            suma=suma+i;
                System.out.println(suma);
        }
    }
    
}
