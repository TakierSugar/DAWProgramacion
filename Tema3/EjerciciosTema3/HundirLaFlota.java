package EjerciciosTema3;

import java.util.Scanner;

public class HundirLaFlota {

    public static void createShips(int numShips, int[][] shipPlaces) {
        int r1, r2;
        int cont = 0;
        

        while (cont < numShips) {
            r1 = (int) (Math.random()*8); 
            r2 = (int) (Math.random()*8);
            if (shipPlaces[r1][r2] != 1) {
                shipPlaces[r1][r2]=1;
                cont++;
            }
        }
    }
    public static void main(String[] args) {

        int[][] shipPlaces = new int[8][8];
        createShips(10, shipPlaces);

        // Iniciamos el Scanner para leer las entradas del usuario
        Scanner lector;
        lector = new Scanner(System.in);
        int contador = 0;

        while(contador < 10){

            System.out.println("Introduce una fila para disparar y con suerte darle a un barco xd");
            int fila = lector.nextInt();
            System.out.println("Introduce una columna para disparar y con suerte darle a un barco xd");
            int columna = lector.nextInt();

            // Comprobamos: Si en el tablero (shipPlaces[fila][columna]) hay un 0 (es decir, hay agua), ponemos un 2. Si hay barco, un 3.
            // La función que imprime el tablero interpreta estos números y coloca los símbolos pertinentes.
            if (shipPlaces[fila][columna] == 1) {
                shipPlaces[fila][columna] = 3;
                contador++;
            } else if (shipPlaces[fila][columna] == 0){
                shipPlaces[fila][columna] = 2;
            }

            imprimirTablero(shipPlaces);
        }
        lector.close();
    }
        // Ahora falta hacer que todo esto lo haga en bucle hasta que se hayan encontrado los 10 barcos.
    public static void imprimirTablero (int[][] shipPlaces){

        for (int[] fila : shipPlaces) {
            for (int numero : fila){
                switch (numero) {
                    
                    case 0:
                    case 1:
                    System.out.print(" . ");    //Sin disparar.
                    break;

                    case 2:
                    System.out.print(" O ");    //Disparo y agua.  
                    break;

                    case 3:
                    System.out.print(" X ");    //Disparo a un barco.        
                    break;
                
                    default:
                    break;
                }
            }
            System.out.println();
        }
    }
}