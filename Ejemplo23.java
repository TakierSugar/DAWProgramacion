import java.util.Scanner;

public class Ejemplo23 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        int numero, positivos = 0 ;
        Scanner reader = new Scanner (System.in);
        //Empieza el programa

        do  {
            System.out.println("Dame un número (Pulsa 0 para acabar)");
            numero = reader.nextInt();

            if (numero > 0) {

            positivos = positivos + 1;
            }

        }while (numero != 0);
        reader.close();
        System.out.println("Hay" + " " + positivos + " " + "números positivos");
    }
}