package POO;

public class TicketMachineTest2 {
    public static void main(String[] args) {
        TicketMachine2 Ticket;
        Ticket = new TicketMachine2(200);
        Ticket.insertMoney(10);
        Ticket.setDiscount(200);  
        Ticket.printTicket2();
        Ticket.insertMoney(200);
        Ticket.printTicket2();  
    }
    
}
