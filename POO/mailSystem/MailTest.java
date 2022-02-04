package POO.mailSystem;

public class MailTest {
    public static void main(String[] args) {
     
    MailServer servidor;
    servidor = new MailServer();
    MailClient Cliente1, Cliente2;
    Cliente1 = new MailClient(servidor,"Paco");
    Cliente2 = new MailClient(servidor, "Juan");
    Cliente1.sendMailItem("Juan;Vicente;Pablo", "Estoy probando si funciona el programa", "Prueba");
    Cliente1.sendMailItem("Juan;Vicente;Jotaro", "Funciona?", "Prueba");
    Cliente2.sendMailItem("Paco", "OK, funciona perfectamente", "Reply to Paco");
    System.out.println(servidor.howManyMailItems("Vicente"));
    System.out.println(servidor.howManyMailItems("Pablo"));
    Cliente2.printNextMailItem();
    Cliente1.printNextMailItem();
    Cliente1.forwardLastMailItem("Paco");
    }
}
