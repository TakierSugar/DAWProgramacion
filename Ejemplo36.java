import java.util.Scanner;

public class Ejemplo36 {
    
    public static void main(String[] args){

        //Declaro variables
        int[] numero = {1,2,3,4,5,6,7,8,9,10};
        int mayor = 0;
        Scanner reader = new Scanner (System.in);

        //Empieza el programa
        for (int valor : numero) {

            System.out.println("Dame diez numeros: (llevas "+ (valor-1) +")");
            valor = reader.nextInt();
                if (mayor == 0){ mayor = valor;
                }
                
            if (valor>mayor){ 
                mayor=valor;
            }
        }
        reader.close();
        System.out.println("El mayor número es: " + mayor);
    }
}