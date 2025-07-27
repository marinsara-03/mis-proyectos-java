/*Leer un numero y contar cuantos digitos pares tiene*/
package repasoparcialf18;
import java.util.Scanner;
public class RepasoParcialF18 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numero=0;
        int count=0;
        int digito=0;
        System.out.println("Digite un numero: ");
        numero=read.nextInt();
            
            if(numero==0){
                count+=1;
            }else {
                while(numero>0){
                    digito=numero%10;
                    if (digito%2==0){
                        count++;
                    }
                    numero=numero/10;
                }
            }
        System.out.println("El numero tiene: "+count+" digitos pares");
    }
    
}
