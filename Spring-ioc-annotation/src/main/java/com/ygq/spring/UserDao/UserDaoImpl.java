package com.ygq.spring.UserDao;

import org.springframework.stereotype.Repository;

@Repository  // 该注解用于将数据访问层（Dao 层）的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
public class UserDaoImpl implements UserDao{
    @Override
    public void print() {
        System.out.println("DAO层执行结束");
    }
}
