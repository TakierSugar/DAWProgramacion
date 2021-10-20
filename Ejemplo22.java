import java.util.Scanner;

public class Ejemplo22 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        int numero, positivos = 0;
        Scanner reader = new Scanner (System.in);

        //Empieza el programa
        for (int i = 0; i < 10; i++) {
            System.out.println("Dame un número:");
            numero = reader.nextInt();
            reader.close();
            if (numero >= 0) {
        
                positivos = positivos + 1;
        
            }
        }
        
        System.out.println("Hay" + " " + positivos + " " + "números positivos");
    }
}