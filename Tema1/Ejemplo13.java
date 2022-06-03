package Tema1;
import java.util.Scanner;
public class Ejemplo13 {
    public static  void main (String argv[]){
        double A;
        double B;
        double Ascendente;
        
        
        

        Scanner reader = new Scanner(System.in);
        

        System.out.println("Inserta número:");
        A = reader.nextDouble();

        System.out.println("Inserta número:");
        B = reader.nextDouble();

        System.out.println("Presiona 1 para ascendente, presiona 2 para descendente");
        Ascendente = reader.nextDouble();

        if (Ascendente == 1){
            if (A < B){
                System.out.println(A + " " + B);

            }else{
                System.out.println(B + " " + A);
            }
        }else if (Ascendente == 2){
            if (A > B){
                System.out.println(B + " " + A);
            }else{
                System.out.println(A + " " + B);
            }
        }
        reader.close();
        
    }
}