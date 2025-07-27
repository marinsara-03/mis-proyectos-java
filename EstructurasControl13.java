/*Leer un numero por pantalla de hasta 4 cifras, luego imprimir cuantas unidades, decenas, centenas y unidades de mil tiene*/
package estructurascontrol13;
import java.util.Scanner;
public class EstructurasControl13 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numero=0;
        int unidades=0;
        int decenas=0;
        int centenas=0;
        int unidadesMil=0;
        System.out.println("Digite un numero: ");
        numero=read.nextInt();
        if (numero>0 && numero<=9999){
            unidadesMil = numero / 1000;
            centenas = (numero % 1000) / 100;
            decenas = (numero % 100) / 10;
            unidades = numero % 10;
            if(unidadesMil>0){
                System.out.println("El numero tiene: "+unidadesMil+" unidades de mil");
            }if(centenas>0){
                System.out.println("El nuemro tiene: "+centenas+" centenas");
            }if(decenas>0){
                System.out.println("El numero tiene: "+decenas+" decenas");
            }System.out.println("El numero tiene: "+unidades+" unidades");
        }else{
            System.out.println("El valor ingresado no esta dentro del rango");
        }
    }
    
}
