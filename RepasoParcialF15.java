/*Determinar si una persona tiene derecho a subsidio según edad y salario.*/
package repasoparcialf15;
import java.util.Scanner;
public class RepasoParcialF15 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        
        int edad=0;
        float salario=0;
        
        System.out.println("Digite su edad: ");
        edad=read.nextInt();
        System.out.println("Digite su salario: ");
        salario=read.nextFloat();
        
        if(edad>=0 && edad<=17 && salario==0){
            System.out.println("Tiene derecho a subsidio");
        }else if(edad>=18 && edad<=23 && salario==0){
            System.out.println("Debe demostrar que esta estudiando si desea adquirir el subsidio, de lo contrario no tiene derecho a este");
        }else if(edad>=24 && edad<=50 && salario>=1500000){
            System.out.println("No tiene derecho a subsidio");
        }else if(edad>=24 && edad<=50 && salario<=1500000){
            System.out.println("Tiene derecho a subsidio");
        }else if(edad>=51 && salario==0){
            System.out.println("Tiene derecho a subsidio");
        }else{
            System.out.println("Error");
        }
    }
    
}
