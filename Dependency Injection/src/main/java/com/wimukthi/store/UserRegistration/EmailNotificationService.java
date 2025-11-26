package com.wimukthi.store.UserRegistration;

public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message, String Email) {
        System.out.println("Sending email to " + Email);
    }
}
