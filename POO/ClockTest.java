package POO;

public class ClockTest {
    public static void main(String[] args) {
        ClockDisplay Reloj;
        Reloj = new ClockDisplay(23,58,59);
        Reloj.timeTick();
        for(int i = 0 ; i < 120 ; i++) {
            Reloj.timeTick();
            System.out.println(Reloj.getTime());
        }
    }
}
