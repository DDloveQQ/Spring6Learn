package com.ygq.spring6.bean.autowire;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutoWireByXML {
    @Test
    public void ByTypeTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.saveUser();
    }

    @Test
    public void ByNameTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-autowire2.xml");
        UserController userController = ac.getBean(UserController.class);
        userController.saveUser();
    }
}
