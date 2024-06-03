package com.ygq.spring.XMLaop;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest {
    private Logger logger = LoggerFactory.getLogger(CalculatorTest.class);

    @Test
    public void test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-aop-by-xml.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        int add = calculator.add(2, 2);
        logger.info("执行成功" + add);
    }
}
