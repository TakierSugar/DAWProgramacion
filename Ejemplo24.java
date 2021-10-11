import java.util.Scanner;

public class Ejemplo24 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        double nota, nota2 = 1, diez = 0, numero = 0;
        Scanner reader = new Scanner (System.in);
        //Empieza el programa

        do  {
            System.out.println("Dame una nota:");
            nota = reader.nextDouble();

            if (nota == 10) {

            diez = diez + 1;
            }
            numero = numero + 1;
            nota2 = nota2 + nota;
        }while (nota != -1);
        reader.close();
        System.out.println("Hay" + " " + diez + " " + "dieces");
        System.out.println("la nota media es" + " " + (nota2)/(numero-1));
    }
}