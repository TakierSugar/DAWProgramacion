import java.util.Scanner;
public class Ejemplo11 {
    public static  void main (String argv[]){
        double A;
        double B;

        Scanner reader = new Scanner(System.in);

        System.out.println("Inserta número:");
        A = reader.nextInt();
        System.out.println("Inserta número:");
        B = reader.nextInt();
        

        if (A > B){
        System.out.println(B);
        System.out.println(A);
        }else{
        System.out.println(A);
        System.out.println(B);    }
        reader.close();
        
    }
}