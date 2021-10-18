import java.util.Scanner;

public class Ejemplo21 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        int año;
        Scanner reader = new Scanner (System.in);
        //Empieza el programa
        System.out.println("Año:");
        año = reader.nextInt();
        reader.close();

       
        if ((año % 4 == 0 ) && ((año % 100 != 0 ) || (año % 400 == 0))){
            System.out.println("Este año es bisiesto");
        }else{
            System.out.println("Este año no es bisiesto");
        }

    }
}