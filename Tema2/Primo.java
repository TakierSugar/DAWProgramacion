import java.util.Scanner;

public class Primo {
    public static boolean esPrimo(){
        
        int numero, contador = 0;
        Scanner reader = new Scanner (System.in);
        boolean primo;
        
        System.out.print("Dame un número: ");
        numero = reader.nextInt();
        reader.close();
        for (int i = 1; i < numero; i++){
            if (numero%i==0){
                contador = contador + 1;
            }
        }
        if (contador >= 2){primo = false;     
        }else{ primo = true;
        }
        
        if (primo = false){
            System.out.println(numero + " no es un número primo");
        }else if(primo = true){
            System.out.println(numero + " es un número primo");
        }
        return primo;
        
    }
}
