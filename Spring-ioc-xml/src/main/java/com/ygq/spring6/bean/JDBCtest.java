package com.ygq.spring6.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

public class JDBCtest {
    @Test
    public void testDataSource() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-dataSource.xml");
        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
