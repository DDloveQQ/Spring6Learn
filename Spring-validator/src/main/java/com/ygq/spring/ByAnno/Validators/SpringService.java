package com.ygq.spring.ByAnno.Validators;

import com.ygq.spring.ByAnno.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

@Service
public class SpringService {
    @Autowired
    public Validator validator;

    public boolean validatePersonByValidator(User user) {
        BindException bindException = new BindException(user, user.getName());
        validator.validate(user, bindException);
        return bindException.hasErrors();
    }
}
