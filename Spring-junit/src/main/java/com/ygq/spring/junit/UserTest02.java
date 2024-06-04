package com.ygq.spring.junit;

//import org.junit.jupiter.api.Test;  // 注意，此引用对应5代Junit
import org.junit.Test; // 此引用对应4代Junit,千万不要引错
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")

public class UserTest02 {
    @Autowired
    private User user;

    @Test
    public void testUser2() {
        System.out.println(user);
    }
}
