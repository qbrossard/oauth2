package com.example.oauth2.hello;

import java.time.LocalDateTime;

public class UserInfo {
    private final String name;
    private final LocalDateTime timestamp;

    public UserInfo(String name, LocalDateTime timestamp) {
        this.name = name;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
