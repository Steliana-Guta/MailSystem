public class MailServer {
    private MailItem item;
    public MailServer() {

    }

    public MailItem getMailItem() {return item;}

    public void post(MailItem item) {this.item = item;}

}
