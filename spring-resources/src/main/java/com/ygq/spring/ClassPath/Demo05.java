package com.ygq.spring.ClassPath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;


public class Demo05 {
    public static void main(String[] args) {
        /*
         * 通过搜索文件系统路径下的xml文件创建ApplicationContext，
         * 但通过指定classpath:前缀强制搜索类加载路径
         * classpath:bean.xml
         * */
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:bean.xml");
        System.out.println(ac);
        Resource resource = ac.getResource("ygq.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}
