/*Leer un numero de 4 cifras exactas por pantalla, luego imprimir si este es capicúa*/
package estructurascontrol15;
import java.util.Scanner;
public class EstructurasControl15 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numero=0;
        int unidades=0;
        int decenas=0;
        int centenas=0;
        int unidadesMil=0;
        int suma=0;
        System.out.println("Digite un numero: ");
        numero=read.nextInt();
        if (numero>=1000 && numero<=9999){
            unidadesMil = numero / 1000;
            centenas = (numero % 1000) / 100;
            decenas = (numero % 100) / 10;
            unidades = numero % 10;
            if (unidadesMil==unidades && centenas==decenas){
                System.out.println("El numero es capicua");
            }else {
                System.out.println("El numero no es capicua");
            }
        }else{
            System.out.println("El valor no esta dentro del rango");
        }
    }
    
}
