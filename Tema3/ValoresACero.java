package Tema3;

public class ValoresACero {
    public static void main(String[] args) {
        int[][] matriz = new int [10][10];
        String fila = "";
        int contadorf = 0, contadorc = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                double aleatorio = Math.random();
                if (aleatorio<=0.5){fila = fila + "0 ";}
                else if (aleatorio>0.5){fila = fila + "1 ";}
            }
            if (fila == "0 0 0 0 0 0 0 0 0 0 "){contadorf++;}
            System.out.println(fila);
            fila = "";
        }
        System.out.println();
        System.out.println();
        System.out.println(contadorf);
    }   
}
