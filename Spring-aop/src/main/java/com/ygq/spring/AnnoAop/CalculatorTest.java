package com.ygq.spring.AnnoAop;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest {
    private Logger logger = LoggerFactory.getLogger(CalculatorTest.class);

    @Test
    public void test01d() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        int add = calculator.add(1, 1);
        logger.info("执行成功" + add);
    }
}
