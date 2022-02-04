package Controles.Control03;

public class Control03Main {
    public static void main(String[] args) {
        Teclado estandar, mini;
            estandar = new Teclado();
            mini = new Teclado("blanco",74,"inalambrico","IT","FormatoIncorrecto");
        Ordenador sobremesa, portatil;
            sobremesa = new Ordenador(estandar);
            portatil = new Ordenador("portatil", "Rojo", mini);
            portatil.setTeclado(estandar);
            sobremesa.setTeclado(mini);
    }
 }
