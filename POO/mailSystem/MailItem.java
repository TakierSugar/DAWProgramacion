package POO.mailSystem;

public class MailItem
{
    // The sender of the item.
    private String from;
    // The intended recipient.
    private String to;
    // The text of the message.
    private String message;
    private String asunto;

    public MailItem(String from, String to, String message, String asunto)
    {
        this.from = from;
        this.to = to;
        this.message = message;
        this.asunto = asunto;
    }

    public String getFrom()
    {
        return from;
    }
    public String getTo()
    {
        return to;
    }
    public String getMessage()
    {
        return message;
    }
    public String getAsunto()
    {
        return asunto;
    }

    public void print()
    {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Asunto: " + asunto);
        System.out.println("Message: " + message);
    }
}