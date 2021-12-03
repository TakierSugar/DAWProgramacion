package Tema3;

public class ValoresACero {
    public static void main(String[] args) {
        int[][] matriz = new int [10][10];
        String fila = "";
        int contadorf = 0, contadorc = 0, contador1 = 0, contador = 0;
        int valor;
        boolean cero;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                double aleatorio = Math.random();
                if (aleatorio<=0.5){ matriz[i][j]=0; fila = fila + " " + matriz[i][j]; cero=true;}
                else if (aleatorio>0.5){matriz[i][j]=1 ;fila = fila + " " + matriz[i][j]; cero=false;}
                if (cero=true){contador++;}
            }
            if (contador == 10){contadorf++;}
            contador=0;
            System.out.println(fila);
            fila = "";
        }
        System.out.println();
        System.out.println();
        System.out.println(contadorf);
    }   
}
