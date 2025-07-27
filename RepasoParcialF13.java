/*Calcular si una persona puede votar (mayor de 18)*/
package repasoparcialf13;
import java.util.Scanner;
public class RepasoParcialF13 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
       
        int edad=0;
        System.out.println("Digite su edad: ");
        edad=read.nextInt();
        
        if(edad>=18){
            System.out.println("Puede votar");
        }else{
            System.out.println("No puede votar");
        }
    }
    
}
