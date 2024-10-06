package com.cicd.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users/{userId}")
    public String getUser(@PathVariable("userId") String userId) {
        return "Hello" + userId + "user!";
    }
}
