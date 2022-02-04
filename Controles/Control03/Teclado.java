package Controles.Control03;

public class Teclado {
    //Atributos
    private String color;
    private int n_teclas;
    private String conectividad;
    private String idioma; 
    private String formato;
    private int contador = 0;
    //Getters
    public String getColor() {
        return color;
    }
    public int getN_teclas() {
        return n_teclas;
    }
    public String getConectividad() {
        return conectividad;
    }
    public String getIdioma() {
        return idioma;
    }
    public String getFormato() {
        return formato;
    }
    public int getContador() {
        return contador;
    }
    //Constructores
    public Teclado(String color, int n_teclas, String conectividad, String idioma, String formato) {
        this.color = color;
        this.n_teclas = n_teclas;
        this.conectividad = conectividad;
        this.idioma = idioma;
        this.formato = formato;
        this.contador = contador++;
        if (conectividad != "cable" && conectividad != "inalambrico")
            this.conectividad="cable";
        if (idioma.length()>2)
            this.idioma="ES";
        if (formato != "extendido" && formato != "compacto")
            this.formato="extendido";
    }
    public Teclado(){
        this.color = "negro";
        this.n_teclas = 104;
        this.conectividad = "cable";
        this.idioma = "ES";
        this.formato = "extendido";
        this.contador = contador++;
    }
}

