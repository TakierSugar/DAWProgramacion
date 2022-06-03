package Tema3.EjerciciosTema3;


import java.util.Arrays;

public class Duplicados {
    public static void main(String[] args) {
        //variables
        int[] elementos = {1,2,3,4,5,4,6,4,7,7,3,1,3,6,7};
        String duplicados = "";
       
        //Programa
        Arrays.sort(elementos);
        for (int i = 0; i<elementos.length-1; i++){
            System.out.print(elementos[i] + ", ");
            if (elementos[i] == elementos[i+1]){
                duplicados = duplicados + " " + elementos[i];
            }
        }
        System.out.println("");
        System.out.println("Se duplican estos elementos :" + duplicados);
    }
}
