import java.util.Scanner;
public class Ejemplo11 {
    public static  void main (String argv[]){

        //Declaración de variables
        double x;
        double y;
        Scanner reader = new Scanner(System.in);
        
        //Empieza el programa
        System.out.println("Inserta número:");
        x = reader.nextInt();

        System.out.println("Inserta número:");
        y = reader.nextInt();

        reader.close();

        if (x > y){
            System.out.println(y + " " + x);
        }else{
            System.out.println(x + " " + y);
        }
    }
}