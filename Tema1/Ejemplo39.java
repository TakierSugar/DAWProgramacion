package Tema1;
import java.util.Scanner;

public class Ejemplo39 {

    public static void main(String[] args) {
     
        //variables
        int numero, i;
        Scanner reader = new Scanner (System.in);
        String divisores = " ";

        //inicio del programa

        System.out.println("Dame el número");
        numero = reader.nextInt();
        reader.close();
        
        for(i = 1; i <= numero; i++){
            if(numero % i == 0){
                divisores = divisores + i + " ";
            }
        }
        System.out.println("Los divisores de "+ numero + " son:" + divisores);
    }
}
