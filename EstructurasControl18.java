/*Leer numeros hasta que el usuario ingrese 0, luego, imprimir cuantos positivos y negativos ingresa el usuario*/
package estructurascontrol18;
import java.util.Scanner;
public class EstructurasControl18 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numeroIngresado=0;
        int positivos=0;
        int negativos=0;
        System.out.println("Ingrese un numero: ");
        numeroIngresado=read.nextInt();
        while(numeroIngresado!=0){
            if (numeroIngresado>0){
                positivos++;
            }else{
                negativos++;
            }
            System.out.println("Ingrese un numero: ");
            numeroIngresado=read.nextInt();
        }System.out.println("Se ingresaron: "+positivos+" positivos y "+negativos+" negativos");
    }
    
}
