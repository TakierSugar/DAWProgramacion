package POO;

/*Enunciado
Crea un programa en el que crees un array de 1000 enteros, en las posiciones pares 
han de aparecer los multiplos de 3 y en las posiciones impares han de aparecer los multiplos 
de 7, despues de rellenar el array imprimir el contenido del array 
si las posiciones son multiplo de 13 */
public class inventada4 {
    public static void main(String[] args) {
        int[] numeros = new int [1000];
        int multiplo3 = 3;
        int multiplo7 = 7;

        //Valores de las posiciones pares
        for (int i = 0; i < numeros.length; i += 2) {
            numeros[i] = multiplo3;
            multiplo3 += 3;
        }
        //Valores de las posiciones impares
        for (int i = 1; i < numeros.length; i += 2) {
            numeros[i] = multiplo7;
            multiplo7 += 7;
        }
        for ( int i = 13; i < numeros.length; i +=13) {
            System.out.println(numeros[i]);
        }
    }
}
