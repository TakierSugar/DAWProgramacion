import java.util.Scanner;
public class Ejemplo15 {
    public static  void main (String argv[]){
        int A = 0 ;


        Scanner reader = new Scanner(System.in);

        System.out.println("Inserta número del 1 al 10:");
        A = reader.nextInt();

        switch (A) {
            case 1: System.out.println(1 + " " + "uno"); break;
            case 2: System.out.println(2 + " " + "dos"); break;
            case 3: System.out.println(3 + " " + "tres"); break;
            case 4: System.out.println(4 + " " + "cuatro"); break;
            case 5: System.out.println(5 + " " + "cinco"); break;
            case 6: System.out.println(6 + " " + "seis"); break;
            case 7: System.out.println(7 + " " + "siete"); break;
            case 8: System.out.println(8 + " " + "ocho"); break;
            case 9: System.out.println(9 + " " + "nueve"); break;
            case 10: System.out.println(10 + " " + "diez"); break;
            



        }
        System.out.println(A);
        reader.close();
        
    }
}