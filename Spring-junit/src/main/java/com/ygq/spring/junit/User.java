package com.ygq.spring.junit;

import org.springframework.stereotype.Component;

@Component
public class User {
    public User() {
        System.out.println("Run user");
    }
}
