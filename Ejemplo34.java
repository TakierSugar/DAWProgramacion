import java.util.Scanner;

public class Ejemplo34 {
    
    public static void main(String[] args) {
    
        
        int numero, resto, otroresto ;
        String[] anArray = new String[23];
        String[] anotherArray = new String[3];

        anArray[0] = "T";

        anArray[1] = "R";

        anArray[2] = "W";

        anArray[3] = "A";

        anArray[4] = "G";

        anArray[5] = "M";

        anArray[6] = "Y";

        anArray[7] = "F";

        anArray[8] = "P";

        anArray[9] = "D";

        anArray[10] = "X";

        anArray[11] = "B";

        anArray[12] = "N";

        anArray[13] = "J";

        anArray[14] = "Z";

        anArray[15] = "S";

        anArray[16] = "Q";

        anArray[17] = "V";

        anArray[18] = "H";

        anArray[19] = "L";

        anArray[20] = "C";

        anArray[21] = "K";

        anArray[22] = "E";

        anotherArray[0] = "X";

        anotherArray[1] = "Y";

        anotherArray[2] = "Z";
        

        Scanner reader = new Scanner (System.in);

        System.out.println("Dime un NIE sin las letras");
        
        numero = reader.nextInt();
        reader.close();

        resto = numero%23;
        otroresto = numero%3;
        for (int i = 0; i < 23; i++){

            for (int j = 0; j < 3; j++)
                if ((i == resto) && (j == otroresto)){
                    System.out.println("El NiE es: "+ anotherArray[j] + numero + anArray[i]);
                }

        }
    }
}
