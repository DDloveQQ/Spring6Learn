package com.ygq.spring.ByAnno.Validators;

import com.ygq.spring.ByAnno.User;
import jakarta.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.validation.Validator;

import java.util.Set;

@Service
public class JakartaService {

    @Autowired
    private Validator validator;

    public boolean validator(User user) {
        Set<ConstraintViolation<User>> sets = validator.validate(user);
        return sets.isEmpty();
    }
}
