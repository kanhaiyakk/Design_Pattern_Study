package Factory_Pattern.Notification_Factory;

public class NotificationFactory {
    public Notification getNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL")) return new EmailNotification();
        else if (type.equalsIgnoreCase("SMS")) return new SMSNotification();
        return null;
    }
}
