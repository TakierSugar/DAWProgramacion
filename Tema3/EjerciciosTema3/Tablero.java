package EjerciciosTema3;

public class Tablero {
    public static void main(String[] args) {
      int i;
      int j;
      int[][] tablero = { { 0, 0, 1, 1, 0, 1, 0, 0 },
          { 3, 0, 0, 0, 3, 0, 0, 1 },
          { 0, 0, 1, 0, 0, 3, 0, 0 },
          { 2, 0, 0, 0, 3, 0, 0, 0 },
          { 1, 0, 0, 3, 3, 2, 0, 0 },
          { 0, 0, 0, 1, 2, 0, 0, 0 },
          { 0, 0, 0, 1, 0, 0, 0, 0 },
          { 1, 0, 0, 0, 0, 0, 0, 0 } };
  
      char letra = 'A';
      System.out.println("  1 2 3 4 5 6 7 8");
  
      for (i = 0; i < tablero.length; i++) {
        System.out.print(letra + " ");
        letra++;
        for (j = 0; j < tablero.length; j++) {
          switch (tablero[i][j]) {
            case 0:
              System.out.print(". ");
              break;
            case 1:
              System.out.print("+ ");
              break;
            case 2:
              System.out.print("O ");
              break;
            case 3:
              System.out.print("X ");
              break;
            default:
              break;
          }
        }
  
        System.out.println();
      }
    }
  }