package ciclofor12;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class CicloFor12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero=read.nextInt();
        for (int i=0; i<=numero; i++){
            System.out.println(i);
        }
    }
    
}
