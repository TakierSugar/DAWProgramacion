package Tema3.EjerciciosTema3;


public class ParesImpares {
    public static void main(String[] args) {
        //variables
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        String pares = "", impares = "";

        //programa
        for (int i = 1 ; i <= numeros.length ; i++){
            if (i%2 == 0){
                pares = pares + " " + i;
            }else{
                impares = impares + " " + i;
            } 
        }
        System.out.println("Los pares son:  " + pares);
        System.out.println("Los impares son:" + impares);
    }
}
