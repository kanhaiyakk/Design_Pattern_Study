package Factory_Pattern.Notification_Factory;

public class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending email notification...");
    }
}
