import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Ejemplo33 {
    
    public static void main(String[] args) {
    
        
        int DNI, resto;
        String[] anArray = new String[23];

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

        Scanner reader = new Scanner (System.in);

        System.out.println("Dime un DNI sin la letra");
        
        DNI = reader.nextInt();
        reader.close();

        resto = DNI%23;

        for (int i = 0; i < 23; i++){

            if (i == resto){
                System.out.println("La letra de " + DNI + " es: " + anArray[i]);
            }

        }
    }
}
