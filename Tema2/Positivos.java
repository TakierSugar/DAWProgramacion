import java.util.Scanner;

public class Positivos {
    public static int positivos(){
        int positivos = 0;
        int[] numero = new int[8];
        Scanner reader = new Scanner(System.in);

        for(int i = 0; i <7; i++){
            System.out.print("Dame un número ");
            numero[i] = reader.nextInt();
            if (numero[i]>0) positivos++;
        }
        reader.close();
        return positivos;
    } 
}
