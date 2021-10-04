//Un programa que calcula una división y una suma.
import java.util.Scanner;
public class Ejemplo8 {
    public static void main(String[] args) {
       
        double edad;
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduce la edad:");
        edad = reader.nextInt();
        reader.close();
        
        if (edad >= 18){
        System.out.println("Tienes la edad legal");
        

         }
        
        }
	
}
