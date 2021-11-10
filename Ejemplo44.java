import java.util.Scanner;

public class Ejemplo44 {
        public static void main(String[] args) {
         
            //variables
            //int[] binario = new int[binario.length];
            int numero = 0, exponente = 0, decimal = 0, digito;
            Scanner reader = new Scanner (System.in);
            
        
            //empieza el programa
           System.out.println("Dame un binario");
           numero = reader.nextInt();
           reader.close();
            while (numero != 0) {
                
                digito = numero % 10;                    
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                exponente++;
                numero = numero / 10;
                }
                System.out.println("El decimal es: " + decimal);
            
        } 
}
 