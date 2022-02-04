package POO.mailSystem;

public class MailClient
{
    // The server used for sending and receiving.
    private MailServer server;
    // The user running this client.
    private String user;

    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }

    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }

    public void printNextMailItem()
    {
        MailItem item = server.getNextMailItem(user);
        if(item == null) {
            System.out.println("No new mail.");
        }
        else {
            item.print();
            System.out.println("-------------------------------------------------------------");
        }
    }

    public void sendMailItem(String to, String message, String asunto){
        String[] partes = to.split(";");
        for(int i = 0; i < to.split(";").length;i++){
            MailItem item = new MailItem(user, partes[i], message, asunto);
            server.post(item);
        }
    }

    public void forwardLastMailItem(String forwardTo){
        printNextMailItem();
        user=forwardTo;
    }
}                   