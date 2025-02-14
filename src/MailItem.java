public class MailItem {
    private String from = "";
    private String to = "";
    private String message = "";

    public MailItem(String from, String to, String message ) {
        this.from = from;
        this.to = to;
        this.message = message;
    }
    public String getFrom() {return this.from;}

    public String getTo() {return this.to;}

    public  String getMessage() {return this.message;}

    public void print() {
        System.out.println("Message:");
        System.out.println("To: " + this.getTo());
        System.out.println("From " + this.getFrom());
        System.out.println("Message: " + this.getMessage());
    }

}
