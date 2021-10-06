import java.util.Scanner;

public class Ejemplo17 {

    public static void main(String[] args) {
        
        //Declaración de variables
        int mes = 0;
        Scanner reader = new Scanner(System.in);

        //Empieza el programa
        System.out.println("introduce el mes: ");
        mes = reader.nextInt();
        reader.close();
        switch (mes){
            case 1 : System.out.println("31"); break;
            case 2 : System.out.println("28 o 29"); break;
            case 3 : System.out.println("31"); break;
            case 4 : System.out.println("30"); break;
            case 5 : System.out.println("31"); break;
            case 6 : System.out.println("30"); break;
            case 7 : System.out.println("31"); break;
            case 8 : System.out.println("31"); break;
            case 9 : System.out.println("30"); break;
            case 10 : System.out.println("31"); break;
            case 11 : System.out.println("3o"); break;
            case 12 : System.out.println("31"); break;
        }
    }
}
