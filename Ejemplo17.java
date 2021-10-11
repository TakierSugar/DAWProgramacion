import java.util.Scanner;

public class Ejemplo17 {

    public static void main(String[] args) {
        
        //Declaración de variables
        byte mes = 0;
        Scanner reader = new Scanner(System.in);

        //Empieza el programa
        System.out.println("introduce el número del mes: ");
        mes = reader.nextByte();
        reader.close();

            

        switch (mes){
            case 1 :
            case 3 :
            case 5 : 
            case 7 : 
            case 8 :
            case 10 : 
            case 12 :
            System.out.println("tiene 31 dias"); break;

            case 2 :
            System.out.println("tiene 28 dias o 29 si es año bisiesto"); break;

            case 4 :
            case 6 :
            case 9 :
            case 11 : 
            System.out.println("tiene 30 dias"); break;
            
            default : System.out.println("Este valor no es valido");
        }
    }
}


//1 3 5 7 8 10 12 tienen 31 dias
//2 tiene 28 dias
// 4 6 9 11 tienen 30 dias