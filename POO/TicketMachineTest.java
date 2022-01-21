package POO;

public class TicketMachineTest {
    
    //Main
    public static void main(String[] args) {
        TicketMachine T1,T2,T3;
        T1 = new TicketMachine();
        T2 = new TicketMachine(400);
        T1.setPrice(200);
        T1.printTicket();
        T2.printTicket();
        T3 = new TicketMachine();
        T3.setTotal(200);
        T3.printTicket();
        T3.empty();
    }
}
