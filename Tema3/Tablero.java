package Tema3;

public class Tablero {
    public static void tablero(String[] args) {
        int [][] tablero = new int[8][8];
        String [] columna = {"A","B","C","D","E","F","G","H"};


        System.out.print("  1 2 3 4 5 6 7 8");
        for (int i = 0; i < tablero.length; i++){
            System.out.println();
            System.out.print(columna[i] +" ");
            for (int j = 0; j < tablero.length; j++){
                double aleatorio = Math.random()*3;
                if (aleatorio>=3){System.out.print("X ");}
                else if (aleatorio>=2){System.out.print("O ");}
                else if (aleatorio>=1){System.out.print("+ ");}
                else if (aleatorio>=0){System.out.print("· ");}
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Tablero.tablero(args);
    }
}
