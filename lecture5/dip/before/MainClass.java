package cc.oop.lecture5.dip.before;

public class MainClass {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Welcome to our service!");
    }
}
