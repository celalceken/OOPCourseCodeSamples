package cc.oop.lecture5.dip.after;

public class MainClass {
    public static void main(String[] args) {
        // Use Dependency Injection to choose notification type
        INotificationSender emailSender = new EmailNotificationSender();
        NotificationService notificationService = new NotificationService(emailSender);
        notificationService.sendNotification("Welcome to our service!");

        INotificationSender smsSender = new SMSNotificationSender();
        notificationService = new NotificationService(smsSender);
        notificationService.sendNotification("Your verification code is 123456.");
    }
}
