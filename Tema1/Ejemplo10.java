package Tema1;
import java.util.Scanner;
public class Ejemplo10 {
    public static  void main (String argv[]){
        double A;

        Scanner reader = new Scanner(System.in);

        System.out.println("Inserta número:");
        A = reader.nextDouble();
        reader.close();

        if (A >= 0){
            System.out.println("Es positivo");
        }else{
         System.out.println("Es negativo");
        }    
    }
}