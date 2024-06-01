package com.ygq.spring;

import com.ygq.spring.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller  // 该注解通常作用在控制层（如SpringMVC 的 Controller），用于将控制层的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
public class UserController {

    @Qualifier("userServiceImpl")
    @Autowired  // 测试属性注入
    private UserService userService;

    // @Autowired  // 测试构造器注入
    public UserController(@Qualifier("userServiceImpl") UserService userService) {  // 测试形参注入
        this.userService = userService;
    }

    // @Autowired  // 测试set注入
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void out() {
        userService.print();
        System.out.println("Controller层执行结束");
    }
}
