package com.ygq.spring.ByMethod.Service;

import com.ygq.spring.ByMethod.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class MyService {
    public String testParams(@NotNull @Valid User user) {
        return user.toString();
    }
}
