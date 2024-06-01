package com.ygq.spring.UserDao;

import org.springframework.stereotype.Repository;

// 该类用于测试ByName装配,因为此类与UserDaoImpl中的方法名称相同,因此默认的ByType装配方式失效
// 需要Qualifier额外指定bean的名字

@Repository  // 该注解用于将数据访问层（Dao 层）的类标识为 Spring 中的 Bean，其功能与 @Component 相同。
public class UserDaoRedisImpl implements UserDao{
    @Override
    public void print() {
        System.out.println("Redis Dao层执行结束");
    }
}
