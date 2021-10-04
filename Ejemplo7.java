import java.util.Scanner;
public class Ejemplo7 {
    public static  void main (String argv[]){
        double real;
        double rebajado;
        

        Scanner reader = new Scanner(System.in);

        System.out.println("Precio base:");
        real = reader.nextInt();
        

        System.out.println("Precio rebajado:");
        rebajado = reader.nextInt();

        System.out.println("EL descuento es:");
        System.out.println((((real - rebajado) / real) * 100) + "%");
        
        reader.close();
        
    }
}