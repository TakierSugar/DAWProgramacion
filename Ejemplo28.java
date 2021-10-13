import java.util.Scanner;

public class Ejemplo28 {
    
    public static void main(String[] args) {
        
        //Declaración de variables
        int numero, contador = 0, i;
        Scanner reader = new Scanner (System.in);
        //Empieza el programa
        System.out.println("Número:");
        numero = reader.nextInt();
        reader.close();

        for( i = 1 ; i <= numero ; i++){
            if(numero%i==0){
                contador++;
            }
        }
        if (contador==2){
            System.out.println(numero + " " + "es un numero primo");
        }else{
            System.out.println(numero + " " + "no es un numero primo");

        }


    }
        

}
