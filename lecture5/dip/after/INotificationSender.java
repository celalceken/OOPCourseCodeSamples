/*
* High-Level Module: NotificationService depends on an abstraction (NotificationSender) rather than on a concrete implementation (like EmailNotificationSender or SMSNotificationSender).
Abstraction: NotificationSender is an interface that declares the send method.
Low-Level Modules: EmailNotificationSender and SMSNotificationSender are concrete implementations of the NotificationSender interface.
Dependency Injection: The NotificationService receives a NotificationSender through its constructor, allowing for flexibility and easy swapping of notification methods without modifying the service itself.
*/
package cc.oop.lecture5.dip.after;

public interface INotificationSender {
    void send(String message); // Method to send notification
}
