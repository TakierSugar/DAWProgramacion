import java.util.Scanner;

public class Potencia {
    public static double potencia(){

        //variables
        double x=0, X;
        int n;
        Scanner reader = new Scanner(System.in);

        System.out.println("Dame un valor para x");
        x = reader.nextDouble();
        X = x;
        System.out.println("Dame un valor para n");
        n = reader.nextInt();
        reader.close();
        for(int i = 0; i<n; i++){
            x=X*x;
        }
        return x;
    }
}