package POO;

public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;

    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    //1.
    public int getTotal() {
        return total;
    }

    //2.
    public void setPrice(int cost) {
        this.price = cost;
    }

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    //3.
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    //4.
    public void showPrice()
    {
        System.out.printf("The price of the ticket is %d cents.", price);
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }

    //5.
    public TicketMachine()
    {
        price = 0;
        balance = 0;
        total = 0;
    }
    
    //6.
    public void empty()
    {
        total = 0;
    }
}