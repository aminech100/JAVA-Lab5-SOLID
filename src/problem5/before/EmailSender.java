package problem5.before;

public class EmailSender {
    private final String server;

    public EmailSender(String server) {
        this.server = server;
    }

    public void send(String to, String message){
        System.out.println("[Email via " + server + " to " + to +"] " + message);
    }
}
