import java.util.Scanner;

public class Entrada {
    public static int getInteger(){
        int resultado = 0;
        String texto = "Pon un entero: ";
        Scanner reader = new Scanner(System.in);

        System.out.println(texto);

        if (!reader.hasNextInt()){
            do{
            System.out.println("no es un entero, pon un entero: ");
            resultado = reader.nextInt();
            if(!reader.hasNextInt()){
                continue;
            }else{
            return resultado = reader.nextInt();}
            }while (!reader.hasNextInt());
        }
            
        return resultado = reader.nextInt();
    }    
}
