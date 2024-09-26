// Low-level module 1
package cc.oop.lecture5.dip.after;

public class SMSNotificationSender implements INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification: " + message); // Sending SMS notification
    }
}