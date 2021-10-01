import java.util.Scanner;
public class Ejemplo7 {
    public static  void main (String argv[]){
        double A;
        double B;
        

        Scanner reader = new Scanner(System.in);

        System.out.println("Precio base:");
        A = reader.nextInt();
        

        System.out.println("Precio rebajado:");
        B = reader.nextInt();

        System.out.println("EL descuento es:");
        System.out.println((((A-B)/A)*100)+"%");
        
        reader.close();
        
    }
}