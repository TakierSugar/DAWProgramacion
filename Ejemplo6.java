import java.util.Scanner;
public class Ejemplo6 {
    public static  void main (String argv[]){
        double A;
        double Area;
        double Perimetro;
        final double Pi = 3.14159;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el radio:");
        A = reader.nextDouble();
        

       

        Area = A * Pi * Pi;
        Perimetro = 2 * Pi * A;
        System.out.println("El area es:" + Area); 
        System.out.println("El perimetro es:" + Perimetro); 
        reader.close();
        
    }
}