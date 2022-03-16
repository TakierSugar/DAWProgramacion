package POO.CutreClown;

public class ParserXMLTest {

    public static void printXML(ParserXML imprimible){
        System.out.println(imprimible.generateXML());
    }
    public static void main(String[] args) {
        Usuario u1 = new Usuario("bomgia@gmail.com", "123456789");
        Media m1 = new Media("Mascarpone.it", "Mucho texto", MediaType.VIDEO, u1);

        printXML(u1);
        printXML(m1);
    }
}