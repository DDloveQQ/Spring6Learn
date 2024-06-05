package com.ygq.spring.ResourceInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo04 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ResourceBean resourceBean = ac.getBean("resourceBean", ResourceBean.class);
        resourceBean.parse();
    }
}
