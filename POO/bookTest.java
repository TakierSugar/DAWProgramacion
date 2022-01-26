package POO;

public class bookTest {
    public static void main(String[] args) {
        Book B1;
        B1 = new Book("Jose", "Tortillaaaaaaaas", 0, true);
        B1.printDetails();
        B1.setRefNumber("Esto deberia ser correcto");
        B1.printDetails();
        B1.setRefNumber("NO");
        B1.printDetails();
    }
}
