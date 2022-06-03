package Tema3.EjerciciosTema3;


public class MoverCeros {
    public static void main(String[] args) {
        //variables
        int[] Array = {1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0};
        int[] auxiliar = new int[Array.length];

        //programa
        for (int i = 0 ; i <= Array.length; i++){
            if (Array[i] != 0){
                auxiliar[i]=Array[i];
                
            }
        }
    }
}
