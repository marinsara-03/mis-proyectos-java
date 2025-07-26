/**/
package ciclofor9;
import java.util.Scanner;

/**
 *
 * @author flaka
 */
public class CicloFor9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int suma=0;
        int multiplicacion=0;
        for(int i=20; i<=400; i=i+1){
            if (i%2==0){
                suma=suma+i;
                System.out.println("La suma va: "+suma);
                multiplicacion=multiplicacion*i;
                System.out.println("La multiplicacion va en: "+multiplicacion);
            }
        }
    }
    
}
/*public class SumaProductoPares {

    public static void main(String[] args) {
        int sumaPares = 0;
        long productoPares = 1; // Usamos long para evitar desbordamiento

        for (int i = 20; i <= 400; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
                productoPares *= i;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println("El producto de los números pares es: " + productoPares);
    }
}*/
