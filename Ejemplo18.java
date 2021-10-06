import java.util.Scanner;

public class Ejemplo18 {

    public static void main(String[] args) {

        //Declaración de variables
        int horas, minutos, segundos;
        Scanner reader = new Scanner(System.in);

        //Empieza el programa
        System.out.println("Cuantas horas?"); 
        horas = reader.nextInt();

        System.out.println("Cuantos minutos?");
        minutos = reader.nextInt();

        System.out.println("Cuantos segundos?");
        segundos = reader.nextInt();
        reader.close();

        if (segundos >= 60){
            minutos = (minutos + 1);
            segundos = (segundos - 60);
                if (minutos >= 60){
                    horas = (horas + 1);
                    minutos = (minutos - 60); 
                }
        }

        System.out.println(horas + ":" + minutos + ":" + segundos); 

        


        
    }
}
