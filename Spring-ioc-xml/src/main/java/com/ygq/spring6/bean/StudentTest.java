package com.ygq.spring6.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class StudentTest {
    @Test
    public void testDIBySet() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = ac.getBean("studentOne", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDIByConstructor() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = ac.getBean("studentTwo", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI2Object() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = ac.getBean("studentFour", Student.class);
        System.out.println(student);

        Student student1 = ac.getBean("studentFourBeta", Student.class);
        System.out.println(student1);

        Student student2 = ac.getBean("studentFourGamma", Student.class);
        System.out.println(student2);
    }

    @Test
    public void testDI2Array() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = ac.getBean("studentFive", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI2List() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-di.xml");
        Student student = ac.getBean("studentFive", Student.class);
    }
}
