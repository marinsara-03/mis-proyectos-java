/*Leer números hasta que el usuario ingrese 0.*/
package estructurascontrol5;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class EstructurasControl5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numero=0;
        System.out.println("Digite un numero: ");
        numero=read.nextInt();
        while(numero!=0){
            System.out.println("Digite un numero: ");
            numero=read.nextInt();
        }
    }
    
}
