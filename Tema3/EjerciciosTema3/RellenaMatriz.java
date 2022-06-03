package Tema3.EjerciciosTema3;


public class RellenaMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int [10][10];

        for (int i = 0; i < matriz.length; i++){
            System.out.println();
            for (int j = 0; j < matriz.length; j++){
                double aleatorio = Math.random();
                if (aleatorio<0.5){System.out.print("0 ");}
                else if (aleatorio>=0.5){System.out.print("1 ");}
            }
        }
        System.out.println();
    }   
}
