public class MailSystem {

    MailSystem() {}
    public static void main(String[] args) {
        MailServer server = new MailServer();
        MailClient clientA = new MailClient( server, "User A");
        MailClient clientB = new MailClient( server, "User B");
        clientA.sendMailItem("User B", "Hell from A!");
        clientB.printMailItem();
        clientB.sendMailItem("User A", "Hello to you too from B!");
        clientA.printMailItem();
    }
}