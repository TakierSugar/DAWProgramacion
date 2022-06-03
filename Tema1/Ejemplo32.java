package Tema1;
public class Ejemplo32 {
    

    public static void main(String[] args) {
    
        // declares an array of integers

        int[] anArray;

        // allocates memory for 10 integers

        anArray = new int[10];

        // initialize first element

        anArray[0] = 13;

        anArray[1] = 56;

        anArray[2] = 37;

        anArray[3] = 49;

        anArray[4] = 47;

        anArray[5] = 55;

        anArray[6] = 38;

        anArray[7] = 33;

        anArray[8] = 544;

        anArray[9] = 44;


        for(int i=9; i>=0; i--){

            
            System.out.println("Elements at index " + i + ": " +anArray[i]);
        }
    }
}