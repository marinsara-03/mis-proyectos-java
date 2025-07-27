/*Recibir dos numeros por pantalla y crear un menu con opciones para mostrar el resultado (1.sumar, 2.restar y 3.salir)*/
package repasoparcialf12;
import java.util.Scanner;
public class RepasoParcialF12 {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        
        int numero1=0;
        int numero2=0;
        int menu=0;
        int suma=0;
        int resta=0;
        
        System.out.println("Ingrese un numero: ");
        numero1=read.nextInt();
        System.out.println("Ingres otro numero: ");
        numero2=read.nextInt();
        
        
        while (menu!=3){
            System.out.println("Digite 1 para sumar, 2 para restar y 3 para salir");
            menu=read.nextInt();
            
            if(menu==1){
                suma=numero1+numero2;
                System.out.println(suma);
            }else if(menu==2){
                resta=numero1-numero2;
            }else if(menu==3){
                System.out.println("Fin del programa.");
            }else{
                System.out.println("Valor invalido");
            }
        }
    }
    
}
