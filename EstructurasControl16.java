/*Generar los primeros N terminos de la serie 1, 2, 4, 8, 16...N se debe ingresar por pantalla*/
package estructurascontrol16;
import java.util.Scanner;
public class EstructurasControl16 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int n=1;
        System.out.println("Digite un numero: ");
        n=read.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(n+", ");
            n=n*2;
        }
    }
    
}
