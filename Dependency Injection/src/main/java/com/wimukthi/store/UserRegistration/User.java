package com.wimukthi.store.UserRegistration;

public class User {
    private long id;
    private String email;
    private String password;
    private String name;

    public User(long id, String email, String password, String name) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public long getUserId(){
        return id;
    }
    public String getEmail() {
        return email;
    }
}

