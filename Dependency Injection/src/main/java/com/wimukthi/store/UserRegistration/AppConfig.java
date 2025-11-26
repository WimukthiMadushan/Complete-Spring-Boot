package com.wimukthi.store.UserRegistration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmailNotificationService emailNotificationService() {
        return new EmailNotificationService();
    }
    @Bean
    public InMemoryUserService inMemoryUserService() {
        return new InMemoryUserService();
    }
    @Bean
    public UserService userService() {
        return new UserService(inMemoryUserService(), emailNotificationService());
    }
}
