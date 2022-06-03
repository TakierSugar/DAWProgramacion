package Tema1;
import java.util.Scanner;
public class Ejemplo14 {
    public static  void main (String argv[]){
        byte A;
        
        

        Scanner reader = new Scanner(System.in);

        System.out.println("Inserta número:");
        A = reader.nextByte();
        reader.close();
        
        if (A < 0){
            System.out.println(A +" "+ "No es una nota valida");
        }else if (A < 3){
            System.out.println(A +" "+ "Muy deficiente");
        }else if (A < 5){
            System.out.println(A +" "+ "Insuficiente");
        }else if (A < 6){
            System.out.println(A +" "+ "Suficiente");
        }else if (A < 7){
            System.out.println(A +" "+ "Bien");
        }else if (A < 9){
            System.out.println(A +" "+ "Notable");
        }else if (A < 10){
            System.out.println(A +" "+ "Sobresaliente");
        }else{
            System.out.println(A +" "+ "No es una nota valida");
        }
        
        
    }
}