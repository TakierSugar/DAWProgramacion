import java.util.Scanner;

public class Ejemplo25 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        double factorial = 1, numero = 0;
        Scanner reader = new Scanner (System.in);

        //Empieza el programa
        System.out.println("Pideme un factorial");
        numero = reader.nextDouble();

        do{
            factorial = factorial * numero;
            numero--;
        }while (numero != 0);
        
        reader.close();
        System.out.println("El resultado es" + factorial);
    }
}