/*determinar si un años es bisiesto*/
package repasoparcialf11;
import java.util.Scanner;
public class RepasoParcialF11 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        System.out.print("Digita un año:");
        int año=read.nextInt();
        if ((año%4==0 && año%100!=0)|| año%400==0){
            System.out.println(año+" El año es bisiesto");
        }else {
            System.out.println(año+" El año no es bisiesto");
        }
    }
    
}
