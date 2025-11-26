package com.wimukthi.store.UserRegistration;


public class UserService {
    private UserRepository userRepository;
    private NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void register(User user){
        userRepository.save(user);
        notificationService.send("User Registration Complete", user.getEmail());
    }
}
