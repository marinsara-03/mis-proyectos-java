/*Contar hacia atrás desde 10 hasta 1.*/
package estructurascontrol4;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class EstructurasControl4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
    }
    
}
