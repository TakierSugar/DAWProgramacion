import java.util.Scanner;

public class Ejemplo38 {

    public static void main(String[] args) {
     
        //variables
        String frase;
        Scanner reader = new Scanner (System.in);
        int vocales = 0;
        //inicia el programa

        System.out.println("Dime algo");
        frase = reader.next();
        reader.close();

        for(int j = 0; j < frase.length(); j++){
        
            if((frase.charAt(j) == 'a')||(frase.charAt(j) == 'e')||(frase.charAt(j) == 'i')||(frase.charAt(j) == 'o')||(frase.charAt(j) == 'u')){
                vocales = vocales + 1;
            }
        }
        System.out.println("En total hay " + vocales + " vocales");   
    }
}
