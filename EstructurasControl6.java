/*Leer numeros hasta que el usuario ingrese 0, luego imprimir el mayor*/
package estructurascontrol6;
import java.util.Scanner;
/**
 *
 * @author flaka
 */
public class EstructurasControl6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numero=0;
        int numeroMa=Integer.MIN_VALUE;
        System.out.println("Digite un numero: ");
        numero=read.nextInt();
        while(numero!=0){
            if (numero>numeroMa){
                numeroMa=numero;
            }
            System.out.println("Digite un numero: ");
            numero=read.nextInt();
        }System.out.println("El numero mayor fue: "+numeroMa);
    }
    
}
