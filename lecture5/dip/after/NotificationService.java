// High-level module
package cc.oop.lecture5.dip.after;

public class NotificationService {
    private INotificationSender notificationSender;

    public NotificationService(INotificationSender notificationSender) {
        this.notificationSender = notificationSender; // Dependency injection
    }

    public void sendNotification(String message) {
        notificationSender.send(message); // Delegate notification sending
    }
}
