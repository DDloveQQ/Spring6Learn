package com.ygq.spring6.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    private Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);

    @Test
    // 根据类型获取bean
    public void testHelloWorld01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 使用此方法时依然别忘了在bean.xml文件中定义<bean>
        HelloWorld bean = ac.getBean(HelloWorld.class);
        bean.sayHello();
    }

    @Test
    // 根据id和类型获得bean
    public void testHelloWorld02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld bean = ac.getBean("helloworld", HelloWorld.class);
        bean.sayHello();
    }
}
