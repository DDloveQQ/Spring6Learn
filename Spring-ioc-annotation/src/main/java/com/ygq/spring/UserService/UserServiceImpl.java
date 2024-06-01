package com.ygq.spring.UserService;

import com.ygq.spring.UserDao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service  // 该注解通常作用在业务层（Service 层），用于将业务层的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
public class UserServiceImpl implements UserService{

    @Autowired  // 测试属性注入
    @Qualifier("userDaoImpl")  // 指定bean的名字(方式1)
    private UserDao userDao;

    // @Autowired  // 测试构造器注入
    // qualifier指定bean的名称
    public UserServiceImpl(@Qualifier("userDaoImpl") UserDao userDao) {  // 测试形参注入
        this.userDao = userDao;
    }
    // 注: 当只有一个有参的构造函数时，无注解时依然可以自动注入
    // 但有多个构造构造方法时则失效

    // @Autowired  // 测试set注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void print() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}
