/*Leer dos numeros y sumar los multiplos de 3 entre ellos*/
package repasoparcialf19;
import java.util.Scanner;
public class RepasoParcialF19 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int numero1=0;
        int numero2=0;
        int suma1=0;
        int suma2=0;
        int tabla=0;
        
        System.out.println("Ingrese un numero: ");
        numero1=read.nextInt();
        System.out.println("Ingrese otro numero: ");
        numero2=read.nextInt();
        for(int i=1; i<=10; i=i+1){
            tabla=3*i;
            suma1=numero1+tabla;
            suma2=numero2+tabla;
            System.out.println("\nla suma del primer numero entre los multiplos de 3 es: "+suma1+".\nLa suma del otro "
            + "numero entre los multiplos de 3 es: "+suma2);
        }
    }
    
}
