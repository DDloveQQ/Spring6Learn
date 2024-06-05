package com.ygq.spring.ResourceLoader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

// ClassPathXmlApplicationContext获取Resource实例
public class Demo01 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext();
        Resource res = ac.getResource("ygq.txt");
        System.out.println(res.getFilename());
    }
}
