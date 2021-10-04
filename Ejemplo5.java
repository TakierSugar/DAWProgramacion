import java.util.Scanner;
public class Ejemplo5 {
    public static  void main (String argv[]){
        int X,Y;
        int sum,sub,mult,div;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter number 1:");
        X = reader.nextInt();
        

        System.out.println("Enter number 2:");
        Y = reader.nextInt();

        sum = X + Y;
        sub = X - Y;
        mult = X * Y;
        div = X / Y;
        System.out.println("sum" + sum);
        System.out.println("subfraction" + sub);
        System.out.println("multiplicacion" + mult);
        System.out.println("division:" + div);
        reader.close();
        
    }
}