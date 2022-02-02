package POO.mailSystem;

public class MailTest {
    public static void main(String[] args) {
     
    MailServer servidor;
    servidor = new MailServer();
    MailClient Cliente1, Cliente2;
    Cliente1 = new MailClient(servidor,"Paco");
    Cliente2 = new MailClient(servidor, "Mini-Paco");
    Cliente1.sendMailItem("Mini-Paco", "Estoy probando si funciona el programa", "Prueba");
    Cliente2.sendMailItem("Paco", "OK, funciona perfectamente", "Reply to Paco");
    System.out.println(servidor.howManyMailItems("Paco"));
    Cliente2.printNextMailItem();
    Cliente1.printNextMailItem();
    }
}
