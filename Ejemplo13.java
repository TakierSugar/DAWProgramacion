import java.util.Scanner;
public class Ejemplo13 {
    public static  void main (String argv[]){
        double A;
        double B;
        double Ascendente;
        
        
        

        Scanner reader = new Scanner(System.in);
        

        System.out.println("Inserta número:");
        A = reader.nextInt();
        System.out.println("Inserta número:");
        B = reader.nextInt();
        System.out.println("Inserta un número positivo para ascendente, negativo para descendente (0 es positivo)");
        Ascendente = reader.nextInt();

        if (Ascendente >= 0){
            if (A < B){
                System.out.println(A);
                System.out.println(B);
            }else{
                System.out.println(B);
                System.out.println(A);    
            }
        }else{
            if (A > B){
                System.out.println(A);
                System.out.println(B);
            }else{
                System.out.println(B);
                System.out.println(A);
            }
        }
        reader.close();
        
    }
}