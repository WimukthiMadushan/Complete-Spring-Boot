package com.wimukthi.store.UserRegistration;

import java.util.HashMap;

public class InMemoryUserService implements UserRepository {
    private HashMap<Object, Object> users  = new HashMap<>();
    @Override
    public void save(User user) {
        users.put(user.getUserId(), user);

    }
}
