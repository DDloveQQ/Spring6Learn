package com.ygq.spring.ByMethod;

import com.ygq.spring.ByMethod.config.ValidationConfig;
import com.ygq.spring.ByMethod.Service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMethod3 {
    @Test
    public void testMyService1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService myService = context.getBean(MyService.class);
        User user = new User();
        user.setAge(10);
        user.setName("张三");
        user.setPhone("13920304501");
        myService.testParams(user);
    }
}
