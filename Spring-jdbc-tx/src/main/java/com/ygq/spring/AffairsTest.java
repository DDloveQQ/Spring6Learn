package com.ygq.spring;

import com.ygq.spring.Controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class AffairsTest {

    @Autowired
    private BookController bookController;

    @Test
    // 注意，为了测试事务存在与否对运行结果的影响，user1初始金余额设为50，book1售价设为80,库存设为100
    // 如果没有事务的加入, 则当执行buyBook操作时会因为余额不足而报出SQLException错误,余额为50不变,但book1的库存却变为99(非法)
    // 如果加入了事务,执行buyBook操作时依然会报出SQLException错误,但余额保持为50不变,book1的库存也保持为100不变(合法)
    public void testButBook() {
        bookController.checkout(new Integer[]{1, 2}, 1);
    }
}
