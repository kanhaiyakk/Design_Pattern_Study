package Factory_Pattern.Notification_Factory;

public class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS notification...");
    }
}
