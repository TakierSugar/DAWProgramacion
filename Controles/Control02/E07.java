package Controles.Control02;

import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        
        //variables
        int tiempo, horas, horasFijas;
        Scanner reader = new Scanner(System.in);
        
        //programa
        System.out.println("Hora actual: ");
        tiempo = reader.nextInt();
        System.out.println("Cantidad de horas: ");
        horas = reader.nextInt();
        reader.close();
        horasFijas = horas;
        while (tiempo + horas >= 24){
            horas = horas - 24;}
        System.out.println("En " + horasFijas + " horas, el reloj marcara las " + (tiempo+horas));
    }
}
