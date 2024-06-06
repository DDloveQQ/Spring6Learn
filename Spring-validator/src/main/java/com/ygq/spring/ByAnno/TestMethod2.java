package com.ygq.spring.ByAnno;

import com.ygq.spring.ByAnno.Validators.JakartaService;
import com.ygq.spring.ByAnno.Validators.SpringService;
import com.ygq.spring.ByAnno.config.ValidationConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMethod2 {
    @Test
    public void testMyService1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        JakartaService myService = context.getBean(JakartaService.class);
        User user = new User();
        user.setAge(2000);
        user.setName("张三");
        boolean validator = myService.validator(user);
        System.out.println(validator);  // true -> 校验通过,无异常 ; false -> 校验不通过
    }

    @Test
    public void testMyService2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        SpringService myService = context.getBean(SpringService.class);
        User user = new User();
        user.setName("lucy");
        user.setAge(20);
        user.setAge(-1);
        boolean validator = myService.validatePersonByValidator(user);
        System.out.println(validator);  // true -> 存在错误(hasErrors) ; false -> 不存在错误
    }
}
