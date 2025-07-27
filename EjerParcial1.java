/**/
package ejerparcial1;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class EjerParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero=read.nextInt();
        if (numero%5==0){
            System.out.println("El numero es multiplo de 5");
        }
    }
    
}
