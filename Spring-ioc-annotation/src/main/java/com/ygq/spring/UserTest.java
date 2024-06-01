package com.ygq.spring;

import com.ygq.spring.config.Spring6Config;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void testAnnotation1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserController uc = ac.getBean("userController", UserController.class);
        uc.out();
        logger.info("测试1执行成功");
    }

    @Test
    public void testAnnotation2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserController2 uc = ac.getBean("userController2", UserController2.class);
        uc.out();
        logger.info("测试2执行成功");
    }

    @Test
    public void testAnnotation3() {
        // 全注解开发
        ApplicationContext ac = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserController2 uc = ac.getBean("userController2", UserController2.class);
        uc.out();
        logger.info("测试3执行成功");
    }
}
