package POO;

public class HeaterTest {
    public static void main(String[] args) {
        Heater H1 = new Heater(0,30);
        H1.setIncrement(8);
        H1.warmer(0);
        H1.setIncrement(-5);
        H1.cooler(0);
        H1.setIncrement(4);
        H1.warmer(0);
    } 
}
