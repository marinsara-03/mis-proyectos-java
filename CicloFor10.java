package ciclofor10;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class CicloFor10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        System.out.println("Digite 20 numeros");
        int numeros=0;
        int count=0;
        for(int i=1; i<=20; i++){
            numeros=read.nextInt();
            if (numeros>0){
                count+=1;
            }
        }System.out.println("La cantidad de positivos es de: "+count);
    }
    
}
