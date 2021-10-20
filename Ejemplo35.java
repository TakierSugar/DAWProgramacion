import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args){

        //Declaro variables
        double[] numero = {1,2,3,4,5,6,7,8,9,10};
        double total = 0;
        int diez = 0;
        Scanner reader = new Scanner (System.in);

        //Empieza el programa
        for (double nota : numero) {

            System.out.println("Dame una nota:");
            nota = reader.nextDouble();

            if (nota == 10) {

            diez = diez + 1;
            }
            total = total + nota;

        }
        reader.close();
        System.out.println("Tu nota media es " + (total/10));
        System.out.println("Has sacado " + diez + " dieces");
    }   
}
