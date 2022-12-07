package com.example.hw_7_1_2_1_authorization_service.UserInfo;

public class User {
    private String user;
    private String password;
    public User(String user, String password){
        this.user = user;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }
}