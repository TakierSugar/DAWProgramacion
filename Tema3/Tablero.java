package Tema3;

public class Tablero {
    public static void main(String[] args) {
        int [][] tablero = new int[8][8];
        String [] columna = {"A","B","C","D","E","F","G","H"};


        System.out.print("  1 2 3 4 5 6 7 8");
        for (int i = 0; i < tablero.length; i++){
            System.out.println();
            System.out.print(columna[i] +" ");
            for (int j = 0; j < tablero.length; j++){
                double aleatorio = Math.random()*4;
                if (aleatorio<2.5){System.out.print("· ");}
                else if (aleatorio<3){System.out.print("+ ");}
                else if (aleatorio<3.5){System.out.print("O ");}
                else if (aleatorio>=3.5){System.out.print("X ");}
            }
        }
        System.out.println();
    }
}
