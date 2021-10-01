import java.util.Scanner;
public class Ejemplo6 {
    public static  void main (String argv[]){
        double A;
        double Area;
        double Perimetro;
        double Pi = 3.14159;
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el radio:");
        A = reader.nextInt();
        

       

        Area = A * Pi * Pi;
        Perimetro = 2 * Pi * A;
        System.out.println("El area es:"); 
        System.out.println(Area);
        System.out.println("El perimetro es:"); 
        System.out.println(Perimetro);
        
        reader.close();
        
    }
}