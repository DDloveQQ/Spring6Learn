package com.ygq.spring.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// Spring提供了一个运行器，可以读取配置文件（或注解）来创建容器。我们只需要告诉它配置文件位置就可以了
// 这样可以省去ac建立和getBean过程

// 方式1：
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:beans.xml")
// 方式2：
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class UserTest {
    @Autowired
    private User user;

    @Test
    public void testUser() {
        System.out.println(user);
    }

}
