public class MailClient {
    private MailServer server;
    private String user = "";

    public MailClient(MailServer server, String user) {
        this.server = server;
        this.user = user;
    }
    public MailItem getMailItem() { return server.getMailItem(); }

    public void printMailItem() { this.getMailItem().print(); }

    public void sendMailItem (String to, String message) {
        MailItem item = new MailItem(this.user, to, message);
        this.server.post(item);
    }
}
