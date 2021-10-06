import java.util.Scanner;
public class Ejemplo12 {
    public static  void main (String argv[]){
        double A;
        double B;
        

        Scanner reader = new Scanner(System.in);

        System.out.println("Inserta número:");
        A = reader.nextInt();

        System.out.println("Inserta número:");
        B = reader.nextInt();
        reader.close();

        if (A < B){
        System.out.println(B);
        
        }else{
        System.out.println(A);

        }
        
        
    }
}