package Controles.Control03;

public class Ordenador {
    //Atributos
    private String formato;
    private String color;
    private Teclado teclado;
    //Getters
    public String getFormato() {
        return formato;
    }
    public String getColor() {
        return color;
    }
    public Teclado getTeclado() {
        return teclado;
    }
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    //Constructores
    public Ordenador(String formato, String color, Teclado teclado) {
        this.formato = formato;
        this.color = color;
        this.teclado = teclado;
        if(formato != "sobremesa" && formato != "portatil")
        this.formato = "sobremesa";
    }
    public Ordenador(Teclado teclado) {
        this.formato = "sobremesa";
        this.color = "negro";
        this.teclado = teclado;
    }
}
