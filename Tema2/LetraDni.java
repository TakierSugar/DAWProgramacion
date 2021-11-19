package Tema2;

import java.util.Scanner;

public class LetraDni {

    public static String letraDni(){

        int DNI, resto;
        String[] Letra = new String[23];

        Letra[0] = "T";

        Letra[1] = "R";

        Letra[2] = "W";

        Letra[3] = "A";

        Letra[4] = "G";

        Letra[5] = "M";

        Letra[6] = "Y";

        Letra[7] = "F";

        Letra[8] = "P";

        Letra[9] = "D";

        Letra[10] = "X";

        Letra[11] = "B";

        Letra[12] = "N";

        Letra[13] = "J";

        Letra[14] = "Z";

        Letra[15] = "S";

        Letra[16] = "Q";

        Letra[17] = "V";

        Letra[18] = "H";

        Letra[19] = "L";

        Letra[20] = "C";

        Letra[21] = "K";

        Letra[22] = "E";

        Scanner reader = new Scanner (System.in);
        System.out.println("Dime un DNI sin la letra");
        
        DNI = reader.nextInt();
        reader.close();
        resto = DNI%23;
        return Letra[resto];
    }
}
