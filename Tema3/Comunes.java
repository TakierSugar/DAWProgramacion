package Tema3;

public class Comunes {
    public static void main(String[] args) {
        //variables
        int[] PrimerArray = {1,2,3,4,5,4,6,4,7,7,3,1,3,6,0};
        int[] OtroArray = {7,5,5,4,3,2,9,0,10,5,6,0};
        
        String comunes = "";
       
        //Programa
        
        for (int i = 0; i<PrimerArray.length-1; i++){
            System.out.print(PrimerArray[i] + ", ");
            }
            System.out.println("");
        for (int j = 0; j<OtroArray.length-1; j++){
            System.out.print(OtroArray[j] + ", ");
            }
            
        for (int i = 0; i<PrimerArray.length-1; i++){
            for (int j = 0; j<OtroArray.length-1; j++){
                if (PrimerArray[i] == OtroArray[j]){
                comunes = comunes + " " + PrimerArray[i];
                    }
                }
            }
        System.out.println("");
        System.out.println("Se repiten estos enteros: " + comunes);
    }
}
