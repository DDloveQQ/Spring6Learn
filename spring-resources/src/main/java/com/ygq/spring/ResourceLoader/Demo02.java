package com.ygq.spring.ResourceLoader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

// FileSystemApplicationContext获取Resource实例
public class Demo02 {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext();
        Resource res = ac.getResource("ygq.txt");
        System.out.println(res.getFilename());
    }
}
