 public class Ejemplo29 {

    public static void main(String[] args) {
        
        //Declaracion de variables
        int numero=3, contador = 100, divisor=2;
        boolean esPrimo = true;

        //Empieza el programa
           
        
        do{
            while ((divisor < numero) && esPrimo){

                if ((numero%divisor)==0){
                    esPrimo = false;}
                
                divisor++;
            }

            if (esPrimo == true){System.out.println(numero);}

            divisor=2;
            numero++;
            esPrimo = true;
        }while (numero<=contador);

    }
}