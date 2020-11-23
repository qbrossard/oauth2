package com.example.oauth2.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class HelloController {
    @GetMapping(path = "/user", produces = APPLICATION_JSON_VALUE)
    public UserInfo user() {
        return new UserInfo("Quentin", LocalDateTime.now());
    }
}
