/*
*
* Direct Dependency: In NotificationService, the service directly depends on the concrete class EmailNotificationSender.
* This means that any change to the notification method would require modifying the NotificationService class.
* Lack of Abstraction: There is no interface or abstraction layer for NotificationSender. The high-level module
* (NotificationService) should not depend on a specific implementation (like EmailNotificationSender); it should depend on an abstraction.
*
* */


// High-level module
package cc.oop.lecture5.dip.before;

public class NotificationService {
    private EmailNotificationSender emailSender; // Direct dependency on a concrete class

    public NotificationService() {
        this.emailSender = new EmailNotificationSender(); // Instantiation of a concrete class
    }

    public void sendNotification(String message) {
        emailSender.send(message); // Sending notification directly
    }
}