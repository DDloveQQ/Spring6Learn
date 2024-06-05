package com.ygq.spring;

import com.ygq.spring.config.SpringConfig;
import com.ygq.spring.Controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllAnnoTest {
    @Test
    public void testTxAllAnnotation(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController accountService = applicationContext.getBean("bookController", BookController.class);
        accountService.checkout(new Integer[]{1, 2}, 1);
    }
}
