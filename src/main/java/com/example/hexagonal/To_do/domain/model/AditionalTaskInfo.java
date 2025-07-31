package com.example.hexagonal.To_do.domain.model;

public class AditionalTaskInfo {
    private final long userId;
    private final String userName;
    private final String userEmail;

    public AditionalTaskInfo(long userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }


    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
