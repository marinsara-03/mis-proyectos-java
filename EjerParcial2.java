/**/
package ejerparcial2;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class EjerParcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.println("Digite un numero: ");
        int numero1=read.nextInt();
        System.out.println("Digite otro numero");
        int numero2=read.nextInt();
        if(numero1%numero2==0){
            System.out.println("El numero " +numero1+ " es multiplo de "+numero2);
        }else {
            System.out.println("El numero "+numero1+ " no es multiplo de "+numero2);
        }
    }
    
}
