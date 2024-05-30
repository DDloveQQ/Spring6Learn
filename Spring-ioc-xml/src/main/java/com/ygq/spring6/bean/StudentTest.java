package com.ygq.spring6.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void testDIBySet() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = ac.getBean("studentOne", Student.class);
        System.out.println(student);
    }
}
