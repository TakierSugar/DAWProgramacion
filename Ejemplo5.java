import java.util.Scanner;
public class Ejemplo5 {
    public static  void main (String argv[]){
        int A;
        int B;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number 1:");
        A = reader.nextInt();
        

        System.out.println("Enter number 2:");
        B = reader.nextInt();

        suma = A + B;
        resta = A - B;
        multiplicacion = A * B;
        division = A / B;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);
        reader.close();
        
    }
}