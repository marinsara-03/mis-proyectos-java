/*Leer numeros hasta que el usuario ingrese 0, luego imprimir el menor*/
package estructurascontrol7;
import java.util.Scanner;
public class EstructurasControl7 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numero=0;
        int numeroMenor=Integer.MAX_VALUE;
        System.out.println("Digite un numero: ");
        numero=read.nextInt();
        while(numero!=0){
            if (numero<numeroMenor && numero!=0){
                numeroMenor=numero;
            }
            System.out.println("Digite un numero: ");
            numero=read.nextInt();
        }System.out.println("El numero menor fue: "+numeroMenor);
    }
    
}
