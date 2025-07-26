/*Realice un programa que calcule la suma de los enteros entre 1 y 10, es decir 1+2+3+…+10. */
package ciclofor5;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class CicloFor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int suma=0;
        for (int i=1; i<=10; i++){
            suma=suma+i;
            System.out.println(suma);
        }
    }
    
}
