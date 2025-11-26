package com.wimukthi.store;

import com.wimukthi.store.UserRegistration.User;
import com.wimukthi.store.UserRegistration.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        //var orderService = context.getBean(OrderService.class);
        //orderService.placeorder();

        //var notificationService = context.getBean(NotificationManager.class);
        //notificationService.sendNotification("Hello, This is new message");

        var userService =  context.getBean(UserService.class);
        userService.register(new User(1,"email", "password", "name"));
    }


}
