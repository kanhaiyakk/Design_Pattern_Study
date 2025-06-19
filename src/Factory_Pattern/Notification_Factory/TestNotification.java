package Factory_Pattern.Notification_Factory;

public class TestNotification {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.getNotification("EMAIL");
        Notification notification1 = factory.getNotification("SMS");
        notification.notifyUser();
        notification1.notifyUser();
    }
}
